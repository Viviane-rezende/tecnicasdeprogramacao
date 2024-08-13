package Banco;

public class Conta {
	public int nConta; // atributo
	public String titular; // atributo
	public double saldo; // saldo

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;

		}
	}

	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		} else {
			return false;
		}
	}

	public String mostrarDados() {
		String texto;
		texto = "\n Nome: " + this.titular + "\t Saldo R$: " + this.saldo +"\n Num Conta"+ nConta;
		return texto;
	}

	

	public boolean transferir(Conta destino, double valor) {
		if (sacar(valor)) {
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
		
		
	}
}