import java.util.List;

public class LibraryStaff {
    public void updateBook(List<EditableBook> books, String title, String newTitle, int newYear, String newPublisher) {
        for (EditableBook book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {

                book.setTitle(newTitle);
                book.setPublicationYear(newYear);
                book.setPublisher(newPublisher);

            }
        }
    }
}
