# Bank-Agency-POO
Esta implementação consiste em um programa de Agência Bancária em Java, que demonstra os conceitos de encapsulamento, composição e interação entre classes.

## Diagrama UML
![Diagrama UML das Classes](https://github.com/viniciuscavalcantte/Bank-Agency-POO/blob/main/Classe%20UML.png)
Neste Diagrama:

 "ContaBancaria" possui três atributos privados: numeroConta, nomeTitular e saldo. Ele também possui métodos públicos para obter informações e realizar operações na conta.

 "AgenciaBancaria" possui dois atributos privados: numeroAgencia e contas (uma lista de ContaBancaria). Ele possui métodos públicos para adicionar contas, buscar contas, realizar depósitos e realizar saques.

 "AgenciaBancariaApp" representa aplicação principal do sistema, contendo o método main.
