public class Animal {
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Animal Name: " + name + ", Age : " + age);
    }
}
