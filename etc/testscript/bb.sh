#!/bin/bash

function check {
  DIR=$1
  i=0
  for f in $BASE_SRC/$DIR/*.java
  do
    ff=${f##*/}
    ff=${ff%.*}
    if [ ! -f $BASE_BIN/$DIR/$ff.class ]; then
      arr[$i]=$ff.class
      i=$(($i+1))
    fi
  done
  echo $arr
}
a=$(check "objs")
echo ${#a[@]}
