public class Circle implements GeoShape {
    private double dim1;
	Circle(double dim1){
		this.dim1=dim1;
	}
	
	public double area(){
		return (Math.PI) * (dim1* dim1);
	}

	public double getdim1() {
		return dim1;
	}

	public void setdim1(double dim1) {
		this.dim1 = dim1;
	}

	@Override
	public void draw() {
		System.out.println("Draw Circle");
	}

}
