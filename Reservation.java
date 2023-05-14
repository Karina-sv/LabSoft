import java.util.*;

public class Reservation {
    private Map<Lender, List<Title>> waitingList = new HashMap();
    private boolean fulfilled;
    private Date fulfilledData;

    public Map<Lender, List<Title>> getWaitingList() {
        return waitingList;
    }
    public void reserve(Title title, Lender lender) {
        List newList = new ArrayList();
        newList.add(title);
        waitingList.putIfAbsent(lender, newList);
    }
}