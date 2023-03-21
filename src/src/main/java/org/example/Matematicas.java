package org.example;

public class Matematicas {

//consultar si el resultado es distinto de cero para determinar si el polinomio tiene ese término o no.

    public static int consultarTermino(Polinomio polinomio, int termino){
        int i = 0;
        int resultado = 0;
        while(i <= polinomio.getGrado() && resultado == 0){
            if(polinomio.getDato(i).getTermino() == termino){
                resultado = polinomio.getDato(i).getValor();
            }
            i++;
        }
        return resultado;
    }

    public static Polinomio suma(Polinomio polinomio1, Polinomio polinomio2){
        Polinomio polinomio = new Polinomio() {
            public int getGrado() {
                return 0;
            }

            public void setGrado(int grado) {

            }

            public datoPolinomio getDato(int i) {
                return null;
            }

            public void setDato(datoPolinomio dato, int i) {

            }

            public void insertar(datoPolinomio dato) {

            }

            public void eliminar(int i) {

            }

            public void mostrar() {

            }

            public Polinomio suma(Polinomio polinomio) {
                return null;
            }

            public Polinomio resta(Polinomio polinomio) {
                return null;
            }

            public Polinomio multiplicacion(Polinomio polinomio) {
                return null;
            }

            public Polinomio derivada() {
                return null;
            }

            public Polinomio integral() {
                return null;
            }

            public Polinomio clone() {
                return null;
            }

            public boolean equals(Polinomio polinomio) {
                return false;
            }

            public String toString() {
                return null;
            }
        };
        int i = 0;
        int j = 0;
        int k = 0;
        while(i <= polinomio1.getGrado() && j <= polinomio2.getGrado()){
            if(polinomio1.getDato(i).getTermino() == polinomio2.getDato(j).getTermino()){
                polinomio.insertar(polinomio1.getDato(i).suma(polinomio2.getDato(j)));
                i++;
                j++;
            }else if(polinomio1.getDato(i).getTermino() > polinomio2.getDato(j).getTermino()){
                polinomio.insertar(polinomio1.getDato(i));
                i++;
            }else{
                polinomio.insertar(polinomio2.getDato(j));
                j++;
            }
            k++;
        }
        while(i <= polinomio1.getGrado()){
            polinomio.insertar(polinomio1.getDato(i));
            i++;
            k++;
        }
        while(j <= polinomio2.getGrado()){
            polinomio.insertar(polinomio2.getDato(j));
            j++;
            k++;
        }
        polinomio.setGrado(k-1);
        return polinomio;
    }

    public static Polinomio resta(Polinomio polinomio1, Polinomio polinomio2){
        Polinomio polinomio = new Polinomio() {
            public int getGrado() {
                return 0;
            }

            public void setGrado(int grado) {

            }

            public datoPolinomio getDato(int i) {
                return null;
            }

            public void setDato(datoPolinomio dato, int i) {

            }

            public void insertar(datoPolinomio dato) {

            }

            public void eliminar(int i) {

            }

            public void mostrar() {

            }

            public Polinomio suma(Polinomio polinomio) {
                return null;
            }

            public Polinomio resta(Polinomio polinomio) {
                return null;
            }

            public Polinomio multiplicacion(Polinomio polinomio) {
                return null;
            }

            public Polinomio derivada() {
                return null;
            }

            public Polinomio integral() {
                return null;
            }

            public Polinomio clone() {
                return null;
            }

            public boolean equals(Polinomio polinomio) {
                return false;
            }

            public String toString() {
                return null;
            }
        };
        int i = 0;
        int j = 0;
        int k = 0;
        while(i <= polinomio1.getGrado() && j <= polinomio2.getGrado()){
            if(polinomio1.getDato(i).getTermino() == polinomio2.getDato(j).getTermino()){
                polinomio.insertar(polinomio1.getDato(i).suma(polinomio2.getDato(j)));
                i++;
                j++;
            }else if(polinomio1.getDato(i).getTermino() > polinomio2.getDato(j).getTermino()){
                polinomio.insertar(polinomio1.getDato(i));
                i++;
            }else{
                polinomio.insertar(polinomio2.getDato(j));
                j++;
            }
            k++;
        }
        while(i <= polinomio1.getGrado()){
            polinomio.insertar(polinomio1.getDato(i));
            i++;
            k++;
        }
        while(j <= polinomio2.getGrado()){
            polinomio.insertar(polinomio2.getDato(j));
            j++;
            k++;
        }
        polinomio.setGrado(k-1);
        return polinomio;
    }

