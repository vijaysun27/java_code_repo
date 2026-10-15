package Assignments.Assignment_2;

public class Dog extends Animal implements Playable{
	public Dog(String sound) {
		super(sound);
	}
	
	public void sound() {
		System.out.println("Dog makes a sound: "+sound);	
	}
	public void play() {
		System.out.println("Dog can play: Yes");
	}

}
