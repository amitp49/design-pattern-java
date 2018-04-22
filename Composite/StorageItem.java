package Composite;

public abstract class StorageItem {
	public void add(StorageItem storageItem)
	{
		throw new UnsupportedOperationException();
	}
	public void remove(StorageItem storageItem)
	{
		throw new UnsupportedOperationException();
	}
	public StorageItem getChild(int i)
	{
		throw new UnsupportedOperationException();
	}
	public void print(String prefix)
	{
		throw new UnsupportedOperationException();
	}
}
