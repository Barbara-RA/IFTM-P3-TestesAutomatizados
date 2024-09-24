package org.iftm.aula_pessoa_tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PessoaTests {

    private Pessoa pessoa;

    @BeforeEach
    public void instanciarObjetos() {
        pessoa = new Pessoa();
    }

    @Test
    @DisplayName("Caso de teste que verifica o nome válido e que  não esteja nos limites")
    public void testarNomeMinusculoValidoDentroLimite() {
        // Arrange
        String entradaValida = "joao";
        String resultadoEsperado = "JOAO";

        // ACT
        pessoa.setNome(entradaValida);
        String resultadoObtido = pessoa.getNome();

        // assign
        assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    @DisplayName("Caso de teste que verifica o nome válido e que  não esteja nos limites")
    public void testarNomeMaiusculoValidoDentroLimite() {
        // Arrange
        String entradaValida = "JOAO";
        String resultadoEsperado = "JOAO";

        // ACT
        pessoa.setNome(entradaValida);
        String resultadoObtido = pessoa.getNome();

        // assign
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    @DisplayName("Caso de teste que verifica o nome válido e que  não esteja nos limites")
    public void testarModificarNomeValidoNoLimiteInferior() {
        // Arrange
        String entradaValida = "Ed";
        String resultadoEsperado = "ED";

        // ACT
        pessoa.setNome(entradaValida);
        String resultadoObtido = pessoa.getNome();

        // assign
        assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    @DisplayName("Caso de teste que verifica o nome válido e que  não esteja nos limites")
    public void testarModificarNomeValidoNoLimiteSuperior() {
        // Arrange
        String entradaValida = "A vida é uma jornada cheia de desafios e conquistas cada passo que damos nos aproxima dos nossos sonhos não importa o quão difícil seja continue a caminhar com determinação e esperança sempre";
        String resultadoEsperado = "A VIDA É UMA JORNADA CHEIA DE DESAFIOS E CONQUISTAS CADA PASSO QUE DAMOS NOS APROXIMA DOS NOSSOS SONHOS NÃO IMPORTA O QUÃO DIFÍCIL SEJA CONTINUE A CAMINHAR COM DETERMINAÇÃO E ESPERANÇA SEMPRE";

        // ACT
        pessoa.setNome(entradaValida);
        String resultadoObtido = pessoa.getNome();

        // assign
        assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    @DisplayName("Caso de teste que verifica o nome inválido")
    public void testarModificarNomeInvalidoAbaixoLimiteInferior() {
        // Arrange
        String entradaInvalida = "a";

        //act and assign
        assertThrows(IllegalArgumentException.class, () -> {
            pessoa.setNome(entradaInvalida);
        });

    }

    @Test
    @DisplayName("Caso de teste que verifica o nome inválido")
    public void testarModificarNomeInvalidoAcimaLimiteSuperior() {
        // Arrange
        String entradaInvalida = "A vida é uma jornada cheia de desafios e conquistas cada passo que damos nos aproxima dos nossos sonhos não importa o quão difícil seja continue a caminhar com determinação e esperança sempreeeeeeeeeeeeeee";

        //act and assign
        assertThrows(IllegalArgumentException.class, () -> {
            pessoa.setNome(entradaInvalida);
        });

    }

    @Test
    @DisplayName("Caso de teste que verifica o nome válido e que  não esteja nos limites")
    public void testarConstrutorComNomeMinusculoValidoForaLimite() {
        // Arrange
        String entradaValida = "joao";
        String resultadoEsperado = "JOAO";

        // ACT
        pessoa = new Pessoa(entradaValida);
        String resultadoObtido = pessoa.getNome();

        // assign
        assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    @DisplayName("Caso de teste que verifica o nome válido e que  não esteja nos limites")
    public void testarconstrutorNomeMaiusculoValidoDentroLimite() {
        // Arrange
        String entradaValida = "JOAO";
        String resultadoEsperado = "JOAO";

        // ACT
        pessoa = new Pessoa(entradaValida);
        String resultadoObtido = pessoa.getNome();

        // assign
        assertEquals(resultadoEsperado, resultadoObtido);   
    }

    @Test
    @DisplayName("Caso de teste que verifica o nome válido e que  não esteja nos limites")
    public void testarConstrutorNomeValidoNoLimiteInferior() {
        // Arrange
        String entradaValida = "Ed";
        String resultadoEsperado = "ED";

        // ACT
        pessoa = new Pessoa(entradaValida);
        String resultadoObtido = pessoa.getNome();

        // assign
        assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    @DisplayName("Caso de teste que verifica o nome válido e que  não esteja nos limites")
    public void testarConstrutorNomeValidoNoLimiteSuperior() {
        // Arrange
        String entradaValida = "A vida é uma jornada cheia de desafios e conquistas cada passo que damos nos aproxima dos nossos sonhos não importa o quão difícil seja continue a caminhar com determinação e esperança sempre";
        String resultadoEsperado = "A VIDA É UMA JORNADA CHEIA DE DESAFIOS E CONQUISTAS CADA PASSO QUE DAMOS NOS APROXIMA DOS NOSSOS SONHOS NÃO IMPORTA O QUÃO DIFÍCIL SEJA CONTINUE A CAMINHAR COM DETERMINAÇÃO E ESPERANÇA SEMPRE";

        // ACT
        pessoa = new Pessoa(entradaValida);
        String resultadoObtido = pessoa.getNome();

        // assign
        assertEquals(resultadoEsperado, resultadoObtido);

    }

    @Test
    @DisplayName("Caso de teste que verifica o nome inválido")
    public void testarConstrutorNomeInvalidoAbaixoLimiteInferior() {
        // Arrange
        String entradaInvalida = "a";

        //act and assign
        assertThrows(IllegalArgumentException.class, () -> {
            pessoa = new Pessoa(entradaInvalida);
        });

    }

    @Test
    @DisplayName("Caso de teste que verifica o nome inválido")
    public void testarCosntrutorNomeInvalidoAcimaLimiteSuperior() {
        // Arrange
        String entradaInvalida = "A vida é uma jornada cheia de desafios e conquistas cada passo que damos nos aproxima dos nossos sonhos não importa o quão difícil seja continue a caminhar com determinação e esperança sempreeeeeeeeeeeeeee";

        //act and assign
        assertThrows(IllegalArgumentException.class, () -> {
            pessoa = new Pessoa(entradaInvalida);
        });

    }

}
