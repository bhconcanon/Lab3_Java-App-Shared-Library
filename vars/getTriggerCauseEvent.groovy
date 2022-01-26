String getTriggerCauseEvent() {
    def buildCauseInfo = currentBuild.getBuildCauses("com.cloudbees.jenkins.plugins.pipeline.events.EventTriggerCause")
    if (buildCauseInfo && buildCauseInfo[0])  {
        def test = buildCauseInfo[0].event.test
        return test
    }
    return "N/A"
}