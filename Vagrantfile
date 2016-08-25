# -*- mode: ruby -*-
# vi: set ft=ruby :

VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  
  config.vm.provider :virtualbox do |v|
    # v.name = "jenkins"
    v.memory = 512
    v.cpus = 2
    v.customize ["modifyvm", :id, "--natdnshostresolver1", "on"]
    v.customize ["modifyvm", :id, "--ioapic", "on"]
  end


  config.vm.box = "geerlingguy/ubuntu1604"
  config.ssh.insert_key = true


  # Set the name of the VM. See: http://stackoverflow.com/a/17864388/100134
  config.vm.define :master do |master|
    # master.name = "master"
    master.vm.network :private_network, ip: "192.168.10.22"
  end

  config.vm.define :slave do |slave|
    # slave.name = "slave"
    slave.vm.network :private_network, ip: "192.168.10.11"

    # pipeline
    slave.vm.synced_folder "slave/jenkins/workspace/pipeline-ex", "/var/lib/jenkins/workspace/pipeline-ex", 
      create: true, #disabled: true,
      type: 'nfs', mount_options: ['rw', 'vers=3', 'tcp', 'fsc', 'actimeo=2']
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
