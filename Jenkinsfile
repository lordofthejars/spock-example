stage 'Dev'

node {
        git url:'https://github.com/lordofthejars/spock-example.git'
        sh "./gradlew clean build"
}

stage 'QA'

parallel(
    build1: {
        node {
            git url:'https://github.com/lordofthejars/spock-example.git'
            sh "./gradlew clean build"
        }
    },
    build2: {
        node {
            git url:'https://github.com/lordofthejars/spock-example.git'
            sh "./gradlew clean build"
        }
    }
)