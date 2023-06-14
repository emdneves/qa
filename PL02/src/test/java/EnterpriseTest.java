import EX_02.*;
import EX_01.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnterpriseTest {

    private Enterprise enterprise;
    private Employee employee1,employee2, employee3 ;

    @BeforeEach
    public void setUp() {
        enterprise = new Enterprise();
    }

    @Test
    public void testAddEmployee() {
        employee1 = new Employee("nome do manager", "Manager", 300);
        employee2 = new Employee("nome do developer", "Developer", 100);
        employee3 = new Employee("nome do estagiário", "Intern", 50);
        enterprise.addEmployee(employee1);
        enterprise.addEmployee(employee2);
        enterprise.addEmployee(employee3);
        assertEquals(3, enterprise.getEmployees().size());
    }

    @Test
    public void testRemoveEmployeee() {
        employee1 = new Employee("nome do manager", "Manager", 300);
        employee2 = new Employee("nome do developer", "Developer", 100);
        enterprise.addEmployee(employee1);
        enterprise.addEmployee(employee2);
        enterprise.removeEmployee(employee1);
        assertEquals(1, enterprise.getEmployees().size() );
    }

    @Test
    public void testCalculateTotalSalaries() {
        employee1 = new Employee("nome do manager", "Manager", 300);
        employee2 = new Employee("nome do developer", "Developer", 100);
        employee1.setHoursWorked(20);
        employee2.setHoursWorked(20);

        enterprise.addEmployee(employee1);
        enterprise.addEmployee(employee2);

        assertEquals(8400, enterprise.calculateTotalSalaries());
    }

}
