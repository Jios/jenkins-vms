# -*- mode: ruby -*-
# vi: set ft=ruby :

VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  
  # config.vm.box = "geerlingguy/ubuntu1604" #"geerlingguy/centos7"
  # config.ssh.insert_key = true

  config.vm.provider :virtualbox do |v|
    # v.name = "jenkins"
    v.memory = 512
    v.cpus = 2
    v.customize ["modifyvm", :id, "--natdnshostresolver1", "on"]
    v.customize ["modifyvm", :id, "--ioapic", "on"]
  end

  config.vm.box = "geerlingguy/ubuntu1604"


  # Set the name of the VM. See: http://stackoverflow.com/a/17864388/100134
  config.vm.define :master do |master|
    # master.name = "master"
    master.ssh.insert_key = true
    master.vm.network :private_network, ip: "192.168.10.22"
  end

  config.vm.define :slave do |slave|
    # slave.name = "slave"
    slave.ssh.insert_key = true
    slave.vm.network :private_network, ip: "192.168.55.11"
  end

  ### 
  ### Ansible provisioner.
  ### 
  config.vm.provision "ansible" do |ansible|
    ansible.playbook = "provisioning/playbook.yml"
    ansible.inventory_path = "provisioning/inventory"
    ansible.sudo = true
  end

end
