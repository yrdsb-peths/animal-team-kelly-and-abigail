import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This a winnie the pooh, the hero.
 * 
 * @author (Abigail) 
 * @version (Nov 28 2025)
 */
public class WinnieThePooh extends Actor
{
    GreenfootSound winnieSound = new GreenfootSound("audio_winnie.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    
    /**
     * Constructor - The code that gets run one time when object is created
     */
    
    public WinnieThePooh() {
        for(int i = 0; i < idle.length; i++) {
            idle[i] = new GreenfootImage("images/winnie_idle/idle" + i + ".png");
        }
        
        setImage(idle[0]);
    }
    
    /**
     * Animate Winnie
     */
    
    int imageIndex = 0;
    public void animateWinnie() {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        
        // Eat the hunny
        eat();
        
        // Animate the winnie
        animateWinnie();
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
            winnieSound.play();
        }
    }
}
