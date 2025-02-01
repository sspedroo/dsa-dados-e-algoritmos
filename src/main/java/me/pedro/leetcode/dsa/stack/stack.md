# Stack

Stack (pilha em português) é basicamente empilhar itens e ele segue o conceito de Lifo (Last in First Out), ou seja, o primeiro que entra
é o primeiro que sai, sempre temos que tirar do topo da pilha.
Caso a gente saiba o tamanho máximo da stack podemos implementar com um array e um ponteiro. Mas geralmente é feita em Linked List pois 
dai a Stack(pilha) pode ser crescer várias vezes. 

Com uma implementação com LinkedList temos um ponteiro HEAD que inicialmente irá apontar para o primeiro item da fila, quando adicionarmos um 
novo item, esse novo item irá apontar para o primeiro e o ponteiro irá se mover para esse novo item.