import java.util.scanner;

public class waterBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water consumption in litres: ");
        int consumption = sc.next Int();

        int bill;
        if(consumptuion <= 500){
            bill = 100;
        }else {
            bill = 200;
        }
        System.out.println("water bill: Rs." + bill);
        sc.close();

        }
    }

