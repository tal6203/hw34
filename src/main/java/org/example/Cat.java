package org.example;

import lombok.Getter;
import lombok.Setter;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Meow");
    }
}
