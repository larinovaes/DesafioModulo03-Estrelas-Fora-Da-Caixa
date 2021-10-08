package br.com.zup;

public class Main {


    public static void main(String[] args) {

        boolean menuDeRepeticao = true;

        while (menuDeRepeticao) {

            try {
                menuDeRepeticao = Sistema.executarSistem();
            } catch (Exception mensagemErro){
                System.out.println(mensagemErro.getMessage());
            }
    }
    }
}
