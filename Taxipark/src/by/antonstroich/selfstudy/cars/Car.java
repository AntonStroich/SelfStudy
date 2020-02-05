package by.antonstroich.selfstudy.cars;

public abstract class Car {

	private String modelCar;
	private int registrationNumber;
	private int carCost;
	private int fuelSpend;
	private int seatNumber;

	public String getModelCar() {
		return modelCar;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public int getCarCost() {
		return carCost;
	}

	public void setCarCost(int carCost) {
		this.carCost = carCost;
	}

	public int getFuelSpend() {
		return fuelSpend;
	}

	public void setFuelSpend(int fuelSpend) {
		this.fuelSpend = fuelSpend;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	@Override
	public String toString() {
		return "Model: " + getModelCar() + ", Registration number: " + getRegistrationNumber()
		+ ", Car cost: " + getCarCost() + ", Fuel spend: " + getFuelSpend() + ", Number of seats:"
		+ getSeatNumber() + ".";
	}

}
