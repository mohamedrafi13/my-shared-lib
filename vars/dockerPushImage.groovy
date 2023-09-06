/*def call (String project, String ImageTag, String dockerHub) {
    withCredentials([usernamePassword(
        credentialsId: "docker",
        usernameVariable: "user",
        passwordVariable: "pass"
    )]) {
        sh "docker login -u '$user' -p '$pass'"
    }
    sh "docker image push ${dockerHub}/${project}:${ImageTag}"
    sh "docker image push ${dockerHub}/${project}:latest"
}*/

def call(String awsAccountID, String region, String ecrRepoName) {
    sh """
    aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${awsAccountID}.dkr.ecr.${region}.amazonaws.com
    docker push ${awsAccountID}.dkr.ecr.${region}.amazonaws.com/${ecrRepoName}:latest
    """
    
}

 