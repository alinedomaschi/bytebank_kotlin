import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val Joao = Cliente(nome = "João", cpf = "", senha = 3)

    val contaJoao = ContaCorrente(titular = Joao, numero = 1002)
    contaJoao.titular.nome = "João"

    val Maria = Cliente("Maria", cpf = "", senha = 4)

    var contaMaria = ContaPoupanca(titular = Maria, numero = 1003)
    contaMaria.titular.nome = "Maria"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)

}