public class Circle extends GeoShape {
    Circle(double dim1){
		super(dim1);
	}
	
	public double area(){
		return (Math.PI) * (getdim1()* getdim1());
	}
}
