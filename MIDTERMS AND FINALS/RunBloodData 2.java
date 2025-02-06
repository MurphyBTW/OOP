import java.util.Scanner;

class BloodData {
    private String bloodType;
    private String rhFactor;
    
    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = "+";
    }
    
    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }
    
    public void display() {
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    }
}

public class RunBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter blood type of patient (A, B, AB, O): ");
        String bloodTypeInput = scanner.nextLine().trim().toUpperCase();
        
        if (!bloodTypeInput.equals("A") && !bloodTypeInput.equals("B") && !bloodTypeInput.equals("AB") && !bloodTypeInput.equals("O")) {
            System.out.println("Error: Invalid blood type entered.");
            scanner.close();
            return;
        }
        
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String rhFactorInput = scanner.nextLine().trim();
        
        BloodData bloodData;
        if (bloodTypeInput.isEmpty() || rhFactorInput.isEmpty()) {
            bloodData = new BloodData();
        } else {
            bloodData = new BloodData(bloodTypeInput, rhFactorInput);
        }
        
        bloodData.display();
        scanner.close();
    }
}