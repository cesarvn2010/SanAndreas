San Andreas – Com Java e 4 designs patterns

Autor: César Murilo
 

Propósito

	O objetivo deste projeto é aplicar alguns conhecimentos de padrões de projeto adquiridos e na linguagem de programação que achar melhor. Eu escolhi Java.
      É um projeto bem simples e utiliza 4 designs patterns, sendo eles:
* Strategy
* Adapter
* Decorator
* Memento


Padrões de Projeto aplicados


Strategy

	O pacote gtasanandreas.strategy contêm comportamentos dos personagens. Cada comportamento implementa um método da interface Acao.java. A vantagem de se utilizar o Strategy é que ele permite adicionar ou alterar classes mesmo em tempo de execução, separar e organizar melhor os algoritmos e dispensar o uso de operadores condicionais para utilização dos comportamentos em diferentes momentos.

Adapter

	Quando o personagem Carl Johnson rouba um veículo, passa-se a manipular o veículo. No entanto, Carl Johnson também é controlado e algumas de suas ações ainda são executadas, como, por exemplo, a de atirar.
	Com a vantagem de poder estar reutilizando classes e dar ao jogador uma nova interface para seu personagem, foi utilizado o padrão Adapter. 

Decorator

	O padrão Decorator foi utilizado para equipar o objeto arma com acessórios, como mira a laser e silenciador. 
	A vantagem de utilizar este padrão é que é possível estender uma classe com novas funcionalidades, sem, no entanto, estar modificando a classe principal. 

Memento

 A vantagem de utilizar o padrão Memento é que ele permite recuperar estados quando necessário. Sendo assim, em um jogo é normal que o jogador queira salvar e estar carregando estados. 


