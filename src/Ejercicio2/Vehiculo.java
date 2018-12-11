package Ejercicio2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yo
 */
public class Vehiculo {
    private String matricula, marca, modelo, descripcion, propietario;
    private float presupuesto;
    private int telefono;
        
    Vehiculo(String matricula, String marca, String modelo, String descripcion, String propietario, float presupuesto, int telefono){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.propietario = propietario;
        this.presupuesto = presupuesto;
        this.telefono = telefono;
        }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public float totalACobrar(){    
        float total = (this.presupuesto*21/100)+this.presupuesto;
        return total;
    }
    
    public String toString(){
    return ("Matricula: " +this.matricula+"  Marca: " +this.marca +"  Modelo: " +this.modelo
            +"  Descripcion: " +this.descripcion + " Propetario: " +this.propietario 
            +" Presupuesto: " +this.presupuesto +" Teléfono: " +this.telefono);
    }
}
