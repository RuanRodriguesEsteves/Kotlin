// -------- Classes de Classes --------
// Classe Pessoa com duas propriedades e um método de apresentação
class Pessoa(val nome: String, val idade: Int) {
    // Função que imprimi uma apresentação na tela
    fun apresentar() {
        carregamento(10)
        println("Olá, meu nome é $nome e eu tenho $idade anos.")
        limparTerminal(2000)
    }
}

// Classe Retangulo com duas propriedades e dois métodos para retornar Área e Altura de um retângulo
class Retangulo(val largura: Double, val altura: Double) {
    // Função para calcular área de um retângulo
    fun area(): Double {
        return largura * altura
    }

    // Função para calcular perímetro de um retângulo
    fun perimetro(): Double {
        return largura * 2 + altura * 2
    }
}

// Classe Conta Bancária com duas propriedades e três métodos para depositar, sacar e exibir saldo
class ContaBancaria(val conta: Int, var saldo: Double = 0.00) {
    fun depositar(valor: Double) {
        carregamento(5, "Depositando")
        saldo += valor
        exibirSaldo()
    }

    fun sacar(valor: Double) {
        carregamento(5, "Sacando")
        if(saldo > 0.00) {
            saldo -= valor
        }else {
            println("Saldo Insuficiente!")
            limparTerminal(2000)
        }

        exibirSaldo()
    }

    fun exibirSaldo() {
        carregamento(3)
        println("Saldo atual: $saldo")
        limparTerminal(2000)
    }
}
// -------- Fim Classes de Classes --------

// ------------------------------------------------------------------------------------------------

// -------- Classes de Generics - Classes Genéricas --------
// Classe Genérica Caixa que pode armazenar apenas um item de qualquer tipo e contém dois métodos, um para definir e o outro para obter o item
class Caixa<C>(var item: C) {
    fun definirNovoItem(novoItem: C) {
        item = novoItem
    }

    fun obterItem(): C {
        return item
    }
}

class Par<P>(var item1: P, var item2: P) {
    
    fun definirItens(novoItem1: P, novoItem2: P) {
        item1 = novoItem1
        item2 = novoItem2
    }

    fun obterItem1(): P {
        return item1
    }

    fun obterItem2(): P {
        return item2
    }
}

class Fila<F> {
    private val fila = mutableListOf<F>()

    fun exibirFila() {
        carregamento(5)
        println(fila.toString())
        println(fila.size)
        limparTerminal(2000)
    }

    fun adicionarNaFila(item: F){
        fila.add(item)
    }

    fun removerPrimeiroDaFila(){
        if(fila.isNotEmpty()) {
            fila.removeAt(0)
        }
    }

}
// -------- Fim Classes de Generics - Classes Genéricas --------



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

fun retornarNumeroInteiro(mensagem: String): Int {
    var numero: Int?
    do {
        println("$mensagem\nCerifique-se de que seja um número inteiro.")
        numero = readLine()?.toIntOrNull()
    } while(numero == null)

    return numero
}

