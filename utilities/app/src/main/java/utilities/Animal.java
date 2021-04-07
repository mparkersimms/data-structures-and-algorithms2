package utilities;

public class Animal {
    String type;
    public int rosterNum;

    public Animal(String type) {
        this.type = type;
        this.rosterNum = 0;
    }
    @Override
    public String toString(){
        return type+rosterNum;
    }

}
