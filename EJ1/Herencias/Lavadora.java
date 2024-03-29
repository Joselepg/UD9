package Herencias;

import java.text.DecimalFormat;

/**
 * Clase para crear lavadoras
 * 
 * @author Joel, Marius, Jose Luis
 *
 */

public class Lavadora extends Clases.Electrodomestico {
	// M�todos
	private final double CARGA = 5;
	private final DecimalFormat DF = Clases.Electrodomestico.DF;

	private double carga;

	// Constructores
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.color = COLOR;
		this.consEnergetico = CONSENERGETICO;
		this.carga = CARGA;
	}

	public Lavadora(double precioBase, String color, char consEnergetico, double peso, double carga) {
		super(precioBase, color, consEnergetico, peso);
		this.carga = carga;
	}

	// M�todos

	// Extiendo el m�todo de las clase padre, y le a�ado la condici�n de
	// si la carga es mayor a 30, al precio se le suman 50
	public double precioFinal() {
		super.precioFinal();
		if (carga > 30) {
			precioBase += 50;
		}

		return precioBase;
	}

	@Override
	public String toString() {
		return "Lavadora [PRECIO BASE=" + DF.format(precioBase) + "�" + ", COLOR=" + color + ", CONSUMO ENERG�TICO="
				+ consEnergetico + ", PESO=" + peso + "kg" + ", CARGA=" + carga + "]";
	}

	// Getters y setters
	public double getCARGA() {
		return carga;
	}
}