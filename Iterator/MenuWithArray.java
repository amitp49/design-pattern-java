package Iterator;

public class MenuWithArray implements Menu{
	MenuItem[] menuitems;

	/**
	 * @param menuitems
	 */
	public MenuWithArray() {
		
		menuitems = new MenuItem[3];
		menuitems[0] = new MenuItem("Name X", "Desc X", true, 22.50);
		menuitems[1] = new MenuItem("Name Y", "Desc Y", true, 23.50);
		menuitems[2] = new MenuItem("Name Z", "Desc Z", false, 24.50);
	}

	/**
	 * @return the menuitems
	 */
	public MenuItem[] getMenuitems() {
		return menuitems;
	}

	public Iterator createIterator()
	{
		Iterator iterator = new MenuWithArrayIterator(menuitems);
		return iterator;
	}
}
