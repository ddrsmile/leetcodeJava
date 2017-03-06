#!/bin/bash

export ROOT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
echo "The root directory: " $ROOT_DIR
if [ -d "bin" ]; then
  export BIN_DIR=$ROOT_DIR/bin
  export CLASSPATH=.:$ROOT_DIR/bin
else
  mkdir bin
  export BIN_DIR=$ROOT_DIR/bin
  export CLASSPATH=.:$ROOT_DIR/bin
fi
echo "The bin directory: " $BIN_DIR
echo "The classpath: " $CLASSPATH

if [ -d "src" ]; then
  export SRC_DIR=$ROOT_DIR/src
else
  mkdir src
  export SRC_DIR=$ROOT_DIR/src
fi
echo "The src directory: " $SRC_DIR

export INPUT_DIR=$ROOT_DIR/input

echo "DONE"
