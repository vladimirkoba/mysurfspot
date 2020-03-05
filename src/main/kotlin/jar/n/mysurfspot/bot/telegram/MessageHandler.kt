package jar.n.mysurfspot.bot.telegram


interface MessageHandler {
    fun handle(message: String?): String;
}