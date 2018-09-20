package observer;


public class Lake implements Runnable{
	
	private double waterTemperature = 14;
	private double waterLevel = 15.9;
	private int amountOfDucks;
	
	private void changeWaterTemp() {
		if ((waterTemperature >= 28.5) && !(waterTemperature < -15.5)) {
			waterTemperature=- (Math.random() * 0.4);
		} else {
			waterTemperature =+0.2;
		}
	}
	
	private void changeWaterLevel() {
		if (waterTemperature >= 20.5 ) {
			waterLevel=-0.2;
		} else {
			waterLevel=+ (Math.random() * 0.4);
		}
	}
	
	@Override
	public void run() {
		while (true) {
		changeWaterTemp();
		changeWaterLevel();
		}
	}

	
	public void setAmountOfDucks(int amount) {
		amountOfDucks=+ amount;
	}
	public int getAmountOfDucks() {
		return amountOfDucks;
	}
	public double getWaterTemperature() {
		return waterTemperature;
	}
	public double getWaterLevel() {
		return waterLevel;
	}
	
}
