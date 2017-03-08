#!/bin/bash
arg=$1

if [ "$arg" = 0 ]; then
  exit 0
fi

if [ -z "$ROOT_DIR" -o ! "$ROOT_DIR"=$(PWD)  ]; then
  echo "Please resouce set_env.sh"
  exit 0
fi

#collect the item not compiled
function check {
  DIR=$1
  i=0
  for f in $SRC_DIR/$DIR/*.java
  do
    ff=${f##*/}
    ff=${ff%.*}
    if [ ! -f $BIN_DIR/$DIR/$ff.class ]; then
      i=$(($i+1))
    fi
  done
  echo $i
}


if [ "$arg" = "objs" ]; then
  javac -d $BIN_DIR $SRC_DIR/objs/*.java 
  exit 0
fi

if [ "$arg" = "utils" ]; then
  ckobjs=$(check "objs")
  if [ ! $ckobjs = 0 ]; then
    javac -d $BIN_DIR $SRC_DIR/objs/*.java 
  fi
  javac -d $BIN_DIR $SRC_DIR/utils/*.java
  exit 0
fi


if [ "$arg" = "all" ] || [ -z $arg ]; then
  ckobjs=$(check "objs")
  if [ ! $ckobjs = 0 ]; then
    javac -d $BIN_DIR $SRC_DIR/objs/*.java
  fi
  ckutils=$(check "utils")
  if [ ! $ckutils = 0 ]; then
    javac -d $BIN_DIR $SRC_DIR/utils/*.java
  fi
  exit 0
fi

