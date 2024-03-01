
package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {

  @Id
  @GeneratedValue (strategy = GenerationType.SEQUENCE)
  private int num_cliente;
  private String nombre_perro;
  private String raza;
  private String color;
  private String alergico;
  private String especial;
  private String observaciones;
  @OneToOne
  private Duenio unDuenio;

  public Mascota() {
  }

  public Mascota(int num_cliente, String nombre_perro, String raza, String color, String alergico, String especial, String observaciones, Duenio unDuenio) {
    this.num_cliente = num_cliente;
    this.nombre_perro = nombre_perro;
    this.raza = raza;
    this.color = color;
    this.alergico = alergico;
    this.especial = especial;
    this.observaciones = observaciones;
    this.unDuenio = unDuenio;
  }

  public int getNum_cliente() {
    return num_cliente;
  }

  public void setNum_cliente(int num_cliente) {
    this.num_cliente = num_cliente;
  }

  public String getNombre_perro() {
    return nombre_perro;
  }

  public void setNombre_perro(String nombre_perro) {
    this.nombre_perro = nombre_perro;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getAlergico() {
    return alergico;
  }

  public void setAlergico(String alergico) {
    this.alergico = alergico;
  }

  public String getEspecial() {
    return especial;
  }

  public void setEspecial(String especial) {
    this.especial = especial;
  }

  public String getObservaciones() {
    return observaciones;
  }

  public void setObservaciones(String observaciones) {
    this.observaciones = observaciones;
  }

  public Duenio getUnDuenio() {
    return unDuenio;
  }

  public void setUnDuenio(Duenio unDuenio) {
    this.unDuenio = unDuenio;
  }

  


}