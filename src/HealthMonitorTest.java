
public class HealthMonitorTest {
	
    public static void main(String[] args) {
    	
    	/*to string method*/
    	
    	HealthMonitor p1 = new HealthMonitor(75,150,"A");
    	System.out.println(p1.toString());
    	
    	
        HealthMonitor person = new HealthMonitor ();
        System.out.println("Initial Systolic level of " + person.getName() + " is " + person.getSystolic());
        System.out.println("Initial Diastolic level of " + person.getName() + " is " + person.getDiastolic());
        
        person.setBlood(150,10,"Lily");
        System.out.println("Blood pressure level of " + person.getName() + " is " + person.getSystolic() 
        +"/" + person.getDiastolic()+ " mmHg");
    
        /* test high and low level of blood pressure level */
        
        System.out.println("Result of testing high systolic is: " + person.highSystolic());
        System.out.println("Result of testing low systolic is: " + person.lowSystolic());
        System.out.println("Result of testing high diastolic is: " + person.highDiastolic());
        System.out.println("Result of testing low diastolic is: " + person.lowDiastolic());
  
        /* test testBlood function from specific value*/
        
        System.out.println("Testing 140/90 mmHg blood pressure: " );
        person.testBlood(140, 90,"Jane");
        
        /*test testBlood function from random number */
        
        person.setBlood((int)(Math.random()* 251 + 50),(int)(Math.random()* 251 + 50),"John");
        System.out.println(person.getName()+" has random blood pressure level of " + person.getSystolic() + "/" + person.getDiastolic() + " mmHg");
        person.testBlood(person.getSystolic(),person.getDiastolic(),person.getName());
        
        /*Array list test*/
        
    	HealthMonitor p2 = new HealthMonitor(85,150,"B");
    	System.out.println(p2.toString());
    	
    	HealthMonitor p3 = new HealthMonitor(90,100,"C");
    	System.out.println(p3.toString());
    	
    	HealthMonitor p4 = new HealthMonitor(100,120,"D");
    	System.out.println(p4.toString());
 
    	
    	HealthRecord healthrecord = new HealthRecord();
    	System.out.println(healthrecord.toString());
    	
    	healthrecord.register(p1);
    	healthrecord.register(p2);
    	healthrecord.register(p3);
    	healthrecord.register(p4);
    	System.out.println(healthrecord.toString());
    	healthrecord.deregister(p1);
    	System.out.println(healthrecord.toString());
    	
    
}
}