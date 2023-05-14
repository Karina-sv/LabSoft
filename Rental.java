import javax.xml.crypto.Data;
import java.util.Date;

public class Rental {
    private int id;
    private Copy copy;
    private Lender lender;
    private Date rentalDate;

    public Rental(){
    }
    public void rent(Copy copy, Lender lender) {
        copy.addInventory(-1);
        System.out.println(String.format("A Copy of title %s is rented by %s ",copy.getTitle().getName(), lender.getName()));
    }
}
