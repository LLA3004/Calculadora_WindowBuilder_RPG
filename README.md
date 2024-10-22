# Calculadora_WindowBuilder_RPG
Esta aplicação é uma calculadora de combate para um sistema RPG com interface gráfica (GUI) construída em Java utilizando a biblioteca Swing. Ela permite calcular o resultado de ataques e defesas entre dois personagens, levando em conta atributos, modificadores, armas, armaduras e efeitos. A aplicação também implementa a possibilidade de rolar dados com diferentes números de faces e aplicar efeitos como "Golpe Furtivo", falhas e acertos críticos.

Funcionalidades
Entrada de Dados:
O usuário pode inserir o número de faces do dado para ataque e dano, além de valores para atributos como destreza, modificadores de ataque/defesa, atributos da arma, efeito do ataque, e características da armadura.

Rolar Dados:
Um dado é rolado para determinar o resultado do ataque, com base no número de faces fornecido. O resultado do dado é utilizado junto com atributos e modificadores para calcular o valor final do ataque.

Cálculo de Ataque e Defesa:
O ataque é calculado somando-se o resultado do dado ao atributo do atacante, arma, efeito, e modificadores de ataque.
A defesa é calculada somando-se a destreza (dividida por dois), a armadura, a arma de defesa, e os modificadores de defesa.

Golpe Furtivo:
Caso o checkbox "Golpe Furtivo" esteja marcado, o dano causado no ataque é multiplicado por dois.
Críticos e Falhas Críticas:
Se o dado de ataque rolar um valor mínimo (1), o ataque é tratado como uma falha crítica e tem valor 1.
Se o dado rolar o valor máximo (baseado no número de faces), o ataque será considerado um acerto crítico e o dano será dobrado.

Resultado do Combate:
Se o ataque for maior que a defesa, o sistema rola um número de dados de dano baseado no multiplicador do ataque sobre a defesa e exibe o dano total.
Caso contrário, a defesa será considerada bem-sucedida, e uma mensagem indicará o sucesso da defesa.

Tratamento de Erros:
Caso algum campo obrigatório esteja vazio ou contenha um valor inválido, o sistema exibe uma mensagem de erro solicitando o preenchimento correto.

Campos de Entrada
Dado (Número de Faces): O número de faces do dado para determinar o resultado do ataque.
Dano (Número de Faces): O número de faces do dado usado para calcular o dano.
Atributo: Atributo de ataque do atacante.
Arma: Atributo da arma do atacante.
Efeito: Efeito aplicado ao ataque (ex: magia, bônus temporário).
Modificador de Ataque: Um valor adicional que influencia o ataque.
Destreza: A destreza do defensor, dividida por dois no cálculo da defesa.
Armadura: O valor da armadura do defensor.
Modificador de Defesa: Um valor adicional que influencia a defesa.
Arma (Defesa): Atributo da arma de defesa.

Ações Principais
Botão "Calcular": Executa o cálculo do ataque e da defesa com base nos valores fornecidos. Exibe o resultado em uma caixa de diálogo (JOptionPane).
Checkbox "Golpe Furtivo": Aplica um multiplicador ao dano total se estiver selecionado.

Como Usar
Preencha todos os campos com os valores apropriados para o combate, incluindo o número de faces dos dados, atributos, modificadores, etc.
Selecione o checkbox "Golpe Furtivo" se o ataque envolver um ataque furtivo.
Clique no botão "Calcular" para executar a simulação de ataque e defesa.

O resultado será exibido em uma caixa de diálogo, indicando se o ataque foi bem-sucedido ou se a defesa prevaleceu.

Estrutura do Código
Classes
calc: Classe principal que herda de JFrame e configura a interface gráfica com componentes como JLabel, JTextField, JButton, e JCheckBox.
EventQueue: Responsável por lançar a aplicação em uma thread separada de evento, garantindo a execução correta da interface gráfica.
JOptionPane: Utilizado para exibir o resultado final do cálculo (ataque ou defesa) ao usuário.
Random: Usado para simular a rolagem de dados.

Lógica de Ataque e Defesa
O dado é rolado usando Random para gerar um número entre 1 e o número de faces do dado de ataque.
O ataque é calculado somando-se o valor do dado rolado com os atributos de ataque (atributo, arma, efeito e modificadores).
A defesa é calculada com base na destreza, armadura, arma de defesa e modificadores de defesa.
Se o ataque exceder a defesa, o sistema calcula o dano rolando dados adicionais com base no multiplicador ataque/defesa.

Se houver um acerto crítico ou golpe furtivo, o dano total é multiplicado por 2.
Tratamento de Exceções

A aplicação captura exceções do tipo NumberFormatException para garantir que todos os campos obrigatórios sejam preenchidos corretamente e exibe mensagens de erro apropriadas.

Requisitos
Java 8 ou superior.
IDE ou ambiente de desenvolvimento para executar o código (ex: Eclipse, IntelliJ IDEA).
Como Executar
Faça o download ou clone o repositório.
Abra o projeto em sua IDE de preferência.
Compile e execute a classe calc.
Preencha os campos necessários e clique em "Calcular" para ver os resultados do combate.

