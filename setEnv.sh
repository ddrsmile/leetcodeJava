#!/bin/bash

export CURRENT_DIR=$(PWD)
echo "The current directory: " $CURRENT_DIR
if [ -d "bin" ]; then
  export BASE_BIN=$(PWD)/bin
  export CLASSPATH=.:$(PWD)/bin
else
  mkdir bin
  export BASE_BIN=$(PWD)/bin
  export CLASSPATH=.:$(PWD)/bin
fi
echo "The bin directory: " $BASE_BIN
echo "The classpath: " $CLASSPATH

if [ -d "src" ]; then
  export BASE_SRC=$(PWD)/src
else
  mkdir src
  export BASE_SRC=$(PWD)/src
fi
echo "The src directory: " $BASE_SRC
echo "DONE"
