public class Book {
    private String author;
    private String name;
    private int pages;
    public Book(String author, String name, int pages){
        this.author=author;
        this.name=name;
        this.pages=pages;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return author+", "+name+", "+pages+" pages";
    }
}
