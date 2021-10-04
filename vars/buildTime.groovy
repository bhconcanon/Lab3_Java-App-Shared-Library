#!/usr/bin/env groovy

def call(String name = 'build') {
	import hudson.model.*

	println "Last Run: " + build.getTimestampString()
	println "Last Run Date and Time: " + build.getTimestampString2()
	println "Build Time In Ms: " + build.running duration()
	println "End time: " + new Date(((long)build.getStartTimeInMillis() + build.duration))
}