package lesson1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Author fedorDostoevsky = new Author("Федор", "Достоевсий");
        Book warAndPeace = new Book("Война и Мир", levTolstoy, 1865);
        Book idiot = new Book("Идиот", fedorDostoevsky, 1869);

        System.out.println("warAndPeace = " + warAndPeace);
        System.out.println();
        System.out.println("idiot = " + idiot);
        System.out.println();

        idiot.setPublicationYear(idiot.getPublicationYear() + 1);

        System.out.println(idiot);
    }
}