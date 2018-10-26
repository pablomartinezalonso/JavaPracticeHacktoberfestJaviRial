public class Satelite {

	// atributos
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;

	// Constructor con todos los parametros
	Satelite(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		if (d >= 0) {
			distancia_tierra = d;
		} else {
			distancia_tierra = 0d;
		}

	}

	// constructor sin parametros (por defecto)
	Satelite() {
		meridiano = paralelo = distancia_tierra = 0;
	}

	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		if (d >= 0) {
			distancia_tierra = d;
		} else {
			distancia_tierra = 0d;
		}
	}

	public void printPosicion() {
		System.out.println("El sat�lite se encuentra en el paralelo " + paralelo + "\n Meridiano " + meridiano
				+ "\n a una distancia de la tierra de " + distancia_tierra + " Kil�metros");

	}

//M�todo void variaAltura(double desplazamiento). Este m�todo acepta un par�metro que ser� positivo o
//negativo dependiendo de si el sat�lite tiene que alejarse o acercarse a La Tierra.
//M�todo boolean enOrbitaQ. Este m�todo devolver� false si el sat�lite est� en tierra y true en caso
//contrario.
//M�todo void variaPosicion(double variap, double variam). Este m�todo permite modificar los atributos de
//posici�n (meridiano y paralelo) mediante los par�metros variap y variam. Estos par�metros ser�n valores
//positivos o negativos relativos que har�n al sat�lite modificar su posici�n.

	public void variaAltura(double desplazamiento) {
		double aux = 0d;
		aux = distancia_tierra + desplazamiento;
		if(aux>0) {
		distancia_tierra += desplazamiento;
		}
	}
		public boolean enOrbita() {
			
			if (distancia_tierra>0) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public void variaPosicion(double variap, double variam) {
			meridiano+=variam;
			paralelo+=variap;
			
		}
}
