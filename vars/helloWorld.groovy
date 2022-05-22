def call(Map config = [:]){
  sh "echo Hello ${config.name} , Welcome to ${config.company}"
}
