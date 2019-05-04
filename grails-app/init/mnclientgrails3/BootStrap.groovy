package mnclientgrails3

import clients.RecaptchaClient
import org.springframework.beans.factory.annotation.Autowired

class BootStrap {

    @Autowired
    RecaptchaClient recaptchaClient

    def init = { servletContext ->
        recaptchaClient.verify('example', 'foo')
    }
    def destroy = {
    }
}
