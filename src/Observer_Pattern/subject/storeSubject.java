package Observer_Pattern.subject;

import Observer_Pattern.observer.notificationAlertObserver;

public interface storeSubject {
     void add(notificationAlertObserver o);
     void remove(notificationAlertObserver o);
      void notification();


}
