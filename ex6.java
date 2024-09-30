import java.util.Scanner;
    public class ex6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter company's name: ");
            String companyName = scanner.nextLine();
            System.out.print("Enter company's revenue: ");
            double companyRevenue = scanner.nextDouble();
            System.out.print("Enter company's expenses: ");
            double companyExpenses = scanner.nextDouble();
            Company company = new Company(companyName, companyRevenue, companyExpenses);
            company.displayInfo();
            scanner.close();
        }
    }


