package nov19;
public class SecondClass {
	public static void main(String[] args) {

		Son1 s1=new Son1();
		s1.bike();
		Son2 s2=new Son2();
		s2.bike();
		s2.oldBike();
		
	}
}
class GrandMother{
	void oldbike(){
		System.out.println("Scooty");
	}
}
class GrandFather extends GrandMother{
	void oldBike(){
		System.out.println("Royal Enfield 1983");
	}
}

class Father extends GrandFather{
	void oldBike(){
		System.out.println("Royal Enfield GT350");
	}
}

class Son1 extends Father{
	void bike(){
		System.out.println("Royal Enfield Himalayan");
	}
}

class Son2 extends Father{
	void bike(){
		System.out.println("Gt 650");
	}
}