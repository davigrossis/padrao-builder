package builder;

import org.example.Funcionario;
import org.example.FuncionarioBuilder;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioBuilderTest {

    @Test
    void deveRetornarExcecaoParaFuncionarioSemId() {
        try {
            FuncionarioBuilder builder = new FuncionarioBuilder();
            Funcionario funcionario = builder
                    .setNome("Davi")
                    .setCargo("Estagiario")
                    .setSalario(3000)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("ID inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemNome() {
        try {
            FuncionarioBuilder builder = new FuncionarioBuilder();
            Funcionario funcionario = builder
                    .setId(1)
                    .setCargo("Estagiario")
                    .setSalario(3000)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemCargo() {
        try {
            FuncionarioBuilder builder = new FuncionarioBuilder();
            Funcionario funcionario = builder
                    .setId(1)
                    .setNome("Davi")
                    .setSalario(3000)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cargo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioComSalarioInvalido() {
        try {
            FuncionarioBuilder builder = new FuncionarioBuilder();
            Funcionario funcionario = builder
                    .setId(1)
                    .setNome("Davi")
                    .setCargo("Estagiario")
                    .setSalario(1200)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Salário inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarFuncionarioValido() {
        FuncionarioBuilder builder = new FuncionarioBuilder();
        Funcionario funcionario = builder
                .setId(1)
                .setNome("Davi")
                .setCargo("Estagiario")
                .setSalario(1600)
                .build();

        assertNotNull(funcionario);

    }
}
