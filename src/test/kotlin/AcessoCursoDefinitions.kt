import io.cucumber.java8.Pt
import org.junit.jupiter.api.Assertions

class AcessoCursoDefinitions : Pt {
    init {
        var matriculado = false
        Dado("que o aluno está com status matriculado {int}") { statusMatriculado : Int ->
            matriculado = statusMatriculado == 1
        }
        var retorno = 0
        Quando("acessar o painel do curso com login for {string} e senha {string}") { usuario: String, senha: String  ->
            if(usuario == "matriculado@usuario.com.br" && senha == "Abc123"){
                retorno = 200
            }else if(usuario == "naoMatriculado@usuario.com.br" && senha == "Abc123"){
                retorno = 403
            }
        }
        Entao("retorna {int}") { statusCode : Int ->
            Assertions.assertEquals(retorno, statusCode)
        }

    }
}