package br.com.alura.bytebank.modelo
import br.com.alura.bytebank.modelo.Cliente


class ContaPoupanca(
    titular: Cliente,
    numero: Int)
    : Conta(
    titular = titular,
    numero = numero
){
    override fun saca(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}