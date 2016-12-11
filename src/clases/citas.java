
package clases;

/**
 *
 * @author usuario
 */
public class citas {
    int id_citas;
    String fecha;
    String hora;
    pacientes cedula;
    pacientes paciente;
    especialidades especialidad;
    medicos medico;
    int precio;

    public citas(int id_citas, String fecha, String hora, pacientes cedula, pacientes paciente, especialidades especialidad, medicos medico, int precio) {
        this.id_citas = id_citas;
        this.fecha = fecha;
        this.hora = hora;
        this.cedula = cedula;
        this.paciente = paciente;
        this.especialidad = especialidad;
        this.medico = medico;
        this.precio = precio;
    }

    public int getId_citas() {
        return id_citas;
    }

    public void setId_citas(int id_citas) {
        this.id_citas = id_citas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public pacientes getCedula() {
        return cedula;
    }

    public void setCedula(pacientes cedula) {
        this.cedula = cedula;
    }

    public pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(pacientes paciente) {
        this.paciente = paciente;
    }

    public especialidades getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(especialidades especialidad) {
        this.especialidad = especialidad;
    }

    public medicos getMedico() {
        return medico;
    }

    public void setMedico(medicos medico) {
        this.medico = medico;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "citas{" + "id_citas=" + id_citas + ", fecha=" + fecha + ", hora=" + hora + ", cedula=" + cedula + ", paciente=" + paciente + ", especialidad=" + especialidad + ", medico=" + medico + ", precio=" + precio + '}';
    }
    
}