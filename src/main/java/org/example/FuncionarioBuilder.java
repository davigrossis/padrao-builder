package org.example;

import java.util.Date;

public class FuncionarioBuilder {

    private Funcionario funcionario;

    public FuncionarioBuilder() {
        funcionario = new Funcionario();
    }

    public Funcionario build() {
        if (funcionario.getId() == 0) {
            throw new IllegalArgumentException("ID inválido");
        }
        if (funcionario.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (funcionario.getCargo().equals("")) {
            throw new IllegalArgumentException("Cargo inválido");
        }
        if (funcionario.getSalario() < 1500) {
            throw new IllegalArgumentException("Salário inválido");
        }
        return funcionario;
    }

    public FuncionarioBuilder setId(int id) {
        funcionario.setId(id);
        return this;
    }

    public FuncionarioBuilder setNome(String nome) {
        funcionario.setNome(nome);
        return this;
    }

    public FuncionarioBuilder setDataNascimento(Date dataNascimento) {
        funcionario.setDataNascimento(dataNascimento);
        return this;
    }

    public FuncionarioBuilder setCpf(String cpf) {
        funcionario.setCpf(cpf);
        return this;
    }

    public FuncionarioBuilder setRg(String rg) {
        funcionario.setRg(rg);
        return this;
    }

    public FuncionarioBuilder setCargo(String cargo) {
        funcionario.setCargo(cargo);
        return this;
    }

    public FuncionarioBuilder setSalario(double salario) {
        funcionario.setSalario(salario);
        return this;
    }

    public FuncionarioBuilder setDataAdmissao(Date dataAdmissao) {
        funcionario.setDataAdmissao(dataAdmissao);
        return this;
    }

    public FuncionarioBuilder setEmail(String email) {
        funcionario.setEmail(email);
        return this;
    }

    public FuncionarioBuilder setTelefone(String telefone) {
        funcionario.setTelefone(telefone);
        return this;
    }

    public FuncionarioBuilder setEnderecoLogradouro(String logradouro) {
        funcionario.setEnderecoLogradouro(logradouro);
        return this;
    }

    public FuncionarioBuilder setEnderecoNumero(int numero) {
        funcionario.setEnderecoNumero(numero);
        return this;
    }

    public FuncionarioBuilder setEnderecoComplemento(String complemento) {
        funcionario.setEnderecoComplemento(complemento);
        return this;
    }

    public FuncionarioBuilder setEnderecoBairro(String bairro) {
        funcionario.setEnderecoBairro(bairro);
        return this;
    }

    public FuncionarioBuilder setEnderecoCidade(String cidade) {
        funcionario.setEnderecoCidade(cidade);
        return this;
    }

    public FuncionarioBuilder setEnderecoUF(String uf) {
        funcionario.setEnderecoUF(uf);
        return this;
    }

    public FuncionarioBuilder setCep(String cep) {
        funcionario.setCep(cep);
        return this;
    }
}
