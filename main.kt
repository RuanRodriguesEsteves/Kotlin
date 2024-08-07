// -------- Funções Úteis --------

// Função para imprimir o Título
fun imprimirTitulo(titulo: String) {
    // Variável tituloFinal com condição para verificar se tamanho é par, se for, adiciona os espaços sem exclamação, se não, adiciona com exclamação
    var tituloFinal = if (titulo.length % 2 == 0) " " + titulo + " " else " " + titulo + "! "
    val tamanhoPrefixo = (98 - tituloFinal.length) / 2
    val prefixo = "-".repeat(tamanhoPrefixo)
    carregamento(1)
    println("|--------------------------------------------------------------------------------------------------|")
    println("|$prefixo$tituloFinal$prefixo|")
    println("|--------------------------------------------------------------------------------------------------|")
}

// Função para simular um carregamento
fun carregamento(tempo: Long, mensagem: String = "Carregando") {
    limparTerminal(0)
    print(mensagem)
    print("|")
    for (i in 0..100) {
        print("=")
        Thread.sleep(tempo)
    }
    println("|")
    limparTerminal(0)
}

// Função que pula 100 linhas para deixar o Terminal com um aspecto limpo
fun limparTerminal(tempo: Long) {
    Thread.sleep(tempo)
    repeat(50) { println() }
}

// -------- Fim Funções Úteis --------

// -------- Algoritmo de: Funções - Valores de Parâmetro Padrão e Argumentos Nomeados --------
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
    println("-- Informações da Viagem --\nDestino: $destino\nDias de hospedagem: $dias\nHospedagem: $hospedagem")
}

// -------- Fim dos Algoritmo de: Funções - Valores de Parâmetro Padrão e Argumentos Nomeados --------

// -------- Algoritmo de: Funções - Valores de Parâmetro Padrão e Argumentos Nomeados --------
// Função que aceita qualquer quantidade de números e realiza uma soma entre eles
fun soma(vararg numeros: Int): Int {
    var resultado = 0 
    for (numero in numeros) {
        resultado = resultado + numero
    }
    return resultado
}

// -------- Funções - Valores de Parâmetro Padrão e Argumentos Nomeados --------
fun valoresDeParametroPadraoEArgumentosNomeados() {
    carregamento(5)
    // Menu de opções das Aulas do Curso
    while(true) {
        println("Selecione uma opção:\n[1] Calculadora De Desconto\n[2] Configuração de Usuário")
        println("[3] Planejamento de Viagem\n[0] Voltar")
        var opcao = readLine()?.toIntOrNull()
        when(opcao) {
            1 -> {
                imprimirTitulo("Calculadora de Desconto")
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
                carregamento(5, "Calculando")
                println("Preço Final: " + calcularDesconto(preco, desconto, imposto))
                limparTerminal(2000)
            }
            2 -> {
                imprimirTitulo("Configuração de Usuário")
                println("Digite o Nome do Usuário:")
                var nome = readLine().toString()
                var idade: Int?
                do {
                    println("Cerifique-se de que seja um valor inteiro.\nDigite a idade:")
                    idade = readLine()?.toIntOrNull()
                } while(idade == null)
                println("Digite seu Email:")
                var email = readLine().toString()
                carregamento(2)
                if (email == "") configurarUsuario(nome, idade) else configurarUsuario(nome, idade, email)
                limparTerminal(2000)
            }
            3 -> {
                imprimirTitulo("Planejamento de Viagem")
                println("Informe o Destino da Viagem:")
                var destino = readLine().toString()
                var dias: Int?
                do {
                    println("Informe quantos dias irá ficar e cerifique-se de que seja um valor inteiro:")
                    dias = readLine()?.toIntOrNull()
                } while(dias == null)
                 println("Informe o tipo de Hospedagem:\nExemplo: Hotel")
                 var hospedagem = readLine().toString()
                 carregamento(5)
                 planejarViagem(destino, dias, hospedagem)
                 limparTerminal(2000)
            }
            0 -> {
                carregamento(2, "Voltando")
                break
            }
            else -> println("Escolha uma opção válida!")
        }
    }
}
// -------- Fim Funções - Valores de Parâmetro Padrão e Argumentos Nomeados --------

// -------- Funções - Parâmetro vararg --------
fun parametroVararg() {
    carregamento(5)
    while(true) {
        println("Selecione uma Opção:\n[1] Soma de Números\n[0] Voltar")
        var opcao = readLine()?.toIntOrNull()
        when(opcao) {
            0 -> {
                carregamento(2, "Voltando")
                break
            }
            1 -> {
                imprimirTitulo("Soma de Números")
                var quantidade: Int?
                val numeros = mutableListOf<Int>()
                do {
                    println("Primeiro, informe quantos números exestirá na soma: Certifique-se de que será um valor inteiro")
                    quantidade = readLine()?.toIntOrNull()
                } while(quantidade == null)

                for(i in 1..quantidade) {
                    var numero: Int?
                    do {
                        println("Digite o $i° Número, certifique-se de que seja um inteiro:")
                        numero = readLine()?.toIntOrNull()
                    } while(numero == null)
                    numeros.add(numero)
                }
                
                println("Números Informados:\n $numeros\nResultado: ${soma(*numeros.toIntArray())} ")
                limparTerminal(2000)
            }
        }

    }
}
// -------- Fim Funções - Parâmetro vararg --------


fun introducaoPraticaALinguagemDeProgramacaoKotlin() {
    // Menu de Opções de Conteúdo do Curso
    carregamento(5)
    while(true) {
        println("Seleciona uma Opção:\n[1] Funções - Valores de Parâmetro Padrão e Argumentos Nomeados")
        println("[2] Funções - Parâmetro vararg\n[0] Voltar")
        var opcao = readLine()?.toIntOrNull()
        when(opcao) {
            0 -> {
                carregamento(2, "Voltando")
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
    imprimirTitulo("Seja Bem Vindo")
    while(true) {
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