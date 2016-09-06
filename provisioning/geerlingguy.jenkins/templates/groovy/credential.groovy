import jenkins.model.*
import com.cloudbees.plugins.credentials.CredentialsScope
import com.cloudbees.plugins.credentials.impl.UsernamePasswordCredentialsImpl

import com.cloudbees.plugins.credentials.*
import com.cloudbees.plugins.credentials.common.*
import com.cloudbees.plugins.credentials.domains.*
import com.cloudbees.jenkins.plugins.sshcredentials.impl.*
import hudson.plugins.sshslaves.*


publicKey  = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDQc4/Sflw+uX/O2uNODV2i3DM5VT4NpfxBCPU2hK8vtpO4dJRYPzg22y9pn8vCY4jUxAxO3vv6PMoutm7bnu8dBuybxpFGMI42aIyQxbQOOEGPk9zxxEGtIFvHWN6ejpUyHg835VhHlmDwiRrHDVZv0dwyKWSuAqfBrm6PkNzo5fwoIZ1gBPWh+6VWFSsIFFXut5Ch2agw0thvMe/ha1PPWQgxC6e45ajQ4q8gREvxN5BlENHBQjEI++XwNaEJVkq31Ri/2a+9d11ldhIjwDPv2eyNyM49wCxjg2ffrHHZQkCK9CKNTrQBL8Qcq6eaZGZ06n9eTiVE4mdzTidi6V2v abs@tutk.com"
//privateKey = "MIIEogIBAAKCAQEA0HOP0n5cPrl/ztrjTg1dotwzOVU+DaX8QQj1NoSvL7aTuHSUWD84NtsvaZ/LwmOI1MQMTt77+jzKLrZu257vHQbsm8aRRjCONmiMkMW0DjhBj5Pc8cRBrSBbx1jeno6VMh4PN+VYR5Zg8Ikaxw1Wb9HcMilkrgKnwa5uj5Dc6OX8KCGdYAT1ofulVhUrCBRV7reQodmoMNLYbzHv4WtTz1kIMQunuOWo0OKvIERL8TeQZRDRwUIxCPvl8DWhCVZKt9UYv9mvvXddZXYSI8Az79nsjcjOPcAsY4Nn36xx2UJAivQijU60AS/EHKunmmRmdOp/Xk4lROJnc04nYuldrwIDAQABAoIBAC4cMgdM/li9reDzGG7uk/TvosEe8xAP1IIKWjvKE/qI95pI53ux2FyCFbXWrDr+y4jNKS/VMYYEJnE418LrIFeabYJz5TTSjtLIQ7fOk+rFVPNOsQQl9qU2UDcDmJMYVTZ14cXqjKGhSSZMHclEUQeBM6VA9M1tNvCoBjrpv4Qg3Tjk5pgLaAYzfS1irder3xX1TxCh8Hc2isfpXugB4g2w1QD7sO+aocliAF+MT0pmvHkMNoVN8sDTT8MPR330XPmG8Bhtz8WI5xMQFvRrJ/mVusHWhG4uIArqq8b74cOhBj1YSlqJoPdv0Kd/DGwZ75gNsq0C0RsQkJgHmbxZfuECgYEA96jl9bZioIGjRVR3seCITamQ9ZzWBSog11HA3E58T5p6IQf/Lx+wC2LDbF28Pe51WGUL+5CKQmo7VeOgcwo0Idxegeqb2XER4SjV3vTGKOXccOqkqFJOw8cyfaCQTRMHq76g/ZVg9j/4pbDDtBgLMDomducU9vsq38KfgbgTyJECgYEA13ik5JYoCz+uOb3p6g8PK8j3i1t0PtPI6HAHg+Ujo38lUGkDraz6L6UdjVvVVSVH/JB0uwogK8/cOURiRvZJ9r5T5XGPIoH/KMglMDCwC7Js3mklD8fnVJEtrGTMxYyGBaYwpPZyFdFyl5dDg38g1SQ6WhuMNeaoHrKsmlTL4j8CgYA2TaBuqhkiHIrSTt0X8aWxcbbJRCRhaYVd8R0asVLsmXCiAYDgslAFjxhOkJcP9VNhmHZyKJVITsbH5GtwDhK0Qf+u+ORHX1WOS0fp5T32BcC6OZj1F2cR4oGdrjE11TBfZiMitzhVhl1c509iE8uQPY/ljnG4XgZenewfo18jIQKBgCillp2UgetVUP2NiPHhc2A0IhaE4xHzC8RlVdWYxTdThet8U/hQWEXipQeEmmLcjI7lhU+/YkBBju6yqsNuNJe6YcM3v+OnmEXOM826cYtTVlxCg35NnKMEXBRYU5S0pJeuOSD1aKIbB733CAJnWf87PVLAPZvxbieUVyEp++grAoGAL/lqWjS1qsdxxkEfNTcDx8Ep0P9UtEHIM7f15kRx4HNI5rkkH/XoFg3NtCtZfMNx0z9CTc2OFNOF4X4gLcwKSY1HG/p3EmYbntzE/U0/FsrdxZQsT6Kgxm0JHSuAbMgsb0+nWz5NKh2F0VDjjjM3Hn7Axs/DsXvjsj3+dhjVJk0="
privateKey = '''-----BEGIN RSA PRIVATE KEY-----
MIIEogIBAAKCAQEA0HOP0n5cPrl/ztrjTg1dotwzOVU+DaX8QQj1NoSvL7aTuHSU
WD84NtsvaZ/LwmOI1MQMTt77+jzKLrZu257vHQbsm8aRRjCONmiMkMW0DjhBj5Pc
8cRBrSBbx1jeno6VMh4PN+VYR5Zg8Ikaxw1Wb9HcMilkrgKnwa5uj5Dc6OX8KCGd
YAT1ofulVhUrCBRV7reQodmoMNLYbzHv4WtTz1kIMQunuOWo0OKvIERL8TeQZRDR
wUIxCPvl8DWhCVZKt9UYv9mvvXddZXYSI8Az79nsjcjOPcAsY4Nn36xx2UJAivQi
jU60AS/EHKunmmRmdOp/Xk4lROJnc04nYuldrwIDAQABAoIBAC4cMgdM/li9reDz
GG7uk/TvosEe8xAP1IIKWjvKE/qI95pI53ux2FyCFbXWrDr+y4jNKS/VMYYEJnE4
18LrIFeabYJz5TTSjtLIQ7fOk+rFVPNOsQQl9qU2UDcDmJMYVTZ14cXqjKGhSSZM
HclEUQeBM6VA9M1tNvCoBjrpv4Qg3Tjk5pgLaAYzfS1irder3xX1TxCh8Hc2isfp
XugB4g2w1QD7sO+aocliAF+MT0pmvHkMNoVN8sDTT8MPR330XPmG8Bhtz8WI5xMQ
FvRrJ/mVusHWhG4uIArqq8b74cOhBj1YSlqJoPdv0Kd/DGwZ75gNsq0C0RsQkJgH
mbxZfuECgYEA96jl9bZioIGjRVR3seCITamQ9ZzWBSog11HA3E58T5p6IQf/Lx+w
C2LDbF28Pe51WGUL+5CKQmo7VeOgcwo0Idxegeqb2XER4SjV3vTGKOXccOqkqFJO
w8cyfaCQTRMHq76g/ZVg9j/4pbDDtBgLMDomducU9vsq38KfgbgTyJECgYEA13ik
5JYoCz+uOb3p6g8PK8j3i1t0PtPI6HAHg+Ujo38lUGkDraz6L6UdjVvVVSVH/JB0
uwogK8/cOURiRvZJ9r5T5XGPIoH/KMglMDCwC7Js3mklD8fnVJEtrGTMxYyGBaYw
pPZyFdFyl5dDg38g1SQ6WhuMNeaoHrKsmlTL4j8CgYA2TaBuqhkiHIrSTt0X8aWx
cbbJRCRhaYVd8R0asVLsmXCiAYDgslAFjxhOkJcP9VNhmHZyKJVITsbH5GtwDhK0
Qf+u+ORHX1WOS0fp5T32BcC6OZj1F2cR4oGdrjE11TBfZiMitzhVhl1c509iE8uQ
PY/ljnG4XgZenewfo18jIQKBgCillp2UgetVUP2NiPHhc2A0IhaE4xHzC8RlVdWY
xTdThet8U/hQWEXipQeEmmLcjI7lhU+/YkBBju6yqsNuNJe6YcM3v+OnmEXOM826
cYtTVlxCg35NnKMEXBRYU5S0pJeuOSD1aKIbB733CAJnWf87PVLAPZvxbieUVyEp
++grAoGAL/lqWjS1qsdxxkEfNTcDx8Ep0P9UtEHIM7f15kRx4HNI5rkkH/XoFg3N
tCtZfMNx0z9CTc2OFNOF4X4gLcwKSY1HG/p3EmYbntzE/U0/FsrdxZQsT6Kgxm0J
HSuAbMgsb0+nWz5NKh2F0VDjjjM3Hn7Axs/DsXvjsj3+dhjVJk0=
-----END RSA PRIVATE KEY-----
Add Comment'''

