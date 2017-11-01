package hrlovecraft;

import java.util.ArrayList;

public class PaystubWarehouse extends Warehouse<Paystub> {
    private static final PaystubWarehouse INSTANCE=new PaystubWarehouse();

    private ArrayList<Paystub> paystubs=getList();
    private PaystubWarehouse(){
        //delete loop after testing
        for (int i=1; i<10; i++)
            paystubs.add(new Paystub(i));
    }

    public static PaystubWarehouse getInstance(){
        return INSTANCE;
    }

    public void add(Paystub paystub){
        paystubs.add(paystub);
    }

    //change from/to lines after Paystub class is complete
    public ArrayList<Paystub> get(int fromDate, int toDate){
        ArrayList<Paystub> paystubArrayList=new ArrayList<Paystub>();
        for (Paystub paystub:paystubs){
            if (paystub.id>=fromDate&&paystub.id<=toDate)
                    paystubArrayList.add(paystub);
        }
        return paystubArrayList;
    }

    public Paystub get(int date){
        Paystub stub= paystubs.get(date);
        return stub;
    }


    public int getSize(){
        return paystubs.size();
    }



}
