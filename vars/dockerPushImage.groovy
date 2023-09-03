def call (String project, String ImageTag, String dockerHub) {
    withCredentials([usernamePassword(
        credentialsId: "docker",
        usernameVariable: "user",
        passwordVariable: "pass"
    )]) {
        sh "docker login -u '$user' -p '$pass'"
    }
    sh "docker image push ${dockerhub}/${project}:${ImageTag}"
    sh "docker image push ${dockerhub}/${project}:latest"
}