fun retornarDouble(mensagem: String): Double {
    var numero: Double?
    do {
        println("$mensagem\nCerifique-se de que seja um número.")
        numero = readLine()?.toDoubleOrNull()
    } while(numero == null)

    return numero
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

fun revertString(string: String?): String {
    val revertedString = string ?: throw IllegalArgumentException("A String não pode ser nula!")
    return string.reversed()
}
// -------- Fim Algoritmos de Null Safety Nulidade --------

// ------------------------------------------------------------------------------------------------

// -------- Algoritmos de Gerenics - Funções Genericas --------
// Função de Troca
fun <T> troca(array: Array<T>, indice1: Int, indice2:Int){

    try {
        val temporario = array[indice1 - 1]
        array[indice1 - 1] = array[indice2 - 1]
        array[indice2 - 1] = temporario
    } catch (e: ArrayIndexOutOfBoundsException) {
        limparTerminal(0)
        println("Informe uma posição válida!")
        limparTerminal(2000)
    }

}

fun <A> exibirArray(array: Array<A>) {
    for(i in array.indices) {
        println("[${i + 1}] - ${array[i]}")
    } 
}

// Função Maior
fun <M: Comparable<M>> maior(parametro1: M, parametro2: M): M {
    return if (parametro1 > parametro2) parametro1 else parametro2
}

// -------- Fim Algoritmos de Gerenics - Funções Genericas --------


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

                val nome = readLine().toString()
                val idade = retornarNumeroInteiro("Digite a idade");
                
                println("Digite seu Email:")
                val email = readLine().toString()

                carregamento(2)
                if (email == "") configurarUsuario(nome, idade) else configurarUsuario(nome, idade, email)
                limparTerminal(2000)
            }
            3 -> {
                imprimirTitulo("Planejamento de Viagem")

                println("Informe o Destino da Viagem:")
                val destino = readLine().toString()

                val dias = retornarNumeroInteiro("Informe a quantidade de Dias:")

                println("Informe o tipo de Hospedagem:\nExemplo: Hotel")
                val hospedagem = readLine().toString()

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
                val quantidade = retornarNumeroInteiro("Primeiro, informe quantos números exestirá na soma:")
                val numeros = mutableListOf<Int>()

                for(i in 1..quantidade) {
                    val numero = retornarNumeroInteiro("Digite o $i° Número")
                    numeros.add(numero)
                }
                
                carregamento(10)
                println("Números Informados:\n $numeros\nResultado: ${soma(*numeros.toIntArray())} ")
                limparTerminal(2000)
            }
            2 -> {
                imprimirTitulo("Concatenação de Strings")
                val quantidade = retornarNumeroInteiro("Primeiro, informe quantos números exestirá na soma:")
                val palavras = mutableListOf<String>()

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
                val quantidade = retornarNumeroInteiro("Primeiro, informe quantos números exestirá na soma:")
                val numeros = mutableListOf<Int>()

                for(i in 1..quantidade) {
                    val numero = retornarNumeroInteiro("Informe o $i° número:")
                    
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
        println("Selecione uma Opção:\n[1] Verificação de Nulo com Operador de Elvis\n[2] Operador Seguro de Chamada (?.) e Operador Elvis (?:)\n[3] Operador !! e Tratamento de Exceção\n[0] Voltar")
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
            3 -> {
                imprimirTitulo("Operador !! e Tratamento de Exceção")
                println("Digite uma palavra ou frase para que seja exibida revertida:\nObs. Se for vazia, em branco, ou nula, irá gerar um erro java.lang.IllegalArgumentException mostrando a mensagem: \"A String não pode ser nula!\"")
                var string: String? = readLine()
                
                string = if(string.isNullOrBlank()) null else string

                limparTerminal(0)
                println(revertString(string))
                limparTerminal(2000)
            }
            else -> println("Escolha uma opção válida!")
        }
    }
}
// -------- Fim Null Safety Nulidade --------



// -------- Classes --------
fun classes() {
    imprimirTitulo("Classes")
    
    while(true){
        println("Selecione uma Opção:\n[1] Classe Pessoa\n[2] Classe Retângulo\n[3] Classe Conta Bancária\n[0] Voltar")
        var opcao: Int? = readLine()?.toIntOrNull()
        when(opcao) {
            0 -> {
                carregamento(2, "Voltando")
                break
            }
            1 -> {
                imprimirTitulo("Classe Pessoa")

                println("Informe o nome da pessoa:")
                val nome = readLine().toString()
                val idade = retornarNumeroInteiro("Retorne a idade")
                
                val pessoa = Pessoa(nome, idade)
                pessoa.apresentar()
            }
            2 -> {
                imprimirTitulo("Classe Retângulo")

                val largura = retornarDouble("Informe a largura do Retângulo:")
                val altura = retornarDouble("Informe a Altura do Retângulo:")

                val retangulo = Retangulo(largura, altura)

                carregamento(10)
                println("A Área do Retângulo é de: ${retangulo.area()}\nO perímetro do Retângulo é de: ${retangulo.perimetro()}")
                limparTerminal(2000)
            }
            3 -> {
                imprimirTitulo("Conta Bancária")

                var contaBancaria = ContaBancaria(1)
                
                while(true) {
                    println("Selecione uma opção:\n[1] Visualizar Saldo\n[2] Depositar\n[3] Sacar\n[0] Voltar")
                    var opcao = readLine()?.toIntOrNull()
                    when(opcao) {
                        0 -> {
                            println("Voltando...")
                            limparTerminal(0)
                            break
                        }
                        1 -> contaBancaria.exibirSaldo()
                        2 -> {
                            val valor = retornarDouble("Informe o valor para depósito:")
                            contaBancaria.depositar(valor)
                        }
                        3 -> {
                            val valor = retornarDouble("Informe o valor para saque:")
                            contaBancaria.sacar(valor)
                        }
                    }
                }
            }
            else -> println("Escolha uma opção válida!")
        }
    }
}
// -------- Fim Classes --------



