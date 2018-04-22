package Composite;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directory dir1 = new Directory("A");
		Directory dir2 = new Directory("B");
		Directory dir3 = new Directory("C");
		dir1.add(dir2);
		dir1.add(dir3);
		dir1.add(new File("X"));
		dir2.add(new File("Y"));
		dir2.add(new File("Z"));
		dir3.add(new File("W"));
		
		dir1.print("");
	}

}
