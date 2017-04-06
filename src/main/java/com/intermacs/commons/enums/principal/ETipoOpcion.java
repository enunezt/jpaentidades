/**
 * 
 */
package com.intermacs.commons.enums.principal;

/**
 * @author enunezt
 *
 */
public enum ETipoOpcion {
	
	/**
	 * vALORES DEBEN IR EN ORDEN
	 */
	
	VISTA ("VISTA",0),
	TRANSACCION("TRANSACCION",1),
	ACCION("ACCION",2),
	OTRO("OTRO",3);
	
    private final String name; // in meters
    private final int id; 
    ETipoOpcion(String name,int id) {
   
        this.name = name;
        this.id = id;
    }


	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}

}
