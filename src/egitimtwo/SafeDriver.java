package egitimtwo;

public interface SafeDriver {
public static final int MAXIMUM_SPEED=55;
public static final int SAFE_FOLLOWING_DISTANCE=100;
public static final double MINIMUM_FUEL_LEVEL=0.2;
public static void printMaxSpeed() {
	System.out.println(MAXIMUM_SPEED);
} 
public void drive();
public void stop();
}
