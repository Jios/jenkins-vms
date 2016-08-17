import jenkins.model.*

def instance = Jenkins.getInstance()

// configure slack
def slack = Jenkins.instance.getExtensionList(
  jenkins.plugins.slack.SlackNotifier.DescriptorImpl.class
)[0]

def params = [
  slackTeamDomain: "{{ jenkins_TEAM }}",
  slackToken: "{{ jenkins_TOKEN }}",
  slackRoom: "{{ jenkins_CHANNEL }}",
  slackBuildServerUrl: "{{ jenkins_URL }}",
  slackSendAs: "{{ email_name }}"
]

def req = [
  getParameter: { name -> params[name] }
] as org.kohsuke.stapler.StaplerRequest

slack.configure(req, null)

slack.save()
