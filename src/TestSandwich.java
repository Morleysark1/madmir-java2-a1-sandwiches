import javax.swing.JOptionPane;
public class TestSandwich {

	public static void main(String[] args) {
		/*
		 * This class is a program class.
		 * It WILL include a main() method.
		 * This program should create two instances of
		 * Sandwich, and it should demonstrate the
		 * use of all of the methods encapsulated
		 * in the Sandwich class.
		 * 
		 * Finish off this program by displaying the
		 * values of each of the fields for each 
		 * Sandwich instance.
		 * 
		 */
		//Instantiate a SandWhich object
		Sandwich morleysBLT = new Sandwich();
		Sandwich merleSandwich = new Sandwich();
		Sandwich artiesSandwich = new Sandwich();
		
		//set the values of the field in Blt
		morleysBLT.setMainIngred( " beacon, lettus, tomatoes ");
		morleysBLT.setBreadType(" White ");
		morleysBLT.setPrice(2.50);
		
		
		//output 
		String sandwichMaker;
		sandwichMaker = JOptionPane.showInputDialog("Who's making the sandwich?");
		JOptionPane.showMessageDialog
		(null,  sandwichMaker + " is making a " + morleysBLT.getMainIngred() + 
				" sandwich on " + morleysBLT.getBreadType() + ". the price is $" +
				morleysBLT.getPrice());
		
		
		//set the values of the field in Blt
		merleSandwich.setMainIngred( " pepperoni ");
		merleSandwich.setBreadType(" Wheat ");
		merleSandwich.setPrice(5.00);
		
		//output 
		sandwichMaker = JOptionPane.showInputDialog("Who's making the sandwich?");
		JOptionPane.showMessageDialog
		(null,  sandwichMaker + " is making a " + merleSandwich.getMainIngred() + 
				" sandwich on " + merleSandwich.getBreadType() + ". the price is $" +
				merleSandwich.getPrice());
		
		
		//set the values of the field in Blt
				artiesSandwich.setMainIngred( " pbj ");
				artiesSandwich.setBreadType(" whole wheat ");
				artiesSandwich.setPrice(2.50);
				
				//output 
				sandwichMaker = JOptionPane.showInputDialog("Who's making the sandwich?");
				JOptionPane.showMessageDialog
				(null,  sandwichMaker + " is making a " + artiesSandwich.getMainIngred() + 
						" sandwich on " + artiesSandwich.getBreadType() + ". the price is $" +
						artiesSandwich.getPrice());
				
		
	}

}
