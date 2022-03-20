import java.util.ArrayList;
/**
 * Health record with patient group and blood pressure record for each groups. 
 * The patient group are an aggregation of the HealthMonitor class.
 * 
 * @author Lily Mingthaisong
 *
 */

public class HealthRecord {
//field
	private String patientGroup;
	private ArrayList<HealthMonitor> bloodpressureRecord;
	
//constructors
	public HealthRecord(String patientGroup) {
		this.patientGroup = patientGroup;
		this.bloodpressureRecord = new ArrayList<HealthMonitor>();
	}
	
	public HealthRecord() {
		this("Unnamed group");
	}
	
	public boolean register(HealthMonitor healthmonitor) {
		//each group has to be less than 10 people
		if(bloodpressureRecord.size() < 10) {
			bloodpressureRecord.add(healthmonitor);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean deregister(HealthMonitor healthmonitor) {
		//remove data
		return bloodpressureRecord.remove(healthmonitor);
	}
	
	@Override
	public String toString() {
		return "Patient Group: " + patientGroup + ", Bloodpressure Record: "+ bloodpressureRecord.toString();
				
	}
}
