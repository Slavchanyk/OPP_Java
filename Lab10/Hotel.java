package ua.lpnuai.oop.slavchanyk10;


public class Hotel {
    private String id;
    private Date start;
    private Date end;
    private Room room;
    private StringBuffer reason;

    public Hotel(){

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setStart(int day, int month, int year) {
        this.start = new Date(day, month, year);
    }

    public Date getStart() {
        return start;
    }

    public void setEnd(int day, int month, int year) {
        this.end = new Date(day, month, year);
    }

    public Date getEnd() {
        return end;
    }

    public void setRoom(String type, int number) {
        this.room = new Room(type, number);
    }

    public Room getRoom() {
        return room;
    }

    public void setReason(StringBuffer reason) {
        this.reason = reason;
    }

    public StringBuffer getReason() {
        return reason;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + this.id +
                ", start='" + this.start.toString() + '\'' +
                ", end='" + this.end.toString() + '\'' +
                ", room='" + this.room.toString() + '\'' +
                ", reason='" + this.reason.toString() + '\'' +
                '}';
    }



}
