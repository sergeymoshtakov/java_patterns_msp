public class FinancialReportFactory implements ReportFactory{
    @Override
    public ReportHeader createReportHeader() {
        return new FinantialReportHeader();
    }

    @Override
    public ReportBody createReportBody() {
        return new FinantialReportBody();
    }
}
