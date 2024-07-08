public class HRmanager extends Employee{
    public HRmanager (int salary){
        super(salary);
    }
    @Override
    public void work(){
        System.out.println("Managing Employee");
    }

    public void  addEmployee(){
        System.out.println("\n Adding New Employee");
    }
}
