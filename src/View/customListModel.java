package View;

import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;

import Model.Item;
import Model.Items;

public class customListModel extends AbstractListModel{

	private ArrayList<Item> data;

	public customListModel(Items items)
	{

		this.data = items.getItemList();

		data.toString();
		System.out.print(data.toString()); 
	}

	// get size data
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public Object getElementAt(int index) {
		// TODO Auto-generated method stub
		System.out.print(data.get(index)) ;
		return data.get(index).toString();
	}

}
