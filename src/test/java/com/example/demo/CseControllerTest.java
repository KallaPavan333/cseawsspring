package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CseControllerTest {

    @Autowired
    CseController c;

    @Test
    void testAddCSE() {
        String result = c.addCSE(2, 3);
        assertEquals("5 23mh1a05h3", result);
    }
}
