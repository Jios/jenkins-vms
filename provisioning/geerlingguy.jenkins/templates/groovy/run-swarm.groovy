def command = "java -jar /var/lib/jenkins/swarm/swarm-client-2.2.jar -master http://{{ hostvars.master.ansible_ssh_host }}:8080/ -username admin -password admin -name Ubuntu -labels linux &"
def process = command.execute()
//process.waitFor()

//def output = process.in.text
//log.info output