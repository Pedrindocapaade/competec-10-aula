public class Main
{
	public static void main(String[] args) {
		System.out.println(calcularBaskara(3,7,2));
		
	}
	
	public static float calcularImc(float altura,float peso){
		    float imc = peso / (altura*altura);
		    System.out.println("Seu imc é:"+imc);
		    return imc;
	}
	
	public static float calcularBaskara(float a,float b, float c){
	    float bask = (b*b)-4*(a*c);
	    System.out.println("O delta é igual a = "+ bask);
	    return bask;
	}
}
