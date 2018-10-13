package yto.net.cn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.dto.Result;
import yto.net.cn.service.YtoLoginService;

@Controller
public class YtoLoginController {

    @Autowired
    private YtoLoginService ytoLoginService;

    //http://127.0.0.1:8080/login?phone=123456&pass=123456
    @RequestMapping(value = "/login")
    @ResponseBody
    public Result<String> login(String phone , String pass){
        Result<String> result;
        YtoLogin ytoLogin = ytoLoginService.login(phone , pass);
        if(ytoLogin != null){
            result = new Result<>(true , ytoLogin.getLoginUsername() , "登陆成功");
        }else{
            result = new Result<>(false , null , "密码或手机号有误");
        }
        return result;
    }

    //下面为数据绑定的测试
    //http://localhost:8080/t?name=123&age=123
    @RequestMapping(value = "/t")
    @ResponseBody
    public String test1(String name , Integer age){
        return name + " " + age;
    }

    //测试绑定对象
    //http://localhost:8080/t1?loginUsername=123&loginPassword=123
    @RequestMapping(value = "/t1")
    @ResponseBody
    public String test2(YtoLogin ytoLogin){
        return ytoLogin.toString();
    }

    //测试绑定数组
    //http://localhost:8080/t2?name=123&name=da&name=you
    @RequestMapping(value = "/t2")
    @ResponseBody
    public String test3(String[] name){
        StringBuilder sb = new StringBuilder();
        for(String s : name){
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
}
