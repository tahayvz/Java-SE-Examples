package egitimtwo;

import egitimtwo.Good.UnitOfMeasureType; //enum
public class TestGoods {
public static void main(String[] args) {
	Liquid glue=new Liquid("Acme glue",2334,4,UnitOfMeasureType.LITER,15);
	Liquid paint=new Liquid("Acme invisible paint",2490,0.65,UnitOfMeasureType.GALLON,0.7);
	Solid anvil = new Solid("Acme Anvil", 1668, 0.3, UnitOfMeasureType.CUBIC_METER, 5000, 0.5);
			System.out.println(glue);
			System.out.println(paint);
			System.out.println(anvil);
					
			System.out.println(Good.getCatalog());
			Good.getCatalog().remove(1);
			Solid toaster = new Solid("Acme Toaster", 1755, 0.75,			UnitOfMeasureType.CUBIC_FEET, 1.0, 1.0);
			Good.getCatalog().add(toaster);
			Good.getCatalog().add(toaster);
			System.out.println(Good.getCatalog());
					} 
}