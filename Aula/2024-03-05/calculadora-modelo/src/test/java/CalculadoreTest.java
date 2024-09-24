import org.ex.Calculadora;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalculadoreTest {
    // informa o construtor
    private static Calculadora calc;


    // instancia o objeto apenas uma vez e como o BeforeAll é static, o construtor deve ser static.
    @BeforeAll
    static void inicializarTeste (){
        System.out.println("Começou o teste!!!!!!!");
        calc = new Calculadora();
        
    }

    @BeforeEach
    void instanciarObjetos(){
        System.out.println("Iniciando caso de teste");
    };

    @Test
    public void testarSomaDoisInteirosRetornaCorreto() throws Exception{
        System.out.println("Início teste 01");
        // AAA - Arrange
        //cenário de teste
        int numero1 = 10;
        int numero2 = 20;
        int resultadoEsperado = 30;
        // AAA - ACT
        //executa
        int resultadoObtido= calc.somar(numero1,numero2);
        //valida resultado
        // if (resultado!=resultadoEsperado){
        // System.out.println("Oops! Deu um resultado não esperado: "+resultado);
        // }
        // else System.out.println("OK! Passou do teste.");
        // AAA - Assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }
    
    @Test
    public void testarPrimeiroNumeroExtrapolaLimiteSuperior() throws Exception{
        System.out.println("Início teste 02");
        //cenário de teste
        int numero1 = 100;
        int numero2 = 20;
        int resultadoEsperado = 120;
        //executa
        int resultadoObtido= calc.somar(numero1,numero2);
        // resultado
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);

    }

    
    @Test
    public void testarPrimeiroNumeroExtrapolaLimiteInferior() throws Exception{
        System.out.println("Início teste 03");
        //cenário de teste
        int numero1 = 0;
        int numero2 = 20;
        int resultadoEsperado = 20;
        //executa
        int resultadoObtido= calc.somar(numero1,numero2);
        // resultado
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }


    // aprendendo sobre Exception
    @Test
    public void testaFalhaPrimeiroNumeroExtrapolaLimiteSuperior(){
        System.out.println("Início teste 04");
        //cenário de teste
        int numero1 = 101;
        int numero2 = 20;
        //executa
  
        Assertions.assertThrows(Exception.class,( )->{calc.somar(numero1,numero2);});
    }


    @Test
    public void testaFalhaPrimeiroNumeroExtrapolaLimiteInferior(){
        System.out.println("Início teste 05");
        //cenário de teste
        int numero1 = -1;
        int numero2 = 20;
        //executa
        Assertions.assertThrows(Exception.class,( )->{calc.somar(numero1,numero2);});
    }

    
    @Test
    @DisplayName("Testa a divisão de dois números inteiros corretos, ou seja, divisor diferente de zero.")
    void testDividirDoisInteirosCorretos() throws Exception{
        // Arrange
        int numero1 = 9;
        int numero2 = 3;
        int resultadoEsperado = 3;

        // Act
        int resultadoObtido = calc.dividir(numero1,numero2);

        // Assert
        Assertions.assertEquals(resultadoEsperado,resultadoObtido);
    }

    @Test
    void testDividirDoisInteirosIncorretosDivisorZero(){
        // Arrange
        int numero1 = 9;
        int numero2 = 0;

        // Act and Assert
        Assertions.assertThrows(Exception.class,()->{calc.dividir(numero1, numero2);}, "Divisã por zero");


        // Não é recomedado pois não espero um resultado e sim um erro.
        // try {
        //     int resultadoObtido = calc.dividir(numero1,numero2);
        // } catch (ArithmeticException e) {
            
        // }catch(Exception e){
            
        // }
    }

    @AfterEach
    void finalizarCadaMetodoTeste(){
    System.out.println("Finalizando caso de teste");
    };

    @AfterAll
    static void finalizarTeste (){
        System.out.println("Fim do teste!!!!!!!");
    }
    
    
}
