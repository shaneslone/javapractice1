package dogs;

public class Dog 
{
	public static String bark = "Woof";

	private String breed;
	private int age;
	private String color;

	public Dog()
	{

	}

	public Dog(String color)
	{
		this.breed = "mutt";
		this.age = 1;
		this.color = color;
	}

	public Dog(String breed, int age, String color)
	{
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	public String getBreed()
	{
		return breed;
	}

	public int getAge()
	{
		return age;
	}

	public String getColor()
	{
		return color;
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public void sleep(int minutes)
	{
		System.out.println("ZZZ " + minutes);
	}
}