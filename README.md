### Make changes to the followings:
```
# provisioning/inventory
host name
host ip

# provisioning/vars/main.yml
remote_user: 

# provisioning/playbook.yml
hosts: 
```

# Ansible Vagrant profile for a Jenkins CI server

## add ssh keys to remote machines
[master]
$ `ssh-copy-id jian@172.20.1.20`
[slave]
$ `ssh-copy-id jian@172.20.1.31`	

## ansible command
$ `ansible-playbook -i provisioning/inventory provisioning/playbook.yml`

### download ansible role to directory: ./provisioning
ansible-galaxy install geerlingguy.jenkins -p ./provisioning -v

### add jenkins plugins
edit jenkins_plugins variable in file: provisioning/geerlingguy.jenkins/defaults/main.yml


## Ansible Roles' Author Information

Created in 2014 by [Jeff Geerling](http://jeffgeerling.com/), author of [Ansible for DevOps](http://ansiblefordevops.com/).
