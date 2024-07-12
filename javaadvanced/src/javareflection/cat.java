package javareflection;

public class cat {
	private final String name;
	private int age;
	//declare constructor
	public cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
//	void setname(name) { 
//		this.name = name;
//	}
	public String getname() {
		return name;
	}
	public void  setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void meow() {
		System.out.println("concac");
	}
	public void hepThisIsPrivate() {
		System.out.println("how did you call this ");
	}
	public static void eating() {
		System.out.println("Eating mouse");
	}
}
