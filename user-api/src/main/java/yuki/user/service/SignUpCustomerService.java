package yuki.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yuki.user.domain.SignUpForm;
import yuki.user.domain.model.Customer;
import yuki.user.domain.repository.CustomerRepository;

@Service
@RequiredArgsConstructor
public class SignUpCustomerService {
    private final CustomerRepository customerRepository;

    public Customer signUp(SignUpForm form){
        return customerRepository.save(Customer.from(form));
    }
}
