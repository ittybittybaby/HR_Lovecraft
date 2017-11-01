package hrlovecraft;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class TimeCardWarehouse extends Warehouse<TimeCard> {


    private static final TimeCardWarehouse INSTANCE=new TimeCardWarehouse();

    private ArrayList<TimeCard> timeCards=getList();

    private TimeCardWarehouse(){
        //delete loop after testing
        for (int i=1; i<10; i++)

            timeCards.add(new TimeCard(i));

    }

    public static TimeCardWarehouse getInstance(){
        return INSTANCE;
    }


    public void add(TimeCard card) {
        timeCards.add(card);

    }

    public TimeCard get(int date) {
        for(TimeCard card :timeCards)
            if(card.id() == date)
                return card;
        return null;
    }


    //change to/from dates types after TimeCard class complete
    public ArrayList<TimeCard> get(int dateFrom, int dateTo) {
        ArrayList<TimeCard> cardSelection=new ArrayList<TimeCard>();
        for (TimeCard card: timeCards){
            if(card.id>=dateFrom && card.id<=dateTo)
                cardSelection.add(card);
        }
        return cardSelection;
    }

    public int getSize(){
        return timeCards.size();
    }



}