// helpers

def getNameFromEmail = { email ->

    (name, domain) = email.split("@")

    return name
}

def addCredential = { credential ->

    def credentials_store = Jenkins.instance.getExtensionList('com.cloudbees.plugins.credentials.SystemCredentialsProvider')[0].getStore()

    def global_domain = com.cloudbees.plugins.credentials.domains.Domain.global()
    def result = credentials_store.addCredentials(global_domain, credential)

    return result
}


// main helpers

def addWithUsernameAndPassword = { email, password ->

    username = getNameFromEmail(email)

    /// credentials-plugin
    //    https://github.com/jenkinsci/credentials-plugin/blob/master/src/main/java/com/cloudbees/plugins/credentials/impl/UsernamePasswordCredentialsImpl.java
    def scope       = CredentialsScope.GLOBAL
    def id          = "${username}_http"
    def description = "${username} with password"

    // username & password
    def credential = new UsernamePasswordCredentialsImpl(scope, id, description, username, password) 

    def result = addCredential(credential)

    return result
}

def addWithUsernameAndSource = { email, privateKeySource ->

    username = getNameFromEmail(email)

    /// ssh-credentials-plugin
    //    https://github.com/jenkinsci/ssh-credentials-plugin/blob/master/src/main/java/com/cloudbees/jenkins/plugins/sshcredentials/impl/BasicSSHUserPrivateKey.javadef scope = CredentialsScope.GLOBAL
    def scope            = CredentialsScope.GLOBAL
    def id               = "${username}_ssh"
    def jenkins_username = "{{ jenkins_admin_username }}"
    def passphrase       = ""
    def description      = "${username} with ssh private key"

    // with private (ssh) key from master
    // https://gist.github.com/hayderimran7/d6ab8a6a770cb970349e
    def credential = new BasicSSHUserPrivateKey(scope, id, jenkins_username, privateKeySource, passphrase, description)

    def result = addCredential(credential)

    return result
}


