# Game_FORCA_2.0
Game Criado Intuitivamente para Teste, Uso Didático para Modo de Jogabilidade orientado Object

* Game usando JLabel - JPanel - <Todos compartilhados em modo Public. e sendo manipulados em outras classes, que fazem uso de atualizar os mesmo citados>
* Uso de Gerenciador Frame<GroupLayaut, Por ser Mais maleável e intuitivo modificar e acrescentar Objetos sem desestrutura o Código.>

* Uso de Class Enum para controle das Palavras a serem usadas, método simples e pratico para seleção randômico das palavras à ser sorteada. 

* TelaControle.java : onde controla todos os processos iniciais, com método Main. sege Controlando inicialização, uma forma simples sem entradas, apenas método de chamada à classes, 
* compNome.java: onde se da Inicio dos algoritmos para controle de acertos e erros. sentando os Object necessários nas outras classes e ligada diretamente com classe gameForca; facilitando assim melhor uso dos métodos da classe.
* nomeRandom.jar : Enum com nomes para serem sorteados e serem Injetados no processo.
* gameForca.jar : Principal classe com controle sobre Os JFame etc.. toda parte gráfica e representativa. somente alguns Algorítimos estão nos métodos Button.
* imgControl.jar: Controla as Imagens serem usadas para Serem injetadas ao errar as letras. algoritmo para controle de cada uma.. apenas injeta na classe gameForca as posições
