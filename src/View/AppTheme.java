package View;

import java.util.ResourceBundle;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;

public class AppTheme extends DefaultMetalTheme{
	protected ColorUIResource getPrimary1()  
	{
		ResourceBundle colors = ResourceBundle.getBundle("ThemeColorBundle");
		ColorUIResource primary1 =  new ColorUIResource(Integer.parseInt(colors.getString("primary1R")),
										Integer.parseInt(colors.getString("primary1G")),
										Integer.parseInt(colors.getString("primary1B")));
		
		return primary1;
	}
	
	protected ColorUIResource getPrimary2()  
	{
		ResourceBundle colors = ResourceBundle.getBundle("ThemeColorBundle");
		ColorUIResource primary2 =  new ColorUIResource(Integer.parseInt(colors.getString("primary2R")),
										Integer.parseInt(colors.getString("primary2G")),
										Integer.parseInt(colors.getString("primary2B")));
		
		return primary2;
	}
	
	protected ColorUIResource getPrimary3()  
	{
		ResourceBundle colors = ResourceBundle.getBundle("ThemeColorBundle");
		ColorUIResource primary3 =  new ColorUIResource(Integer.parseInt(colors.getString("primary3R")),
										Integer.parseInt(colors.getString("primary3G")),
										Integer.parseInt(colors.getString("primary3B")));
		
		return primary3;
	}
}
