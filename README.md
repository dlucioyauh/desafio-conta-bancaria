# Projeto ContaBanco

Este é um projeto simples em Java que simula a criação de uma conta bancária via terminal. O usuário é solicitado a fornecer informações como número da agência, número da conta, nome do cliente e saldo inicial. Após a coleta dessas informações, o sistema exibe uma mensagem de confirmação com os dados fornecidos.

## Funcionalidades

- Solicitação de número da agência.
- Solicitação de número da conta.
- Solicitação do nome do cliente.
- Solicitação do saldo inicial da conta.
- Exibição de mensagem de confirmação com os dados inseridos.

## Tecnologias Utilizadas

- Linguagem de Programação: Java
- Ferramentas: Scanner para entrada de dados via terminal

## Como Executar

### Pré-requisitos

- Java Development Kit (JDK) instalado

### Passos para Compilação e Execução

1. **Clone o repositório:**
   ```sh
   git clone https://github.com/seu-usuario/ContaBanco.git
   ```

2. **Navegue até o diretório do projeto:**
   ```sh 
   cd ContaBanco
   ```

3. **Compile o arquivo ContaTerminal.java:**
   ```sh
   javac ContaTerminal.java
   ```

4. **Execute o programa:**
   ```sh
   java ContaTerminal
   ```

# Exemplo de Uso

Quando o programa é executado, ele solicita ao usuário as informações necessárias:

```sh
Por favor, digite o número da Agência !
067-8
Por favor, digite o número da Conta !
1021
Por favor, digite o nome do Cliente !
MARIO ANDRADE
Por favor, digite o saldo da Conta !
237.48
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```

# Tratamento de Erros

O programa inclui uma verificação para garantir que o saldo inserido pelo usuário seja um número decimal válido. Caso contrário, solicita novamente a entrada até que um valor válido seja fornecido.

# Contribuição

Contribuições são bem-vindas! Se você tiver alguma melhoria ou correção, sinta-se à vontade para abrir um pull request.
