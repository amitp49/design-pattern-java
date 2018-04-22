package Iterator;

import java.util.ArrayList;

public class MenuWithArrayList implements Menu {
	ArrayList menuItems;
	
	public MenuWithArrayList()
	{
		menuItems = new ArrayList();
		
		menuItems.add(new MenuItem("Name A", "Desc A", true, 2.50));
		menuItems.add(new MenuItem("Name B", "Desc B", true, 3.50));
		menuItems.add(new MenuItem("Name C", "Desc C", false, 4.50));
		menuItems.add(new MenuItem("Name D", "Desc D", true, 1.50));
	}

	/**
	 * @return the menuItems
	 */
	public ArrayList getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator()
	{
		Iterator iterator = new MenuWithArrayListIterator(menuItems);
		return iterator;
	}
}
