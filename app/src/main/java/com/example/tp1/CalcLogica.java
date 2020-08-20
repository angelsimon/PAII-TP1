package com.example.tp1;

import java.text.DecimalFormat;

public class CalcLogica{

    public enum Estado{
        Inicio,
        Operando1,
        Operacion,
        Operando2,
        Error
    }

    private String operacion,n1, n2;
    private Estado estado;

    public CalcLogica(){
        reset();
    }

    public void reset(){
        n1 = "0";
        n2 = "";
        operacion = "";
        this.estado = Estado.Inicio;
    }

    private String getNumber(String number){
        Double a = 0.0;
        long b = 0;
        number = leadingZeros(number);
        a = Double.parseDouble(number);
        b = a.longValue();

        if(a - b != 0){
            DecimalFormat df = new DecimalFormat("###.#####");
            number = df.format(a);
        }
        else{
            number = String.valueOf(b);
        }
        return number;
    }

    private String leadingZeros(String number){
        return number.replaceFirst("^0+(?!$)", "");
    }

    private String getResultado(){
        if (operacion == ""){
            return getNumber(n1);
        }
        else{
            if (n2.length() == 0)
                return getNumber(n1);
            else
                return getNumber(n2);

        }
    }

    private String calcular(){
        Double res = 0.0;
        if(this.estado != Estado.Operando2){
            return getNumber(n1);
        }
        switch(operacion){
            case "+":
                res = Double.parseDouble(n1) + Double.parseDouble(n2);
            break;
            case "-":
                res = Double.parseDouble(n1) - Double.parseDouble(n2);
             break;
            case "/":
                if(n2 == "0"){
                    this.estado = Estado.Error;
                }
                else {
                    res = Double.parseDouble(n1) / Double.parseDouble(n2);
                }
            break;
            default:
                res = Double.parseDouble(n1) * Double.parseDouble(n2);
            break;
        }
        reset();
        n1 = String.valueOf(res);
        n2 = "";
        this.estado = Estado.Operacion;
        return getNumber(n1);
    }

    private void addNumber(String n){
        if (operacion == ""){
            /// N1
            n1 += n;
            this.estado = Estado.Operando1;
        }
        else {
            /// N2
            n2 += n;
            this.estado = Estado.Operando2;
        }
    }

    private void addOperacion(String n){
        if(this.estado == Estado.Operando2){
            calcular();
        }

        operacion = n;
    }


    public String input(String s){
        String r = "";
        switch(s){
            case "+":
            case "-":
            case "/":
            case "*":
                addOperacion(s);
                r = getResultado();
            break;
            case "=":
                r = calcular();
            break;
            case "C":
                reset();
                r = "0";
                break;
            default:
                addNumber(s);
                r = getResultado();
            break;
        }
        return r;
    }

}
