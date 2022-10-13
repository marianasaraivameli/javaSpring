package com.example.poospring01.aula01.praticaIntegradora.springJava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumerosRomanosTest {

    @ParameterizedTest
    @CsvSource({"1, I", "2, II", "5, V", "7, VII", "10, X", "50, L"})
    @DisplayName("Teste romanos conversão")
    void converterEmRomanos_retornoSucesso_quandoConverterResultado(int number, String romano) {
        String nr01 = NumerosRomanos.converterEmRomanos(number);

        assertThat(nr01).isEqualTo(romano);
    }
}
