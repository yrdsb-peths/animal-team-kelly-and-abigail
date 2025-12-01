import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    public MyWorld() {
        super(600, 400, 1, false);
        
        //creates pooh object
        WinnieThePooh pooh = new WinnieThePooh();
        addObject(pooh, 300, 300);
        
        //creates honey object
        Fries fries = new Fries();
        addObject(fries, 300, 0);
        
        //creates a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel,50, 50);
    }
    
    /**
     * End the game and draw 'GameOver'
     */
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    
    }
    
    
    /**
     * Increases score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
     * Spawns each fries
     */
    public void spawnFries()
    {
        int x = Greenfoot.getRandomNumber(600);
        
        Fries fries = new Fries();
        addObject(fries, x, 0);
    
    }
}
