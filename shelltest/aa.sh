#!/bin/bash

i=0
for f in $BASE_SRC/objs/*.java
do
  ff="${f##*/}"
  ff="${ff%.*}"
  
  if [ ! -f $BASE_BIN/objs/$ff.class ]; then
    arr[$i]=$ff.class
    i=$(($i+1))
  fi
done

if [ ! ${#arr[@]} = 0 ]; then
  for f in ${arr[@]}
  do
    echo "$f not found"
  done
fi
