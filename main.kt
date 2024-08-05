// Função que pula 100 linhas para deixar o Terminal com um aspecto limpo
fun limparTerminal() {
    println("Carregando...")
    Thread.sleep(500)
    repeat(50) { println() }
}

// Função que calcula o desconto aplicado a um preço, e depois soma o valor de imposto em cima. 
fun calcularDesconto(preco: Double, desconto: Double, imposto: Double): Double {
    return preco - preco * (desconto / 100) + ((preco - preco * (desconto / 100)) * (imposto / 100))
}

// Função que imprime informações fornecidas pelo usuário
fun configurarUsuario(nome: String, idade: Int, email: String = "Não Fornecido") {
    println("Nome: $nome\nIdade: $idade\nEmail: $email")
}

// Função para mostrar detalhes de uma viagem
fun planejarViagem(destino: String, dias: Int, hospedagem: String) {
    limparTerminal()
    println("-- Informações da Viagem --\nDestino: $destino\nDias de hospedagem: $dias\nHospedagem: $hospedagem")
}

// Funções - Valores de Parâmetro Padrão e Argumentos Nomeados
fun valoresDeParametroPadraoEArgumentosNomeados() {
    while(true) {
        limparTerminal()
        println("Selecione uma opção:\n[1] Calculadora De Desconto\n[2] Configuração de Usuário")
        println("[3] Planejamento de Viagem\n[0] Voltar")
        var opcao = readLine()?.toIntOrNull()
        when(opcao) {
            1 -> {
                limparTerminal()
                println("---- Calculadora de Desconto ----")
                var preco: Double?
                var desconto: Double?
                var imposto: Double?
                
                do {
                    println("Certifique-se de que seja um número decimal separado por \".\".\nInforme o valor do Produto: ")
                    preco = readLine()?.toDoubleOrNull()
                    println("Informe o percentual de Desconto: ")
                    desconto = readLine()?.toDoubleOrNull()
                    println("Informe o percentual do Imposto: ")
                    imposto = readLine()?.toDoubleOrNull()
                } while(preco == null || desconto == null || imposto == null)
                
                println("Preço Final: " + calcularDesconto(preco, desconto, imposto))
            }
            2 -> {
                limparTerminal()
                println("---- Configuração de Usuário ----")
                println("Digite o Nome do Usuário:")
                var nome = readLine().toString()
                var idade: Int?
                do {
                    println("Cerifique-se de que seja um valor inteiro.\nDigite a idade:")
                    idade = readLine()?.toIntOrNull()
                } while(idade == null)
                println("Digite seu Email:")
                var email = readLine().toString()
                limparTerminal()
                if (email == "") configurarUsuario(nome, idade) else configurarUsuario(nome, idade, email)
            }
            3 -> {
                limparTerminal()
                println("---- Planejamento de Viagem ----")
                println("Informe o Destino da Viagem:")
                var destino = readLine().toString()
                var dias: Int?
                do {
                    println("Informe quantos dias irá ficar e cerifique-se de que seja um valor inteiro:")
                    dias = readLine()?.toIntOrNull()
                } while(dias == null)
                 println("Informe o tipo de Hospedagem:\nExemplo: Hotel")
                 var hospedagem = readLine().toString()
                 planejarViagem(destino, dias, hospedagem)
            }
            0 -> {
                println("Voltando...")
                break
            }
            else -> println("Escolha uma opção válida!")
        }
    }
}

fun parametroVararg() {
    while(true) {
        println("Selecione uma Opção:\n[0] Voltar")
        var opcao = readLine()?.toIntOrNull()
        when(opcao) {
            0 -> {
                println("Voltando...")
                break
            }
        }
    }
}

fun introducaoPraticaALinguagemDeProgramacaoKotlin() {
    // Menu de Opções de Conteúdo do Curso
    while(true) {
        limparTerminal()
        println("Seleciona uma Opção:\n[1] Funções - Valores de Parâmetro Padrão e Argumentos Nomeados")
        println("[2] Funções - Parâmetro vararg\n[0] Voltar")
        var opcao = readLine()?.toIntOrNull()
        when(opcao) {
            0 -> {
                println("Voltando...")
                break
            }
            1 -> valoresDeParametroPadraoEArgumentosNomeados()
            2 -> parametroVararg()
            else -> println("Escolha um opção válida!")
        }
    }
}

// Função que inicia o Script
fun main() {

    // Menu de Opções de Curso
    while(true) {
        limparTerminal()
        println("Selecione uma opção:\n[1] Introdução Prática à Linguagem de Programação Kotlin\n[0] Sair")
        var opcao = readLine()?.toIntOrNull()
        when(opcao) {
            0 -> {
                println("Saindo...")
                break
            }
            // Acessar função do conteúdo do Curso Introdução Prática à Linguagem de Programação Kotlin
            1 -> introducaoPraticaALinguagemDeProgramacaoKotlin()
            else -> println("Escolha uma opção válida!")
        }
    }
}