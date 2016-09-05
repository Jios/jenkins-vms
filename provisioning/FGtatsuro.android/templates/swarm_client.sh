#!/bin/sh
### BEGIN INIT INFO
# Provides: swarm.sh
# Required-Start: $remote_fs $syslog
# Required-Stop: 
# Default-Start: 2 3 4 5
# Default-Stop: 0 1 6
# Short-Description: Start daemon at boot time
# Description: Auto run swarm-client.jar
### END INIT INFO

java -jar "{{ swarm_client_path }}/{{ swarm_client }}" \
	 -master "http://{{ hostvars.master.ansible_ssh_host }}:8080/" \
	 -username {{ jenkins_admin_username }} -password {{ jenkins_admin_password }} \
	 -labels "android linux ubuntu" \
	 -name slave &

exit 0