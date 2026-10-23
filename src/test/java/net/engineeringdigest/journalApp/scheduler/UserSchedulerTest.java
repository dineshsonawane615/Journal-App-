package net.engineeringdigest.journalApp.scheduler;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import scheduler.UserSchedular;

@SpringBootTest
public class UserSchedulerTest {

    @Autowired
    private UserSchedular userSchedular;

    @Test
    public void testFetchUsersAndSendSaMail() {
         userSchedular.FetchUsersAndSendSaMail();
    }
}
