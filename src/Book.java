public class Book {
    // Задание 1
    //это поле
private final String name;
private int dateOfPublic;
private Author author;
    // Задание 3
    // это конструктор
    public Book (String name, int dateOfPublic, Author author){
        this.name = name;
        this.dateOfPublic = dateOfPublic;
        this.author = author;
    }
    // Задание 4
    // это геттер для name
    public String getName() {
        return this.name;
    }

    // это геттер для getDateOfPublic
    public int getDateOfPublic() {
        return this.dateOfPublic;
    }

    public Author getAuthor() {
        return this.author;
    }

    // Задание 5
    // это сеттер для getDateOfPublic
    public void setDateOfPublic(int dateOfPublic) {
        this.dateOfPublic = dateOfPublic;
    }
}
