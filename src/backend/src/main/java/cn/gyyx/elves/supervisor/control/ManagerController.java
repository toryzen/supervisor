package cn.gyyx.elves.supervisor.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

public class ManagerController {

    protected final Logger logger= LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/api/userlist")
    public Object userlist(@RequestAttribute("param") HashMap<String,String> data) {
        return null;
    }

    @RequestMapping("/api/adduser")
    public Object adduser(@RequestAttribute("param") HashMap<String,String> data) {
        return null;
    }

    @RequestMapping("/api/deluser")
    public Object deluser(@RequestAttribute("param") HashMap<String,String> data) {
        return null;
    }

    @RequestMapping("/api/edituser")
    public Object edituser(@RequestAttribute("param") HashMap<String,String> data) {
        return null;
    }

    @RequestMapping("/api/changepwd")
    public Object changepwd(@RequestAttribute("param") HashMap<String,String> data) {
        return null;
    }
}
