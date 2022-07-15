package commonLibs.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportUtils {
    ExtentHtmlReporter htmlReport;
    ExtentReports extentReports;
    ExtentTest extentTest;

    public ReportUtils(String htmlReportFilename) {

        htmlReportFilename= htmlReportFilename.trim();

        htmlReport = new ExtentHtmlReporter(htmlReportFilename);
        extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReport);
    }

    public void createTest(String testName) {
        extentTest = extentReports.createTest(testName);
    }

    public void logInfo(Status status, String message) {
        extentTest.log(status, message);
    }
}
