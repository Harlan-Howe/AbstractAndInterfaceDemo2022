import java.awt.*;

public class Obstacle
{
    private Image icon;
    private int hitPoints;

    public Obstacle()
    {

    }

    public Image getIcon()
    {
        return icon;
    }

    public void setIcon(Image icon)
    {
        this.icon = icon;
    }

    public int getHitPoints()
    {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }
}
