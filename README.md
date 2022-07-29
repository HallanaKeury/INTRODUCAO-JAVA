# REVISÃO JAVA


🔺 VARIÁVEL
> Um espaço na memória do computador, onde se pode guardar valores



Existem 4 tipos:

🔹 1. Instância: objeto

🔹 2. Classe: classe

🔹 3.Local: dentro de métodos

🔹 4. Parâmetro: Na assinatura do método

Padrão de definição da variável:
> <?visibilidade?><?modificador?>tipo nome<?=valor inicial?>
> 

obs:. O que está entre interrogações é opcional, vai depender da necessidade

visibilidade:  
> "public", "protected" e "private"
modificador: 
> "static" e "final(constante)"
tipo:
> tipo de dado 
nome: 
> Nome que é fornecido a variável
valor inicial: 
> Um valor inicial, caso deseje

📍 Convenções e regras:

 - Não devem começar com números
 - Embora permitido, "$" e "_" devem ser evitados;
 - São case-sensitive
 - Sem espaços
 - Não podem ser as palavras reservadas do Java

🔺  TIPOS DE DADOS

São os valores e consequentemente operações que as variáveis podem assumir e sofrer, respectivamente.

📍 Tipos de dados

- Textual
- Numeral
- Lógico
- Objeto


📍 Tipificação:
- Estática 
> (forte) - obriga você a criar a variável já com o tipo
- Dinâmica 
>  (fraco) - pode ser detectado o tipo durante a compilação
- Primitivo
> Tipos básicos, numéricos
-  Composto 
> É heterogênio, pode ser composto de vários dados

📍 Capacidade de armazenamento das variáveis

 - byte > -128 até 127 bytes
 - short > -32.768 ate 32.767 
 - int > 32 bits
 - long > 64 bits
 - float > 32 bits
 - douuble > 64 bits

🔺 OPERADORES ARITMÉTICOS

> São símbolos especiais que são capazes de realizar ações específicas em um, dois ou mais operandos e, em seguida, retornar um resultado.

Tipos

 - pós-fixado: exp++ ou exp--
 - prefixado: ++exp ou --exp
 - aritmético: +,=,*,/,%
 - atribuição: =,+=,-=,*=,/=, e %=

PRECEDÊNCIAS(Ordem em que o java executa)

 - pós-fixado: exp++ ou exp--
 - prefixado: ++exp ou --exp
 - Multiplicativo: *,/,%
 - Aditivo: +, -
 - Atribuição: =, +=, -=, *=,/=,%=



🔺 CASTING

> É a transformação de uma determinada variável de tipo menos específico para um tipo mais específico ou vice-versa.

Tipos

 - Upcast(implícito)
 - Downcast(explícito)
 
 🔺 MÉTODO:

> É uma porção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita uma requisição a ele. São responsáveis por definir e realizar um determinado comportamento.

🔺 Criação de um método

📍 Padrão de definição completo (vazio):
> <?visibilidade?><?tipo?><?modificador?> retorno nome(<?parâmetros?>)<?exceções?>corpo

Onde:

 🔹 1. visibilidade: 
> "public", "protected" ou "private"
 🔹 2. tipo:
>  concreto ou abstrato
 🔹 3. modificador:
> "static" ou "final"
 🔹 4. retorno :
> tipo de dado(string, int, float, double) ou void(vazio)
 🔹 5. nome:
>  Nome que é fornecido ao método
 🔹 6. parâmetros:
> Parâmetros que pode receber
 🔹 7. exceções:
> Exceções que pode lançar
 🔹 8. corpo:
> Código que possui ou vazio

🔺PARTICULARIDADES

🔹 1. Assinatura
> É a forma de identificar unicamente o método
Ass = nome + parâmetros

Exemplo:
Método
public double calcularTotalVenda(double precoItem1, double precoItem2)
{...}

Assinatura: calcularTotalVenda(double precoItem1, double precoItem2)

🔹 2. Construtor e Destrutor: São métodos especiais usados na Orientação a Objetos.

🔹 3. Mensagem: É o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou a uma classe.

🔹 4. Passagem de parâmetros:
 - Por valor (cópia)
 - Por referência (endereço) 
 
 🔺 SOBRECARGA
> É a capacidade de definir métodos para diferentes contextos, mas preservando  seu nome.

Alterar a assinatura do método: 
> Ass = nome + parâmetros

Exemplo:
 - converterParaInteiro(float f);
 - converterParaInteiro(double d);
 - converterParaInteiro(String s);
 - converterParaInteiro(float f, RoundType rd(roundtype arredonda para baixo ou para cima));

 - converterParaInteiro(RoundType rd,  String s);
 - converterParaInteiro();

🔺RETORNO(RETURN)

📍Funcionamento:

 O método executa seu retorno quando:
 - Completa todas as suas instruções internas
 - Chega a uma declaração explícita de retorno
 - Lança uma exceção

 - O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto;
 - O tipo de dado do return deve ser compatível com o do método;
 - Se o método for sem retorno(void), pode ou não ter um "return" para encerrar sua execução.












