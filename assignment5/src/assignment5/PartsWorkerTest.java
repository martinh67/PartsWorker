package assignment5;

// class to test the functionality of the parts worker class
public class PartsWorkerTest {
	
	public static void main(String[] args) {
		
		/* the fixed bonus is €10, 
		 * the payment per piece of merchandise to €5, 
		 * the pieces required for the bonus is 5 */
		
		// create the first parts worker object with the number of pieces produced for the first object to 20
		PartsWorker partsWorker1 = new PartsWorker("Thomas", "Dorby", "123-4567-007", 20);
		
		// use the toString method to print out the details of the first object
		System.out.println(partsWorker1.toString());
		
		// print a space
		System.out.println();
		
		// create the second parts worker object with the number of pieces produced for the first object to 1
		PartsWorker partsWorker2 = new PartsWorker("William", "Hanna", "123-4567-008", 1);
		
		// use the toString method to print out the details of the second object
		System.out.println(partsWorker2.toString());
		
	}
}

