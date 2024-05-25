import java.util.Scanner;

class ContaTerminal{
//   declaracao de atributos
    int numero;
    String agencia;
    String nomeCliente;
    Double saldo;

//    declaração do metodo
    void criarConta(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Por favor, digite o nome do titular da conta: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, deposite um valor para abrir a conta ");
        saldo = scanner.nextDouble();

        System.out.println(String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque!",
                nomeCliente, agencia, numero,saldo));

        scanner.close();
    }

}

class ContaBancaria {
    public static void main(String[] args) {
        ContaTerminal usuario = new ContaTerminal();
        usuario.criarConta();
    }
}