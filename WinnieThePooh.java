import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This a winnie the pooh, the hero.
 * 
 * @author (Abigail) 
 * @version (Nov 28 2025)
 */
public class WinnieThePooh extends Actor
{
    /**
     * Act - do whatever the WinnieThePooh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        
        eat();
    }
    
    /**
     * Eat the Honey when touching and spawn new honey if the honey is eaten
     */
    public void eat()
    {
        //Remove apple if pooh eats it
        if(isTouching(Honey.class))
        {
            removeTouching(Honey.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnHoney();
            world.increaseScore();
        }
    }
    
}
