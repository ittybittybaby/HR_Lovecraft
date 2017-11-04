package hrlovecraft;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class TimeCardWarehouse extends Warehouse<TimeCard> {


    private ArrayList<TimeCard> timeCards = getList();


    public void add(TimeCard card) {
        timeCards.add(card);

    }

    public TimeCard get(String date) {
        for(TimeCard card : timeCards){
            if(datetoString(card).equals(date))
                return card;}
        return null;
    }

    public  String datetoString(TimeCard card){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        return  card.getTimeIn().format(formatter);
    }

    public static LocalDateTime stringToDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy-HHmm");
        return LocalDateTime.parse(date+"-0000", formatter);
    }

    //change to/from dates types after TimeCard class complete
    public ArrayList<TimeCard> get(String dateFrom, String dateTo) {
        ArrayList<TimeCard> cardSelection=new ArrayList<TimeCard>();
        for (TimeCard card: timeCards){
            if(card.getTimeIn().isAfter(stringToDate(dateFrom))&&card.getTimeIn().isBefore(stringToDate(dateTo)))
                cardSelection.add(card);
        }
        return cardSelection;
    }

    public int getSize(){
        return timeCards.size();
    }


}
