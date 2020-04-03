package jar.n.mysurfspot.bot.telegram

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import org.telegram.telegrambots.bots.DefaultBotOptions
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update


//@Service
class ForecastBot(
        options: DefaultBotOptions,
        private val handler: MessageHandler
) : TelegramLongPollingBot(options) {

    private val log = LoggerFactory.getLogger(javaClass)

    @Value("\${bot.username}")
    private val botUsername: String? = null
    @Value("\${bot.token}")
    private val botToken: String? = null


    override fun getBotUsername(): String? {
        return botUsername;
    }

    override fun getBotToken(): String? {
        return botToken;
    }


    override fun onUpdateReceived(update: Update?) {
        update!!
        val chatId = update.message.chatId

        log.info("Received message {} from chatId {}", update.message.text, chatId)
        val response = handler.handle(update.message.text)
        log.info("Sending message {} to chatId {}", response, chatId)
        println(String.format("Sending response: %s", response))
        val message: SendMessage = SendMessage()
                .setChatId(chatId)
                .setText(response)
        execute(message)
    }

    @Scheduled(fixedDelay = 1000 * 600)
    fun sendMessage() {

        println("hello")
    }


}