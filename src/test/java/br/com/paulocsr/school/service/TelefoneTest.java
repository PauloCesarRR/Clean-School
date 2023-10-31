package br.com.paulocsr.school.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.paulocsr.school.vo.Telefone;

@SpringBootTest
public class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class,
            () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
            () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
            () -> new Telefone("1", "123456789"));
    }
}
