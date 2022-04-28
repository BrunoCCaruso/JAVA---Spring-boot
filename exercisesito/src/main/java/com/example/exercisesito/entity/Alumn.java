package com.example.exercisesito.entity;

import javax.persistence.*;


@Entity
@Table(name = "alumno")
public class Alumn {

    @Id
    @Column(name = "alumno_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "alumno_nombre")
    private String nombre;

    @Column(name = "alumno_apellido")
    private String apellido;

    @Column(name = "alumno_nacimiento")
    private String nacimiento;

    @Column(name = "alumno_kyu")
    private String kyu;

    public Alumn() {
    }

    public Alumn(Integer id, String nombre, String apellido, String nacimiento, String kyu) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.kyu = kyu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getKyu() {
        return kyu;
    }

    public void setKyu(String kyu) {
        this.kyu = kyu;
    }
}
