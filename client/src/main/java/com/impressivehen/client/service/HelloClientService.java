package com.impressivehen.client.service;


import com.impressivehen.model.HelloRequest;
import com.impressivehen.model.HelloResponse;
import com.impressivehen.model.HelloServiceGrpc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import net.devh.boot.grpc.client.inject.GrpcClient;

@Slf4j
@Service
public class HelloClientService {
    @GrpcClient("grpc-hello-server")
    private HelloServiceGrpc.HelloServiceBlockingStub stub;

    public void sayHello(String firstName, String lastName) {
        HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
                .setFirstName("Shawn")
                .setLastName("Hu")
                .build());

        log.info("helloResponse: {}", helloResponse);
    }
}
