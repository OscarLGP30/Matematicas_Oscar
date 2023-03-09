package org.example;

public interface Polinomio {

//almacena la estructura de datos polinomio que está compuesto de dos campos el grado del polinomio y un puntero que apunta al termino mayor del polinomio.

    public int getGrado();
    public void setGrado(int grado);
    public datoPolinomio getDato(int i);
    public void setDato(datoPolinomio dato, int i);
    public void insertar(datoPolinomio dato);
    public void eliminar(int i);
    public void mostrar();
    public Polinomio suma(Polinomio polinomio);
    public Polinomio resta(Polinomio polinomio);
    public Polinomio multiplicacion(Polinomio polinomio);
    public Polinomio derivada();
    public Polinomio integral();
    public Polinomio clone();
    public boolean equals(Polinomio polinomio);
    public String toString();














}
