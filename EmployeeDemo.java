class Employee{           
    int id;              // parts of the employee information i.e data members
    String name;         
    double salary;

    void get(){           //assigning values to the data members
        id=101;
        name="John De";
        salary=30000.00;
    }

    void show(){        //for displaying the values of datamembers
        System.out.println("employee id is"+id);
        System.out.println("Employee name is"+name);
        System.out.println("Employee salary is:"+salary);
    }
}             //everything inside the curly braces is the class property.

class EmployeeDemo{
    public static void main(String[] args){
        Employee obj=new Employee();
        obj.get();                              //object_name.method_name  [syntax]
        obj.show();                             //this feature is called message passing
    }
}