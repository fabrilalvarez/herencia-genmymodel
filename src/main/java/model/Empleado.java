package model;

/**
 * empleado superclase
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */
public abstract class Empleado {

    /**
     * nombre del empleado
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private String nombre;

    /**
     * sueldo del empleado
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */
    private long sueldo;

    /**
     * constructor empleado
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */
    public Empleado(String nombre, long sueldo) {
        this.nombre=nombre;
        this.sueldo=sueldo;
        // TODO construct me	
    }

    /**
     * metodo de acceso
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */
    public String getNombre() {
        // TODO implement me
        return "";
    }

    /**
     * metodo de acceso
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */
    public void setNombre() {
        // TODO implement me	
    }

    /**
     * metodo de acceso
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */
    public long getSueldo() {
        // TODO implement me
        return 0L;
    }

    /**
     * metodo de acceso
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */
    public void setSueldo() {
        // TODO implement me	
    }

    /**
     * vemos todos los datos del empleado
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */
    public String visualizarDatos() {
        // TODO implement me
        return "";
    }

    /**
     * hacemos los calculos
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */
    public long caluclarSueldo() {
        // TODO implement me
        return 0L;
    }

    /**
     * encuentra el tipo de trabajador&nbsp;
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */
    public void encontrarTipoTrabajador() {
        // TODO implement me	
    }

}
