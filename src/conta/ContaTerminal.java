package conta;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		String nomeCliente;
		String agencia;
		int numConta;
		double saldo;
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o numero da agencia: ");
		agencia = scanner.next();
		System.out.println("digite o numero da conta: ");
		numConta = scanner.nextInt();
		System.out.println("digite o nome do cliente: ");
		nomeCliente = scanner.next();
		System.out.println("digite valor a ser depositado: ");
		saldo = scanner.nextDouble();
		
		System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponivel para saque.");
		
		scanner.close();
		
	}
}
