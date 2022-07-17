package JavaStart.ObjectPrograming1.PayrollCalculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Paweł","Pogorzelski",3000);
        System.out.println("Dochód netto pracownika wynosi: " + Calculator.nettoYearPayment(employee));
        System.out.println("Dochód brutto pracownika wynosi: " + Calculator.bruttoYearPayment(employee));
    }
}
