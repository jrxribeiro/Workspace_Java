package UserInterface;

import java.util.Scanner;

import core.Funcionario;

public class FolhaPgto {
		public static void main(String args[]) {
			Scanner teclado = new Scanner(System.in);
			Funcionario f1, f2, f3;

			f1 = new Funcionario(1, "Isidro", "Professor", 80.0, 100);
			f2 = new Funcionario(2, "Pedro ", "Gerente  ", 100.0, 70);
			f3 = new Funcionario(Integer.parseInt(teclado.nextLine()),     // numFuncional � INT (tenho q converter)
					             teclado.nextLine(),                       // nome � STRING
					             teclado.nextLine(),       				   // cargo � STRING
					             Double.parseDouble(teclado.nextLine()),   // valorHora � DOUBLE (tenho q converter)
					             Integer.parseInt(teclado.nextLine()));    // numHoras � INT (tenho q converter)

			System.out.println("Folha de Pagamento");
			System.out.println(f1.getNumFuncional() + " | "+f1.getNome()+" | "+f1.calcularSalarioBruto()+ " | "+f1.calcularImposto()+" | "+f1.calcularSalarioLiquido());
			System.out.println(f2.getNumFuncional() + " | "+f2.getNome()+" | "+f2.calcularSalarioBruto()+ " | "+f2.calcularImposto()+" | "+f2.calcularSalarioLiquido());
			System.out.println(f3.getNumFuncional() + " | "+f3.getNome()+" | "+f3.calcularSalarioBruto()+ " | "+f3.calcularImposto()+" | "+f3.calcularSalarioLiquido());
			teclado.close();

		}

	}