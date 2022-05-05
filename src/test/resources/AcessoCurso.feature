#language: pt

  Funcionalidade: Acesso ao painel do curso
    Cenario: Aluno matrículado e Acesso OK
      Dado que o aluno está com status matriculado 1
      Quando acessar o painel do curso com login for "matriculado@usuario.com.br" e senha "Abc123"
      Entao retorna 200

    Cenario: Aluno Não matrículado e Acesso OK
      Dado que o aluno está com status matriculado 0
      Quando acessar o painel do curso com login for "naoMatriculado@usuario.com.br" e senha "Abc123"
      Entao retorna 403
