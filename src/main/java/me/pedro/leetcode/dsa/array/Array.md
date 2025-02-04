# Array

Tipo uma lista que armazena elementos, array ocupa um espaço contiguo na memoria, ou seja, os valores de um array estão em sequência na memória.

Por convenção, o primeiro indice(posição) do array começa com 0 e para acessarmos um elemento do array, nos passamos a posição dele no array.

Arrays são imutaveis, tamanho deve ser informado na criação. 


## Técnicas Comuns para resolver problemas de Array e Strings

- Sliding Window
- Two Pointer
- Binary Search
- Exponencial Search

### Sliding Window

Nessa técnica identificamos a possibilidade do seu uso quando a solução é um sub-array ou tamanho de sub-array que preenche certa condição.

Em Sliding Window geralmente usamos dois **While**, um "fora" que expande o ponteiro da direita e o de dentro que expande(ou recua) o 
ponteiro da esquerda. Eu entendi como se fosse a tradução literal de uma janela deslizante, no qual temos dois ponteiros, o direito e o 
esquerdo e o eles vão percorrendo o nosso array aonde o ponteiro direito expande a janela e o ponteiro esquerdo vem "fechando", recuando a 
janela. 

Geralmente só abrimos o segundo **While** quando certa condição acontecer e então acontece o que eu descrevi ali em cima:
ponteiro direito -> expande a janela
ponteiro esquerdo -> diminui a janela

Lembrar de usar o tamanho do array menos 1(- 1) no primeiro While para não sofremos com null ou array out of bounds.

---

### Two Pointer

Como o próprio nome diz, usamos dois ponteiros nessa técnica para resolver o problema. Geralmente consiste em inicializar dois ponteiros, um 
no inicio e outro no fim, manipulamos os ponteiros para não ter que alocar espaços adicionais na memória e os ponteiros indicam para os 
locais aonde estamos no algoritmo.

---

### Binary Search

Esse é um algoritmo clássico e acredito ser importante ter ele sempre revisado na mente. Binary Search conta com uma regra no qual os itens 
devem estar ordenados e ele tem o complexidade temporal de O(Log N) e espacial de O(1).

Então o tempo aumentar linearmente enquanto nosso input aumenta exponencialmente, aqui também utilizamos a técnica de Two Pointer. 
Basicamente iniciamos dois ponteiros (lo e hi) onde lo é no inicio do array de input e hi é no final do array. Enquanto lo não for maior que 
hi (while (lo < hi)) nos realizamos a lógica de pegar o indice do meio e perguntar se é esse nosso target, se for retornamos e se não for nos 
perguntamos se o meio é menor que o nosso target, se for então nosso ponteiro lo recebe um novo inicio que é meio mais 1 e caso não for, 
então o nosso ponteiro hi recebe um novo final que é o mid.

Porque disso? meio que a cada vez que tentamos resolver o problema nos eliminamos metade, ou seja, nós descobrimos o indice do meio do array 
e temos o nosso target, se soubermos que nosso target é maior que nosso indice do meio, então sabemos que tudo que vem antes dele não servirá 
e assim também como caso nosso target seja menor que o meio então tudo que vem depois não servirá e nós repetimos isso até encontrar o target 
ou procurar em todos os elementos.