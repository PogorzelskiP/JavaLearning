package JavaStart.ObjectPrograming1.PayrollCalculator;
public class Calculator {
    public static double nettoYearPayment(Employee employee){
        return employee.getSalary()*12;
    }

    public static double bruttoYearPayment(Employee employee){
        return ((Calculator.nettoYearPayment(employee)*1.2d)+(12*1000));
    }
}
