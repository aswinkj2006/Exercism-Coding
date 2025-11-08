public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        boolean exp = daysSkipped < 5;
        return  exp ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        boolean exp = productsSold < 20;
        return exp ? 10:13;
    }

    public double bonusForProductsSold(int productsSold) {
        boolean exp = productsSold <= 20;
        return exp ? productsSold*10 : productsSold*13;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        int totalSalary;
        if ( daysSkipped < 5 ){
            if ( productsSold <= 20 ){
                totalSalary = (1000+(productsSold*10));                
            }
            else{
                totalSalary = (1000+(productsSold*13));
            }
        }
        else{
            if ( productsSold <= 20 ){
                totalSalary = (850+(productsSold*10));                
            }
            else{
                totalSalary = (850+(productsSold*13));
            }
        }
        boolean exp = totalSalary <= 2000;
        return exp ? totalSalary : 2000;
    } 
}
