import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void disPlayAllBooks(boolean showPublisher) {
        if (books.isEmpty()) {
            System.out.println("==>Thư viện chưa có sách nào.");
        } else {
            for (Book b : books) {
                b.disPlayInfo(showPublisher);
            }
        }
    }

    public void searchByAuthor(String author) {
        boolean f = false;
        for(Book b : books) {
            if(b.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                b.disPlayInfo(true);
                f = true;
            }
        }
        if(!f) {
            System.out.println("==>Không tìm thấy sách nào của tác giả.");
        }
    }

    public void removeBookById(int bookId) {
        Book toRemove = null;
        for (Book b : books) {
            if (b.getBookId() == bookId) {
                toRemove = b;
                break;
            }
        }
        if (toRemove != null) {
            books.remove(toRemove);
            System.out.println("==>Đã xóa sách có ID: " + bookId);
        } else {
            System.out.println("==>Không tìm thấy sách có ID: " + bookId);
        }
    }
}



