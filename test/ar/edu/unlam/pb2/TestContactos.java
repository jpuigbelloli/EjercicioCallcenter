package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestContactos {

	@Test
	public void queSePuedaConvertirUnStringAUnInteger() {

		int valorEsperado = 52;

		Integer enteroWrapper = Integer.parseInt("52");

		assertEquals(valorEsperado, (int) enteroWrapper);
	}

	@Test
	public void queSePuedaCrearUnContacto() {
		// Preparacion
		Contacto nuevo;
		final Boolean ES_CLIENTE = false;
		final Boolean DESEA_SER_LLAMADO = true;

		// Ejecucion
		nuevo = new Contacto();

		// Validacion
		assertNotNull(nuevo);
		assertFalse(nuevo.getEsCliente());
		assertEquals(DESEA_SER_LLAMADO, nuevo.getDeseaSerLlamado());
	}

	@Test
	public void queLosDatosDelContactoSeGuardenCorrectamente() {
		// Preparacion
		Contacto nuevo;
		final String NOMBRE_Y_APELLIDO_ESPERADO = "Enzo Fernandez";
		final String CELULAR_ESPERADO = "+5491163598231";
		final String E_MAIL_ESPEPERADO = "enzoFernandez08@carp.com.ar";
		final String DIRECCION_ESPERADA = "Udaondo y Lugones";
		final Integer CODIGO_POSTAL_ESPERADO = 1001;
		final String LOCALIDAD_ESPERADA = "CABA";
		final Provincia PROVINCIA_ESPERADA = Provincia.CABA;
		final Boolean ES_CLIENTE = false;
		final Boolean DESEA_SER_LLAMADO = true;

		// Ejecucion
		nuevo = new Contacto(NOMBRE_Y_APELLIDO_ESPERADO, CELULAR_ESPERADO, E_MAIL_ESPEPERADO, DIRECCION_ESPERADA,
				CODIGO_POSTAL_ESPERADO, LOCALIDAD_ESPERADA, PROVINCIA_ESPERADA);

		// Validacion
		assertNotNull(nuevo);
		assertEquals(NOMBRE_Y_APELLIDO_ESPERADO, nuevo.getNombreYApellido());
		assertEquals(CELULAR_ESPERADO, nuevo.getCelular());
		assertEquals(E_MAIL_ESPEPERADO, nuevo.getEMail());
		assertEquals(DIRECCION_ESPERADA, nuevo.getDireccion());
		assertEquals(CODIGO_POSTAL_ESPERADO, nuevo.getCodigoPostal());
		assertEquals(LOCALIDAD_ESPERADA, nuevo.getLocalidad());
		assertEquals(PROVINCIA_ESPERADA, nuevo.getProvincia());
		assertFalse(nuevo.getEsCliente());
		assertTrue(nuevo.getDeseaSerLlamado());
	}

	/*
	 * queElNombreYApellidoSeaAlfanumerico 
	 * queElCelularTengaCodigoDePaisYDeArea
	 */

	@Test
	public void queSeValideCorrectamenteUnEMailSinArroba() {
		// preparacion
		Contacto nuevo;
		final String EMAIL_INCORRECTO = "enzofernandez08carp.com.ar";

		// Ejecucion
		nuevo = new Contacto();

		// Validacion
		assertFalse(nuevo.esUnEMailValido(EMAIL_INCORRECTO));
	}

	@Test
	public void queSeValideCorrectamenteUnEMailSinPunto() {
		// preparacion
		final String EMAIL_INCORRECTO = "enzofernandez08@carpcomar";
		final Boolean RESULTADO_ESPERADO;

		RESULTADO_ESPERADO = Contacto.esUnEMailValido(EMAIL_INCORRECTO);

		// Validacion
		assertFalse(RESULTADO_ESPERADO);
	}

	/*
	 * queLaDireccionSeaAlfanumerica queElCodigoPostalSeaNumerico
	 * queLaLocalidadSeaAlfanumerico queProvinciaContenga23
	 * queClienteSeInicieEnFalse queDeseaSerLlamadoNuevamenteSeaTrue
	 */

	@Test
	public void queSePuedaLlamarAUnContacto() {
		// preparacion
		Contacto nuevo;
		Llamada nueva;
		final String NOMBRE_Y_APELLIDO_ESPERADO = "Enzo Fernandez";
		final String CELULAR_ESPERADO = "+5491163598231";
		final String E_MAIL_ESPEPERADO = "enzoFernandez08@carp.com.ar";
		final String DIRECCION_ESPERADA = "Udaondo y Lugones";
		final Integer CODIGO_POSTAL_ESPERADO = 1001;
		final String LOCALIDAD_ESPERADA = "CABA";
		final Provincia PROVINCIA_ESPERADA = Provincia.CABA;
		final Boolean RESULTADO_DE_LA_LLAMADA_ESPERADA = true;
		final String OBSERVACIONES_ESPERADAS = "Se realido la venta";
		final Integer CANTIDAD_DE_LLAMADAS_RECIBIDAS_ESPERADAS = 1;

		// Ejecucion
		nuevo = new Contacto(NOMBRE_Y_APELLIDO_ESPERADO, CELULAR_ESPERADO, E_MAIL_ESPEPERADO, DIRECCION_ESPERADA,
				CODIGO_POSTAL_ESPERADO, LOCALIDAD_ESPERADA, PROVINCIA_ESPERADA);
		nueva = new Llamada(RESULTADO_DE_LA_LLAMADA_ESPERADA, OBSERVACIONES_ESPERADAS);

		nuevo.llamar(nueva);

		// Validacion
		assertEquals(CANTIDAD_DE_LLAMADAS_RECIBIDAS_ESPERADAS, nuevo.getCantidadDeLlamadasRecibidas());

	}

	/*
	 * queSePuedaBuscarAlCandidato queSeMuestreEnPantallaLosDatosDelCandidato
	 * queParaLlamarElContactoNoSeaCliente queParaLlamarElContactoDeseaSerLlamado
	 * queElCodigoPostalDebeExistirEnLaZonaDeCobertura
	 * queLaLlamadaExitosaElContactoSeTransformeACliente
	 * queLaLlamadaExitosaElContactoNoSePuedaVolverALlamar
	 * queSiElContactoNoDeseaSerLlamadoSePuedaIntentarEnUnFuturo
	 * queSiElContactoNoDeseaSerLlamadoElOPeradorPuedaAnotarUnaObservacion
	 */

}
