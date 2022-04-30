package teste;

import java.util.Scanner;

public class DesafioVinho {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 String T = scan.nextLine();
		 String respostasCompetidores = scan.nextLine();


		 String[] respostasCompetidoresSplit = respostasCompetidores.split(" "); 
		 int count = 0;
		 for (int i = 0; i < respostasCompetidoresSplit.length; i ++) {
		   if (T.equalsIgnoreCase(respostasCompetidoresSplit[i])) 
		     count++;
		 }
		 
		 System.out.println(count);
		 scan.close();
	}

}
