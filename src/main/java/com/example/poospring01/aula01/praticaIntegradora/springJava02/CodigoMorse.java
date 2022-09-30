package com.example.poospring01.aula01.praticaIntegradora.springJava02;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/codigomorse")
public class CodigoMorse {
    // https://stackoverflow.com/questions/29706653/morse-code-translatorsimple

    public String codigoMorseDecodificado(String texto) {
        char[] portuguese = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?'};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.."};

        String userInput = texto.toLowerCase();

        char[] chars = userInput.toCharArray();

        String str = "";
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < portuguese.length; j++) {

                if (portuguese[j] == chars[i]) {
                    str = str + morse[j] + " ";
                }
            }
        }
        return texto + ": " + str;
    }
}
