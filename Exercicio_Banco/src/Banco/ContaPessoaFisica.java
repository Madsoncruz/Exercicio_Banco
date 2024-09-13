package Banco;

public class ContaPessoaFisica extends Conta{
	private double limiteEmprestimo;
	private double limiteSaque;
	
	public ContaPessoaFisica() {
	}
	public ContaPessoaFisica(int numeroConta, String nomeTitula, int idade, double saldoDaConta, double limiteEmprestimo, double limiteSaque) {
		super(numeroConta, nomeTitula, idade, saldoDaConta);
		this.limiteEmprestimo = limiteEmprestimo;
		this.limiteSaque = limiteSaque;
	}
	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}
	public double getLimiteSaque() {
		return limiteSaque;
	}
	public void setLimiteEmprestimo(double limiteEmprestimo) {
		limiteEmprestimo = limiteEmprestimo;
	}
	public void setLimiteSaque(double limiteSaque) {
		limiteSaque = limiteSaque;
	}
	@Override
	public void depositar(double valor) {
		super.depositar(valor);
		saldoDaConta += 15.00;
	}
	@Override
	public void Sacar(double valor) {
		super.Sacar(valor);
		saldoDaConta -= 3.00;
	}
	
	public void extratPF() {
		System.out.println("\n------Extrato das Contas de Pessoa Fisica -------- " );
	    System.out.println("Número da Conta: " + getNumeroConta());
	    System.out.println("Nome do Titular: " + getNomeTitula());
	    System.out.println("Idade: " + getIdade());
	    System.out.println("Saldo da Conta: " + getSaldoDaConta());
	    System.out.println("Limite de Empréstimo: " + getLimiteEmprestimo());
	    System.out.println("Limite de Saque: " + getLimiteSaque());
		}
	
	
	
	
	
	

}
