package Observer_Pattern.subject;

import Observer_Pattern.observer.notificationAlertObserver;

import java.util.ArrayList;

public class iphoneStoreSubject implements storeSubject {

    int currentStock=0;
    ArrayList<notificationAlertObserver> list=new ArrayList<>();

    public void add(notificationAlertObserver o){
        list.add(o);
    };

    public void remove(notificationAlertObserver o){
         list.remove(o);
    };

    public void notification(){
        for(int i=0;i<list.size();i++){
           list.get(i).update();
        }
    }

    public void newStock(int newQuantity){
        if(currentStock==0 && newQuantity>0){
            currentStock+=newQuantity;
            this.notification();
        }
    }

}
