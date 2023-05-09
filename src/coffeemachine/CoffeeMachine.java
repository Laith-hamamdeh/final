package coffeemachine;

import java.sql.SQLException;

public class CoffeeMachine {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, WaterException, BeansException, CleanException {
        new CoffeeMenu().setVisible(true);
    }

}
