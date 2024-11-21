public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Майн", "Рид");
        System.out.println(author1);

        Author author2 = new Author("Алексей", "Толстой");
        System.out.println(author2);

        Author author3 = new Author("Денис", "Фонвизин");
        System.out.println(author3);

        Book book1 = new Book ("Всадник без головы", author1, 1866);
        System.out.println(book1);

        Book book2 = new Book("Пётр Первый",author2, 1930);
        System.out.println(book2);

        Book book3 = new Book("Недоросль", author3, 1782);
        System.out.println(book3);

        book3.setPublishYear(1801);
        System.out.println(book3);

        book1.setPublishYear (1900);
        System.out.println(book1);



    }
}