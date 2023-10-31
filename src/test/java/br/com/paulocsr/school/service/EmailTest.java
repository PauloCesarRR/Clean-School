package br.com.paulocsr.school.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.paulocsr.school.vo.Email;

@SpringBootTest
public class EmailTest {
    @Test
    void shouldntCreateEmailWithAddressInvalid(){
         assertThrows(IllegalArgumentException.class,
            () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
            () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
            () -> new Email("invalid"));
    }
}
