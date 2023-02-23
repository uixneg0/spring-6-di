package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("fauxService")
@Profile("uat")
public class FauxServiceUAT implements FauxService{

    @Override
    public String getDatasourceString() {
        return "Uat datasource string!";
    }
}
