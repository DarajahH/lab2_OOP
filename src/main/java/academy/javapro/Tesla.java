package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    // TODO: Create constructor that takes model and year
    
    // TODO: Set make to "Tesla"
    
    public Tesla(String make,String model, int year) {
    	this.make = "Tesla";
    	this.model = "model s";
    	this.year = 2024;
    }

 
	@Override
	public void enableAutopilot() {
		// TODO Auto-generated method stub
		System.out.println("Autopilot engaged.");
        autopilotEnabled = true;
	}

	@Override
	public void disableAutopilot() {
		// TODO Auto-generated method stub
		System.out.println("Autopilot disengaged.");
        autopilotEnabled = false;
	}

	@Override
	public boolean isAutopilotEnabled() {
		// TODO Auto-generated method stub
		return autopilotEnabled;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		 System.out.println("Tesla is now powered on...");
	        isRunning = true;
		
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		 System.out.println("Tesla is shutting down...");
	        isRunning = false;
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		if (isRunning) {
            System.out.println("Tesla is accelerating..");
        } else {
            System.out.println("Start Engine");
        }
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Tesla is braking...");
	}

	@Override
	public void Charge() {
		// TODO Auto-generated method stub
		System.out.println("Tesla is now charging...");
        charging = true;
	}

	@Override
	public boolean isCharging() {
		// TODO Auto-generated method stub
		return charging;
	}
    
    // TODO: Initialize autopilotEnabled and charging to false

    // TODO: Implement all required methods from Vehicle, Electric, and Autonomous
    // Each method should include appropriate print statements
	
	// Getters and Setters

    public void setAutopilotEnabled(boolean autopilotEnabled) {
        this.autopilotEnabled = autopilotEnabled;
    }

    public void setCharging(boolean charging) {
        this.charging = charging;
    }
}
