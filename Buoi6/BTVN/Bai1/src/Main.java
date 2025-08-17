import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Tìm sách theo tác giả");
            System.out.println("4. Xóa sách theo ID");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhập tiêu đề: ");
                    String title = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String author = sc.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = Double.parseDouble(sc.nextLine());

                    System.out.print("Có nhập nhà xuất bản không? (y/n): ");
                    String hasPublisher = sc.nextLine();
                    if (hasPublisher.equalsIgnoreCase("y")) {
                        System.out.print("Tên NXB: ");
                        String pubName = sc.nextLine();
                        System.out.print("Địa chỉ NXB: ");
                        String pubAddr = sc.nextLine();
                        Publisher publisher = new Publisher(pubName, pubAddr);
                        library.addBook(new Book(title, author, price, publisher));
                    } else {
                        library.addBook(new Book(title, author, price));
                    }
                    break;
                case 2:
                    System.out.print("Hiển thị nhà xuất bản? (y/n): ");
                    boolean showPublisher = sc.nextLine().equalsIgnoreCase("y");
                    library.disPlayAllBooks(showPublisher);
                    break;

                case 3:
                    System.out.print("Nhập tên tác giả cần tìm: ");
                    String searchAuthor = sc.nextLine();
                    library.searchByAuthor(searchAuthor);
                    break;

                case 4:
                    System.out.print("Nhập ID sách cần xóa: ");
                    int id = Integer.parseInt(sc.nextLine());
                    library.removeBookById(id);
                    break;

                case 5:
                    System.out.println("Thoát chương trình.");
                    sc.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");

            }
        }
    }
}