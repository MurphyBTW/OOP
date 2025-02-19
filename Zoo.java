class Animal {
    void makeSound() {}  
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
        System.out.println("I'm a good boy!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}

class Bird extends Animal {
    void makeSound() {
        System.out.println("Chirp!");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Animal[] zoo = {new Dog(), new Cat(), new Bird(), new Dog()};

        for (Animal animal : zoo) {
            animal.makeSound();
        }
    }
}
