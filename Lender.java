public class Lender {
    private String name;
    private int Id;
    private String telephone;
    public Lender(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
    }
    public void lend(Copy copy) {
        if (copy.getQuantity() <= 0){
            System.out.println(String.format("%s can't rent this copy now because there isn't any copy available, added to waiting list...",this.name));
            copy.reserve(this);
            return;

        }
        copy.rent(this);
    }
    public String getName() {
        return name;
    }
}

