import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.*;
import junit.textui.TestRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;
public class CucumberListener implements ConcurrentEventListener {
    public Logger logger = LoggerFactory.getLogger(TestRunner.class);
    public void onTestRunStarted(TestRunStarted testRunStarted) {
        logger.info("TEST RUN STARTED AT:" + LocalDateTime.now());
    }
    public void onTestCaseStarted(TestCaseStarted testCaseStarted) {
    }
    public void onTestCaseFinished(TestCaseFinished testCaseFinished){
    }
    public void onTestRunFinished(TestRunFinished testRunFinished) {
        logger.info("TEST RUN FINISHED AT: " + LocalDateTime.now());
    }
    public void onTestStepFinnish(TestStepFinished testStepFinished){
        if (!testStepFinished.getResult().getStatus().isOk()){
        }
    }
    public void onTestStepStart(TestStepStarted testStepStarted){
    }
    @Override
    public void setEventPublisher(EventPublisher eventPublisher) {
        eventPublisher.registerHandlerFor(TestRunStarted.class, this::onTestRunStarted);
        eventPublisher.registerHandlerFor(TestRunFinished.class, this::onTestRunFinished);
        eventPublisher.registerHandlerFor(TestCaseStarted.class, this::onTestCaseStarted);
        eventPublisher.registerHandlerFor(TestCaseFinished.class, this::onTestCaseFinished);
        eventPublisher.registerHandlerFor(TestStepFinished.class, this::onTestStepFinnish);
        eventPublisher.registerHandlerFor(TestStepStarted.class, this::onTestStepStart);
    }
}