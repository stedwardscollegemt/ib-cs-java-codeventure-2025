package chapter08.may_2018_p2;

public class Points {
    
    private String memberId;
    
    private int totalPoints;
    
    private int bonusPoints;
    
    private String statusNow;
    
    private String statusNextYear;

    private Visit[] allVisits = new Visits[366];

    int y;

    public Points(String id) {
        memberId = id;
        bonusPoints = 0;
        y = 0;
        statusNow = "Bronze";
    }

    public Points(String id, int bp) {
        memberId = id;
        bonusPoints = bp;
        y = 0;
        statusNow = "Bronze";
    }

    // TODO: All the accessor and mutator methods

    public Visits getAllVisits(int v) {
        return allVisits[v];
    }

    public void addVisit(Visits v) {
        allVisits[y] = v;
        y = y + 1;
    }

    isGold() {

    }

    calculateTotalPoints() {

    }

    daysMissing() {

    }
}
