#!/bin/bash
PWD=`pwd`
cd opt/lifangkai/ms-eureka7001-2.0.0-assembly/ms-eureka7001-2.0.0/bin
cd ../lib
LIB_DIR=`pwd`

SERVER_NAME='com.microservice.skeleton.register.RegisterApplication'
PIDS=`ps -ef | grep java | grep "$LIB_DIR" |grep $SERVER_NAME|awk '{print $2}'`
if [ -z "$PIDS" ]; then
    echo "stop fail! The $SERVER_NAME not start!"
    exit 1
fi

for PID in $PIDS ;
do
    kill $PID > /dev/null 2>&1
done
echo "stop success! pid:"$PIDS
cd $PWD