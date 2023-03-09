abstract class GeoShape{
	
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


class Rectangle extends GeoShape{
	
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


class Circle extends GeoShape{
	
	Circle(double dim1){
		super(dim1);
	}
	
	public double area(){
		return (Math.PI) * (getdim1()* getdim1());
	}
	
	
}


class Triangle extends GeoShape{
	
	private double dim2;
	
	Triangle(double dim1,double dim2){
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
		return 0.5*dim2*getdim1();
	}
	
}



public class Shape {
	
	static double sumArea(GeoShape s1,GeoShape s2,GeoShape s3){
		return s1.area()+s2.area()+s3.area();
	}
	
	public static void main(String[] args) {
		
		Rectangle r=new Rectangle(2,4);
		
		Triangle t=new Triangle(2,4);
		
		Circle c=new Circle(4);
		
		double s=sumArea(r,t,c);
		
		//double t =r.area();
		System.out.println(s);
	}
}