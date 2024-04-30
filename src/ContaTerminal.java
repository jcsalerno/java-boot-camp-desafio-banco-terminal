import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Seja bem-vindo(a), ao Banco DIO-SAN!");
        System.out.println("Aperte ENTER para entrar no seu banco!");
        String enter = scan.nextLine();

        System.out.println("Por favor, digite o número da sua conta:");
        int contaBancaria = Integer.parseInt(scan.nextLine().trim());

        System.out.println("Por favor, digite o número da sua agência:");
        String contaAgencia = scan.nextLine().trim();

        System.out.println("Por favor, digite seu nome:");
        String nomeUsuario = scan.nextLine().trim();

        System.out.println("Por favor, digite seu saldo:");
        double saldo = Double.parseDouble(scan.nextLine().trim());

       System.out.printf("Olá " + nomeUsuario);
       System.out.print(", obrigado por criar uma conta em nosso banco, sua agência é " + contaAgencia);
       System.out.print(" , conta: " + contaBancaria);
       System.out.print(" e seu saldo é R$ " + saldo);

    }
}
