package Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends StorageItem{
	private String name;
	private ArrayList files;
	/**
	 * @param name
	 */
	public Directory(String name) {
		super();
		this.name = name;
		this.files = new ArrayList();
	}
	
	@Override 
	public void add(StorageItem storageItem) {
		files.add(storageItem);
	}
	
	@Override public void remove(StorageItem storageItem) 
	{
		files.remove(storageItem);
	}
	
	@Override public StorageItem getChild(int i) {
		return (StorageItem) files.get(i);
	}
	
	@Override
	public void print(String prefix) {
		// TODO Auto-generated method stub
		System.out.println(prefix + "D:" + name);
		
		Iterator iterator = files.iterator();
		while(iterator.hasNext())
		{
			StorageItem storageItem = (StorageItem)iterator.next();
			storageItem.print(" " + prefix);
		}
	}
}
