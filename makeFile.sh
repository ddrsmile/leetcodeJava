#!/bin/bash
arg=$1

if [ "$arg" = 0 ]; then
  exit 0
fi

if [ -z "$CURRENT_DIR" -o ! "$CURRENT_DIR"=$(PWD)  ]; then
  source setEnv.sh  
fi

if [ -z "$arg" ]; then
  arg="all"
fi

#collect the item not compiled
function check {
  DIR=$1
  i=0
  for f in $BASE_SRC/$DIR/*.java
  do
    ff=${f##*/}
    ff=${ff%.*}
    if [ ! -f $BASE_BIN/$DIR/$ff.class ]; then
      i=$(($i+1))
    fi
  done
  echo $i
}

if [ "$arg" = "objs" ]; then
  javac -d $BASE_BIN $BASE_SRC/objs/*.java 
  exit 0
fi

if [ "$arg" = "utils" ]; then
  ckobjs=$(check "objs")
  if [ ! $ckobjs = 0 ]; then
    javac -d $BASE_BIN $BASE_SRC/objs/*.java 
  fi
  javac -d $BASE_BIN $BASE_SRC/utils/*.java
  exit 0
fi


if [ "$arg" = "all" ]; then
  ckobjs=$(check "objs")
  if [ ! $ckobjs = 0 ]; then
    javac -d $BASE_BIN $BASE_SRC/objs/*.java
  fi
  ckutils=$(check "utils")
  if [ ! $ckutils = 0 ]; then
    javac -d $BASE_BIN $BASE_SRC/utils/*.java
  fi
  javac -d $BASE_BIN $BASE_SRC/sols/Solution.java
  exit 0
fi

