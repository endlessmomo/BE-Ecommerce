package yuki.user.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import yuki.user.domain.SignUpForm;
import yuki.user.domain.model.Customer;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SignUpCustomerServiceTest {
    @Autowired
    private SignUpCustomerService service;

    @Test
    @DisplayName("등록 관련")
    void signUp(){
        //given
        SignUpForm form = SignUpForm.builder()
                .name("name")
                .birth(LocalDate.now())
                .email("soohyuk96@naver.com")
                .password("1")
                .phone("01000000000")
                .build();
        //when

        //then
        Assert.isTrue(service.signUp(form).getId() != null, "bug");
    }
}