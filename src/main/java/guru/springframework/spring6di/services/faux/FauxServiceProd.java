package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("fauxService")
@Profile("prod")
public class FauxServiceProd implements FauxService{

    @Override
    public String getDatasourceString() {
        return "Prod datasource string!";
    }
}
