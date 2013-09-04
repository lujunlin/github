import javax.swing.text.Caret;


public class Magnate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Car car = Driver.driveCar("bmw");
			Car car2 = Driver.driveCar("benz");
			car.drive();
			car2.drive();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
