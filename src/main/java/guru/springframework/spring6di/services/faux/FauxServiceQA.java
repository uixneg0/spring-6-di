package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("fauxService")
@Profile("qa")
public class FauxServiceQA implements FauxService{

    @Override
    public String getDatasourceString() {
        return "QA datasource string!";
    }
}
