public class Pet {
    private String name;
    private double weight;
    private String species;
// không tham số
    public Pet() {

    }

    public Pet(String name, double weight, String species) {
        this.name = name;
        this.weight = weight;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    void printInfo() {
        System.out.println("Tên của bé: " + name + ", loài: " + species + ", cân nặng: " + weight + " kg.");
    }
    boolean isOverweight() {
        return weight > 10;
    }
    String getBasicInfo() {
        return name + " (" +  species + ")";
    }
}
