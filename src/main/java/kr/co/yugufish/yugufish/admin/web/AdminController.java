package kr.co.yugufish.yugufish.admin.web;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.yugufish.yugufish.admin.model.AdminVo;


@RequestMapping("/admin")
@RestController
public class AdminController {

    @RequestMapping("/login")
    public AdminVo adminLogin(@RequestBody AdminVo adminVo){
        System.out.print("ddddddd " + adminVo);
        return adminVo;
    }
    
}