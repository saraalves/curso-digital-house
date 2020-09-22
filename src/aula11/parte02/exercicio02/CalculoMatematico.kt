package aula11.parte02.exercicio02

import java.lang.ArithmeticException
import javax.swing.table.TableRowSorter

class CalculoMatematico {


    fun dividir(numero1: Int, numero2: Int) : Int {

        if(numero2 == 0){
            throw ArithmeticException("Operação invalida, não é possível dividir um número por 0")
        }
        return numero1 / numero2
    }

}