public class Main {
    public static void main(String[] args) {
        Cage cage1 = new Cage("1");
        Cage cage2 = new Cage("2");

        cage1.addPet(new Pet("Budo", 30, "Chó"));
        cage1.addPet(new Pet("Ngao", 60, "Chó"));
        cage1.addPet(new Pet("Tây", 30, "Chó"));
        cage2.addPet(new Pet("Ta", 55, "Chó"));
        cage2.addPet(new Pet("Ngáo", 50, "Chó"));

        System.out.println("📦 Tổng số lồng đã tạo: " + Cage.getTotalCages());

        System.out.println("\n📋 Danh sách thú trong từng lồng:");
        cage1.printAllPets();
        cage2.printAllPets();

        System.out.println("\n⚖️ Danh sách thú nặng hơn 10kg:");
        for (Pet pet : cage1.getPets()) {
            if (pet.isOverweight()) {
                System.out.println("- " + pet.getBasicInfo());
            }
        }
        for (Pet pet : cage2.getPets()) {
            if (pet.isOverweight()) {
                System.out.println("- " + pet.getBasicInfo());
            }
        }
    }
}
