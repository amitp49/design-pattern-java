package Iterator;

import java.util.ArrayList;

public class MenuWithArrayListIterator implements Iterator{

	ArrayList menuItems;
	int position = 0;	
	
	/**
	 * @param menuItems
	 */
	public MenuWithArrayListIterator(ArrayList menuItems) {
		super();
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position >= menuItems.size() || menuItems.get(position) == null)
			return false;
		else 
			return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = (MenuItem) menuItems.get(position);
		position++;
		
		return menuItem;
	}

}
