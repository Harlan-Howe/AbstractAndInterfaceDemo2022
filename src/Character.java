import java.awt.*;

public class Character
{
    private int width, height, currentFrame;
    private Image[] animationFrames;

    public Character()
    {

    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getCurrentFrame()
    {
        return currentFrame;
    }

    public void setCurrentFrame(int currentFrame)
    {
        this.currentFrame = currentFrame;
    }

    public Image[] getAnimationFrames()
    {
        return animationFrames;
    }

    public void setAnimationFrames(Image[] animationFrames)
    {
        this.animationFrames = animationFrames;
    }
}
