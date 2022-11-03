package ui9ugtfg;
import java.util.Scanner;
public class mad {
	
	
	public static void main(String[] args) { 
	
	

	Scanner keyboardInput = new Scanner(System.in);

	

	System.out.print("Enter teams name: ");
	String name = keyboardInput.nextLine();

	System.out.print("Enter color of the jersey : ");
	String jersey = keyboardInput.nextLine();

	System.out.print("Enter best player: ");
	String bestplayer = keyboardInput.nextLine();

	System.out.println("There is a team called " + name);
	System.out.println(" Their jersey is" + jersey);
	System.out.println("and the best player is  "  + bestplayer);

}
}
