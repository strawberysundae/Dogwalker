import java.util.Scanner;

public class DogWalkCompany {
    private int[] dogs;

    public DogWalkCompany(String str) {
        dogs = new int[24];
        Scanner s = new Scanner(str);

        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = s.nextInt();
        }
    }

    public int numAvailableDogs(int hour) {
        return dogs[hour];
    }

    public void updateDogs(int hour, int numberDogsWalked) {
        dogs[hour] -= numberDogsWalked;
    }
}

