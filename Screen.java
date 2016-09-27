import java.awt.*;

public class Screen
{
	public static int width()
	{
		Toolkit t = Toolkit.getDefaultToolkit();
		return (t.getScreenSize().width);
	}

	public static int height()
	{
		Toolkit t = Toolkit.getDefaultToolkit();
		return (t.getScreenSize().height);
	}
          
        public int x(int percent)
        {
            return ((Number)((percent/100.0)*width())).intValue();
        }
        
        public int y(int percent)
        {
            return ((Number)((percent/100.0)*height())).intValue();
        }
}
