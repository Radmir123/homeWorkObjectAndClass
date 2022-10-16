public class Main {


    public static void main(String[] args) {
        // Создание обьекта
        // Задание 1
        Book book = new Book("war and peace", 1869);
        System.out.println(book.getName());
        System.out.println(book.getDateOfPublic());
        // Задание 7
        book.setDateOfPublic(1871);
        System.out.println(book.getDateOfPublic());

        //  Задание 2
        Author author = new Author("Lev Tolstoy");
        System.out.println(author.getAuthor());
        // Задание 6
        AUthorAndBook show = new AUthorAndBook("Капитанская дочь", "Александр Пушкин");
        AUthorAndBook show2 = new AUthorAndBook("Исповедь", "Лев Толстой");

    }

}