package Observer_Pattern.observer;

import Observer_Pattern.subject.storeSubject;

public class EmailAlertObserver implements notificationAlertObserver{
    storeSubject obj;

    public EmailAlertObserver(storeSubject o){
        this.obj=o;
        obj.add(this);
    }

    public void update(){
        System.out.println("stocks received"+".. sending email on mobile ");
    }

    public void unsubscribe(){
        obj.remove(this);
    }


}
