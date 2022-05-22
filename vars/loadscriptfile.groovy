def call(Map config = [:]){
  def scriptcontents = libraryResource "${config.name}"
  WriteFile file: "${config.name}" , text: scriptcontents
  sh "chmod a+x ./${config.name}"
}
