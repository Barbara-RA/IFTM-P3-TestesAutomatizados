package org.ex;

public class Calculadora {
    public int somar(int num1, int num2) throws Exception {
        // return num1 + num2;
        
        // Corrigindo codigo
        if (num1<0||num1>100) {
            // return -1000;
            throw new Exception("Número acima/abaixo dos limites");
        }
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
            throw new Exception("Divisão por zero!!");
        return num1 / num2;
    }
}
