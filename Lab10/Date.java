package ua.lpnuai.oop.slavchanyk10;


public class Date  {
    private int day;
    int month;
    int year;

    public Date (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Data{" +
                "day=" + this.day +
                ", month='" + this.month + '\'' +
                ", year='" + this.year + '\'' +
                '}';
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
