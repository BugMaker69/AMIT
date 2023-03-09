public class Complex{
	
	public double real,imag;
	
	Complex(){
		real=0;
		imag=0;
	}
	
	Complex(double real,double imag){
		this.real=real;
		this.imag=imag;
	}
	
	static Complex add(Complex c1,Complex c2){
		Complex r=new Complex();
		r.real=c1.real+c2.real;
		r.imag=c1.imag+c2.imag;
		return r;
	}
	
	static Complex subtract(Complex c1, Complex c2){
		Complex r=new Complex();
		r.real=c1.real-c2.real;
		r.imag=c1.imag-c2.imag;
		return r;
	}
	
	// void print(){
	// 	if(imag<0){
	// 		System.out.println(real +"-"+ imag+'i');
	// 	}
	// 	else if(imag==0){
	// 		System.out.println(real);
	// 	}
	// 	else if(imag==-1){
	// 		System.out.println(real +"-"+'i');
	// 	}
	// 	else if(imag==1){
	// 		System.out.println(real +"+"+'i');
	// 	}
	// 	else{
	// 		System.out.println(real +"+"+ imag+'i');
	// 	}
	// }
	


	static void print(Complex r){
		
		if(r.imag<0){
			System.out.println(r.real +""+ r.imag+'i');
		}
		else if(r.imag==0){
			System.out.println(r.real);
		}
		else if(r.imag==-1){
			System.out.println(r.real +""+'i');
		}
		else if(r.imag==1){
			System.out.println(r.real +"+"+'i');
		}
		else{
			System.out.println(r.real +"+"+ r.imag+'i');
		}
	}
	
	
}
