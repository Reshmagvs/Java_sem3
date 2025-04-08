import java.awt.*;
import java.awt.event.*;

abstract class Animal {
 private String name; 
 private int age; 
 public Animal(String name, int age) {
  this.name = name; 
  this.age = age; 
 }
 public abstract void makeSound(); 
 public abstract void eat(); 
 public String getName() { return name; } 
 public int getAge() { return age; } 
}
class Dog extends Animal {
 private String breed; 
 public Dog(String name, int age, String breed) {
  super(name, age); 
  this.breed = breed; 
 }
 public void makeSound() { 
  System.out.println(getName() + " says: Woof!"); 
 }
 public void eat() { 
  System.out.println(getName() + " is eating dog food."); 
 }
 public String getBreed() { return breed; } 
}

class Cat extends Animal {
 private String color; 
 public Cat(String name, int age, String color) {
  super(name, age); 
  this.color = color; 
 }
 public void makeSound() { 
  System.out.println(getName() + " says: Meow!"); 
 }
 public void eat() { 
  System.out.println(getName() + " is eating cat food."); 
 }
 public String getColor() { return color; } 
}

public class PetStore extends Frame {
 public PetStore() {
  setTitle("Pet Store"); 
  setSize(400, 300); 
  setLayout(new FlowLayout()); 
  Animal dog = new Dog("Buddy", 3, "Golden Retriever"); 
  Animal cat = new Cat("Whiskers", 2, "Tabby"); 
  Label dogLabel = new Label("Dog: " + dog.getName() + ", Age: " + dog.getAge() + ", Breed: " + ((Dog) dog).getBreed()); 
  Label catLabel = new Label("Cat: " + cat.getName() + ", Age: " + cat.getAge() + ", Color: " + ((Cat) cat).getColor()); 
  add(dogLabel); 
  add(catLabel); 
  addWindowListener(new WindowAdapter() {
   public void windowClosing(WindowEvent we) { dispose(); } 
  }); 
  setVisible(true); 
 }
 public static void main(String[] args) { new PetStore(); } 
}


