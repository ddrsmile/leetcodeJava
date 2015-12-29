#!/bin/bash
arg=$1

cp -f $BASE_SRC/main/$1.java $BASE_SRC/main/Main.java
cp -f $BASE_SRC/sols/$1.java $BASE_SRC/sols/Solution.java

javac -d $BASE_BIN $BASE_SRC/objs/*.java
javac -d $BASE_BIN $BASE_SRC/utils/*.java
javac -d $BASE_BIN $BASE_SRC/sols/Solution.java
javac -d $BASE_BIN/  $BASE_SRC/main/Main.java

java main.Main $CURRENT_DIR/input/$1.txt
