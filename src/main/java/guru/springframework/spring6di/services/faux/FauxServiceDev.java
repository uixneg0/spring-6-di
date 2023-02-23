package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("fauxService")
@Profile({"dev", "default"})
public class FauxServiceDev implements FauxService{

    @Override
    public String getDatasourceString() {
        return "Dev datasource string!";
    }
}
