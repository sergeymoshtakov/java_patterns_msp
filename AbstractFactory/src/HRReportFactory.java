public class HRReportFactory implements ReportFactory{
    @Override
    public ReportHeader createReportHeader() {
        return new HRReportHeader();
    }

    @Override
    public ReportBody createReportBody() {
        return new HRReportBody();
    }
}
