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
		String menu = "\n Bem vindo ao sistema bancário. "
				+ "\n 1-Depositar "
				+ "\n 2- Sacar"
				+ "\n 3 - Transferir"
				+ "\n 4 - Mostrar Dados"
				+ "\n 5 - Cadastrar titular"
				+ "\n 0- Sair"
				+ "\n Digite a opção desejada:";

		int op = 0;

		do {
			String inputValue = JOptionPane.showInputDialog(menu);
			op = Integer.parseInt(inputValue);

			switch (op) {
			case 1: {
				inputValue = JOptionPane.showInputDialog("Digite o valor do depósito:");
				valor = Double.parseDouble(inputValue);

				if (c.depositar(valor)) {
					JOptionPane.showMessageDialog(null, "Depósito efetuado com sucesso!");

				} else {
					JOptionPane.showMessageDialog(null, "Não foi possível realizar o depósito pois o valor é invalido");
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
					JOptionPane.showMessageDialog(null, "Não foi possível realizar o saque pois o valor é invalido");
				}
				JOptionPane.showMessageDialog(null, c.mostrarDados());

			}

				break;

			case 3: {
				inputValue = JOptionPane.showInputDialog("Digite o valor da transferência");
				valor = Double.parseDouble(inputValue);

				if (c.transferir(c1, valor)) {
					JOptionPane.showMessageDialog(null, "Transfeência realizado com sucesso!");

				} else {
					JOptionPane.showMessageDialog(null,
							"Não foi possível realizar a transferência pois o valor é invalido");

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
				JOptionPane.showMessageDialog(null, "Opção Inválida");

			}
		} while (op != 0);
	}
}
