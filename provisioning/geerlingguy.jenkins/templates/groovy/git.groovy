import jenkins.model.*

def inst = Jenkins.getInstance()

def desc = inst.getDescriptor("hudson.plugins.git.GitSCM")

desc.setGlobalConfigName("{{ email_name }}")
desc.setGlobalConfigEmail("{{ email_address }}")

desc.save()