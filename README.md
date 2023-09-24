# grpc - Hello - Spring Boot Starter
## Links
#### Tutorial
https://imertyildiz.medium.com/grpc-in-spring-boot-client-server-1d8803db7086

#### net.devh GrpcServerProperties
https://javadoc.io/doc/net.devh/grpc-server-spring-boot-autoconfigure/latest/net/devh/boot/grpc/server/config/GrpcServerProperties.html

#### grpc-spring-boot-starter/examples
https://github.com/yidongnan/grpc-spring-boot-starter/tree/master/examples

#### protobuf-maven-plugin
https://www.xolstice.org/protobuf-maven-plugin/compile-mojo.html

## Summary
This repo is version 2 of https://github.com/impressivehen2/grpc-1-hello-stock#communication-patterns
to use Spring Boot Starter for auto setup

## Steps
#### 1. mvn clean compile

#### 2. Start Server

#### 3. Start Client

## Knowledge
#### io.grpc.netty.NegotiationType
https://grpc.github.io/grpc-java/javadoc/io/grpc/netty/NegotiationType.html

#### (b)

## Debug
#### (a) [NOT-RESOLVED] package com.impressivehen.common does not exist
when running "mvn clean install" server, client module gives
-> package com.impressivehen.common does not exist
even though ide doesn't complain 

#### (b) 