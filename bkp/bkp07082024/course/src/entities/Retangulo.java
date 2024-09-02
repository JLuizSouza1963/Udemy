package entities;

public class Retangulo {

	public double base;
	public double altura;
	
	public double area () {
		return (base*altura);
	}
		
    public double perimetro () {
		return 2*(base+altura);    	
    }

    public double diagonal () {
		return  Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));    	
    }
	
}