package br.com.alura.bytebank.exceptions

import java.lang.Exception

class SaldoInsuficienteExceptions(mensagem:String="O saldo e insuficiente") : Exception(mensagem)