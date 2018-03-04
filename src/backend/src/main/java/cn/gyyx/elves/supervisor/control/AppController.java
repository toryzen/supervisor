package cn.gyyx.elves.supervisor.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

public class AppController {

    protected final Logger logger= LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/api/applist")
    public Object applist(@RequestAttribute("param") HashMap<String,String> data) {
        return null;
    }

    @RequestMapping("/api/addapp")
    public Object addapp(@RequestAttribute("param") HashMap<String,String> data) {
        return null;
    }

    @RequestMapping("/api/delapp")
    public Object delapp(@RequestAttribute("param") HashMap<String,String> data) {
        return null;
    }

    @RequestMapping("/api/appversion")
    public Object appversion(@RequestAttribute("param") HashMap<String,String> data) {
        return null;
    }

}
