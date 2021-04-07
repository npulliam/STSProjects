package com.codingdojo.calculator;

public class Calculator implements java.io.Serializable {
	private double operandOne;
	private double operandTwo;
	private double results;
	private String operation;
	
	public Calculator() {
		this.operandOne = 0;
		this.operandTwo = 0;
		this.operation = "+";
	}
	
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void performOperation() {
		if(this.operation == "+") {
			setResults(this.operandOne + this.operandTwo);
		} else if (this.operation == "-") {
			setResults(this.operandOne - this.operandTwo);
		} else {
			System.out.println("Unrecognized operation type");
		}
	}

	public double getResults() {
		return results;
	}

	private void setResults(double results) {
		this.results = results;
	}
	
}
