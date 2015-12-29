#!/bin/bash
arg=$1

if [ -z "$1" ]; then
  echo "Please input the problem number"
  echo "For example: ./run 1"
  exit 0
fi

cp -f $BASE_SRC/main/$1.java $BASE_SRC/main/Main.java
cp -f $BASE_SRC/sols/$1.java $BASE_SRC/sols/Solution.java

./makeFile.sh

javac -d $BASE_BIN/ $BASE_SRC/main/Main.java
java main.Main $CURRENT_DIR/input/$1.txt
