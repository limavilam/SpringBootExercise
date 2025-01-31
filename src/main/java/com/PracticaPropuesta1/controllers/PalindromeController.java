package com.PracticaPropuesta1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador para verificar palíndromos.
 */

@RestController
public class PalindromeController {

    /**
     * Endpoint para verificar si una palabra es un palíndromo
     * @param palindromeWord la palabra a verificar
     * @return Un mensaje indicando si la palabra es un palíndromo o no
     */

    @GetMapping("/validar-palindromo/{palindromeWord}")
    public String Palindrome(@PathVariable String palindromeWord) {
        if (isPalindrome(palindromeWord)) {
            return "La palabra " + palindromeWord + " es palindromo.";
        }else {
            return "La palabra " + palindromeWord + " NO es palindromo.";
        }
    }

    /**
     * Metodo para verificar si una palabra es un palíndromo
     * @param palindromeWord la palabra a verificar
     * @return Un mensaje indicando si la palabra es un palíndromo o no
     */

    /*
    Este es el parámetro que vamos a tomar desde el retorno de Palindrome
     */
    private boolean isPalindrome(String palindromeWord) {
        palindromeWord = palindromeWord.toLowerCase();
        int length = palindromeWord.length();
        //No necesito hacer toda la iteración sino la mitad
        for (int i = 0; i < length / 2; i++) {
            //Radar = 5-0-1:4 --> R(0)A(1)D(2)A(3)R(4)
            if(palindromeWord.charAt(i) != palindromeWord.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
