San Andreas – Com Java e 4 designs patterns


 Este projeto em Java é bem simples e utiliza 4 designs patterns, sendo eles:
* Strategy
* Adapter
* Decorator
* Memento


Strategy

	O pacote gtasanandreas.strategy contêm comportamentos dos personagens. Cada comportamento implementa um método da interface Acao.java. A vantagem de se utilizar o Strategy é que ele permite adicionar ou alterar classes mesmo em tempo de execução, separar e organizar melhor os algoritmos e dispensar o uso de operadores condicionais para utilização dos comportamentos em diferentes momentos.

Adapter

	Quando o personagem Carl Johnson rouba um veículo, passa-se a manipular o veículo. No entanto, Carl Johnson também é controlado e algumas de suas ações ainda são executadas, como, por exemplo, a de atirar.
	Com a vantagem de poder estar reutilizando classes e dar ao jogador uma nova interface para seu personagem, foi utilizado o padrão Adapter. 

Decorator

	O padrão Decorator foi utilizado para equipar o objeto arma com acessórios, como mira a laser e silenciador. 



