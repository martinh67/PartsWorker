package assignment5;

// extend the Employee class
public class PartsWorker extends Employee {
	
	// declare variables required for PartsWorker
	private double paymentPerPiece;
	private int piecesProduced;
	private double fixedBonus;
	private int piecesRequiredForBonus;
	
	// constructor for the PartsWorker class
	public PartsWorker(String first, String last, String ssn, int piecesProduced) {
		
		// initialise the attributes from the Employee super class
		super(first, last, ssn);
		
		// the payments per piece of merchandise sold is set to €5
		this.setPaymentPerPiece(5);
		
		// the pieces produced is the parameter passed in
		this.setPiecesProduced(piecesProduced);
		
		// the fixed bonus is initialised at €10
		this.setFixedBonus(10);
		
		// the pieces required to be sold to qualify for the bonus is initialised to 5
		this.setPiecesRequiredForBonus(5);
	}
	
	// method to set the pieces of merchandise required for the parts worker to qualify for the bonus
	private void setPiecesRequiredForBonus(int piecesRequiredForBonus) {
		
		// set the instance of the parts worker to the parameter passed
		this.piecesRequiredForBonus = piecesRequiredForBonus;
	}
	
	// method to get the pieces required to make the bonus
	private int getPiecesRequiredForBonus() {
		
		// set the current instance of the pieces required for the bonus to the parameter
		return this.piecesRequiredForBonus;
	}
	
	// method to initialise the standard bonus payment for the parts worker
	private void setFixedBonus(double fixedBonus) {
		
		// set the instance of the fixed bonus to the parameter passed
		this.fixedBonus = fixedBonus;
	}
	
	// method to get the fixed bonus payment for the parts worker
	private double getFixedBonus() {
		
		// return the current instance of the fixed bonus
		return this.fixedBonus;
	}
	
	// method to set the pieces of merchandise produced for the parts worker
	public void setPiecesProduced(int piecesProduced) {
		
		// set the instance of pieces produced to the parameter
		this.piecesProduced = piecesProduced;
	}
	
	// method to get the pieces of merchandise produced
	public int getPiecesProduced() {
		
		// set the instance of pieces produced to the parameter
		return this.piecesProduced;
	}

	// initialise the payment per piece for the parts worker
	private void setPaymentPerPiece(double paymentPerPiece) {
		
		// set the instance of the payments per piece to the parameter
		this.paymentPerPiece = paymentPerPiece;
	}
	
	// get the payments per piece for the PartsWorker
	private double getPaymentPerPiece() {
		
		// return the paymentsPerPiece
		return this.paymentPerPiece;
	}
	
	// calculate the standard earnings without the bonus on the merchandise
	private double calculateStandardEarnings() {
		
		// return the calculated standard earnings i.e., multiplying the pieces produced by the payment
		return this.getPiecesProduced() * this.getPaymentPerPiece();
	}
	
	// method to check if the parts worker has achieved the bonus
	private boolean isBonusAchieved() {
		
		// if the current instance of the parts worker has achieved the bonus
		if (this.getPiecesProduced() >= this.getPiecesRequiredForBonus()) {
			
			// return true 
			return true;
			
		// if the parts worker has not achieved the bonus
		} else {
		
			// return false
			return false;
		}
	}
	
	// override the toString method from the Employee super class
	@Override
	public String toString()
	{

		//return all of the information regarding the employee
	   return String.format( "Name: %s %s\nSSN: %s\nPieces Produced: %d\nPayment Per Piece: €%.2f\nFixed Bonus: €%.2f\nBonus Achieved: %s\nEarnings: €%.2f", 
	     getFirstName(), getLastName(), getSocialSecurityNumber(), getPiecesProduced(), getPaymentPerPiece(), getFixedBonus(), isBonusAchieved(), earnings() );
	   
	} 
	
	// override the earnings method from the Employee class for the PartsWorker
	@Override
	public double earnings() {
		
		// declare earnings variable needed
		double partsWorkerEarnings = this.calculateStandardEarnings();
		
		// if the parts worker employee has achieved the bonus
		if (this.isBonusAchieved()) {
			
			// add the bonus to the standard earnings
			partsWorkerEarnings += this.getFixedBonus();
		}
		
		// return the earnings
		return partsWorkerEarnings;
	}
}
