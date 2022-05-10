package ar.edu.unlam.pb2;

public class Contacto {

	private Boolean esCliente;
	private Boolean deseaSerLlamado;
	private String nombreYApellido;
	private String celular;
	private String email;
	private String direccion;
	private Integer codigoPostal;
	private String localidad;
	private Provincia provincia;
	private Llamada llamadasRecibidas[];
	private final Integer CANTIDAD_MAXIMA_DE_LLAMADAS;
	private Integer cantidadDeLlamadasRecibidas;

	public Contacto() {
		this.CANTIDAD_MAXIMA_DE_LLAMADAS = 100;
		this.cantidadDeLlamadasRecibidas = 0;
		this.esCliente = false;
		this.deseaSerLlamado = true;
	}

	public Contacto(String nombreYApellido, String celular, String email, String direccion, Integer codigoPostal,
			String localidad, Provincia provincia) {
		this.nombreYApellido = nombreYApellido;
		this.celular = celular;
		this.email = email;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.provincia = provincia;
		this.esCliente = false;
		this.deseaSerLlamado = true;
		this.CANTIDAD_MAXIMA_DE_LLAMADAS = 100;
		this.cantidadDeLlamadasRecibidas = 0;
		this.llamadasRecibidas = new Llamada[CANTIDAD_MAXIMA_DE_LLAMADAS];

	}

	public Boolean getEsCliente() {
		return esCliente;
	}

	public Boolean getDeseaSerLlamado() {
		return deseaSerLlamado;
	}

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public void setnombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

	public String getCelular() {
		return celular;
	}

	public void setcelular(String celular) {
		this.celular = celular;
	}

	public String getEMail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setdireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCodigoPostal() {
		return codigoPostal;
	}

	public void setcodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setlocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setprovincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public void llamar(Llamada nueva) {

		llamadasRecibidas[cantidadDeLlamadasRecibidas++] = nueva;
	}

	public Integer getCantidadDeLlamadasRecibidas() {
		return cantidadDeLlamadasRecibidas;
	}

	public static Boolean esUnEMailValido(String eMailIngresado) {
		if (eMailIngresado.contains("@") && eMailIngresado.contains(".")) {
			return true;
		} else {
			return false;
		}
	}
}
