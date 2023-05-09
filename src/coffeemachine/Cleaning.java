package coffeemachine;

public class Cleaning {

    private int size;

    Cleaning() {
        this.size = 100;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean findClean(int need) throws CleanException {
        if (size <= need) {
            throw new CleanException("you need clean");
        }
        return true;
    }
}
