#!/bin/bash

ps -ef | grep jitsi-hammer | awk '{print $2}' |xargs kill -9
