package com.polarbookshop.edgeservice;

import com.polarbookshop.edgeservice.testcontainers.TestContainers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.context.ImportTestcontainers;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
@ImportTestcontainers(TestContainers.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EdgeServiceApplicationTests {

    @Autowired
    private WebTestClient webClient;

    @Test
    void contextLoads() {
        webClient.get().uri("/books").exchange().expectStatus().isOk();
    }

}
