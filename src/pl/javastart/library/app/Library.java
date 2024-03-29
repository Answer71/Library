package pl.javastart.library.app;

import pl.javastart.library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Bilbioteka v 0.5";
        Book book1 = new Book("W pustyni i w pusczy", "Henryk Sienkiewicz",
                2010, 296, "Greg", "978837271890" );
        Book book2 = new Book("Java. Efektywne programowanie. WYdanie II", "Joshua Bloch",
                2009, 352, "Helion", "9788324620845" );
        Book book3 = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide", "Bert Bates, Katherine Sierra",
                2008, 851, "McGraw-Hill Osborne Media");

        System.out.println(appName);
        System.out.println("Książki dostęne w bibliotece:");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}
