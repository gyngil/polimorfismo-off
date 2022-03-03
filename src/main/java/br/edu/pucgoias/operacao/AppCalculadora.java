package br.edu.pucgoias.operacao;

public class AppCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int soma = 0;
        System.out.println(soma);

        soma = calculadora.somar(1);
        System.out.println(soma);

        soma = calculadora.somar(1,1);
        System.out.println(soma);

        soma = calculadora.somar(1,1,1);
        System.out.println(soma);

        soma = calculadora.somar(1,1,1,1);
        System.out.println(soma);

    }
}
