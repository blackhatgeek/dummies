package am.kdm.dummy;

public class Sinus {
/****************** Sinus function approximation ******************/
	
	/**
	 * Method gives value of the sinus function for variable x given
	 * 
	 * For x given in range <-π;π> the following formula is used:
	 * sin(x) ≈ x - (x^3)/3! + (x^5)/5! - (x^7)/7!
	 * See: Approximation and convergence in Taylor series at Wikipedia
	 * https://en.wikipedia.org/wiki/Taylor_series#Approximation_and_convergence
	 * 
	 * For x given from without the range above, the variable's being shifted to the range
	 * to return approptiate value
	 *  
	 * @param x real number
	 * @return sin(x) function value
	 */
	public static double sin(double x){
		//shift the variable to fit the range
		if(x>Math.PI&&x<=2*Math.PI) x=x-2*Math.PI;
		else if ((x<-Math.PI)||(x>Math.PI)) x=x%(2*Math.PI);
		
		//approximate the value
		return x-x*x*x/6+x*x*x*x*x/120-x*x*x*x*x*x*x/5040;
	}
	
	/**
	 * Given the x as multiple of π, value of sin(x) is calculated
	 * @param x variable of the sinus as a multiple of π (e.g 0.5 will calculate sin(π/2)
	 * @return sin(x) function value using sin(x) function
	 */
	public static double sin2(double x){
		return sin(x*Math.PI);
	}

}
