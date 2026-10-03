
public class HouseholdWaterUsage{
    public static void main(String[] args){

     Scannersc = new Scanner(system.in);

     System.out.print("Enter number of family Members:");
     int familyMembers = sc.nextInt();

     System.out.print("Enter number of water consumed in litres:");
     double waterConsumed = sc.nextDouble();

     System.out.print("Enter house number:");
     int HouseNumber = sc.nextInt();

     System.out.print("Enter water usage status: ");
     int waterUsage = sc.next().CharAt();

     System.out.println("Number of Family members: " + familyMembers);
     System.out.println("Number of water consumed: " + waterConsumed);
     System.out.println("House number: " + houseNumber);
     System.out.println("water usage: " + waterUsage);

    sc.close();
    }

}