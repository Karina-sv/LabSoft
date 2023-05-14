public class Title {
    private String author;
    private String name;
    private String ISBN;

    public Title(String author, String name, String ISBN) {
        this.author = author;
        this.name = name;
        this.ISBN = ISBN;
    }
    public String getName() {
        return name;
    }

}
