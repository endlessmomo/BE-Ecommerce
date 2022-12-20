package yuki.user.service;

import feign.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yuki.user.client.MailgunClient;
import yuki.user.client.mailgun.SendMailForm;

@Service
@RequiredArgsConstructor
public class EmailSendService {
    private final MailgunClient mailgunClient;

    public Response sendEmail() {
        SendMailForm form = SendMailForm.builder()
                .from("yuki@test.com")
                .to("soohyuk96@naver.com")
                .subject("MailgGun Test")
                .text("메일건 테스트입니다.").build();

        return mailgunClient.sendEmail(form);
    }
}
