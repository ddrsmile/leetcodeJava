#!/bin/bash

export CURRENT_DIR=$(PWD)

if [ -d "bin" ]; then
  export BASE_BIN=$(PWD)/bin
  export CLASSPATH=.:$(PWD)/bin
else
  mkdir bin
  export BASE_BIN=$(PWD)/bin
  export CLASSPATH=.:$(PWD)/bin
fi
echo $BASE_BIN
echo $CLASSPATH

if [ -d "src" ]; then
  export BASE_SRC=$(PWD)/src
else
  mkdir src
  export BASE_SRC=$(PWD)/src
fi
echo $BASE_SRC
echo "DONE"