    public static Polinomio multiplicacion(Polinomio polinomio1, Polinomio polinomio2){
        Polinomio polinomio = new Polinomio() {
            public int getGrado() {
                return 0;
            }

            public void setGrado(int grado) {

            }

            public datoPolinomio getDato(int i) {
                return null;
            }

            public void setDato(datoPolinomio dato, int i) {

            }

            public void insertar(datoPolinomio dato) {

            }

            public void eliminar(int i) {

            }

            public void mostrar() {

            }

            public Polinomio suma(Polinomio polinomio) {
                return null;
            }

            public Polinomio resta(Polinomio polinomio) {
                return null;
            }

            public Polinomio multiplicacion(Polinomio polinomio) {
                return null;
            }

            public Polinomio derivada() {
                return null;
            }

            public Polinomio integral() {
                return null;
            }

            public Polinomio clone() {
                return null;
            }

            public boolean equals(Polinomio polinomio) {
                return false;
            }

            public String toString() {
                return null;
            }
        };
        int i = 0;
        int j = 0;
        int k = 0;
        while(i <= polinomio1.getGrado() && j <= polinomio2.getGrado()){
            if(polinomio1.getDato(i).getTermino() == polinomio2.getDato(j).getTermino()){
                polinomio.insertar(polinomio1.getDato(i).suma(polinomio2.getDato(j)));
                i++;
                j++;
            }else if(polinomio1.getDato(i).getTermino() > polinomio2.getDato(j).getTermino()){
                polinomio.insertar(polinomio1.getDato(i));
                i++;
            }else{
                polinomio.insertar(polinomio2.getDato(j));
                j++;
            }
            k++;
        }
        while(i <= polinomio1.getGrado()){
            polinomio.insertar(polinomio1.getDato(i));
            i++;
            k++;
        }
        while(j <= polinomio2.getGrado()){
            polinomio.insertar(polinomio2.getDato(j));
            j++;
            k++;
        }
        polinomio.setGrado(k-1);
        return polinomio;
    }

    public static Polinomio division(Polinomio polinomio1, Polinomio polinomio2){
        Polinomio polinomio = new Polinomio() {
            public int getGrado() {
                return 0;
            }

            public void setGrado(int grado) {

            }

            public datoPolinomio getDato(int i) {
                return null;
            }

            public void setDato(datoPolinomio dato, int i) {

            }

            public void insertar(datoPolinomio dato) {

            }

            public void eliminar(int i) {

            }

            public void mostrar() {

            }

            public Polinomio suma(Polinomio polinomio) {
                return null;
            }

            public Polinomio resta(Polinomio polinomio) {
                return null;
            }

            public Polinomio multiplicacion(Polinomio polinomio) {
                return null;
            }

            public Polinomio derivada() {
                return null;
            }

            public Polinomio integral() {
                return null;
            }

            public Polinomio clone() {
                return null;
            }

            public boolean equals(Polinomio polinomio) {
                return false;
            }

            public String toString() {
                return null;
            }
        };
        int i = 0;
        int j = 0;
        int k = 0;
        while(i <= polinomio1.getGrado() && j <= polinomio2.getGrado()){
            if(polinomio1.getDato(i).getTermino() == polinomio2.getDato(j).getTermino()){
                polinomio.insertar(polinomio1.getDato(i).suma(polinomio2.getDato(j)));
                i++;
                j++;
            }else if(polinomio1.getDato(i).getTermino() > polinomio2.getDato(j).getTermino()){
                polinomio.insertar(polinomio1.getDato(i));
                i++;
            }else{
                polinomio.insertar(polinomio2.getDato(j));
                j++;
            }
            k++;
        }
        while(i <= polinomio1.getGrado()){
            polinomio.insertar(polinomio1.getDato(i));
            i++;
            k++;
        }
        while(j <= polinomio2.getGrado()){
            polinomio.insertar(polinomio2.getDato(j));
            j++;
            k++;
        }
        polinomio.setGrado(k-1);
        return polinomio;
    }

