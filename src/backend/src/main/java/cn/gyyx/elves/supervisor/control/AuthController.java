package cn.gyyx.elves.supervisor.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

public class AuthController {
    protected final Logger logger= LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/api/authlist")
    public Object authlist(@RequestAttribute("param") HashMap<String,String> data) {
        return null;
    }

}
