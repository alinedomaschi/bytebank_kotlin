package br.com.alura.bytebank.modelo

class Diretor (
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val prl: Double
    ) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
){

    open override val bonificacao : Double
        get(){
            return salario + prl
        }
}

