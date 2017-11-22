import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Classroom extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Classroom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Student student1 = new Student( 1, "Bob", "Smith", 11, 93.3, true );
        Student student2 = new Student( 2, "Smith", "Bob", 12, 95.3, false );
        Student student3 = new Student( 3, "Wanna", "One", 10, 99.5, false );
        
        addObject( student1, 60, 60);
        addObject( student2, 540, 60);
        addObject( student3, 300, 340);
    }
}
