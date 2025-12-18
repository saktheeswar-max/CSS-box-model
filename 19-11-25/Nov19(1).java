package nov19;
public class FirstClass {
	void BMW520(){
		System.out.println("King Car");
	}
	public static void main(String[] args) {

		People1 k= new People1();
		k.bike();
		System.out.println(k.name_people1);
		FirstClass king=new FirstClass();
		king.BMW520();
	}
}
class People1{
	String name_people1="Karthik";
	void car(){
		System.out.println("People1 Car");
	}
	void bike(){
		System.out.println("People1 Bike");
	}
}
class People2{
	String name_people1="Mahesh";
	void car(){
		System.out.println("People2 Car");
	}
}