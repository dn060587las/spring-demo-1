package app.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    public IndexController() {
        System.out.println("22222");
    }

    @RequestMapping("/test-json")
    public String json(Model model) {
        model.addAttribute("data", new String[]{"1", "2","3"});
        return "jsonView";
    }

    @RequestMapping("/test-xml")
    public String xml(Model model) {
        model.addAttribute("data", new String[]{"1", "2","3"});
        return "xmlView";
    }

    @RequestMapping("/test-obj")
    @ResponseBody
    public String[] test() {
        return new String[]{"1", "2","3"};
    }
}