// -------- Gerenics - Classes Genericas --------
fun genericsClassesGenericas() {
    imprimirTitulo("Generics - Classes Genéricas")
    
    while(true){
        println("Selecione uma Opção:\n[1] Classe Caixa\n[2] Par Genérico\n[3] Fila Genérica\n[0] Voltar")
        var opcao: Int? = readLine()?.toIntOrNull()
        when(opcao) {
            0 -> {
                carregamento(2, "Voltando")
                break
            }
            1 -> {
                imprimirTitulo("Classe Caixa")

                println("Informe um item, podendo ser qualquer tipo de dado:")
                var item = readLine()
                var caixa = Caixa(item)

                while(true) {
                    println("Selecione uma Opção:\n[1] Obter Item\n[2] Definir Novo Item\n[0] Voltar")
                    var opcao = readLine()?.toIntOrNull()
                    when(opcao) {
                        0 -> {
                            carregamento(2, "Voltando")
                            break
                        }
                        1 -> {
                            carregamento(5)
                            println("Item atual: ${caixa.obterItem()}")
                            limparTerminal(2000)
                        }
                        2 -> {
                            println("Definir novo Item:")
                            val novoItem = readLine()
                            caixa.definirNovoItem(novoItem)
                        }
                        else -> println("Escolha uma opção válida!")
                    }
                }
            }
            2 -> {
                imprimirTitulo("Par Genérico")

                println("Informe o 1° Item, podendo ser de qualquer tipo:")
                var item1 = readLine()
                println("Informe o 2° Item, podendo ser de qualquer tipo:")
                var item2 = readLine()

                var par = Par(item1, item2)
                while(true) {
                    println("Selecione uma Opção:\n[1] Obter Item 1\n[2] Obter Item 2\n[0] Voltar")
                    var opcao = readLine()?.toIntOrNull()
                    when(opcao) {
                        0 -> {
                            carregamento(2, "Voltando")
                            break
                        }
                        1 -> {
                            carregamento(5)
                            println("Item 1: ${par.obterItem1()}")
                            limparTerminal(2000)
                        }
                        2 -> {
                            carregamento(5)
                            println("Item 2: ${par.obterItem2()}")
                            limparTerminal(2000)
                        }
                        else -> println("Escolha uma opção válida!")
                    }
                }
            }
            3 -> {
                imprimirTitulo("Fila Genérica")

                val fila = Fila<String>()
                while(true) {
                    println("Selecione uma Opção:\n[1] Adicionar Item na Fila\n[2] Remover Primeiro Item da Fila\n[3] Visualizar Fila\n[0] Voltar")
                    var opcao = readLine()?.toIntOrNull()
                    when(opcao) {
                        0 -> {
                            carregamento(2, "Voltando")
                            break
                        }
                        1 -> {
                            carregamento(5)
                            println("Informe o Item:")
                            val item = readLine().toString()
                            
                            fila.adicionarNaFila(item)
                            carregamento(5)
                            fila.exibirFila()
                        }
                        2 -> {
                            carregamento(5, "Removendo item...")
                            fila.removerPrimeiroDaFila()
                            carregamento(5)
                            fila.exibirFila()
                        }
                        3 -> {
                            fila.exibirFila()
                        }
                        else -> println("Escolha uma opção válida!")
                    }
                }
            }
            else -> println("Escolha uma opção válida!")
        }
    }
}
// -------- Fim Gerenics - Classes Genericas --------



