package jar.n.mysurfspot.bot.telegram

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class MessageHandlerImpl(
        private val forecastClient: ForecastClient
) : MessageHandler {
    private val log = LoggerFactory.getLogger(javaClass)
    override fun handle(message: String?): String {
        when (message) {
            Message.START.value -> return getStartMessage()
            Message.FORECAST.value -> return getForecastMessage()
        }
        return getDefaultMessage()
    }

    private fun getDefaultMessage(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun getForecastMessage(): String {
        val forecast = forecastClient.forecast();
        log.debug("Received forecast from api: ", forecast);
        return forecast.substring(1..20)
    }

    private fun getStartMessage(): String {
        return "hi"
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}