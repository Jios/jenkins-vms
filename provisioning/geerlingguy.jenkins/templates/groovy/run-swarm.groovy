def command = "java -jar /var/lib/jenkins/swarm/swarm-client-2.2.jar -master http://{{ hostvars.master.ansible_ssh_host }}:8080/ -username {{ jenkins_admin_username }} -password {{ jenkins_admin_password }} -name Coolie -labels linux &"

def process = command.execute()
//process.waitFor()

//def output = process.in.text
//log.info output