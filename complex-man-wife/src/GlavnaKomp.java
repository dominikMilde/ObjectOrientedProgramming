public class GlavnaKomp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Komp(4.3, 3.1);
		Komp c = new Komp(3.111, 3.1112);
		c.ispisBroja();
		Komp c1 = new Komp();
		c1.ispisBroja();
		System.out.println(c1);
		System.out.println(c1.equals(c1));
	}
}

class Komp {
	double re;
	double im;
	
	Komp(double re, double im){ 	/*bez povratne vrijednosti, isti naziv kao klasa*/
		this.re = re;
		this.im = im;
	}
	Komp(){
		this(0.0, 0.0);
		//re = 0.; 				/*method overloading*/
		//im = 0.;
	}

	void ispisBroja() {
		if(im<0.) {
			System.out.println(re + "" + im + "j");
		}
		else {
			System.out.println(re + "+" + im + "j");
		}
	
	}
	@Override
	public String toString() {                //overajdamo metodu iz Object, vidljivost mora biti veća ili ista
		if(im<0.) {
			return(re + "" + im + "j");
		}
		else {
			return(re + "+" + im + "j");
		}
	}
	
	@Override
	public boolean equals(Object o) {        //overajdamo metodu equals
		if (o instanceof Komp) ;
			Komp other = (Komp) o;
		return Math.abs(re-other.re)<1e-15 && Math.abs(im-other.im)<1e-15;
	}
}
