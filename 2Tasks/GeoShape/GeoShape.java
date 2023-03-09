public abstract class GeoShape{
    
	private double dim1;
	
	GeoShape(double dim1){
		this.dim1=dim1;
	}
	
	public void setdim1(double dim1){
		this.dim1=dim1;
	}
	
	public double getdim1(){
		return dim1;
	}
	
	public abstract double area();

}