package hrlovecraft;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class PaystubWarehouse extends Warehouse<Paystub> {
    //private static final PaystubWarehouse INSTANCE=new PaystubWarehouse();

    private ArrayList<Paystub> paystubs=getList();


    public void add(Paystub paystub){
        paystubs.add(paystub);
    }

    //change from/to lines after Paystub class is complete
    public ArrayList<Paystub> get(String fromDate, String toDate){
        LocalDateTime localFromDate=TimeCardWarehouse.stringToDate(fromDate);
                LocalDateTime localToDate= TimeCardWarehouse.stringToDate(toDate);
        ArrayList<Paystub> paystubArrayList=new ArrayList<Paystub>();
        for (Paystub paystub:paystubs){
            if (paystub.getPayPeriodStartDate().isAfter(localFromDate)&&paystub.getPayPeriodEndDate().isBefore(localToDate))
                    paystubArrayList.add(paystub);
        }
        return paystubArrayList;
    }

    public Paystub get(String date){
        LocalDateTime getDate= TimeCardWarehouse.stringToDate(date);
        for(Paystub paystub: paystubs){
            if(paystub.getPayPeriodStartDate().equals(getDate))
                return paystub;}
                return null;

    }

    public int getSize(){
        return paystubs.size();
    }




}
