package Controller;

import Repository.ClientRepository;
import com.project.infnet.javaproject.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Client> findAll (){
        Iterable<Client> all = clientRepository.findAll();
        return all;
    }
    @RequestMapping(method = RequestMethod.POST)
    public Client save (@RequestBody Client client){
        Client c = clientRepository.save(client);
        return c;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Client update (@RequestBody Client client){
        Client c = clientRepository.save(client);
        return c;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete (@RequestBody Client client){
      clientRepository.deleteById(client.getId());
    }
}
