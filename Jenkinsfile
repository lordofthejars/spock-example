node {
    docker.image("java:8").inside {
        git url:'https://github.com/lordofthejars/spock-example.git'
        sh "./gradlew clean build"
    }
}