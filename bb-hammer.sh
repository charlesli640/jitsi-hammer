#!/bin/bash

ROOMNAME="roomName"
NICKNAME="nickName"
NUMROOMS=5
USERS=2
URL=https://jitsi-bb.magnet.com

usage() {
  echo "Usage: $0 [-B|-C][-r roomName][-k nickName][-n #rooms][-u #users]" >&2
  echo "     -B http://jitsi-bb.magnet.com" >&2
  echo "     -C https://jitsi-meet-charles.magnet.com" >&2
  exit 1;
}

while getopts "BCk:n:r:u:" opt; do
  case "$opt" in
  "B") URL=$URL;;
  "C") URL=https://jitsi-meet-charles.magnet.com;;
  "k") NICKNAME=${OPTARG};;
  "r") ROOMNAME=${OPTARG};;
  "n") NUMROOMS=${OPTARG};;
  "u") USERS=${OPTARG};;
  ?)   usage;;
  esac
done
shift $((OPTIND-1))

echo "URL: ${URL}"
echo "RoomName: ${ROOMNAME}"
echo "NickName: ${NICKNAME}"
echo "# Rooms: ${NUMROOMS}"
echo "# Users: ${USERS}"
sleep 2

./jitsi-hammer.sh -u "${URL}/http-bind/" \
-room ${ROOMNAME} -rooms ${NUMROOMS} -users ${USERS} \
-nick ${NICKNAME} -videortpdump ./resources/rtp_vp8.rtpdump \
-audiortpdump ./resources/narwhals-audio.rtpdump
