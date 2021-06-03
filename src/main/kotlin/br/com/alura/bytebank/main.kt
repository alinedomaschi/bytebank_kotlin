package br.com.alura.bytebank

import br.com.alura.bytebank.exceptions.SaldoInsuficienteExceptions
import br.com.alura.bytebank.modelo.Endereco
import testaComportamento

fun main() {
    println("início main")
    testaComportamento()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        val endereco = Any()
        throw SaldoInsuficienteExceptions()
    }
    println("fim funcao2")
}

class
SaldoInsuficienteExceptions : Throwable(" O saldo é insuficiente")