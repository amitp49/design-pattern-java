package Iterator;

public class WaitressMenuPrints {
	Menu menuWithArray;
	Menu menuWithArrayList;
	/**
	 * @param menuWithArray
	 * @param menuWithArrayList
	 */
	public WaitressMenuPrints(Menu menuWithArray,
			Menu menuWithArrayList) {
		super();
		this.menuWithArray =  menuWithArray;
		this.menuWithArrayList =  menuWithArrayList;
	}
	
	public void printMenus()
	{
		Iterator menu1 = menuWithArray.createIterator();
		printMenu(menu1);

		Iterator menu2 = menuWithArrayList.createIterator();
		printMenu(menu2);
	}

	private void printMenu(Iterator obj) {
		// TODO Auto-generated method stub
		while(obj.hasNext())
		{
			MenuItem menuItem = (MenuItem) obj.next();
			System.out.println(menuItem.getName() + " : " + menuItem.getPrice());
		}
	}
}
