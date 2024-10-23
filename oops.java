//******************************************** */
//object
//class
//polymorphism in oops java

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");

    }

    public void about() {
        System.out.println(this.color + " " + this.type);
        System.out.println();
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
    }

    public void printInfo(int age) {
        System.out.println(this.age);
    }

    public void printInfo(String name, int age) {
        System.out.println(this.name + " " + this.age);
    }

    Student() {
        System.out.println("Constructor called at the time of creation");
    }
}

public class oops {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";
        // pen1.write();
        // pen1.about();

        // Pen pen2=new Pen();
        // pen2.color = "red";
        // pen2.type = "bal";
        // pen2.write();
        // pen2.about();

        Student st1 = new Student();
        st1.name = "Rahul";
        st1.age = 20;
        st1.printInfo();
        st1.printInfo(st1.age);
        st1.printInfo(st1.name, st1.age);
    }
}

// *********************************** */
// //inheritance
// class Shape {
// String color;
// public void area() {
// System.out.println("display area");
// }
// }

// class Triangle extends Shape {
// public void givecolor() {
// System.out.println(color);
// }
// }

// public class oops {
// public static void main(String[] args) {
// Triangle t1 = new Triangle();
// t1.color = "Red";
// t1.givecolor();
// }
// }
///////////////////////////////
// class Shape {
// public void area() {
// System.out.println("display area");
// }
// }

// class Triangle extends Shape {
// int l, h;

// public void area(int l, int h) {
// System.out.println(0.5 * l * h); // Corrected the formula
// }
// }

// class EquilateralTriangle extends Triangle {
// @Override
// public void area(int l, int h) {
// System.out.println(0.5 * l * h); // Same formula for equilateral triangle
// }
// }
// class Circle extends Shape{
// public void area(int r){
// System.out.println(3.14*r*r);
// }
// }

// public class oops {
// public static void main(String[] args) {
// Triangle t1 = new Triangle();
// t1.l = 2;
// t1.h = 1;

// t1.area();
// t1.area(t1.l, t1.h);

// EquilateralTriangle t2 = new EquilateralTriangle();
// t2.l = 2;
// t2.h = 1;

// t2.area(t2.l, t2.h); // Calls the overridden area method from
// EquilateralTriangle

// Circle c1=new Circle();
// c1.area(5);
// }
// }

// encapsulation using getter and setters

// //abstraction using abstract key words or interface
// abstract class Animal{
// abstract void walk();
// }
// class horse extends Animal{
// public void walk(){
// System.out.println("walk on four legs");
// }
// }
// public class oops{
// public static void main(String[] args) {
// horse h1=new horse();
// h1.walk();
// }
// }
