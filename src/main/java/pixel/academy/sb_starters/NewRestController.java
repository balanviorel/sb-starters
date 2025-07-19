package pixel.academy.sb_starters;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewRestController {

    @GetMapping("/exemplu")
    public String exemplu() {
        return  "Acesta este un exemplu";
    }

}
