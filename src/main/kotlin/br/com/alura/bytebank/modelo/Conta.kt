package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exceptions.SaldoInsuficienteExceptions

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {

    var saldo = 0.0
    protected set
    companion object Contador {
       var total = 0
         private set

      }
   init{
       println("Criando Conta")
       total++

   }


    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta) {
    if (saldo < valor){
        throw SaldoInsuficienteExceptions(
                mensagem = "O saldo é insuficinte")
    }
       saldo -= valor
            destino.deposita(valor)

        }

    }

