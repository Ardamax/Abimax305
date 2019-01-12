#!/bin/bash -x
cd `dirname $0`
if [ "$MATERIALS_DIR_305" = "" ] ; then
    # You can set MATERIALS_DIR_305 in you .mybashrc or
    # .bashrc or wherever if you don't want to have to edit
    # this script when you copy the directory.
    echo "Please set the MATERIALS_DIR_305 environment variable"
    exit 1
fi
LIBS=$MATERIALS_DIR_305/lib/testy.jar

#
# Compile the program:
#
rm -rf out
mkdir out
javac -Xlint:unchecked -Xmaxerrs 5 -sourcepath src  \
	-cp $LIBS -d out src/*.java
if [ $? != 0 ] ; then
    exit 1
fi

java -cp $LIBS:out -ea Main $*
rm -rf out
