package java8.home;

public class Home {

    private String homeType;
    private int maxGuest;

    public Home(String homeType, int maxGuest) {
        this.homeType = homeType;
        this.maxGuest = maxGuest;
    }

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    @Override
    public String toString() {
        return
                "Home type: "+homeType+"\n"+
                "Max guest: "+maxGuest;
    }
}
