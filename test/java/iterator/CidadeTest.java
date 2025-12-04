package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    void deveContarPessoasCadastroAtualizado(){
        UBS ubs = new UBS(
                new Pessoa("Thiago", false),
                new Pessoa("Maria", true),
                new Pessoa("João", true),
                new Pessoa("Ana", false)
        );
        assertEquals(2, Cidade.contarPessoasCadastroAtualizadoUBS(ubs));
    }

    @Test
    void deveContarTodasPessoas(){
        UBS ubs = new UBS(
                new Pessoa("Thiago", false),
                new Pessoa("Maria", true),
                new Pessoa("João", true),
                new Pessoa("Ana", false)
        );
        assertEquals(4, Cidade.contarTotalPessoasUBS(ubs));
    }

}