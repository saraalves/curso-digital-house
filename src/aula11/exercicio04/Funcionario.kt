package aula11.exercicio04

class Funcionario(val nome: String, val registroDoFuncionario: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Funcionario

        if (registroDoFuncionario != other.registroDoFuncionario) return false

        return true
    }

    override fun hashCode(): Int {
        return registroDoFuncionario
    }

    override fun toString(): String {
        return "Funcionario(registroDoFuncionario=$registroDoFuncionario)"
    }
}