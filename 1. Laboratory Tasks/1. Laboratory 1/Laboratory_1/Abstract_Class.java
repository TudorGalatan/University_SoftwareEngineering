/*
    Abstract Class Example
*/

package Laboratory_1;


abstract class Animal
{
    // Abstract Methods
    abstract void move();
    abstract void eat();
    
    // Concrete Method
    void label ()
    {
        System.out.println("Animal's data: ");
    }
}


class Bird extends Animal
{
    void move ()
    {
        System.out.println("Moves by flying.");
    }
    
    void eat ()
    {
        System.out.println("Eats birdfood.");
    }
}


class Fish extends Animal
{
    void move ()
    {
        System.out.println("Moves by swimming.");
    }
    
    void eat ()
    {
        System.out.println("Eats seafood.");
    }
}


class TestBird
{
    public static void test ()
    {
        Animal myBird = new Bird();
        myBird.label();
        myBird.move();
        myBird.eat();
    }
}


class TestFish
{
    public static void test ()
    {
        Animal myFish = new Fish();
        myFish.label();
        myFish.move();
        myFish.eat();
    }
}


public class Abstract_Class
{
    public static void testAbstractClass ()
    {
        TestBird testBird = new TestBird();
        TestFish testFish = new TestFish();
        
        testBird.test();
        testFish.test();
    }
}
