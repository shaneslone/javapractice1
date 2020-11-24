package dogs;

public class Main 
{
	public static void main(String[] args)
	{
		System.out.println(Dog.bark);

		Dog dottie;
		dottie = new Dog("Springer", 10, "Black and White");
		Dog ginger = new Dog("Troller", 6, "Ginger");
		dottie.bark = "Bark";
		System.out.println(dottie.bark);

		System.out.println(dottie);
		System.out.println(dottie.getAge());

		ginger.setBreed("mutt");
		System.out.println(ginger.getBreed());

		Dog limited = new Dog("Black");
		System.out.println(limited.getAge());

		Dog aDog = new Dog();
		System.out.println(aDog.getBreed());

		aDog.setBreed("Beagles");
		System.out.println(aDog.getBreed());
	}
}