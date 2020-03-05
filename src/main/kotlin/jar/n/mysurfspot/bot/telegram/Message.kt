package jar.n.mysurfspot.bot.telegram

enum class Message(val value: String) {
    START("/start"),
    FORECAST("/forecast");

    override fun toString(): String {
        return value;
    }

}