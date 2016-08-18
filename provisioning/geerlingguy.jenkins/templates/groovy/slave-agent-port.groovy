import jenkins.model.*

def instance = Jenkins.getInstance()

instance.setSlaveAgentPort("{{ jenkins_master_SlaveAgentPort }}")

instance.save()
