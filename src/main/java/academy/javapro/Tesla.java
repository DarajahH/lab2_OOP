package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    // TODO: Create constructor that takes model and year
    
    // TODO: Set make to "Tesla"
    
    public Tesla(String model, int Year) {
    	
    	make = "Tesla";
    	
    }

    public void startCar() {
        System.out.println("Tesla is now powered on silently.");
        isRunning = true;
    }
    
    @Override
    public void stopEngine() {
        System.out.println("Tesla is shutting down.");
        isRunning = false;
    }
    
	@Override
	public void enableAutopilot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disableAutopilot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAutopilotEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Charge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isCharging() {
		// TODO Auto-generated method stub
		return false;
	}
    
    
    
    // TODO: Initialize autopilotEnabled and charging to false

    // TODO: Implement all required methods from Vehicle, Electric, and Autonomous
    // Each method should include appropriate print statements
}
