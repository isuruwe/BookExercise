public class Book implements EditableBook {
    private String title;
    private int publicationYear;
    private String publisher;



    public Book(String title, int publicationYear, String publisher) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
    }


    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublicationYear(int year) {
        this.publicationYear = year;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


}
