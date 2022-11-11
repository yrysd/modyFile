package java8.devices;

import java8.announcement.Announcement;

public class Phone extends Announcement {

    private String country;
    private int memory;

    public Phone(String name, String image,double price, String description,String country, int memory) {
        super(name,image,price,description);
        this.country = country;
        this.memory = memory;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {

        return super.toString()+
                "Phone: "+country+"\n"+
                "Memory: "+memory;
    }

}
