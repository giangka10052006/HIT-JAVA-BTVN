import java.util.ArrayList;

public class Cage {
    private String cageCode;
    private ArrayList<Pet> pets;
    private int currentPetCount;
    private static int totalCages = 0;
    private final int MAX_CAPACITY = 3;

    public Cage() {

    }

    public Cage(String cageCode) {
        this.cageCode = cageCode;
        this.pets = new ArrayList<>();
        this.currentPetCount = 0;
        totalCages++;
    }

    public void addPet(Pet pet) {
        if(currentPetCount < MAX_CAPACITY) {
            pets.add(pet);
            currentPetCount++;
            System.out.println("--> Đã thêm thú cứng vào lồng " + cageCode);
        }
        else
            System.out.println("Lồng " + cageCode + " đã đầy . Không thể thêm được nữa.");
    }

    public void printAllPets() {
        System.out.println("🐾 Lồng " + cageCode + " có " + currentPetCount + " thú:");
        for (Pet pet : pets) {
            pet.printInfo();
        }
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public static int getTotalCages() {
        return totalCages;
    }

    public static void setTotalCages(int totalCages) {
        Cage.totalCages = totalCages;
    }
}




