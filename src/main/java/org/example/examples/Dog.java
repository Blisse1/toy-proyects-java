package org.example.examples;

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println(name + " woof!");
    }
}
