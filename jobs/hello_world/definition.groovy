pipelineJob('Hello world') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('zloyplohoy/jenkins_the_ephemeral', 'master', 'ssh')
                        credentials('github_deploy_key')
                    }
                    branch('master')
                }
            }
            lightweight()
            scriptPath('jobs/hello_world/pipeline.groovy')
        }
    }
}
