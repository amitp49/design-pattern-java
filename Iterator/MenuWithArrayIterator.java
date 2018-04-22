package Iterator;

public class MenuWithArrayIterator implements Iterator{

	MenuItem[] items;
	int position = 0;	
	/**
	 * @param items
	 */
	public MenuWithArrayIterator(MenuItem[] items) {
		super();
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position >= items.length || items[position] == null)
			return false;
		else 
			return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = items[position];
		position++;
		
		return menuItem;
	}

}
