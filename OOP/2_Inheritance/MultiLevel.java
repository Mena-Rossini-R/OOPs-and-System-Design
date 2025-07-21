package Inheritance;

public class MultiLevel {
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.prints();
        //obj.super.prints()  - X super is only used to access immediate parent..cant be used with the object.
    }
}

class Animal{
    Animal(){
        System.out.println("Parent 1");
    }
    
    void prints(){
        System.out.println("Animal class");
    }
}

class Domestic extends Animal{
    Domestic(){
        System.out.println("Parent2 / child of parent 1");
    }

    @Override
    void prints(){
        super.prints();
        System.out.println("Domestic class");
    }
}

class Dog extends Domestic{
    Dog(){
        System.out.println("child of Parent2 / grand child of parent 1");
    }

    @Override
    void prints(){
        super.prints();
        System.out.println("Dog class");
    }
}

/*

OUTPUT : Inheritance$ java MultiLevel.java

Parent 1
Parent2 / child of parent 1
child of Parent2 / grand child of parent 1
Animal class
Domestic class
Dog class


 */
