import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        //creates pooh object
        WinnieThePooh pooh = new WinnieThePooh();
        addObject(pooh, 300, 200);
        
        //creates honey object
        Honey honey = new Honey();
        addObject(honey, 300, 0);
        
        //creates a lable
    }
    
    
    public void spawnHoney()
    {
        int x = Greenfoot.getRandomNumber(600);
        
        Honey honey = new Honey();
        addObject(honey, x, 0);
    
    }
}
