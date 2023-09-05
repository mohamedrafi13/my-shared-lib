/*def call(String project, String ImageTag, String dockerHub) {
    sh """
    trivy image ${dockerHub}/${project}:latest > scan.txt
    cat scan.txt
    
    """
} */

def call(String awsAccountID, String region, String ecrRepoName) {
    sh """
    trivy image ${awsAccountID}.dkr.ecr.${region}.amazonaws.com/${ecrRepoName}:latest > scan.txt
    """
    
} 