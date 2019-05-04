package egitimtwo;
import java.util.*;
public abstract class Good implements Product {
	
public enum UnitOfMeasureType {
LITER, GALLON, CUBIC_METER, CUBIC_FEET
}
private String name;
private int modelNumber;
private double height;
private UnitOfMeasureType unitOfMeasure;
private double weightPerUofM;

public Good(String name, int modelNumber, double height, UnitOfMeasureType uoM) {
this.name = name;
this.modelNumber = modelNumber;
this.height = height;
this.unitOfMeasure = uoM;
}

public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getModelNumber() {
return modelNumber;
}
public void setModelNumber(int modelNumber) {
this.modelNumber = modelNumber;
}
public double getHeight() {
return height;
}
public void setHeight(double height) {
this.height = height;
}
public UnitOfMeasureType getUnitOfMeasure() {
return unitOfMeasure;
}
public void setUnitOfMeasure(UnitOfMeasureType unitOfMeasure)
{
this.unitOfMeasure = unitOfMeasure;
}
public double getWeightPerUofM() {
return weightPerUofM;
}
public void setWeightPerUofM(double weightPerUofM) {
this.weightPerUofM = weightPerUofM;
}

public String toString() {
return "name: "+ name + "#model: " + modelNumber;
}

public abstract double volume();

private static List catalog;
public static List getCatalog() {
return catalog;
}
static {
	Liquid glue = new Liquid("Acme Glue", 2334, 4,UnitOfMeasureType.LITER,15);
			Liquid paint = new Liquid("Acme Invisible Paint", 2490,	0.65,UnitOfMeasureType.GALLON, 0.70);
			Solid anvil = new Solid("Acme Anvil", 1668, 0.3,UnitOfMeasureType.CUBIC_METER, 500, 0.25);
			Solid safe = new Solid("Acme Safe", 1672, 1.0,UnitOfMeasureType.CUBIC_METER, 300, 0.5);
			Solid balloon = new Solid("Acme Balloon", 1401, 15,	UnitOfMeasureType.CUBIC_FEET, 10, 5);
			Solid pistol = new Solid("Acme Disintegrating Pistol", 1587,0.1,UnitOfMeasureType.CUBIC_FEET, 1, 0.5);
			Liquid nitro = new Liquid("Acme Nitroglycerin", 4289, 1.0,UnitOfMeasureType.CUBIC_METER, 0.25);
			Liquid oil = new Liquid("Acme Oil", 4275, 1.0,UnitOfMeasureType.CUBIC_METER, 0.25);
					catalog = new ArrayList();
					catalog.add(glue);
					catalog.add(paint);
					catalog.add(anvil);
					catalog.add(safe);
					catalog.add(balloon);
					catalog.add(pistol);
					catalog.add(nitro);
					catalog.add(oil);
					}


}