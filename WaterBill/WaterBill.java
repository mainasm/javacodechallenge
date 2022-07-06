import java.util.Scanner;

public class WaterBill {

    /**
     * @author Samuel Githogori
     * Closely matches KH's solution
     * Discovered the Math.Ceil inbuilt function
     */
    private static final double minCharge = 18.84;
    private static final double oneCCF = 748;
    private static final double baseCCF = oneCCF*2;
    private static final double addedRate  = 3.90;

    public static double calculateWaterBill(double gallonsUsage) {
        double waterBill;
        double extraGallons;

        if(gallonsUsage>baseCCF) {
            extraGallons = gallonsUsage - baseCCF;
            waterBill = minCharge + (Math.ceil(extraGallons/oneCCF)*addedRate);
        }else{
            waterBill = minCharge;
        }
        return waterBill;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water " +
                "did you use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
    }
}
