package testch7_1;

public class main4 {

	public static void main(String[] args) {
		Artist art = new Artist("Marcus", 20, "Male");
	    Athlete ath = new Athlete("Danny", 25, "Female");

	    art.setGenre("Trip Hop");
	    ath.setSport("Football");;

	    art.introduce();
	    art.playMusic();

	    System.out.println();

	    ath.introduce();
	    ath.playSport();

	}

}
