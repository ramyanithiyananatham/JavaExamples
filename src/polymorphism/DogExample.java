package polymorphism;

public class DogExample {
	String name;
	int age;
	public DogExample(String name,int age)
	{
		this.name=name;
		this.age= age;
	}
	public String getName() {
return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString()
	{
		return ("name: "+this.getName() + ".\nage: "+this.getAge());
	}

	public static void main(String[] args) {
		DogExample tuffy= new DogExample("TUFFY",3);
		System.out.println(tuffy.toString());
	}
}
