package Facade;

public class HomeTheaterFacade {
	Projector projector;
	Speaker speaker;
	DvdPlayer dvdPlayer;
	/**
	 * @param projector
	 * @param speaker
	 * @param dvdPlayer
	 */
	public HomeTheaterFacade(Projector projector, Speaker speaker,
			DvdPlayer dvdPlayer) {
		
		this.projector = projector;
		this.speaker = speaker;
		this.dvdPlayer = dvdPlayer;
	}
	
	public void watchMovie(String movie)
	{
		System.out.println("Getting ready to start movie...");
		projector.on();
		projector.wideScreenMode();
		speaker.on();
		speaker.setVolume(5);
		dvdPlayer.on();
		dvdPlayer.play(movie);
		
	}
	
	public void endMovie()
	{
		System.out.println("Shutting down...");
		projector.off();
		speaker.off();
		dvdPlayer.stop();
		dvdPlayer.eject();
		dvdPlayer.off();
	}
}
