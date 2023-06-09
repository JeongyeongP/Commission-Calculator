import java.util.ArrayList;
import java.util.List;

public class Manager implements SalesEmployee{

    private double totalSales;
    private final double commissionRate = 0.02;
    private List<SalesEmployee> subordinates = new ArrayList<>();
    
    public Manager(double totalSales){
        this.totalSales = totalSales;
    }

    @Override
    public double getCommission() {
        return totalSales*commissionRate;
    }

    @Override
    public String getRole() {
        return "Manager";
    }

    @Override
    public double getTotalSalesCommission() {
        double totalSalesCommission = 0;

        // Adding one's commission first
        totalSalesCommission += getCommission();

        // Adding subordinates' commissions
        for (SalesEmployee subordinate : subordinates) {
            totalSalesCommission += subordinate.getTotalSalesCommission();
        }
        return totalSalesCommission;
    }

    @Override
    public void showSalesTeamCommissionInfo(){
        // Displaying infomration about Sales employee oneself
        System.out.println("-------------------------------------------");
        System.out.println("The role of the employee : "+getRole());
        System.out.println("Sales commission : $ "+getCommission());

        // Displaying information about subordinates
        for (SalesEmployee subordinate : subordinates){
            subordinate.showSalesTeamCommissionInfo();
        }
    }

    public void addSubordinate(SalesEmployee subordinate) {
        subordinates.add(subordinate);
    }

    public void removeSubordinate(SalesEmployee subordinate) {
        subordinates.remove(subordinate);
    }
    
}
