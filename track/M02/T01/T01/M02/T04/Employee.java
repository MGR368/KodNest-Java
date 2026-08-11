class EmpApplication{
    int id;
    String name;
    void work(){
        System.out.println("working");    
    }   
}
class Employee{
    public static void main(String[] args){
        EmpApplication e1 = new EmpApplication();
        e1.id =11;
        e1.name = "mani";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();

        EmpApplication e2 ;
        e2 = e1;
        e2.id =12;
        e2.name = "ram";
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);

    }
        
}
    
