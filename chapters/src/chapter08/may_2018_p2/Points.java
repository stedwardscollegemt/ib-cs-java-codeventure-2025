package chapter08.may_2018_p2;

public class Points {
    
    private String memberId;
    
    private int totalPoints;
    
    private int bonusPoints;
    
    private String statusNow;
    
    private String statusNextYear;

    private Visits[] allVisits = new Visits[366];

    int y;

    public Points(String id) {
        memberId = id;
        bonusPoints = 0;
        y = 0;
        statusNow = "Bronze";
        Visits firstVisit = allVisits[0];
        firstVisit.getDays();
    }

    public Points(String id, int bp) {
        memberId = id;
        bonusPoints = bp;
        y = 0;
        statusNow = "Bronze";
    }

    public String getMemberId() {
        return memberId;
    }

    // Write access via a mutator or setter method
    public void setMemberId(String memberIdIn) {
         memberId = memberIdIn;
    }

    public int totalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPointsIn) {
        totalPoints = totalPointsIn;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(int bonusPointsIn) {
        bonusPoints = bonusPointsIn;
    }

    public String statusNow() {
        return statusNow;
    }

    public String statusNextYear() {
        return statusNextYear;
    }

    public Visits getAllVisits(int v) {
        return allVisits[v];
    }

    public void addVisit(Visits v) {
        allVisits[y] = v;
        y = y + 1;
    }

    public boolean isGold() {
        boolean isGold = false;
        
        // A String is not a primitive data type
        // so primitive comparisons like == may not work as expected
        // always be safe and use String functions like .equals
        if (statusNow.equals("Gold")) {
            isGold = true;
        }
        
        return isGold;
    }

    public int calculateTotalPoints() {
        int calcTotalPoints = 0;






        return calcTotalPoints;
    }

    // daysMissing() {

    // }
}
