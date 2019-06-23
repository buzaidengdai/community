package life.majiang.community;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/sayhi")
    public String sayhi(@RequestParam(name="name", required=false, defaultValue="World") String name){
        return "hi" + name;
    }
}
