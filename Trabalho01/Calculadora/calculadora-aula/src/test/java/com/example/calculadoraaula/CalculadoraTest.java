package com.example.calculadoraaula;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private static Calculadora calc;

    @BeforeAll
    static void inicializarTeste(){
        System.out.println("Começou o teste!!!!!!!!");
        calc = new Calculadora();
    }

    @BeforeEach
    void instanciarObjetos(){
        System.out.println("Inicializando caso de teste");        
    }
    
    @Test
    void testSomarDoisInteirosCorretoLimiteSuperior() throws Exception {
        
        System.out.println("Inicio teste 1");
        // Arrange
        int numero1 = 100;
        int numero2 = 20;
        int resultadoEsperado = 120;

        // Act
        int resultadoObtido = calc.somar(numero1, numero2);

        // Assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    void testSomarDoisInteirosCorretoLimiteInferior() throws Exception {
        System.out.println("Inicio teste 2");
        
        // Arrange
        int numero1 = 0;
        int numero2 = 20;
        int resultadoEsperado = 20;

        // Act
        int resultadoObtido = calc.somar(numero1, numero2);

        // Assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    /*
     @Test
    void testFalhaSomarComNumero1AcimaDoLimiteSuperior() {
        Calculadora calc = new Calculadora();
        // Arrange
        int numero1 = 101;
        int numero2 = 20;

        // Act e Assert
        Assertions.assertThrows(Exception.class, () -> {
            calc.somar(numero1, numero2);
        });
    }

    @Test
    void testFalhaSomarComNumero1AbaixoDoLimiteInferior() throws Exception {
        Calculadora calc = new Calculadora();
        // Arrange
        int numero1 = -1;
        int numero2 = 20;

        // Act e Assert
        Assertions.assertThrows(Exception.class, () -> {
            calc.somar(numero1, numero2);
        });
    } 
    */

    @Test
    @DisplayName("Testa a divisão de dois números inteiros corretos, ou seja, divisor diferente de zero.")
    void testDividirDoisInteirosCorretos() throws Exception{
        // Arrange
        int numero1 = 9;
        int numero2 = 3;
        int resultadoEsperado = 3;

        // Act
        int resultadoObtido = calc.dividir(numero1, numero2);

        // Assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    @DisplayName("Testa a divisão de dois números inteiros incorretos, ou seja, divisor a zero.")
    void testDividirDoisInteirosIncorretosDivisorZero(){
        // Arrange
        int numero1 = 9;
        int numero2 = 0;       

        // Act and Assert
        Assertions.assertThrows(Exception.class, ()->{calc.dividir(numero1, numero2);}, "A classe calculadora não retornou a exception esperada.");
        
    }

    @AfterEach
    void finalizarCadaMetodoTeste(){
        System.out.println("Finalizando caso de teste");        
    }

    @AfterAll
    static void finalizarTeste(){
        System.out.println("Fim do teste!!!!!");
    }

}
