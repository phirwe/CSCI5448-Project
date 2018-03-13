package models;

public class Patient extends Person{
	public String patient_id;
	
	public Double most_recent_temperature = 0.0;
	
	public String getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}
	public Double getMost_recent_temperature() {
		return most_recent_temperature;
	}
	public void setMost_recent_temperature(Double most_recent_temperature) {
		this.most_recent_temperature = most_recent_temperature;
	}
	public Double getMost_recent_pressure() {
		return most_recent_pressure;
	}
	public void setMost_recent_pressure(Double most_recent_pressure) {
		this.most_recent_pressure = most_recent_pressure;
	}
	public Double most_recent_pressure = 0.0;

	
	
	

}
