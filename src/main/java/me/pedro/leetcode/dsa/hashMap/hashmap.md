# HashMap

Tempo geralmente de O(1). O HashMap funciona com chave-valor no qual uma chave está associada a um valor.
Usam a hash(ou hashing) function que realiza a função de associar um input(chave-key) com o slot no array do item que buscamos. 

De começo pode ser meio confuso de entender, estou escrevendo isso para quando eu reler não entender quase nada sem contexto.

Em outras palavras, a hash function irá fazer o serviço de mapear aquilo que estamos buscando (o valor) com a chave e ela é constante pois 
sempre que buscarmos por tal chave, ela sempre estará associada a aquele valor. 
Basicamente é isso, o hashmap pega uma chave , faz uma operação e transforma num valor que será a posição no array onde o item está

Pode existir colisões e com isso temos que lidar com elas, para isso existe o Load Factor que seria a diferença de tamanho entre a estrutura 
de dados que temos e a quantidade de dados. Então se temos um array de tamanho 10.000 e temos 7.000 dados nele, temos um Load Factor de 70%, 
ou 0,7. O rapaz do curso diz que para ter um tradeoff bom entre espaço(memória) e tempo(eficiência) (tradeoff para mim é tipo o equilibrio nas 
coisas, saber abrir mão disso para ter um pouco daquilo) podemos permitir somente 70% a 80% de LoadFactor no hashmap e quando chega ao limite, 
dobramos o tamanho de memória e recalcular as posições de cada elemento. 

Atualmente para lidar com colisões, temos uma abordagem para qual quando houver uma colisão que apontar para outro item, naquela posição do 
array terá uma outra estrutura de dados, provavelmente outro array não muito grande, então dentro do array em uma posição que colide iremos 
ter outro array nessa posição e dentro desse array teremos os valores, assim evitando conflito e mantendo a complexidade em O(1) pois a 
estrutura de dados dentro desse array inicial é tão pequena que a complexidade O(N) para encontrar o elemento certo não interfere em nada.

Pode ter ficado um pouco confuso então vou tentar escrever com outras palavras. Temos um array que é o nosso hashmap, em algum momento pode 
haver uma colisão que seria a chaves diferentes apontando para o mesmo hash(indice/posição no array).
Para resolvermos isso, nessa posição nos criamos um novo array não muito grande e cada um da posição desse array tera lá os elementos. 
Por conta desse array ser muito pequeno, o processo de procurar qual elementos queremos O(N) que seria percorrer o array até encontrar, não 
entre muito na complexidade do algoritmo e então por isso notação ainda se mantém O(1).

