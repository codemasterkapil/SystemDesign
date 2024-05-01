package Car_Rental_System;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
     List<User> users=new ArrayList<>();
     List<Store>store=new ArrayList<>();

     VehicleRentalSystem(List<User> users,List<Store>store){
          this.users=users;
          this.store=store;
     }

     void addUser(User user){
          users.add(user);
     }

     void addStore(Store st){
          store.add(st);
     }

     void removeUser(User user){
          users.remove(user);
     }

     void removeStore(Store st){
          store.remove(st);
     }

}
