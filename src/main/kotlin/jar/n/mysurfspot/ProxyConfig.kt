package jar.n.mysurfspot

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.telegram.telegrambots.ApiContextInitializer
import org.telegram.telegrambots.bots.DefaultBotOptions
import org.telegram.telegrambots.meta.ApiContext


@Configuration
class ProxyConfig {


    @Bean
    fun defaultOptions(): DefaultBotOptions {
        ApiContextInitializer.init()
        return ApiContext.getInstance(DefaultBotOptions::class.java)
    }
}