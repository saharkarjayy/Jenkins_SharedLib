def call(String GitUrl, String GitBranch){
  echo " this is cloning the code"
  git url: "${GitUrl}", branch: "${GitBranch}"
}
