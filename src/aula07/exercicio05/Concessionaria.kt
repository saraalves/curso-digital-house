package aula07.exercicio05

class Concessionaria {

    val registroDeVendas = ArrayList<Venda>()

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double) {
        val novaVenda =  Venda(cliente, veiculo, valor)

        registroDeVendas.add(novaVenda)

        println("Venda realizada com sucesso! Você tem no registro ${registroDeVendas.size} de vendas")
    }

}


//4. Definir, na classe Concessionária, a função registrarVenda(veículo: Veiculo,
//cliente: Cliente, valor: Double), que adiciona ao registro de vendas da
//concessionária uma nova venda de um veículo a um cliente por um valor
//determinado.