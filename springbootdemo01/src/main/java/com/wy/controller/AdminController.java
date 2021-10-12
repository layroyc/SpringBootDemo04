package com.wy.controller;

import com.wy.bean.Admin;
import com.wy.bean.AdminExample;
import com.wy.respcode.Result;
import com.wy.service.AdminService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired(required = false)
    private AdminService adminService;
    //登录
    @RequestMapping("/login")
    public Map login(Admin admin, HttpSession session){
        Map codeMap = new HashMap();
        //登录
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andAdminNameEqualTo(admin.getAdminName());
        criteria.andAdminPwdEqualTo(admin.getAdminPwd());
        List<Admin> accounts = adminService.selectByExample(example);
        if(accounts != null && accounts.size() > 0){
            Admin dbAdmin = accounts.get(0);//查到账户
            //把查到的账户存入到session作用域中
            session.setAttribute("dbAdmin",dbAdmin);
            codeMap.put("code",200);
            codeMap.put("msg", "登录成功");
            return codeMap;
        }else{
            codeMap.put("code",4001);
            codeMap.put("msg", "登录失败，账户或密码错误");
            return codeMap;
        }

    }

    //注册
    @RequestMapping("/register")
    public Map insert(Admin admin){
        Map map = new HashMap();
        int n = adminService.insertSelective(admin);
        if(n>0){
            map.put("code",200);
            map.put("msg","注册成功");
            return map;
        }else{
            map.put("code",400);
            map.put("msg","注册失败,检查网络再来一次");
            return map;
        }
}

    //登录vue
    @RequestMapping("/loginByShiro")
    public Result loginByShiro(@RequestBody Admin admin){
        //登录交给shiro的securityManager管理
        Subject subject = SecurityUtils.getSubject();//subject 是根据 过滤器拿到的

        UsernamePasswordToken token = new UsernamePasswordToken(admin.getAdminAccount(), admin.getAdminPwd());
        //Ctrl+alt+t  写try  catch的
        try {
            subject.login(token); //ok
            return new Result();
        } catch (AuthenticationException e) {//登录不对
            e.printStackTrace();
            return new Result(40001,"账号密码不正确");
        }
    }
}
