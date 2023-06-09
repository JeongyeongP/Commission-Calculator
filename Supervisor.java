import java.util.ArrayList;
import java.util.List;

public class Supervisor implements SalesEmployee{

    private double totalSales;
    private final double commissionRate = 0.03;
    private List<SalesEmployee> subordinates = new ArrayList<>();
    
    public Supervisor(double totalSales){
        this.totalSales = totalSales;
    }

    @Override
    public double getCommission() {
        return totalSales*commissionRate;
    }

    @Override
    public String getRole() {
        return "Supervisor";
    }

    @Override
    public double getTotalSalesCommission() {
        double totalSalesCommission=0;

        // Adding one's commission first
        totalSalesCommission += getCommission();

        // Adding subordinates' commissions
        for (SalesEmployee subordinate : subordinates) {
            totalSalesCommission += subordinate.getTotalSalesCommission();
        }

        return totalSalesCommission;
    }

    @Override
    public void showSalesTeamCommissionInfo() {
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
        if (subordinate.getRole().equals("Manager")){
            System.out.println("-----------------------------------------");
            System.out.println("Supervisor can't have manager as subordinate");
            System.out.println("-----------------------------------------");
        }
        else {
            subordinates.add(subordinate);
        }
    }

    public void removeSubordinate(SalesEmployee subordinate) {
        subordinates.remove(subordinate);
    }


    
}
