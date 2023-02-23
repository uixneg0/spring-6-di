package guru.springframework.spring6di.controllers.faux;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"dev", "EN"})
@SpringBootTest
class FauxControllerProfileTest {
    @Autowired
    FauxController fauxController;

    @Test
    public void sayString(){
        System.out.println(fauxController.getDataSourceString());
    }
}