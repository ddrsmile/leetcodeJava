#!/bin/bash

export MAIN_DIR=./src/main
cnt=0
for f in $MAIN_DIR/*.java
do
  ff=${f##*/}
  ff=${ff%.*}
  if [ "$ff" = "Main" ]; then
    continue
  fi
  echo Run $ff Problem
  ./setEnv_travis.sh $ff
  echo done
  echo
  let cnt=cnt+1
done
echo $cnt problems were run.
