public class Rectangle implements GeoShape {
    private double dim1;
    private double dim2;
	
	Rectangle(double dim1,double dim2){
		this.dim2=dim2;
	}
	
	public void setdim2(double dim2){
		this.dim2=dim2;
	}
	
	public double getdim1() {
		return dim1;
	}

	public void setdim1(double dim1) {
		this.dim1 = dim1;
	}

	public double getdim2(){
		return dim2;
	}
	
	public double area(){
		return dim1*dim2;
	}

	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
	}

}
