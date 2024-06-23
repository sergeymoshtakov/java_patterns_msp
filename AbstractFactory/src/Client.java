public class Client {
    private ReportBody rb;
    private ReportHeader rh;
    private final ReportFactory rf;
    public Client(ReportFactory rf){
        this.rf = rf;
    }
    public void createReport(){
        rh = rf.createReportHeader();
        rb = rf.createReportBody();
    }

    public void printReport(){
        rh.print();
        rb.print();
    }
}
