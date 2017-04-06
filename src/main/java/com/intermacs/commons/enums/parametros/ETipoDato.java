package com.intermacs.commons.enums.parametros;


public enum ETipoDato  {
	
	/**
	 * Entidad base para la parte génrica
	 */
	EN ("ENTERO"),
	CA ("CADENA"),
	DO ("DOUBLE"),
	DA ("DATE")
	;//, OTRO(),....;

    private final String name; // in meters
    ETipoDato(String name) {
   
        this.name = name;
    }

	//@Override
	public String getName() {
		return this.name;
	}


}