package homeWork.hw2.hw16;

public class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }

        @Override
        public void sound() {
            System.out.println("I'm a Cat. My name " + name + ". Mew");
        }
    }
