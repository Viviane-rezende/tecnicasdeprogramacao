package Banco;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// instanciar um objeto do tipo conta

		Conta c = new Conta();
		c.nConta = 001;
		c.titular = "Viviane";
		c.saldo = 1000;
		double valor = 0;

		Conta c1 = new Conta();
		c1.titular = "Alejandro";
		c1.nConta = 777;
		c1.saldo= 1;

		Scanner entrada = new Scanner(System.in);
		String menu = "\n Bem vindo ao sistema banc�rio. "
				+ "\n 1-Depositar "
				+ "\n 2- Sacar"
				+ "\n 3 - Transferir"
				+ "\n 4 - Mostrar Dados"
				+ "\n 5 - Cadastrar titular"
				+ "\n 0- Sair"
				+ "\n Digite a op��o desejada:";

		int op = 0;

		do {
			String inputValue = JOptionPane.showInputDialog(menu);
			op = Integer.parseInt(inputValue);

			switch (op) {
			case 1: {
				inputValue = JOptionPane.showInputDialog("Digite o valor do dep�sito:");
				valor = Double.parseDouble(inputValue);

				if (c.depositar(valor)) {
					JOptionPane.showMessageDialog(null, "Dep�sito efetuado com sucesso!");

				} else {
					JOptionPane.showMessageDialog(null, "N�o foi poss�vel realizar o dep�sito pois o valor � invalido");
				}
				JOptionPane.showMessageDialog(null, c.mostrarDados());

				break;
			}
			case 2: {
				inputValue = JOptionPane.showInputDialog("Digite o valor do saque:");
				valor = Double.parseDouble(inputValue);

				if (c.sacar(valor)) {
					JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "N�o foi poss�vel realizar o saque pois o valor � invalido");
				}
				JOptionPane.showMessageDialog(null, c.mostrarDados());

			}

				break;

			case 3: {
				inputValue = JOptionPane.showInputDialog("Digite o valor da transfer�ncia");
				valor = Double.parseDouble(inputValue);

				if (c.transferir(c1, valor)) {
					JOptionPane.showMessageDialog(null, "Transfe�ncia realizado com sucesso!");

				} else {
					JOptionPane.showMessageDialog(null,
							"N�o foi poss�vel realizar a transfer�ncia pois o valor � invalido");

				}
				JOptionPane.showMessageDialog(null, "Conta Origem:" + c.mostrarDados());
				JOptionPane.showMessageDialog(null, "Conta Destino:" + c1.mostrarDados());
			}

				break;

			case 4: {
				JOptionPane.showMessageDialog(null, c.mostrarDados());

				break;
			}

			case 5: {

				break;
			}

			default:
				JOptionPane.showMessageDialog(null, "Op��o Inv�lida");

			}
		} while (op != 0);
	}
}
