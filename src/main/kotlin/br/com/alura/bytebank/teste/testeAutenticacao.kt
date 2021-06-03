import br.com.alura.bytebank.modelo.*

fun testaAutenticacao(){
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha =1234
    )

    val diretor = Diretor(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha =1235,
        prl = 200.0
    )
    val cliente = Cliente (
        nome = "Gui",
        cpf = "333.333.333-33",
        senha = 1239
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente,1234)
    sistema.entra(diretor,1235)
    sistema.entra(cliente,1239)

    val autenticavel : Autenticavel
}