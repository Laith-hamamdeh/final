package coffeemachine;

import java.sql.SQLException;

public class WaterCapacity {

    private int size;

    WaterCapacity() throws SQLException, ClassNotFoundException {
        this.size = new DB().Water();
    }

    public int getSize() throws SQLException, ClassNotFoundException {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void drain(int amount){
        this.size -= amount;
    }
    public boolean findWater(int need) throws WaterException {
        if (size <= need) {
            throw new WaterException("you haven't Water");
        }
        return true;
    }
}
