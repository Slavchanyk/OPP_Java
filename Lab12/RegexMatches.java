package ua.lpnuai.oop.slavchanyk12;


public class RegexMatches {
    public boolean id (String id){
        String idPattern = "\\w+";
        if (id.matches(idPattern))
            return true;
        return false;
    }

    public boolean date (String[] date) {
        int counter = 0;
        String datePattern = "\\d{2}";
        for (int i = 0; i < 3; i++){
            if (date[i].matches(datePattern)){
                counter++;
            }
        }
        if (counter == date.length)
            return true;
        return false;
    }

    public boolean room (String[] room){
        String typePattern = "[a-zA-Z]+";
        String numberPattern = "\\d+";
        if (room[0].matches(typePattern)&&room[1].matches(numberPattern)){
            return true;
        }
        return false;
    }

    public boolean reason (String reason){
        String reasonPattern = ".+";
        if (reason.matches(reasonPattern))
            return true;
        return false;
    }


}
