package com.manny.day34_server_calc.models;

public class MathEntry {

    private String num1;
    private String op;
    private String num2;
    private String solution;

    public MathEntry(String num1, String op, String num2) {
        this.num1 = num1;
        this.op = op;
        this.num2 = num2;

        double val1 = Integer.parseInt(num1);
        double val2 = Integer.parseInt(num2);

        switch (op) {
            case "add":
                this.op = "+";
                this.solution = String.valueOf(val1 + val2);
                break;
            case "sub":
                this.op = "-";
                this.solution = String.valueOf(val1 - val2);
                break;
            case "multi":
                this.op = "*";
                this.solution = String.valueOf(val1 * val2);
                break;
            case "divide":
                this.op = "/";
                this.solution = String.valueOf(val1 / val2);
                break;
        }
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}