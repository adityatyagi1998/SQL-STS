package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hello.User;
import hello.UserRepository;

@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired

    private UserRepository userRepository;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody String addNewUser (@RequestParam String inclusion, @RequestParam String mettle, @RequestParam String pioneering, @RequestParam String accountability, @RequestParam String collaboration, @RequestParam String trust) {


        User n = new User();

        n.setInclusion(inclusion);
        n.setMettle(mettle);
        n.setPioneering(pioneering);
        n.setAccountability(accountability);
        n.setCollaboration(collaboration);
        n.setTrust(trust);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {

        return userRepository.findAll();
    }
}