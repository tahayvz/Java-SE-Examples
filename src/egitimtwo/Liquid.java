package egitimtwo;

public class Liquid extends Good{
	private double radius;
	public Liquid(String name, int modelNumber, double height, UnitOfMeasureType uoM, double radius) {
			super(name, modelNumber, height, uoM);
			this.radius = radius;
			}
	public double getRadius() {
		return radius;
		}
		public void setRadius(double radius) {
		this.radius = radius;
		}
		public double volume() {
		return Math.PI * radius * radius * getHeight();
		}
		public String toString() {
		return super.toString() + " (liquid) " + volume() + " "+ getUnitOfMeasure();
		}
		
		}