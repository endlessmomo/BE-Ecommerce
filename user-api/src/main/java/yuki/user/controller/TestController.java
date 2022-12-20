package yuki.user.controller;

import feign.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yuki.user.service.EmailSendService;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final EmailSendService emailSendService;

    @GetMapping
    public Response sendTestEmail() {
        return emailSendService.sendEmail();
    };
}
