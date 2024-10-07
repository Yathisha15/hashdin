//Inheritence

// class Bicycle {
//     protected int gear;
//     protected int speed;

//     public Bicycle(int gear, int speed) {
//         this.gear = gear;
//         this.speed = speed;
//     }

//     public int getGear() {
//         return gear;
//     }

//     public int getSpeed() {
//         return speed;
//     }

//     public void setSpeed(int speed) {
//         this.speed = speed;
//     }

//     public void setGear(int newValue) {
//         gear = newValue;
//     }

//     public void applyBreak(int decrement) {
//         speed -= decrement;
//     }

//     public void speedUp(int increment) {
//         speed += increment;
//     }
// }

// class MountainBike extends Bicycle {
//     private int setHeight;

//     public MountainBike(int startHeight, int startSpeed, int startGear) {
//         super(startGear, startSpeed);
//         this.setHeight = startHeight; // Initialize setHeight here
//     }

//     public int getSetHeight() {
//         return setHeight;
//     }

//     public void setSetHeight(int setHeight) {
//         this.setHeight = setHeight;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         MountainBike mountainBike = new MountainBike(20, 20, 1);
//         int a = mountainBike.getSetHeight(); // This will now return 20
//         System.out.print(a);
//         mountainBike.applyBreak(10);
//         System.out.println(mountainBike.speed);
        
//     }
// }



//Encapsulation

// public class Student{
//     private String name;
//     private int age;
//     private String address;
//     public Student(String name, int age, String address) {
//         this.name = name;
//         this.age = age;
//         this.address = address;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public int getAge() {
//         return age;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }
//     public String getAddress() {
//         return address;
//     }
//     public void setAddress(String address) {
//         this.address = address;
//     }
//     @Override
//     public String toString() {
//         return "Student [name=" + name + ", age=" + age + ", address=" + address + ", getClass()=" + getClass()
//                 + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress()
//                 + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//     }
    
    
    
// }


//Abstraction

//  abstract class Student {

//     int x,y;
//     void moveTo(int newX,int newY){
//         System.out.println("move to x: "+x+" and y : "+y);
//     }
//     abstract void draw();
//     abstract void resize();
// }

//  class Circle extends Student{
    
//     void draw(){
//         System.out.println("Drawing a circle");
//     }
//     void resize(){
//         System.out.println("Resizing a circle");
//     }

// }

// public class Main{
//     public static void main(String[] args) {
//         Circle c=new Circle();
//         c.draw();
//         c.resize();
//     }
// }



//Interface for multiple inheritance

//This is going to tell how the appllication will behave 

/**
 * Main
 */


//  interface Bicycle {
      

//     void applyBreak(int decrement);

//     void speedUp(int increment);
     
// }

//ATM Project


