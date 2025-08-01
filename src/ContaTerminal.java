import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência !");
        numero = sc.nextInt();
        // evitar o problema do Enter que ficar no buffer
        sc.nextLine();
        System.out.println("Por favor, digite o nome da Agência!");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o saldo do Cliente!");
        saldo = sc.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");




    }
}