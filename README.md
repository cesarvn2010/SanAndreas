# San Andreas � Com Java e 4 designs patterns

Autor: C�sar Murilo
 

## Prop�sito

   O objetivo deste projeto � aplicar alguns conhecimentos de padr�es de projeto adquiridos e na linguagem de programa��o que achar melhor. Eu escolhi Java.
   � um projeto bem simples e utiliza 4 designs patterns, sendo eles:

* Strategy
* Adapter
* Decorator
* Memento


## Padr�es de Projeto aplicados


### Strategy

   O pacote gtasanandreas.strategy cont�m comportamentos dos personagens. Cada comportamento implementa um m�todo da interface Acao.java. A vantagem de se utilizar o Strategy � que ele permite adicionar ou alterar classes mesmo em tempo de execu��o, separar e organizar melhor os algoritmos e dispensar o uso de operadores condicionais para utiliza��o dos comportamentos em diferentes momentos.

### Adapter

  Quando o personagem Carl Johnson rouba um ve�culo, passa-se a manipular o ve�culo. No entanto, Carl Johnson tamb�m � controlado e algumas de suas a��es ainda s�o executadas, como, por exemplo, a de atirar.
  Com a vantagem de poder estar reutilizando classes e dar ao jogador uma nova interface para seu personagem, foi utilizado o padr�o Adapter. 

### Decorator

   O padr�o Decorator foi utilizado para equipar o objeto arma com acess�rios, como mira a laser e silenciador. 
   A vantagem de utilizar este padr�o � que � poss�vel estender uma classe com novas funcionalidades, sem, no entanto, estar modificando a classe principal. 

### Memento

   A vantagem de utilizar o padr�o Memento � que ele permite recuperar estados quando necess�rio. Sendo assim, em um jogo � normal que o jogador queira salvar e estar carregando estados. 


