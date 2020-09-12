package aula_06.nivel02

//1. Uma empresa de pesquisas precisa tabular os resultados da seguinte enquete feita a um grande quantidade de organizações:
//"Qual o melhor Sistema Operacional para uso em servidores?"
//As possíveis respostas são:
//1- Windows Server 0
//2- Unix 1
//3- Linux 2
//4- Netware 3
//5- Mac OS 4
//6- Outro 5

//Você foi contratado para desenvolver um programa que leia o resultado da enquete
//e informe ao final o resultado da mesma. O programa deverá ler os valores até ser
//informado o valor 0, que encerra a entrada dos dados. Não deverão ser aceitos
//valores além dos válidos para o programa (0 a 6). Os valores referentes a cada uma
//das opções devem ser armazenados num vetor. Após os dados terem sido
//completamente informados, o programa deverá calcular a percentual de cada um
//dos concorrentes e informar o vencedor da enquete. O formato da saída foi dado
//pela empresa, e é o seguinte:
//Sistema Operacional Votos %
//------------------- ----- ---
//Windows Server 1500 17%
//Unix 3500 40%
//Linux 3000 34%
//Netware 500 5%
//Mac OS 150 2%
//Outro 150 2%
//------------------- -----
//Total 8800
//O Sistema Operacional mais votado foi o Unix, com 3500 votos,
//correspondendo a 40% dos votos.

const val PERGUNTA = "Qual o melhor Sistema Operacional para uso em servidores?\n " +
        "1- Windows Server\n" +
        "2- Unix\n" +
        "3- Linux\n" +
        "4- Netware\n" +
        "5- Mac OS\n" +
        "6- Outro"

fun main() {
    val sistemaOperacional = arrayOf("Windows Server", "Unix", "Linux", "Netware", "Mac OS", "Outro")
    do {

        print(PERGUNTA)
        val numeroSO = readLine()!!.toInt()

        if(numeroSO < 0 || numeroSO > 6){
            println("Opção Invalida")
        } else {

            sistemaOperacional[numeroSO - 1]
            var windows = 0
            var unix = 0
            var linux = 0
            var netware = 0
            var mac = 0
            var outro = 0
            when(numeroSO){
                1 -> windows
                2 -> unix
                3 -> linux
                4 -> netware
                5 -> mac
                6 -> outro
            }
        }
//sistemaOperacional[0]
//sistemaOperacional[1]
//sistemaOperacional[2]
//sistemaOperacional[3]
//sistemaOperacional[4]
//sistemaOperacional[5]

    } while (numeroSO != 0)

}

