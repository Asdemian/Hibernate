import dao.CityDao;
import dao.EmployeeDao;
import dao.impl.CityDaoImpl;
import dao.impl.EmployeeDaoImpl;
import model.City;
import model.Employee;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        CityDao cityDao = new CityDaoImpl();
        City city = new City("Десногорск");
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Дарья", "Российская", "Ж", 27, city));
        employees.add(new Employee("Людка", "Всемогущая", "Ж", 38, city));
        employees.add(new Employee("Иван", "Стальченков", "М", 27, city));
        employees.add(new Employee("Паха", "Сильнейший", "М", 35, city));
        employees.add(new Employee("Евлампий", "Русилович", "М", 55, city));

        city.setEmployees(employees);

        cityDao.add(city);

        employeeDao.findAll().forEach(System.out::println);
        cityDao.delete(city);
        employeeDao.findAll().forEach(System.out::println);

    }

}
