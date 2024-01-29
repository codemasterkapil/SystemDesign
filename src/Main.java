import Decorator_Pattern.Pizza.Base_Pizza;
import Decorator_Pattern.Pizza.Farmhouse_Pizza;
import Decorator_Pattern.Pizza.Margerita_Pizza;
import Decorator_Pattern.ToppingDecorator.Mushrooms;
import Decorator_Pattern.ToppingDecorator.Extra_Cheese;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//         iphoneStoreSubject iphone= new iphoneStoreSubject();
//
//         notificationAlertObserver obj1=new EmailAlertObserver(iphone);
//         notificationAlertObserver obj2=new MobileAlertObserver(iphone);
//         iphone.newStock(5);

        Base_Pizza pizza1 = new Mushrooms(new Extra_Cheese(new Farmhouse_Pizza()));

    }
}