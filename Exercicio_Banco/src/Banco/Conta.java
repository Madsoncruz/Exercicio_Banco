package Banco;

public class Conta {
	private int numeroConta;
	private String nomeTitula;
	private int idade;
	protected double saldoDaConta;

	public Conta() {
	}

	public Conta(int numeroConta, String nomeTitula, int idade, double saldoDaConta) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitula = nomeTitula;
		this.idade = idade;
		this.saldoDaConta = saldoDaConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitula() {
		return nomeTitula;
	}

	public int getIdade() {
		return idade;
	}

	public double getSaldoDaConta() {
		return saldoDaConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public void setNomeTitula(String nomeTitula) {
		this.nomeTitula = nomeTitula;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void depositar (double valor) { 
		if (valor > 0) {
			saldoDaConta += valor;
			System.out.println("Depósito realizado de R$: " + getSaldoDaConta());
		}else {
			System.out.println("Deposito inválido");
		}
	}
	public void Sacar(double valor) { 
		if (valor > 0 && valor <= saldoDaConta){
			saldoDaConta -= valor;
			System.out.println("Saque efetuado de R$ : " + valor);
		}else {
			System.out.println("saque inválido ou saldo insuficiente");
		}
		
	}
	

}
