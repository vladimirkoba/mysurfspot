package jar.n.mysurfspot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@EnableFeignClients
@SpringBootApplication
class MysurfspotApplication

fun main(args: Array<String>) {
    runApplication<MysurfspotApplication>(*args)
}

//com3
//mycommitintonew feature
//new fds
//COM5

