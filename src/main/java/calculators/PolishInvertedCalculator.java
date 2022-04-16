package calculators;

import TDAs.Stack;

public class PolishInvertedCalculator extends Calculator{
    //----- ATRIBUTOS -----
    private Stack digits;

    //----- CONSTRUCTOR -----
    public PolishInvertedCalculator(){
        this.digits = new Stack();
    }

    //----- METODOS -----
    public void append(int digit){
        this.digits.push(digit);
    }

    public void append(char operator){
        switch (operator){
            case '+':
                digits.push(super.add(digits.pop(), digits.pop()));
                break;
            case '-':
                digits.push(super.subtraction(digits.pop(), digits.pop()));
                break;
            case '*':
                digits.push(super.multiplication(digits.pop(), digits.pop()));
                break;
            case '/':
                digits.push(super.division(digits.pop(), digits.pop()));
                break;
        }
    }

    public int resolve(String expression){
        for (int i=0 ; i < expression.length() ; i++){
            char aux = expression.charAt(i);
            if(aux != ' '){
                if(Character.isDigit(aux)){
                    append(Character.getNumericValue(aux));
                }else{
                    append(aux);
                }
            }
        }
        return digits.top();
    }
}
