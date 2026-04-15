package UC11;

import java.util.Scanner;

public class UseCase11TrainConsistMgmt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("UC11 - Validate Train ID & Cargo Code");
        System.out.println("====================================");

        // Input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Validation
        boolean isTrainValid = ValidationService.isValidTrainID(trainId);
        boolean isCargoValid = ValidationService.isValidCargoCode(cargoCode);

        // Output
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        sc.close();
    }
}
