/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ncr.dominio;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author natal
 */
@Named
@RequestScoped
public class perfil {
    private String nombre;
    private String carrera;
    private String foto;
    private String foto1;
    private String lenguajes;
    private String baseDeDatos;
    private String proyectos;
    private String promedio;
    private String escuela;
    private String certificaciones;
    private String edad;
    private String correo;
    private String telefono;
    private String icono;
    private String icono1;
    private String icono2;
    private String icono3;
    private String icono4;

    public perfil() {
        nombre = "Natalia Corona Rosillo";
        carrera = "Carrera: Ing. en Tecnologías de la información y comunicaciones";
        foto = "foto.jpeg";
        lenguajes = "HTML y Java";
        baseDeDatos = "Base de datos: MYSQL";
        proyectos = "PAN: Página web para recetas de postres, "
                + "Página web para ventas y"
                + " Carrito seguidor";
        promedio = "Promedio: 9.2";
        escuela = "Instituto Tecnológico Superior de Salvatierra";
        certificaciones = "Soporte TI Y Técnico de redes IP"; 
        edad = "21 años ";
        correo = "natalicoronarosillo@gmail.com";
        telefono = "466-112-29-32";
        icono = "escuela.png";
        icono1 = "lenguaje.png";
        icono2 = "bases.png";
        icono3 = "proyecto.jpg";
        icono4 = "certificacion.jpg";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFoto1() {
        return foto1;
    }

    public void setFoto1(String foto1) {
        this.foto1 = foto1;
    }

    public String getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String lenguajes) {
        this.lenguajes = lenguajes;
    }

    public String getBaseDeDatos() {
        return baseDeDatos;
    }

    public void setBaseDeDatos(String baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }

    public String getProyectos() {
        return proyectos;
    }

    public void setProyectos(String proyectos) {
        this.proyectos = proyectos;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getIcono1() {
        return icono1;
    }

    public void setIcono1(String icono1) {
        this.icono1 = icono1;
    }

    public String getIcono2() {
        return icono2;
    }

    public void setIcono2(String icono2) {
        this.icono2 = icono2;
    }

    public String getIcono3() {
        return icono3;
    }

    public void setIcono3(String icono3) {
        this.icono3 = icono3;
    }

    public String getIcono4() {
        return icono4;
    }

    public void setIcono4(String icono4) {
        this.icono4 = icono4;
    }
    
    
}
