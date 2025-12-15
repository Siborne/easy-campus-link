package org.bytefly;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EasyCampusLinkServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyCampusLinkServerApplication.class, args);
        log.info("启动成功");
        log.info("项目后台基地址:http://localhost:8080/");
        log.info("项目后台接口地址:http://localhost:8080/swagger-ui.html");
    }

}
