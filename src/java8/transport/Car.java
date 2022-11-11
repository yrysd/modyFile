package java8.transport;

import java.time.LocalDate;

public class Car {
    private String colour;
    private LocalDate yearOfIssue;

    public Car(String colour, int yearOfIssue) {
        this.colour = colour;
        this.yearOfIssue = LocalDate.ofEpochDay(yearOfIssue);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Colour: "+colour+"\n"+
                "Year of issue: "+yearOfIssue;
    }
}
