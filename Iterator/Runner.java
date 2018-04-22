package Iterator;

public class Runner {
	public static void main(String[] args) {
		WaitressMenuPrints waitressMenuPrints = new WaitressMenuPrints(new MenuWithArray(), new MenuWithArrayList());
		waitressMenuPrints.printMenus();
	}
}
