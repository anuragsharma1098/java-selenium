package java_revamp.day_3;

public class ArrayClass_3 {
    public static void main(String[] args) {
        Cricketer[] cricketers = new Cricketer[3];
        cricketers[0] = new Cricketer("Sachin Tendulkar", 47, "India");
        cricketers[1] = new Cricketer("Brian Lara", 52, "West Indies");
        cricketers[2] = new Cricketer("Ricky Ponting", 48, "Australia");

        for (Cricketer cricketer : cricketers) {
            System.out.println("Name: " + cricketer.name + ", Age: " + cricketer.age + ", Country: " + cricketer.country);
        }

        Cricketer[] c = {
            new Cricketer("Sachin Tendulkar", 47, "India"),
            new Cricketer("Brian Lara", 52, "West Indies"),
            new Cricketer("Ricky Ponting", 48, "Australia")
        };

        for(Cricketer cricketer : c)
            System.out.println("Name: " + cricketer.name + ", Age: " + cricketer.age + ", Country: " + cricketer.country);

        System.out.println(c[1].name + " is a cricketer from " + c[1].country + " and is " + c[1].age + " years old.");
    }
}

class Cricketer{
    String name;
    int age;
    String country;

    public Cricketer(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}