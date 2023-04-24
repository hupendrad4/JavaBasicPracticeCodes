def call(Map params) {
    def currentJob = params.currentJob
    def currentUser = params.currentUser

    def var_email = "example@jenkins.com" // Replace with your desired value

    println "The value of var_email for ${currentUser} in ${currentJob} is: ${var_email}"

    return var_email
}
