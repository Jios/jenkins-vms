import jenkins.model.*

def inst = Jenkins.getInstance()

def desc = inst.getDescriptor("hudson.tasks.Mailer")

desc.setSmtpAuth("{{ email_address }}", "{{ email_password }}")
desc.setReplyToAddress("{{ email_address }}")
desc.setSmtpHost("{{ email_smtpHost }}")
desc.setUseSsl("{{ email_useSsl }}")
desc.setSmtpPort("{{ email_smtpPort }}")
desc.setCharset("{{ email_charset }}")

desc.save()