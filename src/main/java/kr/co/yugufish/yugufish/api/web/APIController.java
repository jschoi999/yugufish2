package kr.co.yugufish.yugufish.api.web;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {
    
    @RequestMapping("/test")
    public HashMap<String, Object> test(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("aaa", "aaa");
        return map;
    }

}
