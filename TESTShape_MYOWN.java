
abstract class Shape_MYOWN {

	void foreground()
	{
		System.out.println("Shape FG...");
	}
	void background()
	{
		System.out.println("Shape BG...");
	}
void points()
{
	System.out.println("Points are needed...");
}

abstract void speciality();
}
class rectangle extends Shape_MYOWN{

	void perimeter()
	{
		System.out.println("My perimeter is 2(length+breadth)");
		
	}
	

	@Override
	void speciality() {
		
	System.out.println("OPPOSITE SIDES EQUAL...");	
	}

	
}

class circle extends Shape_MYOWN{

	@Override
	void speciality() {
  System.out.println("DISTANCE OF ANY POINT ON CIRCLE FROM CENTRE IS EQUAL...");		
	}
	
	void area()
	{
		System.out.println("My area is 3.14*radius*radius");
	}
}

class square extends Shape_MYOWN{

	@Override
	void speciality() {
		
		System.out.println("ALL SIDES EQUAL..."); 
		
	}
	
	void perimeter()
	{
		System.out.println("My perimeter is 4*side");
	}
	
}
class drawing{
	
	void calldrawing(Shape_MYOWN shape) {
		
		shape.background();
		shape.foreground();
		shape.points();
	
if (shape instanceof circle)	{
	circle c = (circle)shape;
	c.speciality();
c.area();

System.out.println("I M CIRCLE :)");
System.out.println("**************************************");
}

	
if (shape instanceof square) {
	square s = (square)shape;
	s.speciality();
	s.perimeter();

System.out.println("I M SQUARE :)");
System.out.println("**************************************");
}

	
if (shape instanceof rectangle)	{
	rectangle r= (rectangle)shape;
r.speciality();
r.perimeter();

System.out.println("I M RECTANGLE :)");
System.out.println("**************************************");
}
	} }
	
	public  class TESTShape_MYOWN{
		
		public static void main(String [] args) {
			
			drawing DRAW = new drawing();
			
			Shape_MYOWN obj1 = new rectangle();
			DRAW.calldrawing(obj1);
			
			Shape_MYOWN obj2 = new square();
			DRAW.calldrawing(obj2);

			DRAW.calldrawing(new circle());
		}
	}