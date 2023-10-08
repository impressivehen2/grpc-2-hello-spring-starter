# grpc - Hello - Spring Boot Starter
## Links
#### (a) Tutorial
https://imertyildiz.medium.com/grpc-in-spring-boot-client-server-1d8803db7086

#### (b) net.devh GrpcServerProperties
https://javadoc.io/doc/net.devh/grpc-server-spring-boot-autoconfigure/latest/net/devh/boot/grpc/server/config/GrpcServerProperties.html

#### (c) grpc-spring-boot-starter/examples
https://github.com/yidongnan/grpc-spring-boot-starter/tree/master/examples

#### (d) protobuf-maven-plugin
https://www.xolstice.org/protobuf-maven-plugin/compile-mojo.html

## Summary
(a) This repo is version 2 of https://github.com/impressivehen2/grpc-1-hello-stock#communication-patterns
to use Spring Boot Starter for auto setup

(b) .proto files needs to be put in each service to build target files, tested 
not able import common built files

## Steps
#### 1. mvn clean install

#### 2. File -> Project Structure -> module -> add generated-sources as Sources

#### 3. Start Server, Start Client

## Knowledge
#### (a) io.grpc.netty.NegotiationType
https://grpc.github.io/grpc-java/javadoc/io/grpc/netty/NegotiationType.html

## Debug
#### (a) [NOT-RESOLVED] package com.impressivehen.common does not exist
when running "mvn clean install" server, client module gives
-> package com.impressivehen.common does not exist
even though ide doesn't complain 

#### (b) Mac M1 Chip: Unsupported platform: protoc-3.11.4-osx-aarch_64.exe
https://github.com/os72/protoc-jar/issues/93

```aidl
<configuration>
    <protocArtifact>com.google.protobuf:protoc:3.21.1</protocArtifact>
```

