#!/bin/bash
opt=$1
echo START TEH TESTS

javac -d $BASE_BIN $BASE_SRC/objs/*.java
javac -d $BASE_BIN $BASE_SRC/utils/*.java

export MAIN_DIR=./src/main

problems=()
cnt=0
if [ "$opt" = "all" ]; then
  for f in $MAIN_DIR/*.java
  do
    ff=${f##*/}
    ff=${ff%.*}
    if [ "$ff" = "Main" ]; then
      continue
    fi
    problems+=("$ff")
  done
else
  problems=(58 60)
fi

cnt=0
for problem in ${problems[@]}
do
  echo Run Problem $problem
  cp -f $BASE_SRC/main/$problem.java $BASE_SRC/main/Main.java
  cp -f $BASE_SRC/sols/$problem.java $BASE_SRC/sols/Solution.java
  javac -d $BASE_BIN/ $BASE_SRC/sols/Solution.java
  javac -d $BASE_BIN/ $BASE_SRC/main/Main.java
  java main.Main $CURRENT_DIR/input/$problem.txt
  echo done
  echo
  let cnt=cnt+1
done
echo $cnt problems were run.
