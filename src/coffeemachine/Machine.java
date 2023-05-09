package coffeemachine;

import java.sql.SQLException;
import java.util.ArrayList;

public class Machine {

    private WaterCapacity water;
    private BeansCapacity beans;
    private Cleaning cleaning;
    private Brewer brewer;
    private final Logger logger;
    private int i = 0;
    ArrayList<Coffee> coffees = new ArrayList();

    public Machine(int waterCapacity, int beansCapacity, int cleaningCapacity, Logger logger) throws SQLException, ClassNotFoundException, WaterException, BeansException, CleanException {
        //db = new DB();
        this.logger =logger;
        brewer = new Brewer();
        water = new WaterCapacity();
        beans = new BeansCapacity();
        cleaning = new Cleaning();
    }

    public WaterCapacity Water() {
        return water;
    }

    public BeansCapacity Beans() {
        return beans;
    }

    public Cleaning Clean() {
        return cleaning;
    }

    public int getWater() throws SQLException, ClassNotFoundException {
        return water.getSize();
    }

    public void setWater(int water) {
        this.water.setSize(water);
    }

    public int getBeans() throws SQLException, ClassNotFoundException {
        return beans.getSize();
    }

    public void setBeans(int beans) {
        this.beans.setSize(beans);
    }
    public Logger logger(){
        return logger;
    }
    public int getCleaning() {
        return this.cleaning.getSize();
    }

    public void setCleaning(int cleaning) {
        this.cleaning.setSize(cleaning);
    }

    public void displayInfo() {
        System.out.println("Water level: " + water);
        System.out.println("Beans level: " + beans);
    }

    public void clean() {
        this.cleaning.setSize(100);
    }

    public void makeCoffee(String coffeeType, String coffeeName, int coffeeAmount, int waterAmount, int grind, int notclean) throws SQLException, ClassNotFoundException {
        coffees.add(new Coffee(coffeeType, coffeeAmount, water.getSize()));
        Coffee coffee = coffees.get(i++);
        brewer.grindBeans();
        brewer.pourWater(waterAmount);
        brewer.applyPressure();
        brewer.pourCoffee();
        this.beans.drain( coffeeAmount);
        this.water.drain(waterAmount);
        System.out.println(water.getSize());
        this.cleaning.setSize(cleaning.getSize() - notclean);
        logger.log(coffeeName, coffeeType, this.water.getSize(), this.beans.getSize(), grind, coffee.getCaffeine());
        System.out.println("Enjoy your " + coffeeName + " coffee with " + coffee.getCaffeine() * 100 + "mg of caffeine!");
    }

}
