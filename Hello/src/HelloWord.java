import java.util.Scanner;

public class HelloWord {
	public static void main(String args[]) {
		Pessoa p;
		p = new Pessoa(1, "Isidro", "isi@isi.com", "987654321", "Rua IV", 10, "Bl 1 ap 1", "Oz-asco","Centro", "SP", "01001-000", true);
		Pessoa p2;
		p2 = new Pessoa(2, "Jose", "joe@joe.com", "912345678", "Rua II", 20, "Casa B", "Jau", "Centro", "SP", "11111-111", false);


	    System.out.println("Pessoa 1 = "+p.getNome()+" / "+p.getTelefone()+" - "+p.getEmail());

	    Pessoa p3;

	    p3 = new Pessoa(3, "Isidro simplificado", "isidro@simple.com", "98716253");
  

	    p3.setNumId(10);
 
	}

}