public class Copy {
    private Title title;
    private int id;
    private boolean booked;
    private int quantity;

    private Reservation reservation;
    private Rental rental;

    public Copy(Title title) {
        this.title = title;
        this.booked = false;
        this.reservation = new Reservation();
        this.rental = new Rental();
    }

    public void addInventory(int i) {
        this.quantity += i;
    }

    public void reserve(Lender lender){
        reservation.reserve(this.title,lender);
        System.out.println(reservation.getWaitingList());
    }

    public int getQuantity() {
        return quantity;
    }

    public void rent(Lender lender) {
        rental.rent(this, lender);
    }
    public Title getTitle() {
        return title;
    }
}
