public class practicaPlantas {
    private String nombreTienda, direccion ;
    private int numeroContacto ;

    public practicaPlantas(String nombreTienda, String direccion, int numeroContacto) {
        this.nombreTienda = nombreTienda;
        this.direccion = direccion;
        this.numeroContacto = numeroContacto;
    } 

    public String getNombreTienda() {
        return nombreTienda ;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumeroContacto() {
        return numeroContacto;
    }
    
    public void setNombreTienda(String nombreTienda){
        this.nombreTienda=nombreTienda;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
    
}

class Empleado {
    private String nombreEmpleado ;
    private int identificacion , contrasena ;

    public Empleado(String nombreEmpleado, int identificacion, int contrasena) {
        this.nombreEmpleado = nombreEmpleado;
        this.identificacion = identificacion;
        this.contrasena = contrasena;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

}

class RegistroPlantas {
    private String nombreComun , nombreCientifico , tipoPlanta , requerimientos , cuidadosEspecificos ;

    public RegistroPlantas(String nombreComun, String nombreCientifico, String tipoPlanta, String requerimientos,
            String cuidadosEspecificos) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.tipoPlanta = tipoPlanta;
        this.requerimientos = requerimientos;
        this.cuidadosEspecificos = cuidadosEspecificos;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getTipoPlanta() {
        return tipoPlanta;
    }

    public void setTipoPlanta(String tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
    }

    public String getRequerimientos() {
        return requerimientos;
    }

    public void setRequerimientos(String requerimientos) {
        this.requerimientos = requerimientos;
    }

    public String getCuidadosEspecificos() {
        return cuidadosEspecificos;
    }

    public void setCuidadosEspecificos(String cuidadosEspecificos) {
        this.cuidadosEspecificos = cuidadosEspecificos;
    }

}

class Seguimiento {
    private int fechaRiego , fechaAbonado ;
    private String trasplantes , eventosRelevantes ;

    public Seguimiento(int fechaRiego, int fechaAbonado, String trasplantes, String eventosRelevantes) {
        this.fechaRiego = fechaRiego;
        this.fechaAbonado = fechaAbonado;
        this.trasplantes = trasplantes;
        this.eventosRelevantes = eventosRelevantes;
    }

    public int getFechaRiego() {
        return fechaRiego;
    }

    public void setFechaRiego(int fechaRiego) {
        this.fechaRiego = fechaRiego;
    }

    public int getFechaAbonado() {
        return fechaAbonado;
    }

    public void setFechaAbonado(int fechaAbonado) {
        this.fechaAbonado = fechaAbonado;
    }

    public String getTrasplantes() {
        return trasplantes;
    }

    public void setTrasplantes(String trasplantes) {
        this.trasplantes = trasplantes;
    }

    public String getEventosRelevantes() {
        return eventosRelevantes;
    }

    public void setEventosRelevantes(String eventosRelevantes) {
        this.eventosRelevantes = eventosRelevantes;
    }

}

class RegistroClientes{
    private String nombre , contacto , identificacion , residencia , genero ;

    public RegistroClientes(String nombre, String contacto, String identificacion, String residencia, String genero) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.identificacion = identificacion;
        this.residencia = residencia;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}

class GestionCliente {
    private String historialCompras , preferencias , recordatorios ;

    public GestionCliente(String historialCompras, String preferencias, String recordatorios) {
        this.historialCompras = historialCompras;
        this.preferencias = preferencias;
        this.recordatorios = recordatorios;
    }

    public String getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(String historialCompras) {
        this.historialCompras = historialCompras;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public String getRecordatorios() {
        return recordatorios;
    }

    public void setRecordatorios(String recordatorios) {
        this.recordatorios = recordatorios;
    }

}

class Chat {
    private String solicitud , respuesta ;

    public Chat(String solicitud, String respuesta) {
        this.solicitud = solicitud;
        this.respuesta = respuesta;
    }

    public String getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

}

class Buscador {
    private String navegador , filtro ;

    public Buscador(String navegador, String filtro) {
        this.navegador = navegador;
        this.filtro = filtro;
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

}