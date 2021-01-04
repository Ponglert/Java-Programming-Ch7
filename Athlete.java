package testch7_1;

public class Athlete extends Person2 {
	String sport;

    public Athlete (String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}

	public void playSport () {
        System.out.println(name + " is playing " + sport + ".");
    }
}
