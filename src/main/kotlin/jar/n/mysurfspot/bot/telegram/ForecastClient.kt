package jar.n.mysurfspot.bot.telegram

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient("forecastClient", url = "\${forecast.api.url}")
interface ForecastClient {

    @RequestMapping(method = [RequestMethod.GET])
    fun forecast(): String
}