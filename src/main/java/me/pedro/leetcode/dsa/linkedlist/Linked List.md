# Linked List

Não estão sequencialmente em memória, um item aponta para o próximo e caso seja uma doubly linked list, cada item aponta pro próximo 
e pro anterior.

Em geral para leitura, ela é mais lenta que um array pois como o array é em sequencia na memoria, nos sabemos exatamente o tamanho dele e 
podemos acessar diretamente qualquer elemento do array.
O array é [elemento 1 / elemento 2 / elemento 3]

Na linked list isso é um pouco diferente. Nos não sabemos o tamanho da linked list e para descobrir teriamos que acessar elemento por elemento
até chegar o final, basicamente seria assim: 
elemento 1 -> elemento 2 -> elemento 3 -> acabou.

Geralmente temos um ponteiro apontando para o inicio da lista, e caso seja doubly linked list, temos um ponteiro para o começo e para o final,
chamados de head(cabeça) e tail(rabo)

Em Linked list é importante analisarmos os cenários pessimista e otimista para as ações de leitura, inserção e remoção e eles são basicamente 
assim

### Leitura

Melhor caso: O(1) -> Quando lemos o primeiro item ou o ultimo (em caso de doubly linked list com ponteiros head e tail)
Pior caso: O(N) -> Quando temos que ler itens no meio da lista, então temos que percorrer ela

### Inserção

Melhor caso: O(1) -> Inserir item no começo ou no final
Pior caso: O(N) -> Inserir item no meio da lista pois mesmo o insert sendo O(1) porém para procurar o item na lista é O(N)

## Remoção

Melhor caso: O(1) -> Mesmo cenário do inserção
Pior caso: O(N) -> Mesmo cenário do inserção

