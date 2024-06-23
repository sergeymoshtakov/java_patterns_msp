public class Main {
    public static void main(String[] args) {
        ReportFactory financialFactory = new FinancialReportFactory();
        Client financialClient = new Client(financialFactory);
        financialClient.createReport();
        financialClient.printReport();

        ReportFactory hrFactory = new HRReportFactory();
        Client hrClient = new Client(hrFactory);
        hrClient.createReport();
        hrClient.printReport();
    }
}