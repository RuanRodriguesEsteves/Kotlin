# Kotlin
## Exercícios que pratiquei referente ao conteúdo que aprendi com um Curso na DIO
---
### Funções - Valores de Parâmetro Padrão e Argumentos Nomeados
#### Exercício 1: Calculadora de Desconto
Crie uma função calcularDesconto que calcula o valor do desconto aplicado a um preço. A função deve ter os seguintes parâmetros:
- preço: o preço original do produto.
- desconto: o valor do desconto. O valor padrão deve ser 10% do preço.
- imposto: o valor do imposto a ser aplicado após o desconto. O valor padrão deve ser 5% do preço.

A função deve retornar o preço final após a aplicação do desconto e do imposto.

---
#### Exercício 2: Configuração de Usuário
Crie uma função configurarUsuario que aceita o nome, a idade e o email do usuário. Faça com que o parâmetro email tenha um valor padrão de "não fornecido", e idade tenha um valor padrão de 18. A função deve imprimir uma mensagem configurada com as informações fornecidas.

---
#### Exercício 3: Planejamento de Viagem
Crie uma função planejarViagem que aceita os seguintes parâmetros:
- destino: o destino da viagem.
- dias: o número de dias da viagem, com valor padrão de 7.
- hospedagem: o tipo de hospedagem, com valor padrão de "hotel".

A função deve imprimir uma mensagem detalhando o plano da viagem.

---
### Funções - Parâmetro vararg
#### Exercício 1: Soma de Números
Crie uma função chamada soma que aceita um número variável de parâmetros inteiros e retorna a soma de todos eles.

---
#### Exercício 2: Concatenação de Strings
Crie uma função chamada concatenar que aceita um número variável de strings e retorna uma única string que é a concatenação de todas as strings fornecidas, separadas por um espaço.

---
#### Exercício 3: Média de Valores
Crie uma função chamada media que aceita um número variável de valores Double e retorna a média desses valores.

---
### Variáveis var e val
#### Exercício 1: Modificando Variáveis
Crie um programa que define uma variável var e uma constante val. Modifique a variável var e tente modificar a constante val para observar o comportamento.

---
#### Exercício 2: Lista de Tarefas
Crie um programa que define uma lista de tarefas usando uma variável val. Adicione e remova tarefas da lista usando métodos de mutação. Mostre que a referência à lista não pode mudar, mas o conteúdo da lista pode.

---
#### Exercício 3: Contador de Visitas
Crie um programa que define uma variável var para contar o número de visitas a um site. Use uma constante val para definir um valor de incremento que não pode ser modificado. Atualize o contador de visitas várias vezes e exiba o resultado.

---
### Null Safety Nulidade
#### Exercício 1: Verificação de Nulo com Operador de Elvis
Crie uma função chamada obterNomeCompleto que recebe um nome do meio opcional (String?) e um sobrenome (String). Retorne o nome completo no formato "Nome Sobrenome". Se o nome do meio for null, apenas retorne "Nome Sobrenome".

---
#### Exercício 2: Operador Seguro de Chamada (?.) e Operador Elvis (?:)
Crie uma função chamada contarCaracteres que aceita uma string opcional (String?) e retorna o número de caracteres da string. Se a string for null, retorne 0. Use o operador seguro de chamada (?.) e o operador Elvis (?:).

---
#### Exercício 3: Operador !! e Tratamento de Exceção
Crie uma função chamada reverterString que aceita uma string opcional (String?). Se a string não for null, retorne a string invertida. Se a string for null, lance uma exceção IllegalArgumentException com uma mensagem apropriada. Use o operador !! para garantir que a string não seja nula antes de inverter.

### Classes
#### Exercício 1: Classe Pessoa
Crie uma classe chamada Pessoa que possui as propriedades:
- nome: uma String.
- idade: um Int.

Adicione um método chamado apresentar que imprime uma mensagem apresentando a pessoa no formato "Olá, meu nome é [nome] e eu tenho [idade] anos."

---
#### Exercício 2: Classe Retângulo
Crie uma classe chamada Retangulo que possui as propriedades:
- largura: um Double.
- altura: um Double.

Adicione dois métodos:
- area: que retorna a área do retângulo.
- perimetro: que retorna o perímetro do retângulo.

---
#### Exercício 3: Classe Conta Bancária
Crie uma classe chamada ContaBancaria que possui as propriedades:
- numero: um String.
- saldo: um Double (inicializado com 0.0).

Adicione três métodos:
- depositar: que aceita um valor Double e adiciona ao saldo.
- sacar: que aceita um valor Double e subtrai do saldo, se houver fundos suficientes.
- exibirSaldo: que imprime o saldo atual.
# Kotlin
## Exercícios que pratiquei referente ao conteúdo que aprendi com um Curso na DIO
---
### Funções - Valores de Parâmetro Padrão e Argumentos Nomeados
#### Exercício 1: Calculadora de Desconto
Crie uma função calcularDesconto que calcula o valor do desconto aplicado a um preço. A função deve ter os seguintes parâmetros:
- preço: o preço original do produto.
- desconto: o valor do desconto. O valor padrão deve ser 10% do preço.
- imposto: o valor do imposto a ser aplicado após o desconto. O valor padrão deve ser 5% do preço.

