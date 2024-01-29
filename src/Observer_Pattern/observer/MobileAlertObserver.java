package Observer_Pattern.observer;

import Observer_Pattern.subject.storeSubject;

public class MobileAlertObserver implements notificationAlertObserver{

    storeSubject obj;

    public MobileAlertObserver(storeSubject o){
        this.obj=o;
        obj.add(this);
    }

    public void update(){
        System.out.println("stocks received"+".. sending message on mobile ");
    }

    public void unsubscribe(){
        obj.remove(this);
    }


}
