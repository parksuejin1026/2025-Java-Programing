package ch08;

public class Car {
	private String modelName;
	private int modelYear;
	private int color;
	
	Car(String modelName, int modelYear){
		this.modelName = modelName;
		this.modelYear = modelYear;
	}
	
	public String getModel() {
		return this.modelYear + "년식" + this.modelName + " " + this.color;
	}

}
