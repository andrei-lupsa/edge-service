package com.polarbookshop.edgeservice.testcontainers;

import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;

public interface TestContainers {

    @Container
    @ServiceConnection("redis")
    GenericContainer<?> postgresContainer = new GenericContainer<>("redis:7.4")
            .withExposedPorts(6379);

}
