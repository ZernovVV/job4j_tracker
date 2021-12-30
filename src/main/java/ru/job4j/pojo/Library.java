package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 464);
        Book howLinux = new Book("How linux works", 383);
        Book modernJava = new Book("Modern Java in action", 592);
        Book javaModule = new Book("The Java module system", 463);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = howLinux;
        books[2] = modernJava;
        books[3] = javaModule;
        System.out.println("Library content :");
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            System.out.println(bo.getName() + " - " + bo.getCount());
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("Replace index 0 to index 3");
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            System.out.println(bo.getName() + " - " + bo.getCount());
        }
        System.out.println();
        String s = "Clean code";
        System.out.println("Search Clean code");
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            if (s.equals(bo.getName())) {
                System.out.println(bo.getName() + " at index " + index);
            }
        }
    }
}
