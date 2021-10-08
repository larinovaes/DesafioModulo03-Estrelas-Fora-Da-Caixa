package br.com.zup;

import java.util.Scanner;

public class Sistema {

    public static Scanner dadosUsarios(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
}
