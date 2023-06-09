public class Salesperson implements SalesEmployee{

    private double totalSales;
    private final double commissionRate = 0.04;

    public Salesperson(double totalSales){
        this.totalSales = totalSales;
    }

    @Override
    public double getCommission() {
        return totalSales*commissionRate;
    }

    @Override
    public String getRole() {
        return "Salesperson";
    }

    @Override
    public double getTotalSalesCommission() {
        double totalSalesCommission = 0;
        return totalSalesCommission+getCommission();
    }

    @Override
    public void showSalesTeamCommissionInfo(){
        System.out.println("-------------------------------------------");
        System.out.println("The role of the employee : "+getRole());
        System.out.println("Sales commission : $ "+getCommission());
    }

    public void addSubordinate(SalesEmployee subordinate) {
        System.out.println("-----------------------------------------");
        System.out.println("Sorry, Salesperson can't have subordinate");
        System.out.println("-----------------------------------------");
    }


    
}
