import br.com.alura.bytebank.exceptions.SaldoInsuficienteExceptions
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamento() {

    val Alex = Cliente(nome = "Alex", cpf = "",senha = 1)

    val contaAlex = ContaCorrente(titular = Alex, numero = 1000)
    contaAlex.deposita(200.0)

    val Fran = Cliente(nome = "Fran", cpf = "", senha = 2)

    val contaFran = ContaPoupanca(titular = Fran, numero = 1001)
    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("Sacando na conta do Fran")
    contaFran.saca(100.00)
    println(contaFran.saldo)

    println("Saque em excesso do alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("Saque em excesso do Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)


    try{
        contaFran.transfere(valor = 100.0, destino = contaAlex)
        println("Transferencia Sucedida")
    }catch (e: SaldoInsuficienteExceptions) {
        println("Falha")
        println("Saldo insuficiente")
        e.printStackTrace()
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}