import java.util.Scanner;

public class ContaBanco {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        conta.numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        conta.agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente:");
        conta.nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo:");
        conta.saldo = scanner.nextDouble();

        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque.");
    }
}
