public class Book {
    // Задание 1
    //это поле
private String name;
private int dateOfPublic;

    // Задание 3
    // это конструктор
    public Book (String name, int dateOfPublic){
        this.name = name;
        this.dateOfPublic = dateOfPublic;
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

    // Задание 5
    // это сеттер для getDateOfPublic
    public void setDateOfPublic(int dateOfPublic) {
        this.dateOfPublic = dateOfPublic;
    }
}
