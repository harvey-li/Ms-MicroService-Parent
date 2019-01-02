#!/bin/bash
cd /opt/itump/lifangkai/ms-eureka7001-2.0.0/bin
cd ../lib
LIB_DIR=`pwd`

SERVER_NAME='com.microservice.skeleton.register.RegisterApplication'
PIDS=`ps -ef | grep java | grep "$LIB_DIR" |grep $SERVER_NAME|awk '{print $2}'`
if [ -n "$PIDS" ]; then
    echo "start fail! The $SERVER_NAME already started!"
    exit 1
fi


LIB_JARS=`ls $LIB_DIR|grep .jar|awk '{print "'$LIB_DIR'/"$0}'|tr "\n" ":"`
echo $LIB_JARS

echo $SERVER_NAME
cd ..
nohup java -Djava.net.preferIPv4Stack=true -server -Xms1g -Xmx1g -XX:PermSize=128m  -classpath $LIB_JARS $SERVER_NAME 1>/dev/null 2>&1 &
echo "start "$SERVER_NAME" success!"
