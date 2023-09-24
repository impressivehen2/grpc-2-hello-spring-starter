package com.impressivehen.client.runner;


import com.impressivehen.client.service.HelloClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HelloClientRunner implements CommandLineRunner {

    @Autowired
    private HelloClientService helloClientService;

    @Override
    public void run(String... args) throws Exception {
        helloClientService.sayHello("Shawn", "Hu");
    }
}
