import java.util.ArrayList;

// abstract class
abstract class Livestock {
protected String name;
protected int age;

public Livestock(String name, int age) {
if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
this.name = name;
this.age = age;
}

public String getName() { return name; }
public int getAge() { return age; }

abstract String makeSound();
void graze() {
System.out.println(name + " Talbaid belchine.");
}

void graze(String food) {
System.out.println(name + " " + food + "-iig belchine.");
}

@Override
public String toString() {
return name + " (Age: " + age + ")";
}
}

// interface
interface WorkRole {
String performTask();
}

// Horse class
class Horse extends Livestock implements WorkRole {
public Horse(String name, int age) {
super(name, age);
}

@Override
String makeSound() {
return "Yntsgaana!";
}

@Override
public String performTask() {
return "Mori heeriin unalagad hereglegdene.";
}
}

// Sheep class
class Sheep extends Livestock implements WorkRole {
public Sheep(String name, int age) {
super(name, age);
}

@Override
String makeSound() {
return "Mailna!";
}

@Override 
public String performTask() {
    return "Honiin noos huraahad hereglegdene.";
}
}

// Goat class
class Goat extends Livestock implements WorkRole {
public Goat(String name, int age) {
super(name, age);
}

@Override
String makeSound() {
return "Baa!";
}

@Override
public String performTask() {
    return "Ymaa noos avahad hereglegdene.";
}
}
// Camel class
class Camel extends Livestock implements WorkRole {
public Camel(String name, int age) {
super(name, age);
}

@Override
String makeSound() {
return "Builna!";
}

@Override
public String performTask() {
return "Temee goviin teevert hereglegdene.";
}
}

// Cow class
class Cow extends Livestock implements WorkRole {
public Cow(String name, int age) {
super(name, age);
}

@Override
String makeSound(){
    return "Moorno!";
}

@Override
public String performTask() {
    return "Uher suu, tsagaan idee hiihed hereglegdene.";
}
}


// Livestock class
class Herd {
ArrayList<Livestock> livestock = new ArrayList<>();

void addLivestock(Livestock animal) {
livestock.add(animal);
}

void dailyRoutine() {
for (Livestock animal : livestock) {
System.out.println(animal.getName() + ": " + animal.makeSound());
if (animal instanceof WorkRole) {
    System.out.println(((WorkRole) animal).performTask());
}
animal.graze();
System.out.println();
}
}
}

// Main class
public class NomadLivestockDemo {
public static void main(String[] args) {
Herd herd = new Herd();
herd.addLivestock(new Horse("Bayn", 4));
herd.addLivestock(new Sheep("Chuluun", 2));
herd.addLivestock(new Camel("Temur", 6));
herd.addLivestock(new Cow("Davaa", 3));
herd.addLivestock(new Goat("Duuree", 5));

herd.dailyRoutine();
}
}