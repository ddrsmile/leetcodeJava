#!/bin/bash
  javac -d $BASE_BIN $BASE_SRC/objs/*.java 

  javac -d $BASE_BIN $BASE_SRC/utils/*.java

  javac -d $BASE_BIN $BASE_SRC/sols/Solution.java
