import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for pooh
 * 
 * @author (Abigail) 
 * @version (Nov 28 2025)
 */
public class Honey extends Actor
{
    /**
     * Act - do whatever the Honey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + 1);
    }
}
