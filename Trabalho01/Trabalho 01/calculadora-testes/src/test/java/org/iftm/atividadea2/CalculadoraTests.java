package org.iftm.atividadea2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTests {

    //Implemente um teste para o construtor sem parâmetro de entrada. (Utilize o método getMemoria para verificar se o valor da memória é 0).
    @Test
    @DisplayName("Teste Construtor sem parâmetro")
    public void testConstrutorSemParametro() {

        //arrange: cenário de teste
        int resultadoEsperado = 0;

        //act: ação que será testada
        Calculadora calculadora = new Calculadora();
        int resultadoObtido = calculadora.getMemoria();

        //assert: verificação se o resultado é o esperado
        assertEquals(resultadoEsperado, resultadoObtido, "A memória está correta.");
        
    }

    //Implemente os testes para o construtor com parâmetro: recebendo o valor 3.
    @Test
    @DisplayName("Teste Construtor com parâmetro")
    public void testConstrutorComParametro() {

        //arrange
        int valorEntrada = 3;
        int resultadoEsperado = 3;

        //act
        Calculadora calculadora = new Calculadora(valorEntrada);
        int resultadoObtido = calculadora.getMemoria();

        //assert
        assertEquals(resultadoEsperado, resultadoObtido, "A memória está correta.");
        
    }

    //Para os demais testes utilize o construtor com valor 3 (sugestão).
    //Implemente os testes do método somar:somar um número negativo
    @Test
    @DisplayName("Teste Somar um número negativo")
    public void testSomarNumeroNegativo() {

        //arrange
        int valorEntrada = -3;
        int resultadoEsperado = 0;

        //act
        Calculadora calculadora = new Calculadora(3);
        calculadora.somar(valorEntrada);
        int resultadoObtido = calculadora.getMemoria();

        //assert
        assertEquals(resultadoEsperado, resultadoObtido, "Teste de soma por número negativo correto.");
        
    }


    //Implemente os testes do método subtrair: subtrair um número positivo.
    @Test
    @DisplayName("Teste Subtrair um número positivo")
    public void testSubtrairNumeroPositivo() {

        //arrange
        int valorEntrada = 3;
        int resultadoEsperado = 0;

        //act
        Calculadora calculadora = new Calculadora(3);
        calculadora.subtrair(valorEntrada);
        int resultadoObtido = calculadora.getMemoria();

        //assert
        assertEquals(resultadoEsperado, resultadoObtido, "Teste de subtração por número positivo correto.");
        
    }

    //Implemente os testes do método multiplicar: multiplicar um número negativo.
    @Test
    @DisplayName("Teste Multiplicar um número negativo")
    public void testMultiplicarNumeroNegativo() {

        //arrange
        int valorEntrada = -3;
        int resultadoEsperado = 0;

        //act
        Calculadora calculadora = new Calculadora(3);
        calculadora.multiplicar(valorEntrada);
        int resultadoObtido = calculadora.getMemoria();

        //assert
        assertEquals(resultadoEsperado, resultadoObtido, "Teste de multiplicação por número negativo correto.");
        
    }

    //Implemente os testes do método dividir: dividir por valor 0 e dividir por um valor positivo.A divisão por zero deverá retornar uma exception.
    @Test
    @DisplayName("Teste Dividir por valor 0")
    public void testDividirPorZero() {

        //arrange
        int valorEntrada = 0;
        String resultadoEsperado = "Divisão por zero!!!";

        //act
        Calculadora calculadora = new Calculadora(3);
        String resultadoObtido = "";
        try {
            calculadora.dividir(valorEntrada);
        } catch (Exception e) {
            resultadoObtido = e.getMessage();
        }

        //assert
        assertEquals(resultadoEsperado, resultadoObtido, "Teste de divisão por zero correto.");
        
    }

    @Test
    @DisplayName("Teste Dividir por valor positivo")
    public void testDividirPorPositivo() {

        //arrange
        int valorEntrada = 3;
        int resultadoEsperado = 1;

        //act
        Calculadora calculadora = new Calculadora(3);
        int resultadoObtido = 0;
        try {
            calculadora.dividir(valorEntrada);
            resultadoObtido = calculadora.getMemoria();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //assert
        assertEquals(resultadoEsperado, resultadoObtido, "Teste de divisão por valor positivo correto.");
    }

    //Implemente os testes do método exponenciação: exponenciar a memória por 1 e por 10. Se a entrada for um valor maior que 10 deverá retornar uma exception

    @Test
    @DisplayName("Teste Exponenciar a memória por 1")
    public void testExponenciarPor1() {

        //arrange
        int valorEntrada = 1;
        int resultadoEsperado = 10;

        //act
        Calculadora calculadora = new Calculadora(10);
        int resultadoObtido = 0;
        try {
            calculadora.exponenciar(valorEntrada);
            resultadoObtido = calculadora.getMemoria();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //assert
        assertEquals(resultadoEsperado, resultadoObtido, "Teste de exponenciação por 1 correto.");
    }

    @Test
    @DisplayName("Teste Exponenciar a memória por 10")
    public void testExponenciarPor10() {

        //arrange
        int valorEntrada = 10;
        String resultadoEsperado = "Expoente incorreto, valor máximo é 10.";

        //act
        Calculadora calculadora = new Calculadora(3);
        String resultadoObtido = "";
        try {
            calculadora.exponenciar(valorEntrada);
        } catch (Exception e) {
            resultadoObtido = e.getMessage();
        }
        //assert
        assertEquals(resultadoEsperado, resultadoObtido, "Teste de exponenciação por 10 correto.");
    }

    //Implemente os testes para o método zerarMemória. (Utilize o método getMemoria para verificar se o valor da memória é 0).
    @Test
    @DisplayName("Teste Zerar Memória")
    public void testZerarMemoria() {

        //arrange
        int resultadoEsperado = 0;

        //act
        Calculadora calculadora = new Calculadora(3);
        calculadora.zerarMemoria();
        int resultadoObtido = calculadora.getMemoria();

        //assert
        assertEquals(resultadoEsperado, resultadoObtido, "Teste de zerar memória correto.");
        
    }
}
