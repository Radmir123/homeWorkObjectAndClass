public class Main {


    public static void main(String[] args) {
        // Создание обьекта
        // Задание 1
        Book book = new Book("war and peace", 1869, new Author("Lev", "Tolstoy") );
        Book book2 = new Book("Капитанская дочь", 2020, new Author("Alexandr", "Pushkin") );
        System.out.println(book.getName());
        System.out.println(book.getDateOfPublic());
        System.out.println(book.getAuthor().getSurName() + " " + book.getAuthor().getSurName());
        // Задание 7
        book.setDateOfPublic(1871);
        System.out.println(book.getDateOfPublic());

        //  Задание 2
        // Author name = new Author("Lev", "Tolstoy");
       //System.out.println(name.getName());
      // System.out.println(name.getSurName());
       //Author name2 = new Author("Alexandr", "Pushkin");

        // Задание 6


    }

}