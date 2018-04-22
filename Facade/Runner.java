package Facade;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Projector(), new Speaker(), new DvdPlayer());
		homeTheaterFacade.watchMovie("Iron man");
		homeTheaterFacade.endMovie();
	}

}
