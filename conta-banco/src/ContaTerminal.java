import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação dos dados ao usuário
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine();

        double saldo = 0.0;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println("Por favor, digite o saldo da Conta !");
            if (scanner.hasNextDouble()) {
                saldo = scanner.nextDouble();
                entradaValida = true;
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número decimal válido.");
                scanner.next(); // Consumir a entrada inválida
            }
        }

        // Exibição da mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                          ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        // Fechamento do scanner
        scanner.close();
    }
}
