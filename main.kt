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

// ------------------------------------------------------------------------------------------------

// -------- Algoritmos de: Funções - Valores de Parâmetro Padrão e Argumentos Nomeados --------
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
// -------- Fim dos Algoritmos de: Funções - Valores de Parâmetro Padrão e Argumentos Nomeados --------

// ------------------------------------------------------------------------------------------------

// -------- Algoritmos de: Funções - Parâmetro vararg --------
// Função que aceita qualquer quantidade de números e realiza uma soma entre eles
fun soma(vararg numeros: Int): Int {
    var resultado = 0 
    for (numero in numeros) {
        resultado = resultado + numero
    }
    return resultado
}

// Função que aceita qualquer quantidade de Strings e concatena cada uma delas em uma única variável
fun concatenar(vararg palavras: String): String {
    var frase = ""

    for(palavra in palavras) {
        frase = "$frase | $palavra"
    }

    return frase
}

// Função que recebe qualquer quantidade de números Inteiros e mostra a média
fun media(vararg numeros: Int): Double {
    var resultado = 0.00

    for(numero in numeros) {
        resultado = resultado + numero
    }

    return resultado / numeros.size
}
// -------- Fim Algoritmos de: Funções - Parâmetro vararg --------

// ------------------------------------------------------------------------------------------------

// -------- Algoritmos de Modificando Variáveis --------
fun modificandoVariaveis() {
    println("Crie um programa que define uma variável var e uma constante val. Modifique a variável var e tente modificar a constante val para observar o comportamento.")
    limparTerminal(5000)
}

// Algoritmo que adiciona itens a lista e visualiza a lista
fun listaDeTarefas() {
    val listaDeTarefas = mutableListOf<String>()
    var opcao: Int? = null
    
    while(opcao != 0) {
        println("Selecione uma opção:\n[1] Adicionar Item a Lista\n[2] Visualizar Lista\n[0] Voltar")
        opcao = readLine()?.toIntOrNull()

        when(opcao) {
            0 -> {
                carregamento(2, "Voltando")
            }
            1 -> {
                limparTerminal(0)
                println("Informe o Item:")
                listaDeTarefas.add(readLine().toString())
            }
            2-> {
                limparTerminal(0)
                for(tarefa in listaDeTarefas) {
                    println(tarefa)
                }
                limparTerminal(2000)
            }
            else -> println("Escolha uma opção válida!")
        }
    }
}

fun contadorDeVisitas() {
    println("Crie um programa que define uma variável var para contar o número de visitas a um site. Use uma constante val para definir um valor de incremento que não pode ser modificado. Atualize o contador de visitas várias vezes e exiba o resultado.")
    limparTerminal(5000)
}
// -------- Fim Algortimos de Modificando Variáveis --------

// ------------------------------------------------------------------------------------------------

// -------- Algoritmos de Null Safety Nulidade --------
// Função que verifica se nome do meio é nulo, se for, retorna somente o nome e sobrenome, se não, retorna o nome completo
fun obterNomeCompleto(nome: String, nomeDoMeio: String?, sobrenome: String): String {
    if(nomeDoMeio == null) {
        return "$nome $sobrenome"
    } else {
        return "$nome $nomeDoMeio $sobrenome"
    }
}

// Função que retorna a quantidade de caracter que tem em uma String
fun contarCaracteres(entrada: String): Int {
    return entrada?.length ?: 0
}
// -------- Fim Algoritmos de Null Safety Nulidade --------

// ------------------------------------------------------------------------------------------------

// -------- Funções - Valores de Parâmetro Padrão e Argumentos Nomeados --------
fun valoresDeParametroPadraoEArgumentosNomeados() {
    imprimirTitulo("Funções - Valores de Parâmetro Padrão e Argumentos Nomeados")
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
    imprimirTitulo("Funções - Parâmetro vararg")
    while(true) {
        println("Selecione uma Opção:\n[1] Soma de Números\n[2] Concatenação de Strings\n[3] Média de Valores\n[0] Voltar")
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
                    println("Primeiro, informe quantos números exestirá na soma:\nCertifique-se de que será um valor inteiro")
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
                
                carregamento(10)
                println("Números Informados:\n $numeros\nResultado: ${soma(*numeros.toIntArray())} ")
                limparTerminal(2000)
            }
            2 -> {
                imprimirTitulo("Concatenação de Strings")
                var quantidade: Int?
                val palavras = mutableListOf<String>()
                
                do {
                    println("Primeiro, informe quantos números exestirá na soma:\nCertifique-se de que será um valor inteiro")
                    quantidade = readLine()?.toIntOrNull()
                } while(quantidade == null)

                for(i in 1..quantidade) {
                    println("Digite sua palavra ou Frase:")
                    palavras.add(readLine().toString())
                }

                carregamento(10)
                println("Palavras ou Frases Digitadas: $palavras\nResultado:\n${concatenar(*palavras.toTypedArray())}")
                limparTerminal(2000)
            }
            3 -> {
                imprimirTitulo("Média de Valores")
                var quantidade: Int?
                val numeros = mutableListOf<Int>()

                do {
                    println("Primeiro, informe quantos números exestirá na soma:\nCertifique-se de que será um valor inteiro")
                    quantidade = readLine()?.toIntOrNull()
                } while(quantidade == null)

                for(i in 1..quantidade) {
                    var numero: Int?
                    
                    do {
                        println("Informe o $i° número:\nCertifique-se de que seja um número inteiro.")
                        numero = readLine()?.toIntOrNull()
                    } while(numero == null)
                    
                    numeros.add(numero)
                }

                carregamento(10)
                println("Números Informados:\n$numeros\nMédia de Valores:\n ${media(*numeros.toIntArray())}")
                limparTerminal(1000)
            }
            else -> println("Escolha uma opção válida!")
        }

    }
}
// -------- Fim Funções - Parâmetro vararg --------



