import java.util.Scanner;

public class WaterConsumption {

    static int calculateTotal(int unitsConsumedInMorning, unitsConsumedInEvening) {
        return unitsConsumedInMorning + unitsConsumedInEvening
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter : ");
        int morningUsage = sc.nextInt();

        System.out.print("Enter unitsConsumedInMorning: ");
        int eveningUsage = sc.nextInt();

        int total = calculateTotal(morningUsage, eveningUsage);

        System.out.println("Total water consumption: " + total + " litres");

        sc.close();
    }
}
    
}
