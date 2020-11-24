import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Workers foreman1 = new Workers("Vaghinak", "Galstyan", 1988, 'm', 2.5, 150000);
        foreman1.printInfo();


     //Scanner mms = new Scanner(System.in);
     //Workers foreman2 = new Workers(mms.next(), mms.next(), mms.nextInt(), mms.next().charAt(0), mms.nextDouble(), mms.nextInt());
     //foreman2.printInfo();
        Work work1 = new Work();
        work1.workPrice();


    }
}
