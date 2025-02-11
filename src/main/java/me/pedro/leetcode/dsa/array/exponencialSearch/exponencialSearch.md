# Exponential Search

Exponential Search é um algoritmo de busca no qual também usamos a binary search em usa implementação. O array também precisa estar ordenado 
e ele combina duas técnicas: Binary Search e uma busca linear limitada. 
Ele é útil em casos quando o tamanho do array é desconhecido ou muito grande, se tornando especialmente eficaz em cenário onde o elemento 
procurado está próximo ao início do Array pois reduz o número de comparações necessárias.

## Complexidades

- Temporal: O(Log N)
- Espacial: O(1)

## Como funciona?

Temos duas etapas principais, a primeira sendo encontrar um intervalo onde está o elemento que procuramos e a segunda que é realizar uma 
busca binaria nesse intervalo.
Começamos com um intervalo pequeno e vamos dobrando é encontrar um intervalo que contenha o elemento a ser procurado. Na primeira etapa 
podemos usar dois ponteiros ou somente um.
Usando um ponteiro o primeiro passo que fazemos é conferir se o elemento do indice(posição) 0 do array é o elemento que estamos procurando, 
caso seja retornamos o indice 0, caso não seja então definimos o ponteiro como 1 (aqui nos estamos iniciando o intervalo) e fazemos um while 
no qual a condição é: **Enquanto o ponteiro for menor que o tamanho do Array e o Elemento do Array na posição do ponteiro for menor que o 
Target** nos multiplicamos o ponteiro, caso seja 2 ponteiros, multiplicamos os dois e fazemos isso até acharmos o intervalo onde o Target 
está ou até acabar tudo.

No final do while podemos ter duas condições, o Elemento do Array no indice do ponteiro é igual ao Target dai retornamos o ponteiro ou no 
outro caso nos garantimos que passamos do target e dai então fazemos um binarySearch nesse intervalo encontrado.

Minha explicação para esse algoritmo não está das melhores mas vou tentar deixar menos confuso. 

## Usando 1 Ponteiro

Usando um ponteiro nós iremos seguir por esse fluxo, eu defino um Método(considerando que estou usando Java, em outros casos Função) chamado 
exponentialSearch(Array, Target) e esse método espera receber duas coisas, um array e um alvo que está sendo procurado (target).

De primeira eu já faço o confere se a primeira posição/indice do array(array[0]) é igual ao target, se for eu retorno esse indice, 
continuando o fluxo, eu declaro uma variavel que será o tamanho do Array e um variavel que será um Ponteiro com o valor inicial de 1, ou seja,
como já garantimos que o primeiro indice não é igual ao target, então nosso ponteiro começa um posição a frente.

Dai vem a condição do WHILE, enquanto o Ponteiro for menor que o tamanho do Array **e** o elemento do indice do valor atual do ponteiro(essa 
parte eu me complico, elemento do indice do valor atual do ponteiro nada mais é do que Array[ponteiro]) for menor que o Target, nos fazemos a 
operação de multiplicar o valor do ponteiro, então ele vai se multiplicando, dobrando sua busca até cair fora do WHILE.

Caindo fora do WHILE, ocorrem duas alternativas, a primeira é chegar se o indice do ponteiro(Array[ponteiro]) é igual ao Target, se for, 
retornamos o ponteiro
A outra condição é retornar uma binarySearch() com as seguintes condições, é uma binarySearch com uma implementação um pouco diferente.
Como estamos querendo usar O(1) na complexidade Espacial, então nós passamos para a binarySearch 4 parâmetros. O array inteiro da 
exponentialSearch e o Target e passamos também os ponteiros responsvel por delimitar onde deve ser realizado a binarySearch(), sendo esses 
ponteiros equivalente ao **lo** e **hi** de uma binarySearch e para definir isso passamos a metade do valor do ponteiro(equivalente ao lo).

mas porque Pedro a metade do valor do ponteiro, porque o ponteiro se multiplica até sair da condição, caso estejamos nesse passo atual, 
significa que passamos o valor de target e para definir o intervalo onde ele está, nós pegamos o ponteiro e dividimos no meio, assim temos o 
começo desse intervalo.

Já o equivalente ao hi, seria o valor minimo entre o ponteiro ou o ultimo indice do array(seria algo do tipo Min(ponteiro, Array.length - 1)),
assim estamos garantindo que caso o ponteiro tenha ficado maior do que o tamanho do array, então passamos a ultima posição do array, caso 
contrário nós passamos o ponteiro mesmo.

De restante é uma implementação normal de binarySearch
