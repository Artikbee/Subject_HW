public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("nameOne","fistnameOne");
        Author author2 = new Author("nameTwo","fistnameTwo");

        Book book1 = new Book("bookOne",author1,2000);
        Book book2 = new Book("bookTwo",author2,2001);
        System.out.println(book1.getBookName()+" " +book1.getAuthor().getNameAuthor()+" "+book1.getAuthor().getFirstName()+" "+book1.getPublishingYear());
        System.out.println(book2.getBookName()+" " +book2.getAuthor().getNameAuthor()+" "+book2.getAuthor().getFirstName()+" "+book2.getPublishingYear());
        book1.setPublishingYear(2002);
        System.out.println(book1.getBookName()+" " +book1.getAuthor().getNameAuthor()+" " +book1.getAuthor().getFirstName()+" "+book1.getPublishingYear());
    }
}