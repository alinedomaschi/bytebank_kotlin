fun testaCondicoes(saldo:Double){
    if(saldo > 0.0) {
        println("br.com.alura.bytebank.modelo.Conta é positiva")
    } else if (saldo == 0.0) {
        println("br.com.alura.bytebank.modelo.Conta é neutra")
    }else{
        println("br.com.alura.bytebank.modelo.Conta Negativa")
    }
    when{
        saldo > 0.0 -> println("br.com.alura.bytebank.modelo.Conta é Positiva")
        saldo == 0.0 -> println("br.com.alura.bytebank.modelo.Conta é Neutra")
        else -> println("br.com.alura.bytebank.modelo.Conta é Negativa")
    }
}