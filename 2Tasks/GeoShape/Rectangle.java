public class Rectangle extends GeoShape {
    private double dim2;
	
	Rectangle(double dim1,double dim2){
		super(dim1);
		this.dim2=dim2;
	}
	
	public void setdim2(double dim2){
		this.dim2=dim2;
	}
	
	public double getdim2(){
		return dim2;
	}
	
	public double area(){
		return getdim1()*dim2;
	}
}
