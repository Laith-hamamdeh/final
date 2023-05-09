package coffeemachine;

import java.sql.SQLException;

public class BeansCapacity {

    private int size;

    BeansCapacity() throws SQLException, ClassNotFoundException {
        this.size = new DB().Beans();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean findBeans(int need) throws BeansException {
        if (size <= need) {
            throw new BeansException("you haven't Beans");
        }
        return true;
    }
    public void drain(int amount){
        this.size -= amount; 
    }
}
