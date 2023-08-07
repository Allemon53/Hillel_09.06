package homeWork.hw2.hw16;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("I'm a Dog. My name is " + name + ". Gav");
    }
}
