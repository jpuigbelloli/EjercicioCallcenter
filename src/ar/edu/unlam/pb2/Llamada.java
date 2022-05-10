package ar.edu.unlam.pb2;

public class Llamada {

	private boolean fueExitosa;
	private String observaciones;

	public Llamada(boolean fueExitosa, String observaciones) {
		this.fueExitosa = fueExitosa;
		this.observaciones = observaciones;
	}

	public boolean isFueExitosa() {
		return fueExitosa;
	}

	public void setFueExitosa(boolean fueExitosa) {
		this.fueExitosa = fueExitosa;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
