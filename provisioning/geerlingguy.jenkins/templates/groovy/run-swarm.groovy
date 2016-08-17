def command = "java -jar /var/lib/jenkins/swarm/swarm-client-2.2-jar-with-dependencies.jar &"
def process = command.execute()
//process.waitFor()

//def output = process.in.text
//log.info output