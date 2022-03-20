/**
 * A HealthMonitor is a tool checking Blood pressure level
 * 
 *  @author Lily Mingthaisong
 */


public class HealthMonitor {

 //field 
/** @param Systolic pressure – the pressure when your heart pushes blood out
 * 
 */
public int systolicLevel; 

/** @param Diastolic pressure – the pressure when your heart rests between beats
 * 
 */
public int diastolicLevel; 

/** @param Name - patient name
 * 
 */
public String name;

//Constructors	
	/** Default constructor, initialises bloodpressure level value at zero of both Systolic and Diastolic. */

public HealthMonitor (int systolicLevel, int diastolicLevel, String name) {
	this.systolicLevel = systolicLevel;
	this.diastolicLevel = diastolicLevel;
	this.name = name;
}

public HealthMonitor () {
	systolicLevel = 0;
	diastolicLevel = 0;
	name = "n/a";
}


/**
 * 
 * @param systolicLevel - the initial value of the blood pressure.
 * @param diastolicLevel - the initial value of the blood pressure.
 * @param name - patient name.
 */

public String toString() {
	return "[patient: " + name + ", systolic level: " + systolicLevel + 
			", diastolic level: " + diastolicLevel + "]";
}
/**
 * 
 * @return systolicLevel
 */

	public int getSystolic() {
		return systolicLevel;
	}
/**
 * 
 * @return diastolicLevel
 */
	
	public int getDiastolic() {
		return diastolicLevel;
	}
	
	/**
	 * 
	 * @return name of patient
	 */
		
		public String getName() {
			return name;
		}
	
//Methods
	/** Sets the value of the blood pressure to that specified in the argument.
	 *
	 * @param systolicLevel - the initial value of the blood pressure.
	 * @param diastolicLevel - the initial value of the blood pressure.
	 * @param name - name of patient
	 */

	public void setBlood(int systolicLevel, int diastolicLevel, String name) {
		this.systolicLevel = systolicLevel;
		this.diastolicLevel = diastolicLevel;
		this.name = name;
	}

	/** test high and low level of blood **/
	
	/**
	 * 
	 * @return the test value of high systolic assumption
	 */
	
	public boolean highSystolic() {
		if(systolicLevel > 140) {
			return true;
		}else {
			return false;
		}
	}
/**
 * 
 * @return the test value of low systolic assumption
 */
	public boolean lowSystolic() {
		if(systolicLevel < 90) {
			return true;
		}else {
			return false;
		}
	}
	
/**
 * 
 * @return the test value of high diastolic assumption
 */
		
	public boolean highDiastolic() {
		if(diastolicLevel > 90) {
			return true;
		}else {
			return false;
		}
	}
/**
 * 
 * @return the test value of low diastolic assumption
 * 
 */

	public boolean lowDiastolic() {
		if(diastolicLevel < 60) {
			return true;
		}else {
			return false;
		}
	}

	/** test value from 2 parameters **/
	
	public void testBlood(int systolicLevel, int diastolicLevel, String name) {
		
		if (systolicLevel <= 140 && systolicLevel >= 90 && 
				diastolicLevel <= 90 && diastolicLevel >= 60) {
			System.out.println("blood pressure level of "+name+" is normal");
			
		} else if (systolicLevel > 140 && diastolicLevel > 90) {
		    System.out.println(name+" has high blood pressure");
		    
		} else if (systolicLevel < 90 && diastolicLevel < 60) {
		    System.out.println(name+" has low blood pressure");
		    
		} else
			System.out.println("unbalance between systolic and diatolic level for "+name);
	}

}
