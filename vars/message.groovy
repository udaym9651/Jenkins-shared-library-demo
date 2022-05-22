def call(Map config = [:]){
  loadscriptfile(name : './Welcome.sh')
  sh "./Welcome.sh ${config.name} ${config.company}"
}
