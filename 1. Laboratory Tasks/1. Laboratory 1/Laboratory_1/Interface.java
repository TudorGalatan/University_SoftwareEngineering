/*
    Interface Example
*/

package Laboratory_1;


interface Animal
{
    public void eat ();
    public void sound ();
}


interface Bird
{
    int numberOfLegs = 2;
    String outerCovering = "feather";
    
    public void fly ();
}


class Eagle implements Animal, Bird
{
    public void eat ()
    {
        System.out.println("Eats reptiles and amphibians.");
    }
    
    public void sound ()
    {
        System.out.println("Has a high-pitched whistling sound.");
    }
    
    public void fly ()
    {
        System.out.println("Flies up to 10,000 feet.");
    }
}


class TestEagleInterfaces
{
    public static void test ()
    {
        Eagle myEagle = new Eagle();
        
        myEagle.eat();
        myEagle.sound();
        myEagle.fly();
        
        System.out.println("Number of legs: " + Bird.numberOfLegs);
        System.out.println("Outer covering: " + Bird.outerCovering);
    }
}


public class Interface
{
    public static void testInterfaces ()
    {
        TestEagleInterfaces testEagleInterfaces = new TestEagleInterfaces();
        testEagleInterfaces.test();
    }
}
