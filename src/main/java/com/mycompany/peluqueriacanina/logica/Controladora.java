
package com.mycompany.peluqueriacanina.logica;

import static com.mycompany.peluqueriacanina.logica.Mascota_.num_cliente;
import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
  
    ControladoraPersistencia controlPersis = new ControladoraPersistencia ();

    public void guardar(String nombreMasco, String raza, String color, String alergico, 
            String especial, String nomDuenio, String celDuenio, String observaciones) {
        
        // creamos el dueño y asignamos sus valores
        Duenio duenio = new Duenio();
            duenio.setNombre(nomDuenio);
            duenio.setCelular(celDuenio);
        
        // cramos la mascota
        Mascota masco = new Mascota();
            masco.setNombre_perro(nombreMasco);
            masco.setRaza(raza);
            masco.setColor(color);
            masco.setAlergico(alergico);
            masco.setEspecial(especial);
            masco.setObservaciones(observaciones);
            masco.setUnDuenio(duenio);
            
            controlPersis.guardar(duenio,masco);
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color, 
            String alergico, String especial, String observaciones, String nomDuenio, String celDuenio) {
        masco.setNombre_perro(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setEspecial(especial);
        masco.setObservaciones(observaciones);
        
        //modificar la mascota
        controlPersis.modificarMascota(masco);
        
        //seteo nuevos valores del dueño
        Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        dueno.setCelular(celDuenio);
        dueno.setNombre(nomDuenio);
        
        //Llamar al modificar dueño
        this.modificarDuenio(dueno);
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }

}
