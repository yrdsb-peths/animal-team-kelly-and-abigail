import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for pooh
 * 
 * @author (Abigail) 
 * @version (Nov 28 2025)
 */
public class Fries extends Actor
{
    public void act()
    {
        // Fries falls downwars
        setLocation(getX(), getY() + 2);
        
        // Remove Fries and draw game over when  apple get to the bottom
        MyWorld world = (MyWorld) getWorld();
        
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
