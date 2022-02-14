//import java.util.ArrayList;

public class MainAsoc {

	public static void main(String[] args) {
		Zena z = new Zena("Ivana");
		Muskarac m = new Muskarac("Mirko");
		// TODO Auto-generated method stub
		//z.suprug = m;
		//z.predstaviSe();
		Maticar.ozeni(m, z);
		z.predstaviSe();
	}

}

class Zena {
	String ime;
	Muskarac suprug;

	Zena(String ime) {
		this.ime = ime;   
	}
	void predstaviSe() {
		if (suprug == null) {  //atributi se nazivaju i varijable stanja
			System.out.println("Ja sam gospodjica " + ime);
		}
		else {
			System.out.println("Ja sam gospodja " + ime + ", a moj suprug je " + suprug.dajIme());
	 	}
		
	}
}

class Muskarac {
	String ime;
	Zena supruga; // 0..1
	// Zena supruga = new Zena[7] 0..7
	//List supruga = new ArrayList(); 0..n

	Muskarac(String ime) {
		this.ime = ime;
	}
	String dajIme() {
		return ime;
	}
}

class Maticar{
	static void ozeni(Muskarac sretnik, Zena sretnica) {
		if(sretnik.supruga == null && sretnica.suprug == null) {
			sretnik.supruga = sretnica;
			sretnica.suprug = sretnik;
		}
	}
}

//STATIC ZNAČI DA NE MORAMO instancirati OBJEKT tipa Matičar
// matičar je u dependency vezi sa oba, kratka veza, samo dok ih poveže