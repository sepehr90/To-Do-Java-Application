package View;

import java.awt.Color;
import java.awt.Component;
import java.util.ResourceBundle;

import javax.swing.JTable;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableCellRenderer;

import Model.Priority;


@SuppressWarnings("serial")
public class ItemTableCellRenderer extends DefaultTableCellRenderer{    
        
    public Component getTableCellRendererComponent (JTable table,    
                                                    Object value,    
                                                    boolean isSelected,    
                                                    boolean hasFocus,    
                                                    int row,    
                                                    int column) {
    	
		setText(value.toString());
		setOpaque(true);
		
		if(!isSelected){
			setBackground(Priority.getPriority(value.toString()).getColor());
			setForeground(Color.BLACK);
		}
		else{
			
			// use default color from the theme
			ResourceBundle colors = ResourceBundle.getBundle("ThemeColorBundle");
			setBackground(new ColorUIResource(Integer.parseInt(colors.getString("primary3R")),
											Integer.parseInt(colors.getString("primary3G")),
											Integer.parseInt(colors.getString("primary3B"))));
		}
		
		return this;
    }    
} 
