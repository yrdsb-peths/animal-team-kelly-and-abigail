import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for pooh
 * 
 * @author (Abigail) 
 * @version (Nov 28 2025)
 */
public class Honey extends Actor
{
    public void act()
    {
        // Apple falls downwars
        setLocation(getX(), getY() + 2);
        
        // Remove apple and draw game over when  apple get to the bottom
        MyWorld world = (MyWorld) getWorld();
        
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
