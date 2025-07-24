package cucumbersteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.cucumber.suiteslicing.SerenityTags;
import utilities.Storage;
public class Hooks {
    @Before
    public void before() {
        SerenityTags.create().tagScenarioWithBatchingInfo();
    }
    @Before(order = 1)
    public void getScenario(Scenario scenario) throws InterruptedException {
        Storage.putScenario(scenario);
    }
    @After(order = 1)
    public void testEnd(){
        System.out.println("Test is finished");
    }
}