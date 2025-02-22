import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int num;
        String agencia, nomeCliente;
        float saldo;
        Scanner xc = new Scanner(System.in);

        System.out.printf("Banco Vasco da Gama\n");

        System.out.printf("Programa-> Digite sua conta:\n");
        System.out.printf("Usuário: ");
        num = xc.nextInt();
        xc.nextLine();

        System.out.printf("Programa-> Digite sua agência:\n");
        System.out.printf("Usuário: ");
        agencia = xc.nextLine();

        System.out.printf("Programa-> Digite seu nome:\n");
        System.out.printf("Usuário: ");
        nomeCliente = xc.nextLine();

        System.out.printf("Programa-> Digite seu saldo:\n");
        System.out.printf("Usuário: ");
        saldo = xc.nextFloat();

        System.out.printf("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta %d, e seu saldo (%.2f) ja esta disponivel pra saque.", num, saldo);
        xc.close();
    }
}
