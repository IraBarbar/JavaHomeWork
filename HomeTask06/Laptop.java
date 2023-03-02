package HomeTask06;

public class Laptop {
    static int idStart = 0;
    int id;
    String color;
    Integer memory;
    Integer ssd;
    String os;

    public Laptop(String color, Integer memory, Integer ssd, String os) {
        this.id = ++idStart;
        this.color = color;
        this.memory = memory;
        this.ssd = ssd;
        this.os = os;
    }

    void print() {
        System.out.println("id: " + id + ", color: " + color +
                            ", operating memory: " + memory + 
                            ", drive: " + ssd + 
                            ", OS: " + os);
    }

    @Override
    public boolean equals(Object o) {
        var t = (Laptop) o;
        return color == t.color && os == t.os;
    }
}
