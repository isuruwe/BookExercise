public interface EditableBook extends ReadableBook {
    void setTitle(String title);
    void setPublicationYear(int year);
    void setPublisher(String publisher);

}
