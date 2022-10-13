package com.example.poospring01.aula01.praticaIntegradora.springJava;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(RomanosController.class)
class RomanosControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @ParameterizedTest
    @CsvSource({"1, I", "2, II", "5, V", "7, VII", "10, X", "50, L"})
    @DisplayName("Teste romanos conversão")
    void transformaNumeroEmRomano_retornoSucesso_quandoRetornaNumeroConvertido(int numero, String romano) throws Exception {
        ResultActions response = mockMvc.perform(
                get("/romanos/{numero}", numero)
                    .contentType(MediaType.APPLICATION_JSON));

        response.andExpect(jsonPath("$").value(romano));
                // outra forma de fazer, segundo o Stackoverflow
                // .andExpect(content().string(romano));
    }
}