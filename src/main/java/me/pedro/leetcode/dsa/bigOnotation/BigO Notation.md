
# Big O

Entendimento sobre BigO irá me ajudar a fazer algoritmos mais eficientes

## O que é o Big O?
É uma forma de denotar desempenho de um algoritmo e não especificamente sobre um medida de perfomance de um algoritmo, pelo o que pude entender 
sobre.
o que li sobre a notação Big O, ela nós ajuda a mensurar a escabilidade do nosso algoritmo conforme nosso input (entrada) aumenta. 
Sendo assim, conseguimos ver a escabilidade do nosso algoritmo dado a um tamanho de input. Em casos de input pequenos, o Big O não acaba
tendo, como posso dizer, não acaba influenciando muito, porém em casos de input grandes, ai vemos a importância e a aplicabilidade do Big O.
Big O descreve como o tempo de execução ou de uso de memória de um algoritmo cresce conforme o tamanho da entrada(N) aumenta, é isto.

NO Big O sempre consideramos o caso pessimista, ou seja, o pior caso de todos, na minha mente eu estou linkando a lei de murphy lembrando do
filme, se algo pode acontecer seja ruim ou não, então vai acontecer. Então em Big O eu considero isso, posso ter o cenario otimista, o medio e o
péssimo, eu considero o péssimo sempre, o pior dos casos.

---
## Complexidade Temporal
Da forma que entendi, complexidade temporal diz respeito ao tempo de execução do algoritmo (runtime), de certa forma diz respeito ao tempo, seja
ele percorrendo a estrutura, fazendo calculos e analises no algoritmo e etc...

## Complexidade Espacial
Diz respeito ao espaço, no caso memória, o quanto de memória adicional precisamos alocar em nosso algoritmo

## Notações

### O(1)

Significa tempo constante ou memória constante, aqui entendi como que independente do input do algoritmo o tempo de execução será o mesmo, tempo
será constante.
Já em termos de memória é que ela também será constante, ou seja, indenpendente do algoritmo, iremos precisar sempre o mesmo espaço em memória.
Conforme o input aumente, o requisito de espaço de memória permanece o mesmo.

---
### O (LOG N)
Esse eu sinto dificuldade em compreender por isso geralmente eu tento dar mais atenção. 

Binary Search escala em LOG N, ou seja, escala logarítmica.

Os algoritmos log n entendo como conforme o input cresça muito, o tempo de execução não aumenta tão rápido quanto o input
Se um input cresce exponencialmente, o tempo de execução de um algoritmo LOG N irá crescer linearmente

Regra prática: Se o algoritmo descarta metade dos dados a cada passo, provavelmente é O(log N).

---
### O (N)

Em complexidade temporal, seria percorrer todos os elementos da estrutura. O O(n) escala exatamente na medida que o input aumenta.
é o mais simples de entender.
Em questão de espaço, seria equivalente a necessitar a mesma quantidade de espaço em memória que o tamanho do input

---
### O (N LOG N)
Esse também sinto dificuldades, tento sempre abstrair bem.
Matematicamente falando o tempo de execução cresce proporcionalmente a N multiplicado pelo logaritmo de N.

- N representa o número de elementos (ex: itens em uma lista).
- log N vem de operações que "dividem o problema" (como na busca binária).

log n porque? porque sempre que eu estou dividindo, eu estou cortando pela metade até ter algo unico, isso é logaritmo pois estou linear cortando
ao meio. Apos separar ate ficar unico, eu vou ter que juntar e no final das contas ainda terei a mesma quantidade pra juntar, por isso N

Dica: algoritmos de sorting (exceto BubbleSort) ou de divide and conquer serão O(N LOG N)

---

### O (N^2)
É um loop dentro de um loop, for dentro de for.
Para cada item, ele irá checar todos os outros itens


