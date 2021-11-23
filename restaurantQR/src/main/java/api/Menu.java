
package api;

import database.Dish;
import java.util.ArrayList;


public class Menu {
    private ArrayList<Dish> dishes = new ArrayList();

    public Menu() {
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }
    
      public void addDish(Dish dish) { //agregar platos al arrayList
        this.dishes.add(dish);
    }
}
