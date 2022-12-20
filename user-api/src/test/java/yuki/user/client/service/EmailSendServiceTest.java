package yuki.user.client.service;

import feign.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yuki.user.config.FeignConfig;
import yuki.user.service.EmailSendService;

@SpringBootTest
class EmailSendServiceTest {
    @Autowired
    private EmailSendService emailSendService;

    @Test
    @DisplayName("이메일 전송 테스트")
    void EmailTest(){
        emailSendService.sendEmail();
    }

}