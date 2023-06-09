import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Jason Qian
 * @version May 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Animal", 80);
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
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
        titleLabel.setLocation(300, 50);
        Label label = new Label("Press <SPACE> to Start!", 40);
        addObject(label,300,375);
        Label label2 = new Label("HINT: use \u2190 and \u2192 to move!", 30);
        addObject(label2,300,350); 
        Elephant elephant = new Elephant();
        addObject(elephant,300,200);
    }
}
