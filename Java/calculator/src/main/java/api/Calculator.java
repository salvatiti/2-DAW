
package api;


public class Calculator {
   private double numOne;
    private double numTwo;
    private String operation;
   
    

    public Calculator() {
    }

    public Calculator(double numOne, double numTwo, String operation) {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.operation = operation;
    }

    
      
    public double getNumOne() {
        return numOne;
    }

  

    public void setNumOne(int numOne) {
        this.numOne = numOne;
    }

    public double getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(int numTwo) {
        this.numTwo = numTwo;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Calculator{" + "numOne=" + numOne + ", numTwo=" + numTwo + ", operation=" + operation + '}';
    }
    
    
    
}
