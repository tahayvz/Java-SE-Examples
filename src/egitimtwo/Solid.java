package egitimtwo;

public class Solid extends Good {
private double width;
private double length;
public Solid(String name, int modelNumber, double height, UnitOfMeasureType uoM,double width, double length) {
super(name, modelNumber, height, uoM);
this.width = width;
this.length = length;
}
public double getWidth() {
return width;
}
public void setWidth(double width) {
this.width = width;
}
public double getLength() {
return length;
}
public void setLength(double length) {
this.length = length;
}

public String toString() {
return super.toString() + " that is " + volume() + " "+ getUnitOfMeasure() + " in size";
}

public double volume() {
return width * length * getHeight();
}

}