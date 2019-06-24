import clients.RecaptchaClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.spring.beans.MicronautBeanProcessor

// Place your Spring DSL code here
beans = {
    httpClientBeanProcessor(MicronautBeanProcessor, [Client])
}
