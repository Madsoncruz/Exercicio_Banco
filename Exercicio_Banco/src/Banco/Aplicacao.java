package Banco;

import java.util.Scanner;


public class Aplicacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		ContaEmpresarial ContaEmpresa = new ContaEmpresarial();
		ContaPessoaFisica ContaPF = new ContaPessoaFisica();
		ContaPoupanca ContaPoupanca = new ContaPoupanca();
		
		System.out.println("Informe duas Contas Empresarial.");

		for (int contador1= 0; contador1 <=2; contador1 ++ ) {
	

			System.out.println("---Conta Empresarial---");
			System.out.print("Informe o numero da conta: ");
			int NumeroContaE = scanner.nextInt();
			ContaEmpresa.setNumeroConta(NumeroContaE);

			System.out.print("Informe o nome do titular: ");
			String nomeTitular = scanner.nextLine();
			ContaEmpresa.setNomeTitula(nomeTitular);
			scanner.nextLine();

			System.out.print("Sua idade: ");
			int Idade = scanner.nextInt();
			ContaEmpresa.setIdade(Idade);

			System.out.print("Informe o saldo da conta: ");
			double SaldoContaE = scanner.nextDouble();
			ContaEmpresa.depositar(SaldoContaE);

			System.out.print("Informe o valor do emprestimo: ");
			double EmprestimoContaE = scanner.nextDouble();
			ContaEmpresa.depositar(EmprestimoContaE);

			System.out.print("Informe o saque: ");
			double limiteDeSaqueE = scanner.nextDouble();
			ContaEmpresa.Sacar(limiteDeSaqueE);
						
			contador1 = contador1 + 1;

			
		}

		
		System.out.println("---///---///---///---///---///---///---///---///---///---///---");
		
		
		System.out.println("---Informe três Contas Pessoa Física---");
		for (int contador2= 0; contador2 <=3; contador2 ++ ) {

			System.out.println("Conta Pessoa Fisica.");
			System.out.println("Informe o numero da conta: ");
			int NumeroContaPF = scanner.nextInt();
			ContaPF.setNumeroConta(NumeroContaPF);

			System.out.println("Informe o nome do titular: ");
			String nomeTitularPF = scanner.nextLine();
			ContaPF.setNomeTitula(nomeTitularPF);
			scanner.nextLine();


			System.out.println("Sua idade: ");
			int IdadePF = scanner.nextInt();
			ContaPF.setIdade(IdadePF);

			System.out.println("Informe o saldo da conta: ");
			double SaldoContaPF = scanner.nextDouble();
			ContaPF.depositar(SaldoContaPF);

			System.out.println("Informe o valor do emprestimo: ");
			double EmprestimoContaPF = scanner.nextDouble();
			ContaPF.depositar(EmprestimoContaPF);

			System.out.println("Informe o saque: ");
			double LimiteDeSaquePF = scanner.nextDouble();
			ContaPF.Sacar(LimiteDeSaquePF);

			contador2 = contador2 + 1;
		}
		
		System.out.println("---///---///---///---///---///---///---///---///---///---///---");
		
		
		System.out.println("---Informe duas Contas Poupança---");
		for (int contador3= 0; contador3 <=2; contador3 ++ ) {

			System.out.println("Conta Poupanca");
			System.out.println("Informe o numero da conta: ");
			int NumeroContaP = scanner.nextInt();
			ContaPoupanca.setNumeroConta(NumeroContaP);

			System.out.println("Informe o nome do titular: ");
			String nomeTitularP = scanner.nextLine();
			ContaPoupanca.setNomeTitula(nomeTitularP);
			scanner.nextLine();


			System.out.println("Sua idade: ");
			int IdadeP = scanner.nextInt();
			ContaPoupanca.setIdade(IdadeP);

			System.out.println("Informe o saldo da conta: ");
			double SaldoContaP = scanner.nextDouble();
			ContaPoupanca.depositar(SaldoContaP);

			System.out.println("Informe o saque: ");
			double SaqueP = scanner.nextDouble();
			ContaPoupanca.Sacar(SaqueP);

			contador3 = contador3 +1;
		}
		
		ContaEmpresa.extratoE();
		ContaPF.extratPF();
		ContaPoupanca.extratoP();

		scanner.close();
	}

}