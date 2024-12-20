
public class Begin {

	public static void main(String[] args) {
		//involking the constructor
		Car c=new Car("Civic","Red",500000,120,"Japan");
		System.out.println("Name:"+c.getName());
		System.out.println("color:"+c.getColor());
		System.out.println("Cost:"+c.getCost());
		System.out.println("TopSpeed:"+c.getTopSpeed());
		System.out.println("Country:"+c.getCountry());	
		}

}
