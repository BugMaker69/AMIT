public class comp {
    	
	public double real,imag;
	
	comp(){
		real=0;
		imag=0;
	}
	
	comp(double real,double imag){
		this.real=real;
		this.imag=imag;
	}
	
	static comp add(comp c1,comp c2){
		comp r=new comp();
		r.real=c1.real+c2.real;
		r.imag=c1.imag+c2.imag;
		return r;
	}
	
	static comp subtract(comp c1, comp c2){
		comp r=new comp();
		r.real=c1.real-c2.real;
		r.imag=c1.imag-c2.imag;
		return r;
	}
	
	void print(comp r){
		
		if(r.imag<0){
			System.out.println(r.real +"-"+ r.imag+'i');
		}
		else if(r.imag==0){
			System.out.println(r.real);
		}
		else{
			System.out.println(r.real +"+"+ r.imag+'i');
		}
	}
	
}
