package guru.springframework.spring6di.controllers.faux;

import guru.springframework.spring6di.services.faux.FauxService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
@Qualifier("fauxService")
public class FauxController {
    private final FauxService fauxService;

    public FauxController(FauxService fauxService) {
        this.fauxService = fauxService;
    }

    public String getDataSourceString(){
        return fauxService.getDatasourceString();
    }
}
