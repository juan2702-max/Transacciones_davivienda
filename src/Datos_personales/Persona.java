package Datos_personales;

public class Persona {
    
    private int identificacion;
    private String tipo_identificacion;
    private String nombre;
    private String apellido;
    private String correo = "";
    private String numero_telefono = "";
    private String numero_cuenta = "";
    private String id_banco = "";
    private String tipo_cuenta = "";

    public Persona(int identificacion, String tipo_identificacion, String nombre, String apellido, String numero_cuenta, String id_banco, String tipo_cuenta){
        this.identificacion = identificacion;
        this.tipo_identificacion = tipo_identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_cuenta = numero_cuenta;
        this.id_banco = id_banco;
        this.tipo_cuenta = tipo_cuenta;
    }

    // Metoso set
    public void set_banco(String id_banco, String id_cuenta, String tipo){
        this.id_banco = id_banco;
        this.numero_cuenta = id_cuenta;
        this.tipo_cuenta = tipo;
    }
    public void set_id_banco(String id){
        id_banco = id;
    }
    public void set_tipo_cuenta(String tipo){
        tipo_cuenta = tipo;
    }
    public void set_numero_cuenta(String numero_cuenta){
        this.numero_cuenta = numero_cuenta;
    }
    public void set_identificacion(int id){
        identificacion = id;
    }

    public void set_nombre(String nombre){
        this.nombre = nombre;
    }

    public void set_apellido(String apellido){
        this.apellido = apellido;
    }

    public void set_correo(String correo){
        this.correo = correo;
    }

    public void set_numero_telefono(String numero){
        this.numero_telefono = numero;
    }

    public void set_tipo_identificacion(String tipo){
        tipo_identificacion = tipo;
    }

    // Metodos get
    public String get_id_banco(){
        return id_banco;
    }

    public String get_tipo_cuenta(){
        return tipo_cuenta;
    }

    public String get_numero_cuenta(){
        return numero_cuenta;
    }
    public int get_identificacion(){
        return identificacion;
    }

    public String get_nombre(){
        return nombre;
    }

    public String get_apellido(){
        return apellido;
    }

    public String get_tipo_identificacion(){
        return tipo_identificacion;
    }

    public String get_correo(){
        return correo;
    }

    public String get_numero_telefono(){
        return numero_telefono;
    }
}
