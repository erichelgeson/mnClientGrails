package clients;

import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

import java.util.Map;

@Client("https://www.google.com/recaptcha/api")
interface RecaptchaClient {
    @Post("/siteverify")
    Single<Map> verify(String secret, String response);
}
