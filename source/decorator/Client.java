package source.decorator;

public class Client {
 
    public static void main(String[] args) {
        System.out.println("NORMAL EMPLOYEE: ");
        EmployeeComponent employee = new EmployeeConcreteComponent("Nguyen_NA");
        employee.showBasicInformation();
        employee.doTask();
 
        System.out.println("\nTEAM LEADER: ");
        EmployeeComponent teamLeader = new TeamLeader(employee);
        teamLeader.showBasicInformation();
        teamLeader.doTask();
 
        System.out.println("\nMANAGER: ");
        EmployeeComponent manager = new Manager(employee);
        manager.showBasicInformation();
        manager.doTask();
 
        System.out.println("\nTEAM LEADER AND MANAGER: ");
        EmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();
    }
}
