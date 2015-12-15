#!/bin/bash

export CURRENT_DIR=./
echo "The current directory: " $CURRENT_DIR
if [ -d "bin" ]; then
  export BASE_BIN=./bin
  export CLASSPATH=.:./bin
else
  mkdir bin
  export BASE_BIN=./bin
  export CLASSPATH=.:./bin
fi
echo "The bin directory: " $BASE_BIN
echo "The classpath: " $CLASSPATH

if [ -d "src" ]; then
  export BASE_SRC=./src
else
  mkdir src
  export BASE_SRC=./src
fi
echo "The src directory: " $BASE_SRC
echo "DONE"
