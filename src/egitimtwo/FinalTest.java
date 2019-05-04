package egitimtwo;

public class FinalTest {
	 public static final int LESS_TRAVELED=0;//explicit initialization
	 public final int SHORTEST;
	 	public FinalTest() {
	 		SHORTEST=1;//constructor initialization
	 	}
	/* 	public void foo() {
	 		SHORTEST=1; //compile error. Final can change in contructor
	 	}
	*/
	/* public final void drive() { //final method can no longer overridden
		 setvelocity(44);
		 setPath(LESS_TRAVELED);
		 go();
		 
	 }*/
/*public final class FinalTest(){ }
  public class subFinalTest() extends FinalTest{ } //illegal
	   final class should no have descendants*/
}
