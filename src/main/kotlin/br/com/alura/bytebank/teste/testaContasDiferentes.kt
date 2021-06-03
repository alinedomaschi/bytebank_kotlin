import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
       val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Alex",
            cpf = "111.111.111-11",
            senha = 1,
            endereco = Endereco(
                logradouro = "Rua Vergueiro"
            )
        ),
        numero = 1000
    )
    println("Titular")
    println("Nome do titular ${contaCorrente.titular.nome}")
    println("Cpf do titular ${contaCorrente.titular.cpf}")
    println("Endereco titular ${contaCorrente.titular.endereco.logradouro}")

    val contaPoupanca = ContaCorrente(
        titular = Cliente(
            nome = "Fran",
            cpf = "",
            senha = 2
        ),
        numero = 1001
    )
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo Corrente ${contaCorrente.saldo}")
    println("Saldo Poupanca ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo após saque Corrente ${contaCorrente.saldo}")
    println("Saldo após saque Poupanca ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo após transferencia Poupanca ${contaCorrente.saldo}")
    println("Saldo após receber dinheiro ${contaPoupanca.saldo}")
}