// main

def createCredential = { username, password ->

    def creds = com.cloudbees.plugins.credentials.CredentialsProvider.lookupCredentials(
        com.cloudbees.plugins.credentials.common.StandardUsernameCredentials.class,
        Jenkins.instance)

    def c = creds.findResult { it.username == username ? it : null }

    if ( c ) 
    {
        println "found credential ${c.id} for username ${c.username}"

        return
    }

    def result

    if ( password == null || password.length() == 0)
    {
        def privateKeySource = new BasicSSHUserPrivateKey.DirectEntryPrivateKeySource(privateKey)

        //def privateKeySource = new BasicSSHUserPrivateKey.UsersPrivateKeySource()
        
        /*
            BasicSSHUserPrivateKey.DirectEntryPrivateKeySource
            BasicSSHUserPrivateKey.FileOnMasterPrivateKeySource
            BasicSSHUserPrivateKey.UsersPrivateKeySource            --> ~/.ssh/id_rsa
            BasicSSHUserPrivateKey.CredentialsSnapshotTakerImpl
        */

        result = addWithUsernameAndSource(username, privateKeySource)
    }
    else
    {
        result = addWithUsernameAndPassword(username, password)
    }


    if (result) 
    {
        println "credential added for ${username}" 
    } 
    else 
    {
        println "failed to add credential for ${username}"
    }
}


// scripts
createCredential('abs@tutk.com', null)


