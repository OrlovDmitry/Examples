import java.util.Objects;

public class Animal{

    String name;
    private int QUANTITY=4;
    public static int x = 4;
    private int number = 1;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getQUANTITY() {
        return QUANTITY;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Animal animal = (Animal) o;
        return QUANTITY == animal.QUANTITY && number == animal.number && Objects.equals (name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash (name, QUANTITY, number);
    }

}


class Cat extends Animal{

    private int QUANTITY=5;
//    public static int x = 4;

    public Cat(String name) {
        super (name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Lion extends Animal{

    public Lion(String name) {
        super (name);
    }
}