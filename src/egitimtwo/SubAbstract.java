package egitimtwo;

public class SubAbstract extends Abstractandinterface{

		void run(){
			System.out.println("running safely");
			}  
		void draw(){
			System.out.println("drawing circle");
			}  

		public static void main(String args[]){  
			Abstractandinterface obj = new SubAbstract();  
			obj.run();  		
		}
		public void a(){System.out.println("I am a");}  //all interface methods are public. If not public, not work
		public void b(){System.out.println("I am b");}  
		public void d(){System.out.println("I am d");}  
		
}
