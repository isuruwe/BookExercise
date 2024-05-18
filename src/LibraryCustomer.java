import java.util.List;

public class LibraryCustomer {
    public void searchBook(List<ReadableBook> books, String title) {
        for (ReadableBook book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {

                System.out.println("Title: " + book.getTitle());
                System.out.println("Publication Year: " + book.getPublicationYear());
                System.out.println("Publisher: " + book.getPublisher());

            }
        }
    }
}
