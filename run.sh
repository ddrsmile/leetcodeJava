#!/bin/bash
arg=$1

if [ -z "$1" ]; then
  echo "Please input the problem number"
  echo "For example: ./run 1"
  exit 0
fi

cp -f $CURRENT_DIR/src/main/$1.java $CURRENT_DIR/src/main/Main.java

cp -f $CURRENT_DIR/src/sols/$1.java $CURRENT_DIR/src/sols/Solution.java

javac -d $CURRENT_DIR/tmp $CURRENT_DIR/src/main/Main.java

java -cp $CURRENT_DIR/tmp Main $CURRENT_DIR/input/$1.txt
