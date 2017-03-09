#!/bin/bash
opt=$1

echo "START TESTING"

$ROOT_DIR/compile.sh 

export MAIN_DIR=$SRC_DIR/main

problems=()
cnt=0
if [ "$opt" = "all" ] || [ -z "$opt" ]; then
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
  problems=($opt)
fi

cnt=0
for problem in ${problems[@]}
do
  echo Run Problem $problem
  cp -f $SRC_DIR/main/$problem.java $SRC_DIR/main/Main.java
  cp -f $SRC_DIR/sols/$problem.java $SRC_DIR/sols/Solution.java
  javac -d $BIN_DIR/ $SRC_DIR/sols/Solution.java
  javac -d $BIN_DIR/ $SRC_DIR/main/Main.java
  echo "========== RESULT =========="
  java main.Main $INPUT_DIR/$problem.txt
  echo "=========== DONE ==========="
  echo
  let cnt=cnt+1
done
echo $cnt problems were run.
