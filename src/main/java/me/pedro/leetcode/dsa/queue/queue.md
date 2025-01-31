# Queue 

Queue (fila em português) é uma estrutura de dados que segue o conceito FIFO (first in first out, em português primeiro que entra, primeiro 
que sai). Por implementações de filas geralmente não terem tamanhos fixos podemos usar uma Linked List para implementar uma fila.

Basicamente em uma queue, os elementos são sempre adicionados a frente da última posição da fila, se tornando assim o último elemento, em 
boas implementações de fila, geralmente temos dois ponteiros HEAD e TAIL no qual o HEAD aponta para o começo da fila e TAIl aponta para o 
final assim quando tivermos que inserir um novo item na fila, invés de percorrer tudo, usamos a nossa referência do TAIL. 
Dessa forma garantimos que a inserção e remoção seja O(1) pois sempre iremos saber o começo e o fim da queue (fila).

## DEQUEUE
Não necessariamente é FIFO
é um tipo de fila que os itens podem ser inseridos e removidos tanto no começo quanto no final e para isso usamos geralmente uma doubly linked 
list no qual os itens da fila saberão o próximo e o anterior

