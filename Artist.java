package testch7_1;

public class Artist extends Person2 {
	String genre;

    public Artist (String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    
    public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void playMusic () {
        System.out.println(name + " is playing " + genre + " music.");
    }

}
