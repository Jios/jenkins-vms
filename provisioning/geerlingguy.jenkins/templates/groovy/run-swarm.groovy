def command = "java -jar /var/lib/jenkins/swarm/swarm-client-2.2-jar-with-dependencies.jar -master \"http://192.168.10.22:8080\" -username {{ jenkins_admin_username }} -password {{ jenkins_admin_password }} -disableSslVerification &"
def process = command.execute()
//process.waitFor()

//def output = process.in.text
//log.info output