// -------- Gerenics - Funções Genericas --------
fun genericsFuncoesGenericas() {
    imprimirTitulo("Generics - Funções Genéricas")
    
    while(true){
        println("Selecione uma Opção:\n[1] Função Genérica de Troca\n[2] Função Genérica de Comparação\n[3] Função Genérica de Filtro\n[0] Voltar")
        var opcao: Int? = readLine()?.toIntOrNull()
        when(opcao) {
            0 -> {
                carregamento(2, "Voltando")
                break
            }
            1 -> {
                imprimirTitulo("Função Genérica de Troca")

                val quantidade = retornarNumeroInteiro("Informe quantos itens terá o seu Array:")
                val array = Array(quantidade) {""}

                for(i in array.indices) {
                    println("Informe o item ${i + 1}° do Array:")
                    array[i] = readLine().toString()
                }

                while(true) {
                    println("Selecione uma Opção:\n[1] Trocar Posição de Itens do Array\n[2] Mostrar Itens do Array\n[0] Voltar")
                    var opcao = readLine()?.toIntOrNull()
                    when(opcao) {
                        0 -> {
                            carregamento(2, "Voltando")
                            break
                        }
                        1 -> {
                            limparTerminal(0)
                            println("Posição Atual:")
                            exibirArray(array)
                            
                            println("Informe quais itens você quer trocar de posição.")
                            val posicao1 = retornarNumeroInteiro("Informe a primeira posição:")
                            val posicao2 = retornarNumeroInteiro("Informe a segunda posição:")

                            troca(array, posicao1, posicao2)

                            println("Nova Posição:")
                            exibirArray(array)
                            limparTerminal(2000)
                        }
                        2 -> {
                            carregamento(5, "Exibindo Array...")
                            exibirArray(array)
                            limparTerminal(2000)
                        }
                        else -> println("Escolha uma opção válida!")
                    }
                }

            }
            2 -> {
                imprimirTitulo("Função Genérica de Comparação")

                while(true) {
                    var opcao = retornarNumeroInteiro("Primeiro informe se será uma String ou número:\n[1] String\n[2] Número\n[0] Voltar")
                    when(opcao){
                        0 -> {
                            carregamento(2, "Voltando")
                            break
                        }
                        1 -> {
                            println("Informe dois valores para verificar qual é o maior.\nInforme o primeiro valor:")
                            val parametro1 = readLine().toString()

                            println("Informe o segundo valor:")
                            val parametro2 = readLine().toString()

                            println("Maior Valor: ${maior(parametro1, parametro2)}")
                            limparTerminal(2000)
                        }
                        2 -> {
                            println("Informe dois valores para verificar qual é o maior.\nInforme o primeiro valor:")
                            val parametro1 = readLine()?.toIntOrNull() ?: 0

                            println("Informe o segundo valor:")
                            val parametro2 = readLine()?.toIntOrNull() ?: 0

                            println("Maior Valor: ${maior(parametro1, parametro2)}")
                            limparTerminal(2000)
                        }
                        else -> println("Escolha uma opção válida!")
                    }
                }
                

                
            }
            3 -> {
                imprimirTitulo("Função Genérica de Filtro")


            }
            else -> println("Escolha uma opção válida!")
        }
    }
}
// -------- Fim Gerenics - Funções Genericas --------

// Função para selecionar qual o conteúdo dos algoritmos
fun introducaoPraticaALinguagemDeProgramacaoKotlin() {
    // Menu de Opções de Conteúdo do Curso
    carregamento(5)
    while(true) {
        println("Seleciona uma Opção:\n[1] Funções - Valores de Parâmetro Padrão e Argumentos Nomeados")
        println("[2] Funções - Parâmetro vararg\n[3] Variáveis var e val\n[4] Null Safety Nulidade\n[5] Classes\n[6] Gerenics - Classes Genericas\n[7] Generics - Funções Genéricas\n[0] Voltar")
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
            5 -> classes()
            6 -> genericsClassesGenericas()
            7 -> genericsFuncoesGenericas()
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