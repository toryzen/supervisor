package cn.gyyx.elves.supervisor.control;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;


public class PublicController {

    protected final Logger logger= LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/api/login")
    public Object login(@RequestAttribute("param") HashMap<String,String> data) {
        HashMap<String,Object> result = new HashMap<>();
        result.put("flag","false");
        result.put("error","");
        result.put("result","");
        try{

            result.put("flag","true");
        }catch(Exception e){
            e.printStackTrace();
            result.put("error",e.toString());
        }
        logger.info(JSON.toJSONString(result));
        return JSON.toJSONString(result);
    }

    @RequestMapping("/api/logout")
    public Object loginout(@RequestAttribute("param") HashMap<String,String> data) {
        return null;
    }

}
