package org.bytefly;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@Slf4j
public class EasyCampusLinkServerApplication {

    public static void main(String[] args) {
        ConfigurableEnvironment environment = SpringApplication.run(EasyCampusLinkServerApplication.class, args).getEnvironment();
        log.info("启动成功");
        log.info("""
                            Application:'{}' is running Success!
                            Local URL: http://localhost:{}
                            Document: http://localhost:{}/doc.html
                            --------------------------------------------
                        """,
                environment.getProperty("spring.application.name"),
                environment.getProperty("server.port"),
                environment.getProperty("server.port")
        );
    }

}
