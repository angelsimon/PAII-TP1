package com.example.tp1;

public class CalcLogica{
    private String operacion,n1, n2, resultado;

    public CalcLogica(){
        reset();
    }
    public void reset(){
        n1 = "0";
        n2 = "";
        operacion = "";
        resultado = "";
    }

    private String leadingZeros(String number){
        return number.replaceFirst("^0+(?!$)", "");
    }

    private String getResultado(){
        if (operacion == ""){
            return leadingZeros(n1);
        }
        else{
            if (n2.length() == 0)
                return leadingZeros(n1);
            else
                return leadingZeros(n2);

        }
    }

    private String calcular(){
        Double res = 0.0;
        switch(operacion){
            case "+":
                res = Double.parseDouble(n1) + Double.parseDouble(n2);
            break;
            case "-":
                res = Double.parseDouble(n1) - Double.parseDouble(n2);
            break;

        }
        reset();
        n1 = String.valueOf(res);
        return n1;
    }

    private void addNumber(String n){
        if (operacion == ""){
            /// N1
            n1 += n;
        }
        else {
            /// N2
            n2 += n;
        }
    }

    private void addOperacion(String n){
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
