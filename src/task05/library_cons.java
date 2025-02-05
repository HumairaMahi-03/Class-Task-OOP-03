package task05;
public class library_cons{
    private String title;
    private String author;


    public library_cons(String title) {
        this(title,"Unknown");
    }

    public library_cons(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {

        library_cons book1 = new library_cons("not interested in java");
        book1.display();

       
        library_cons book2 = new library_cons("not interested in java", "humaira");
        book2.display();
    }
}