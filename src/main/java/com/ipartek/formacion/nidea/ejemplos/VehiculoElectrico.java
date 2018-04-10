package com.ipartek.formacion.nidea.ejemplos;

public class VehiculoElectrico extends Vehiculo {

	private float potencia;// kW

	public VehiculoElectrico() {
		super();
		this.potencia = 0;
		// TODO Auto-generated constructor stub
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	@Override
	public void arrancar() {
		System.out.println("pulsar boton encendido");
	}

	public VehiculoElectrico(float potencia) {
		this();// cambiar super por this()
		this.potencia = potencia;
	}

	public void encenderLuces() {
		System.out.println("Encedemos luces");
	}

	@Override
	public String toString() {
		return super.toString() + "VehiculoElectrico [potencia=" + potencia + "]";
	}

}