A função deve retornar o preço final após a aplicação do desconto e do imposto.

---
#### Exercício 2: Configuração de Usuário
Crie uma função configurarUsuario que aceita o nome, a idade e o email do usuário. Faça com que o parâmetro email tenha um valor padrão de "não fornecido", e idade tenha um valor padrão de 18. A função deve imprimir uma mensagem configurada com as informações fornecidas.

---
#### Exercício 3: Planejamento de Viagem
Crie uma função planejarViagem que aceita os seguintes parâmetros:
- destino: o destino da viagem.
- dias: o número de dias da viagem, com valor padrão de 7.
- hospedagem: o tipo de hospedagem, com valor padrão de "hotel".

A função deve imprimir uma mensagem detalhando o plano da viagem.

---
### Funções - Parâmetro vararg
#### Exercício 1: Soma de Números
Crie uma função chamada soma que aceita um número variável de parâmetros inteiros e retorna a soma de todos eles.

---
#### Exercício 2: Concatenação de Strings
Crie uma função chamada concatenar que aceita um número variável de strings e retorna uma única string que é a concatenação de todas as strings fornecidas, separadas por um espaço.

---
#### Exercício 3: Média de Valores
Crie uma função chamada media que aceita um número variável de valores Double e retorna a média desses valores.

---
### Variáveis var e val
#### Exercício 1: Modificando Variáveis
Crie um programa que define uma variável var e uma constante val. Modifique a variável var e tente modificar a constante val para observar o comportamento.

---
#### Exercício 2: Lista de Tarefas
Crie um programa que define uma lista de tarefas usando uma variável val. Adicione e remova tarefas da lista usando métodos de mutação. Mostre que a referência à lista não pode mudar, mas o conteúdo da lista pode.

---
#### Exercício 3: Contador de Visitas
Crie um programa que define uma variável var para contar o número de visitas a um site. Use uma constante val para definir um valor de incremento que não pode ser modificado. Atualize o contador de visitas várias vezes e exiba o resultado.

---
### Null Safety Nulidade
#### Exercício 1: Verificação de Nulo com Operador de Elvis
Crie uma função chamada obterNomeCompleto que recebe um nome do meio opcional (String?) e um sobrenome (String). Retorne o nome completo no formato "Nome Sobrenome". Se o nome do meio for null, apenas retorne "Nome Sobrenome".

---
#### Exercício 2: Operador Seguro de Chamada (?.) e Operador Elvis (?:)
Crie uma função chamada contarCaracteres que aceita uma string opcional (String?) e retorna o número de caracteres da string. Se a string for null, retorne 0. Use o operador seguro de chamada (?.) e o operador Elvis (?:).

---
#### Exercício 3: Operador !! e Tratamento de Exceção
Crie uma função chamada reverterString que aceita uma string opcional (String?). Se a string não for null, retorne a string invertida. Se a string for null, lance uma exceção IllegalArgumentException com uma mensagem apropriada. Use o operador !! para garantir que a string não seja nula antes de inverter.

### Classes
#### Exercício 1: Classe Pessoa
Crie uma classe chamada Pessoa que possui as propriedades:
- nome: uma String.
- idade: um Int.

Adicione um método chamado apresentar que imprime uma mensagem apresentando a pessoa no formato "Olá, meu nome é [nome] e eu tenho [idade] anos."

---
#### Exercício 2: Classe Retângulo
Crie uma classe chamada Retangulo que possui as propriedades:
- largura: um Double.
- altura: um Double.

Adicione dois métodos:
- area: que retorna a área do retângulo.
- perimetro: que retorna o perímetro do retângulo.

---
#### Exercício 3: Classe Conta Bancária
Crie uma classe chamada ContaBancaria que possui as propriedades:
- numero: um String.
- saldo: um Double (inicializado com 0.0).

Adicione três métodos:
- depositar: que aceita um valor Double e adiciona ao saldo.
- sacar: que aceita um valor Double e subtrai do saldo, se houver fundos suficientes.
- exibirSaldo: que imprime o saldo atual.

### Generics - Classes Genéricas
#### Exercício 1: Classe Caixa
Crie uma classe genérica chamada Caixa que pode armazenar um único item de qualquer tipo. Adicione métodos para definir e obter o item.

---
#### Exercício 2: Par Genérico
Crie uma classe genérica chamada Par que pode armazenar dois itens de qualquer tipo. Adicione métodos para obter o primeiro e o segundo item.

---
#### Exercício 3: Fila Genérica
Crie uma classe genérica chamada Fila que implementa uma fila simples (First-In-First-Out) usando uma lista. Adicione métodos para enfileirar e desenfileirar itens.

### Generics - Funções Genéricas
#### Exercício 1: Função Genérica de Troca
Crie uma classe genérica chamada Caixa que pode armazenar um único item de qualquer tipo. Adicione métodos para definir e obter o item.

---
#### Exercício 2: Função Genérica de Comparação
Crie uma classe genérica chamada Par que pode armazenar dois itens de qualquer tipo. Adicione métodos para obter o primeiro e o segundo item.

---
#### Exercício 3: Função Genérica de Filtro
Crie uma classe genérica chamada Fila que implementa uma fila simples (First-In-First-Out) usando uma lista. Adicione métodos para enfileirar e desenfileirar itens.