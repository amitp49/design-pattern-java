package Composite;

public class File extends StorageItem{
	private String name;

	/**
	 * @param name
	 */
	public File(String name) {
		super();
		this.name = name;
	}
	
	public void print(String prefix) {
		// TODO Auto-generated method stub
		System.out.println(prefix + name);
	}
	
}
