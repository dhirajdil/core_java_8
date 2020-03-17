package DesignPattern;


interface Shape{
	void draw();
}
class Rectangle implements Shape{
	public void draw() {
		 System.out.println("Inside Rectangle::draw() method.");
		
	}
	
}
class Square implements Shape{
    public void draw() {
		 System.out.println("Inside Square:draw() method.");
	}
	
}
class Circle implements Shape{
      public void draw() {
		 System.out.println("Inside Circle:draw() method.");
		}
      }
class ShapeFactory{
	public Shape returnShapeMethod(String st) {
		if(st==null) {
			return null;
		}
		else if(st.equals("Circle")) {
			return new Circle();
		}else if(st.equals("Rectangle")) {
			return new Rectangle();
		}else if(st.equals("Square")) {
			return new Square();
		}
		return null;
		
	}
	
}

public class FactoryPatternDao {

	public static void main(String[] args) {
		ShapeFactory sh=new ShapeFactory();
		Shape sh1=	sh.returnShapeMethod("Circle");
		sh1.draw();
		Shape sh2=	sh.returnShapeMethod("Rectangle");
		sh2.draw();
		Shape sh3=	sh.returnShapeMethod("Square");
		sh3.draw();
		

	}

}
