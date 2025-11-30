import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This a winnie the pooh, the hero.
 * 
 * @author (Abigail) 
 * @version (Nov 28 2025)
 */
public class WinnieThePooh extends Actor
{
    GreenfootSound winnieSound = new GreenfootSound("_audio_winnie_.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    
    // Direction the winnie is facing
    String facing = "right";
    
    /**
     * Constructor - The code that gets run one time when object is created
     */
    
    public WinnieThePooh() {
        for(int i = 0; i < idleRight.length; i++) {
            idleRight[i] = new GreenfootImage("images/winnie_idle/idle" + i + ".png");
            idleRight[i].scale(50, 80);
        }
        
        for(int i = 0; i < idleLeft.length; i++) {
            idleLeft[i] = new GreenfootImage("images/winnie_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(50, 80);
        }
        
        // Initial Winnie image
        setImage(idleRight[0]);
    }
    
    /**
     * Animate Winnie
     */
    
    int imageIndex = 0;
    public void animateWinnie() {
        if(facing.equals("right")) {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 5) % idleRight.length;
        } else {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 5) % idleLeft.length;
        }
        
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
            facing = "right";
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
