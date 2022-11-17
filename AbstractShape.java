public abstract class AbstractShape {

	public Color color;

	public AbstractShape(Color color){
		this.color = color;
	}

	public Color getColor(){
		return this.color;
	}

	public double area();

}
