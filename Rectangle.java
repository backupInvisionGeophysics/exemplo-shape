public class Rectangle extends AbstractShape{

	public double width;

	public double height;

	public Rectangle(Color color, double width, double height){
		super(color);
		this.width = width;
		this.height = height;
	}

	public double area(){
		return width*height;
	}
}
