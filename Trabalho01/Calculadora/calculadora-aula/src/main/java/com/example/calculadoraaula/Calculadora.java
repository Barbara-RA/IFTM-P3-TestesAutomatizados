package com.example.calculadoraaula;

public class Calculadora {

    public Calculadora(){
        System.out.println("Criou a calculadora");
    }

    public int somar(int num1, int num2) throws Exception {
        if (num1<0 || num1 > 100)
            throw new Exception("Número 1 fora dos limites aceitos (0 a 100)");
        return num1 + num2;
    }

    public int subtrair(int num1, int num2) {
        return num1 + num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 + num2;
    }

    public int dividir(int num1, int num2) throws Exception {
        if (num2 == 0)
            throw new Exception("Divisão por zero!!!!");
        return num1/num2;
    }
}
