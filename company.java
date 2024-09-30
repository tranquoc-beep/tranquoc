class Company {
    private String name;
    private double revenue;
    private double expenses;
    public Company(String name, double revenue, double expenses) {
        this.name = name;
        this.revenue = revenue;
        this.expenses = expenses;
    }
    public double calculateProfit() {
        return revenue - expenses;
    }
    public void displayInfo() {
        System.out.println("Company Name: " + name);
        System.out.println("Revenue: $" + revenue);
        System.out.println("Expenses: $" + expenses);
        System.out.printf("Profit: $%.2f\n", calculateProfit());
    }
}
