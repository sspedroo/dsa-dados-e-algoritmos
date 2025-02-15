# Binary Search

um classico algoritmo em que a compreensão se faz importante e necessária. Algumas caracteriscas são que não precisamos exatamente de um 
array para aplicar o BinarySearch, embora aqui no repositório esteja na pasta array, mas pode também ser em uma binary tree, os itens devem 
estar ordenados.

## Complexidades

- Temporal: O(Log N)
- Espacial: O(1)

## Como funciona?

Bom, inicialmente vou tentar escrever com minhas próprias palavras e racicionio e depois eu escrevo de acordo com materiais e cursos. 
Inicialmente vamos aqui no caso um array e vamos usar dois ponteiros. Um ponteiro(vamos chamar de lo)vai no começo do array e outro no final
(vamos chamar de hi).
Fazemos um while no qual a condição é o ponteiro lo ser menor que o hi, caso o ponteiro seja igual ou maior que o hi é porque já olhamos tudo 
que tinha que olhar, dai definimos o meio desse ponteiro e armazenamos numa variavel, dai vem a implementação, se o alvo que estamos 
procurando estiver no meio, retornamos o indice do meio, caso não seja ai vamos as condições e ela se repete até encontrar e caso não 
encontre, no caso eu retorno -1:
- Se o nosso alvo for maior que o meio, então tudo do meio para trás pode ser descartado, então descartamos isso movendo o ponteiro do começo 
  do array para uma posição a frente do meio, ou seja, o novo começo é uma posição a frente do meio pois descobrimos que nosso alvo é maior 
  que esse valor
- Caso o alvo seja menor que meio, então sabemos que tudo do meio pra frente pode ser descartado, então nosso ponteiro final (hi) agora 
  recebe o valor do meio, pois o meio atual é o novo final pois tudo pra frente do meio é maior que o target

Algumas observações, eu não sei porque no caso onde o target for menor que o meio o ponteiro final (hi) recebe meio invés de receber meio - 1,
preciso estudar isso pois quando é o contrário, o ponteiro inicial recebe meio + 1. Segundo, as vezes ainda é meio abstrato o pensamento 
dessa condição while, nem sempre eu lembro com clareza porque ela é dessa maneira.
