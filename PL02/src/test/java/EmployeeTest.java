import EX_01.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class EmployeeTest {
    private Employee employee1,employee2, employee3 ;
    @BeforeEach
    public void setUp() {
        employee1 = new Employee("nome do manager", "Manager", 300);
        employee2 = new Employee("nome do developer", "Developer", 100);
        employee3 = new Employee("nome do estagiário", "Intern", 50);
    }

    @Test
    public void testCalculateSalary() {
        employee1.setHoursWorked(40);
        assertEquals(12000, employee1.calculateSalary());
        employee1.setHoursWorked(20);
        assertEquals(6000, employee1.calculateSalary());

        employee2.setHoursWorked(40);
        assertEquals(4800, employee2.calculateSalary());
        employee2.setHoursWorked(20);
        assertEquals(2400, employee2.calculateSalary());

        employee3.setHoursWorked(40);
        assertEquals(1600, employee3.calculateSalary());
        employee3.setHoursWorked(20);
        assertEquals(800, employee3.calculateSalary());
    }
}

