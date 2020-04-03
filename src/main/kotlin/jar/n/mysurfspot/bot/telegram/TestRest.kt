package jar.n.mysurfspot.bot.telegram

import org.springframework.stereotype.Component
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.PostConstruct

@Component
class TestRest(private val client: ForecastClient) {


    @PostConstruct
    fun test() {
        println(client.forecast()[0]?.timestamp ?: "none")
    }


    fun a(): String {

        return "some api call"
                .also { print(it) }

    }

    // some change
    // some kom2
}