// -------- Parâmetro Var e Val --------
fun variaveisVarEVal() {
    imprimirTitulo("Parâmetro Var e Val")
    
    while(true){
        println("Selecione uma Opção:\n[1] Modificando Variáveis(Irrelevante. Apenas leitura do exercício proposto.)\n[2] Lista de Tarefas\n[3] Contador de Visitas(Irrelevante. Apenas leitura do exercício proposto.)\n[0] Voltar")
        var opcao: Int? = readLine()?.toIntOrNull()
        when(opcao) {
            0 -> {
                carregamento(2, "Voltando")
                break
            }
            1 -> {
                imprimirTitulo("Modificando Variávels")
                modificandoVariaveis()
            }
            2 -> {
                imprimirTitulo("Lista de Tarefas")
                listaDeTarefas()
            }
            3 -> {
                imprimirTitulo("Contador de Visitas")
                contadorDeVisitas()
            }
            else -> println("Escolha uma opção válida!")
        }
    }
}
// -------- Fim Parâmetro Var e Val --------



// -------- Null Safety Nulidade --------
fun nullSafetyNulidade() {
    imprimirTitulo("Null Safety Nulidade")
    
    while(true){
        println("Selecione uma Opção:\n[1] Verificação de Nulo com Operador de Elvis\n[2] Operador Seguro de Chamada (?.) e Operador Elvis (?:)\n[0] Voltar")
        var opcao: Int? = readLine()?.toIntOrNull()
        when(opcao) {
            0 -> {
                carregamento(2, "Voltando")
                break
            }
            1 -> {
                imprimirTitulo("Verificação de Nulo com Operador de Elvis")
                
                println("Informe o primeiro nome:")
                val nome = readLine().toString()
                var nomeDoMeio: String? = null
                var sobrenome: String
                
                println("Deseja informar o nome do Meio?\nCertifique-se de que Seja as opções informadas\n[1] Sim\n[Qualquer Tecla] Não")
                opcao = readLine()?.toIntOrNull()

                if(opcao == 1) {
                    println("Informe o nome do meio:")
                    nomeDoMeio = readLine().toString()
                }

                println("Informe o sobrenome:")
                sobrenome = readLine().toString()

                limparTerminal(0)
                println(obterNomeCompleto(nome, nomeDoMeio, sobrenome))
                limparTerminal(2000)
            }
            2 -> {
                imprimirTitulo("Operador Seguro de Chamada (?.) e Operador Elvis (?:)")

                println("Digite qualquer palavra ou Frase para contar o número de caracteres:\n")
                val entrada = readLine().toString()

                limparTerminal(0)
                println(contarCaracteres(entrada))
                limparTerminal(2000)
            }
            else -> println("Escolha uma opção válida!")
        }
    }
}
// -------- Fim Null Safety Nulidade --------



// Função para selecionar qual o conteúdo dos algoritmos
fun introducaoPraticaALinguagemDeProgramacaoKotlin() {
    // Menu de Opções de Conteúdo do Curso
    carregamento(5)
    while(true) {
        println("Seleciona uma Opção:\n[1] Funções - Valores de Parâmetro Padrão e Argumentos Nomeados")
        println("[2] Funções - Parâmetro vararg\n[3] Variáveis var e val\n[4] Null Safety Nulidade\n[0] Voltar")
        var opcao = readLine()?.toIntOrNull()
        when(opcao) {
            0 -> {
                carregamento(2, "Voltando")
                break
            }
            1 -> valoresDeParametroPadraoEArgumentosNomeados()
            2 -> parametroVararg()
            3 -> variaveisVarEVal()
            4 -> nullSafetyNulidade()
            else -> println("Escolha um opção válida!")
        }
    }
}
// Fim Função para selecionar qual o conteúdo dos algoritmos



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