    public static Polinomio derivada(Polinomio polinomio){
        Polinomio polinomioDerivada = new Polinomio() {
            public int getGrado() {
                return 0;
            }

            public void setGrado(int grado) {

            }

            public datoPolinomio getDato(int i) {
                return null;
            }

            public void setDato(datoPolinomio dato, int i) {

            }

            public void insertar(datoPolinomio dato) {

            }

            public void eliminar(int i) {

            }

            public void mostrar() {

            }

            public Polinomio suma(Polinomio polinomio) {
                return null;
            }

            public Polinomio resta(Polinomio polinomio) {
                return null;
            }

            public Polinomio multiplicacion(Polinomio polinomio) {
                return null;
            }

            public Polinomio derivada() {
                return null;
            }

            public Polinomio integral() {
                return null;
            }

            public Polinomio clone() {
                return null;
            }

            public boolean equals(Polinomio polinomio) {
                return false;
            }

            public String toString() {
                return null;
            }
        };
        for(int i = 0; i <= polinomio.getGrado(); i++){
            polinomioDerivada.insertar(polinomio.getDato(i).derivada());
        }
        return polinomioDerivada;
    }

    public static Polinomio integral(Polinomio polinomio){
        Polinomio polinomioIntegral = new Polinomio() {
            public int getGrado() {
                return 0;
            }

            public void setGrado(int grado) {

            }

            public datoPolinomio getDato(int i) {
                return null;
            }

            public void setDato(datoPolinomio dato, int i) {

            }

            public void insertar(datoPolinomio dato) {

            }

            public void eliminar(int i) {

            }

            public void mostrar() {

            }

            public Polinomio suma(Polinomio polinomio) {
                return null;
            }

            public Polinomio resta(Polinomio polinomio) {
                return null;
            }

            public Polinomio multiplicacion(Polinomio polinomio) {
                return null;
            }

            public Polinomio derivada() {
                return null;
            }

            public Polinomio integral() {
                return null;
            }

            public Polinomio clone() {
                return null;
            }

            public boolean equals(Polinomio polinomio) {
                return false;
            }

            public String toString() {
                return null;
            }
        };
        for(int i = 0; i <= polinomio.getGrado(); i++){
            polinomioIntegral.insertar(polinomio.getDato(i).integral());
        }
        return polinomioIntegral;
    }

    public static Polinomio clone(Polinomio polinomio){
        Polinomio polinomioClon = new Polinomio() {
            public int getGrado() {
                return 0;
            }

            public void setGrado(int grado) {

            }

            public datoPolinomio getDato(int i) {
                return null;
            }

            public void setDato(datoPolinomio dato, int i) {

            }

            public void insertar(datoPolinomio dato) {

            }

            public void eliminar(int i) {

            }

            public void mostrar() {

            }

            public Polinomio suma(Polinomio polinomio) {
                return null;
            }

            public Polinomio resta(Polinomio polinomio) {
                return null;
            }

            public Polinomio multiplicacion(Polinomio polinomio) {
                return null;
            }

            public Polinomio derivada() {
                return null;
            }

            public Polinomio integral() {
                return null;
            }

            public Polinomio clone() {
                return null;
            }

            public boolean equals(Polinomio polinomio) {
                return false;
            }

            public String toString() {
                return null;
            }
        };
        for(int i = 0; i <= polinomio.getGrado(); i++){
            polinomioClon.insertar(polinomio.getDato(i));
        }
        return polinomioClon;
    }

    public static boolean equals(Polinomio polinomio1, Polinomio polinomio2){
        if(polinomio1.getGrado() != polinomio2.getGrado()){
            return false;
        }else{
            for(int i = 0; i <= polinomio1.getGrado(); i++){
                if(polinomio1.getDato(i).getCoeficiente() != polinomio2.getDato(i).getCoeficiente()){
                    return false;
                }
            }
            return true;
        }
    }

    public static String toString(Polinomio polinomio){
        String cadena = "";
        for(int i = 0; i <= polinomio.getGrado(); i++){
            cadena += polinomio.getDato(i).toString();
        }
        return cadena;
    }


    public static void main(String[] args) {
        


    }

}
