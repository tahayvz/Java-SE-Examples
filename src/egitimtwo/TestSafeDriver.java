package egitimtwo;
//import static egitimtwo.SafeDriver.printMaxSpeed;
//constants and static methods to be imported without importing entire class
import static egitimtwo.SafeDriver.*; //import all statics
import static java.lang.Math.PI;
public class TestSafeDriver {
public static void main(String[] args) {
	int speed=MAXIMUM_SPEED;
	double distance=SAFE_FOLLOWING_DISTANCE;
	//double distance=SafeDriver.SAFE_FOLLOWING_DISTANCE; //illegal
	if(MINIMUM_FUEL_LEVEL>=0.2)
		System.out.println("enough fuel");
	printMaxSpeed();
	double radius=3;
	System.out.println(PI*radius*radius);//Math.PI illegal because imported
}
}
