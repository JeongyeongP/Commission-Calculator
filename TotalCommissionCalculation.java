public class TotalCommissionCalculation {
    public static void main(String[] args){
        
        // -------------Test 1---------------
        // Creating Sales Employee
        Manager Haley = new Manager(2000);
        Supervisor Neil = new Supervisor(5000);
        Salesperson Jasmine = new Salesperson(1000);
        Salesperson Douglas = new Salesperson(4000);

        // Adding subordinates
        Neil.addSubordinate(Douglas);
        Haley.addSubordinate(Neil);
        Haley.addSubordinate(Jasmine);

        // Calculate total sales commission and display
        displaySalesTeamInfo(Haley);

        // // -------------Test 2---------------
        // // Creating Sales Employee
        // Manager Haley = new Manager(2000);
        // Supervisor Neil = new Supervisor(5000);
        // Salesperson Jasmine = new Salesperson(1000);
        // Manager Kiki = new Manager(4000);
        // // Adding subordinates
        // Neil.addSubordinate(Kiki);
        // Haley.addSubordinate(Neil);
        // Haley.addSubordinate(Jasmine);

        // // Calculate total sales commission and display
        // displaySalesTeamInfo(Haley);
        
        // // -------------Test 3---------------
        // // Creating Sales Employee
        // Manager Haley = new Manager(2000);
        // Supervisor Neil = new Supervisor(5000);
        // Salesperson Jasmine = new Salesperson(1000);
        // Salesperson Amber = new Salesperson(3000);
        // // Adding subordinates
        // Haley.addSubordinate(Neil);
        // Haley.addSubordinate(Jasmine);
        // Jasmine.addSubordinate(Amber);

        // // Calculate total sales commission and display
        // displaySalesTeamInfo(Haley);

        // // -------------Test 4---------------
        // // Creating Sales Employee
        // Manager Haley = new Manager(2000);
        // Manager Phil = new Manager(4000);
        // Manager Luke = new Manager(3000);

        // // Adding subordinates
        // Haley.addSubordinate(Phil);
        // Phil.addSubordinate(Luke);
        
        // // Calculate total sales commission and display
        // displaySalesTeamInfo(Haley);


        // // -------------Test 5---------------
        // // Creating Sales Employee
        // Manager Haley = new Manager(2000);
        // Supervisor Neil = new Supervisor(5000);
        // Salesperson Jasmine = new Salesperson(1000);
        // Salesperson Douglas = new Salesperson(4000);
        // Salesperson Cam = new Salesperson(3000);

        // // Adding subordinates
        // Haley.addSubordinate(Neil);
        // Haley.addSubordinate(Jasmine);
        // Neil.addSubordinate(Douglas);

        // // Before Adding new subordinates
        // // Calculate total sales commission and display
        // System.out.println("===========Before Adding Cam(New Salesman)==========");
        // displaySalesTeamInfo(Haley);

        // // Adding Cam
        // Neil.addSubordinate(Cam);

        // // Calculate total sales commission and display
        // System.out.println("===========After Adding Cam(New Salesman)==========");
        // displaySalesTeamInfo(Haley);
        
        
        
        
        
    }

    public static void displaySalesTeamInfo(SalesEmployee salesemployee){
        double totalSalesCommission = salesemployee.getTotalSalesCommission();
        salesemployee.showSalesTeamCommissionInfo();
        System.out.println("-------------------------------------------");
        System.out.println("Total sales commission is $ "+totalSalesCommission);
        System.out.println("-------------------------------------------");

    }
}

