package a0803.book;

public class LibraryEx {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("이것이 자바다", "신용권", "2023-1113", 5.6, "PDF");
        PrintBook printBook = new PrintBook("첨만나리액트", "이인재", "2079-0124", 465, 0.8);

        ebook.displayInfo();
        System.out.println();
        System.out.println("printBook Information");
        printBook.displayInfo();

    }
}
