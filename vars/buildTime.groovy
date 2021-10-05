#!/usr/bin/env groovy

def call(def config=[:]) {

	echo "Last Run: " + build.getTimestampString()
	echo "Last Run Date and Time: " + build.getTimestampString2()
	echo "End time: " + new Date(((long)build.getStartTimeInMillis() + build.duration))
}