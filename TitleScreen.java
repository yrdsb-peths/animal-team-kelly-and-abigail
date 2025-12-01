import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author (Kelly & Abigail) 
 * @version (December 2025)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Winnie", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 250, 150);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act() {
        // Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        WinnieThePooh winnieThePooh = new WinnieThePooh();
        addObject(winnieThePooh,480,92);
        winnieThePooh.setLocation(512,111);
        winnieThePooh.setLocation(525,201);
        winnieThePooh.setLocation(486,212);
        winnieThePooh.setLocation(502,113);
        winnieThePooh.setLocation(503,127);
        winnieThePooh.setLocation(496,140);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,200,288);
        label.setLocation(312,306);
        label.setLocation(292,293);
        Label label2 = new Label("Use <-- and --> to Move", 40);
        addObject(label2,266,239);
        label2.setLocation(325,242);
        label2.setLocation(292,236);
    }
}
