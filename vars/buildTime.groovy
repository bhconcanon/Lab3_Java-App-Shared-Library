#!/usr/bin/env groovy

def call(Map config=[:]) {

	echo "Last Run: " + build.getTimestampString()
	echo "Last Run Date and Time: " + build.getTimestampString2()
	echo "Build Time In Ms: " + build.running duration()
	echo "End time: " + new Date(((long)build.getStartTimeInMillis() + build.duration))
}