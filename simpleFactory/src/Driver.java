
public class Driver {
 public static Car driveCar(String s)throws Exception{
	 if(s.equalsIgnoreCase("Benz"))
		 return new Benz();
	 if(s.equalsIgnoreCase("Bmw"))
		 return new Bmw();
	 throw new Exception();
 }
}
