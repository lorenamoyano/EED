/**
        * Nombre: Numero Complejo.
        *
        * @author Lorena Moyano Montes
        * @version 29.05.2019
        */

public class NumComplejo {
	private double pReal;
	private double pImaginaria;

	 /**
     * Constructor vacio
     *
     *
     */
	public NumComplejo(){

	}
	/**
     * Constructor.
     * @param pReal: parte real del numero.
     * @param pImaginaria: parte imaginaria del numero.
	 */

	public NumComplejo(double pReal, double pImaginaria){
		this.pReal=pReal;
		this.pImaginaria=pImaginaria;
	}
	
	/**
     * Getter.
     * @return parte real del numero.
     */

	public double getpReal() {
		return pReal;
	}
	
	/**Setter.
	 * @param parte real del numero para actualizarlo.
	 */

	public void setpReal(double pReal) {
		this.pReal = pReal;
	}
	
	/**
     * Getter.
     * @return parte imaginaria del numero.
     */

	public double getpImaginaria() {
		return pImaginaria;
	}
	
	/**Setter.
	 * @param parte imaginaria del numero para actualizarlo.
	 */

	public void setpImaginaria(double pImaginaria) {
		this.pImaginaria = pImaginaria;
	}

	/**
	 * Crea un objeto y suma las partes reales e imaginarias
	 * actualizando los resultados.
	 * @return la suma de cada una de las partes
	 */
	
	public static NumComplejo sumarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		result.setpReal(c1.getpReal()+c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()+c2.getpImaginaria());

		return result;
	}
	
	/**
	 * Crea un objeto y resta las partes reales e imaginarias
	 * actualizando los resultados.
	 * @return la resta de ambas partes
	 */

	
	public static NumComplejo restarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		result.setpReal(c1.getpReal()-c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()-c2.getpImaginaria());

		return result;
	}
	
	/**
	 * Crea un objeto y multiplica los numeros
	 * en primer para saber la parte real se resta el producto
	 * de las dos partes reales y las dos partes imaginarias
	 * A continuacion, para la parte imaginaria, se suman los
	 * productos de la parte real del primer numero
	 * y la parte imaginaria del segundo
	 * e igual con el otro numero.
	 * Después de eso se actualizan los resultados y devolvemos el producto
	 * @return el resultado que se encuentra en el objeto creado
	 */

	
	public static NumComplejo multiplicarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		double a=c1.getpReal();
		double b=c1.getpImaginaria();
		double c=c2.getpReal();
		double d=c2.getpImaginaria();

		result.setpReal((a*c)-(b*d));
		result.setpImaginaria((a*d)+(b*c));

		return result;
	}

	/**
	 * Crea un objeto y divide los numeros
	 * en primer para saber el dividendo de la parte real
	 * se suma el producto.
	 * Para el dividendo de la parte imaginaria se resta
	 * el producto de la parte imaginaria del primer numero
	 * con la parte real del segundo numero
	 * y la parte real del primero con la imaginaria del segundo.
	 * Para el divisor, hacemos la suma de la potencia de la parte
	 * real del segundo numero y la imaginaria del segundo.
	 * Por último, la division es el dividendo de la parte real entre
	 * el divisor para la parte real
	 * y el dividendo imaginario entre el divisor para la imaginaria.
	 * Después de eso se actualizan los resultados
	 * @return el resultado que se encuentra en el objeto creado
	 */
	public  static NumComplejo dividirComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		double a=c1.getpReal();
		double b=c1.getpImaginaria();
		double c=c2.getpReal();
		double d=c2.getpImaginaria();

		double dividendoReal = (a*c)+(b*d);
		double dividendoImaginario = (b*c)-(a*d);
		double divisor = (Math.pow(c, 2)+Math.pow(d, 2));

		result.setpReal(dividendoReal/divisor);
		result.setpImaginaria(dividendoImaginario/divisor);

		return result;
	}
	
	
	/**para saber el resto primero cogemos las partes
	 * real e imaginaria y se guardan en una variable
	 * @return la raiz cuadrada de la potencia al cuadrado
	 * de la parte real mas la parte imaginaria.
	 */
	public static double modulo (NumComplejo numComplejo){
		double real =  numComplejo.getpReal();
		double imaginaria = numComplejo.getpImaginaria();

		return Math.sqrt(Math.pow(real, 2)+Math.pow(imaginaria, 2));
	}
	
	/**
	 * Metodo toString para mostrar el resultado
	 * como queramos que salga en pantalla
	 */

	@Override
	public String toString(){
		
		String mostrar="";
		if (pReal!=0){
			mostrar+=pReal;
		}
		if (pImaginaria>=0){
			mostrar=mostrar+"+"+pImaginaria+"i";
		}else {
			mostrar=mostrar+"-"+(pImaginaria*(-1))+"i";
		}
		return mostrar;
	}
}
