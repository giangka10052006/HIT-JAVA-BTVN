public class Car {
    public String brand;
    public int maxSpeed;

    public Car(){

    }

    public Car(String brand, int maxSpeed){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }
    void run() {
        System.out.println("Xe " + brand + " đang chạy với tốc độ tối đa " + maxSpeed + " km/h.");
    }
}
