package OOPs.Polymorphism;

class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        genericAnimal.makeSound();  // Output: Generic animal sound.
        cat.makeSound();            // Output: Meow!
        dog.makeSound();            // Output: Woof!
    }
}

