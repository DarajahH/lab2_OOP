package academy.javapro;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a new Tesla Model S, 2024
        // TODO: Add your code here
    	
    	Tesla newTesla = new Tesla("Tesla", "model s", 2024);
    	
        // Step 2: Display initial status
        System.out.println("Initial Status:");

        // TODO: Display car's initial state

        System.out.println("Car Issued: " + newTesla.getMake() + " " + newTesla.getModel() + " " + newTesla.getYear());
        System.out.println("Is Running: " + newTesla.isRunning());
        System.out.println("Autopilot Enabled: " + newTesla.isAutopilotEnabled());
        System.out.println("Charging: " + newTesla.isCharging());

        
        // Step 3: Start the car and test basic vehicle functions
        // TODO: Start engine
        // TODO: Accelerate
        // TODO: Brake
        
        System.out.println("\nTesting basic vehicle functions:");
       newTesla.startEngine();
       newTesla.accelerate();
       newTesla.brake();

        // Step 4: Test autonomous features
        // TODO: Enable autopilot
        // TODO: Check if autopilot is enabled
        // TODO: Disable autopilot
        
        System.out.println("\nTesting autonomous features:");
        newTesla.enableAutopilot();
        System.out.println("Autopilot Enabled: " + newTesla.isAutopilotEnabled());
        newTesla.disableAutopilot();
        System.out.println("Autopilot Enabled: " + newTesla.isAutopilotEnabled());

        // Step 5: Test electric features
        // TODO: Start charging
        // TODO: Check charging status

        System.out.println("\nTesting electric features:");
        newTesla.Charge();
        System.out.println("Charging: " + newTesla.isCharging());
      
       
        
        // Step 6: Stop the car and display final status
        // TODO: Stop engine
        // TODO: Display final state
        
        System.out.println("\nFinal car status:");
        newTesla.stopEngine();
        System.out.println("Is Running: " + newTesla.isRunning());
        
    }
}
