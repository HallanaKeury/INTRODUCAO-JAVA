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










