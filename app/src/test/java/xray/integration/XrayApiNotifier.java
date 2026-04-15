package xray.integration;

import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;

public class XrayApiNotifier implements TestExecutionListener {
    @Override
    public void testPlanExecutionFinished(TestPlan testPlan) {
        // Your logic to call the API goes here
        System.out.println("All tests finished. Calling global notification API...");
        // Example: HttpClient.newHttpClient().send(...);
    }
}
