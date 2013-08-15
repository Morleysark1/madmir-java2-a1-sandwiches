import javax.swing.JOptionPane;


	/* 
	 * This is the Sandwich class.
	 * This is an object class.
	 * There will be no main() method here
	 * Instead, you will declare variables to create
	 * the object's "fields", and then add methods 
	 * to retrieve or change the value of each field.
	 * 
	 */


public class Sandwich {
	
	
		
			static String mainIngred;
			static String breadType;
			static double price;
	
			public String getMainIngred() {
				return mainIngred;
			}
			/* have no clue what i did here
			*/
			
			public String getBreadType(){
				return breadType;
			}
			public double getPrice(){
				return price;
			}
			public void setMainIngred(String newMainIngred) {
					mainIngred = newMainIngred;
			}
			public void setBreadType(String newBreadType) {
				breadType = newBreadType;
			}
			public void setPrice(double newPrice) {
				price = newPrice;
		
			}
}
