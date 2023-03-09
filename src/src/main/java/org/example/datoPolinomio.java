package org.example;

public class datoPolinomio {

    //almacena el valor y el término de dicho valor –es decir si es xn, xn-1,…, x0–

    private int valor;
    private int termino;

    public datoPolinomio(int valor, int termino){
        this.valor = valor;
        this.termino = termino;
    }

    public int getValor(){
        return valor;
    }

    public int getTermino(){
        return termino;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public void setTermino(int termino){
        this.termino = termino;
    }

    public String toString(){
        return valor + "x^" + termino;
    }

    public boolean equals(datoPolinomio dato){
        return (this.valor == dato.valor && this.termino == dato.termino);
    }

    public datoPolinomio clone(){
        return new datoPolinomio(this.valor, this.termino);
    }

    public int compareTo(datoPolinomio dato){
        if(this.termino > dato.termino){
            return 1;
        }else if(this.termino < dato.termino){
            return -1;
        }else{
            return 0;
        }
    }

    public datoPolinomio suma(datoPolinomio dato){
        if(this.termino == dato.termino){
            return new datoPolinomio(this.valor + dato.valor, this.termino);
        }else{
            return null;
        }
    }

    public datoPolinomio resta(datoPolinomio dato){
        if(this.termino == dato.termino){
            return new datoPolinomio(this.valor - dato.valor, this.termino);
        }else{
            return null;
        }
    }

    public datoPolinomio multiplicacion(datoPolinomio dato){
        return new datoPolinomio(this.valor * dato.valor, this.termino + dato.termino);
    }

    public datoPolinomio derivada(){
        return new datoPolinomio(this.valor * this.termino, this.termino - 1);
    }

    public datoPolinomio integral(){
        return new datoPolinomio(this.valor / (this.termino + 1), this.termino + 1);
    }


    public boolean getCoeficiente() {

        return false;
    }
}
