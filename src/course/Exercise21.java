package course;

public class Exercise21 {

	public static void main(String[] args) {
		String texto = "1234 mar MBP  ";
		String txt = texto.toLowerCase();
		String txt1 = texto.toUpperCase();
		String txt2 = texto.trim();
		String s = "Márcio Barbosa Pimentel o bonitão";
		String[] vect = s.split(" ");
		
		System.out.println(texto +"-");
		System.out.println(txt +"-");
		System.out.println(txt1+"-");
		System.out.println(txt2+"-");
		System.out.println(vect[3]);
		System.out.println(vect[4]);
		System.out.println(vect[0]);
		
		
	}

}
