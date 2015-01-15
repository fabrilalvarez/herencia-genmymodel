package model;


/**
 * tipo de empleado, en este caso empleado Temporal.<div><br></div><div>subclase.</div>
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class EmpleadoTemporal extends Empleado
{

	/**
	 * override encontrar tipo de trabajador
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
        @Override
	public void encontrarTipoTrabajador() {
		// TODO implement me	
	}
	
	/**
	 * constructor empleado temporal
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public EmpleadoTemporal(String nombre,long sueldo) {
		super(nombre,sueldo);
		// TODO construct me	
	}
	
}

