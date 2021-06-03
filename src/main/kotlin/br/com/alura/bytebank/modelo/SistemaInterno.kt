package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha:Int) {
        if(admin.autentica(senha)){
            println("Você entrou no Banco")
        } else {
            println("Falha no Login")
        }
    }

}

