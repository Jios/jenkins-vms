# Ansible Vagrant profile for a Jenkins CI server

## ansible command
$ `ansible-playbook -i provisioning/inventory provisioning/playbook.yml`

### download ansible role to directory: ./provisioning
ansible-galaxy install geerlingguy.jenkins -p ./provisioning -v

### add jenkins plugins
edit jenkins_plugins variable in file: provisioning/geerlingguy.jenkins/defaults/main.yml


## Ansible Roles' Author Information

Created in 2014 by [Jeff Geerling](http://jeffgeerling.com/), author of [Ansible for DevOps](http://ansiblefordevops.com/).
