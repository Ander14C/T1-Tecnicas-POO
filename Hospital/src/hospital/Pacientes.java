package hospital;

import java.time.LocalDate;

public class Pacientes {
    private String tipo_documento;
    private String nro_documento;
    private String nombre;
    private String ape_paterno;
    private String ape_materno;
    private LocalDate fecha_nacimiento;
    private String tipo_sangre;
    private String alergias;
    private String telefono;
    private String correo;

    public Pacientes() {
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(String nro_documento) throws Exception {
        if (this.tipo_documento == null || this.tipo_documento.trim().isEmpty()) {
            throw new Exception("Debe seleccionar primero un tipo de documento.");
        }
        
        if (this.tipo_documento.equalsIgnoreCase("DNI")) {
            if (nro_documento.length() != 8 || !nro_documento.matches("\\d+")) {
                throw new Exception("El DNI debe contener exactamente 8 dígitos numéricos.");
            }
        } else if (this.tipo_documento.equalsIgnoreCase("C.E")) {
            if (nro_documento.length() != 10) {
                throw new Exception("El C.E debe contener exactamente 10 caracteres.");
            }
        }
        this.nro_documento = nro_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public String getApe_paterno() {
        return ape_paterno;
    }

    public void setApe_paterno(String ape_paterno) throws Exception {
        if (ape_paterno == null || ape_paterno.trim().isEmpty()) {
            throw new Exception("El apellido paterno no puede estar vacío.");
        }
        this.ape_paterno = ape_paterno;
    }

    public String getApe_materno() {
        return ape_materno;
    }

    public void setApe_materno(String ape_materno) throws Exception {
        if (ape_materno == null || ape_materno.trim().isEmpty()) {
            throw new Exception("El apellido materno no puede estar vacío.");
        }
        this.ape_materno = ape_materno;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) throws Exception {
        if (tipo_sangre == null || tipo_sangre.trim().isEmpty()) {
            throw new Exception("El tipo de sangre es un dato médico obligatorio.");
        }
        this.tipo_sangre = tipo_sangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) throws Exception {
        if (alergias == null || alergias.trim().isEmpty()) {
            throw new Exception("El campo alergias es obligatorio (Si no tiene, escriba 'Ninguna').");
        }
        this.alergias = alergias;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) throws Exception {
        if (correo != null && !correo.trim().isEmpty()) {
            if (!correo.contains("@") || !correo.endsWith(".com")) {
                throw new Exception("El correo debe incluir '@' y terminar en '.com'.");
            }
        }
        this.correo = correo;
    }

    public void VerDatos() {
        System.out.println("-------------------------------------------");
        System.out.println(" TIPODOC: "+ this.tipo_documento +
                " NRODOC: "+ this.nro_documento +
                " NOMBRE: "+ this.nombre +
                " PATERNO "+ this.ape_paterno +
                " MATERNO: "+this.ape_materno +
                " FECHA DE NACIMIENTO: "+ this.fecha_nacimiento+ 
                " T. SANGRE: "+ this.tipo_sangre+
                " ALERGIAS: "+ this.alergias+ 
                " TELEFONO: "+ this.telefono+
                " CORREO: "+ this.correo);
    }
}