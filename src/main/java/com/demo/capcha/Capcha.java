package com.demo.capcha;

public class Capcha {
    private int pattern;
    private int leftOperand;
    private int operator;
    private int rightOperand;

    public int getPattern() {
        return pattern;
    }

    public void setPattern(int pattern) {
        this.pattern = pattern;
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(int leftOperand) {
        this.leftOperand = leftOperand;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(int rightOperand) {
        this.rightOperand = rightOperand;
    }




    @Override
    public String toString() {
        if(this.getRightOperand()==1){

            return String.format("%s %s %s",leftOperand, "+","One");
        }
        else if(this.getRightOperand()==2){
            return String.format("%s %s %s",leftOperand, "+","Two");
        }
        else if(this.getRightOperand()==3){
            return String.format("%s %s %s",leftOperand, "+","Three");
        }

        return String.format("%s %s %s",leftOperand, "+","One");


    }

    public Capcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.setPattern(pattern);
        this.setLeftOperand(leftOperand);
        this.setOperator(operator);
        this.setRightOperand(rightOperand);
    }
}
