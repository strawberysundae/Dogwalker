import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File f = new File("companies.txt");
        Scanner s = new Scanner(f);

        DogWalkCompany[] companies = new DogWalkCompany[100];

        for (int i = 0; i < companies.length; i++) {
            companies[i] = new DogWalkCompany(s.nextLine());
        }

        f = new File("walkers.txt");
        s = new Scanner(f);

        int totalPay = 0;

        while (s.hasNextInt()) {
            int companyNumber = s.nextInt();
            int maxDogs = s.nextInt();
            int startHour = s.nextInt();
            int endHour = s.nextInt();

            DogWalker walker =
                new DogWalker(maxDogs, companies[companyNumber]);

            totalPay += walker.dogWalkShift(startHour, endHour);
        }

        System.out.println(totalPay);
    }
}


