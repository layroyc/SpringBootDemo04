package com.wy.shirotest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.junit.jupiter.api.Test;

/**
 *  shiro 的认证
 *
 *  左边是 账户  右边是密码
 */

public class ShiroIni {
    //shiro 的3大概念：  subject（用户的请求，主体）, security Manager(shiro的管理类)安全管理者 ,realms(数据库)
    //realms 分为：  ini  realm ， jdbc realm ，自定义的realm ---- 常用的自定义（mybatis，，，）

    @Test
    public void test01(){
        //1,realms  说白了就是数据库
        IniRealm iniRealm = new IniRealm("classpath:shiro.ini");  //1.1创建ini数据库
        //2,security Manager 依赖数据库（iniRealm）  通过set注入进入到数据库
        DefaultSecurityManager sm = new DefaultSecurityManager(); //1.2创建 管理ini们的 管理者
        //注入到security Manager中去
        sm.setRealm(iniRealm);//1.3把管理者注入到 ini库中

        //以上步骤 是 把 realms 注入到 sm 当中去， 即  他们2个联系在一起
        //subject 不是 new 出来的，因为 subject原本就是一个实打实的对象！！！原本就有的
        //只需要用 shiro 的类 做个 接待就可以了
        // SecurityUtils（Security安全单元） 依赖 安全管理中心 （SecurityManager）
        //1.4 Security安全单元注入管理者 通过set注入
        SecurityUtils.setSecurityManager(sm);//接管sm 使用接管后的进行登录

        //SecurityUtils可以直接得到getSubject() 进行登录
        Subject subject = SecurityUtils.getSubject();
        //拿到后就可以使用subject了 直接做登录
        //Authentication  身份认证/登录
        //token  是账户名+密码加密的字符串
        //拟定一个 虚拟的 账户名密码
        String userName = "xiexin";
        String userPwd = "123";
        //在这里，利用shiro 把 userName 和 userPwd 变为一个 token
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userName, userPwd); //1.6 把密语变成暗号 token
        //usernamePasswordToken.getPrincipal()  拿主体  .getPassword() 获取密码  .getUsername() 获取账户名
        System.out.println("顾客登录的时候把账户名和密码 加工后的 token = " + usernamePasswordToken.getUsername());//前端输入的token

        /*UsernamePasswordToken dbToken = new UsernamePasswordToken("xiexin","123");
        System.out.println("数据库中 把账户名和密码 加工后的token = " + dbToken);*/


        try {
            subject.login(usernamePasswordToken);//1.7 当暗号和ini对上了
            //注意：这个登录的方法是 shiro提供的，以后我们就不需要自己写登录了
            System.out.println("登录成功");
        }catch (UnknownAccountException e){
            System.out.println("账户名不对");
        }catch (IncorrectCredentialsException e){
            System.out.println("密码错误");
        }

        }

}
