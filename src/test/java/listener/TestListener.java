package listener;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    Logger logger = LogManager.getLogger(TestListener.class);


    @Override
    public void onTestStart(ITestResult result) {
        logger.info("---------------------------------------------------------------");
        logger.info(result.getMethod().getMethodName() + " Started");
        logger.info("---------------------------------------------------------------");
        logger.info(result.getMethod().getDescription());
    }

    @Override
    public void onStart(ITestContext context) {
        logger.info("===============================================================");
        logger.info("     On Start :-" + context.getName() + "                      ");
        logger.info("===============================================================");
    }

    @Override
    public void onFinish(ITestContext context) {
        logger.info("===============================================================");
        logger.info("     On Finish :-" + context.getName() + "                     ");
        logger.info("===============================================================");
    }


    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("---------------------------------------------------------------");
        logger.info(result.getMethod().getMethodName() + " Passed");
        logger.info("---------------------------------------------------------------");
    }


}
