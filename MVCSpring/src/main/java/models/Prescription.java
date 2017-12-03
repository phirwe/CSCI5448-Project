package models;

public class Prescription {
	private Integer patient_id;
	public Integer getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(Integer patient_id) {
		this.patient_id = patient_id;
	}
	private Integer prescription_id;
	private Integer inventory_id;
	
	public Integer getPrescription_id() {
		return prescription_id;
	}
	public void setPrescription_id(Integer prescription_id) {
		this.prescription_id = prescription_id;
	}
	public Integer getInventory_id() {
		return inventory_id;
	}
	public void setInventory_id(Integer inventory_id) {
		this.inventory_id = inventory_id;
	}

}
