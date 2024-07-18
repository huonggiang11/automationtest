package day5_abstract;
public class Rectangle extends Shape{

	@Override // chú thích ghi đè
	public void draw() 
	{
	System.out.print("Draw rectangle with 4 edges, use  color " + getColor());
	}

}