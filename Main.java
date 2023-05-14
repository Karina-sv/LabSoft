public class Main {
    public static void main(String[] args) {
        Title title = new Title("Grant Smith", "Ace Computer Science","129482-1309728923");
        Title title1 = new Title("Tanenbaum", "Distributed Systems","123456-1309728923");
        Copy copy = new Copy(title);
        Copy copy1 = new Copy(title1);

        Lender melvin= new Lender("melvin", "1234567890");
        Lender herman= new Lender("herman","0987654321");
        Lender solomon = new Lender("solomon","87373853568356");
        Lender karina = new Lender("karina","87373853568356");
        copy.addInventory(1);
        copy1.addInventory(1);

        System.out.println(copy.getQuantity());
        // melvin wants to borrow the copy above
        melvin.lend(copy);
        System.out.println(copy.getQuantity());
        herman.lend(copy);
        solomon.lend(copy);
        karina.lend(copy);
        // check books available
        System.out.println(copy.getQuantity());

    }
}