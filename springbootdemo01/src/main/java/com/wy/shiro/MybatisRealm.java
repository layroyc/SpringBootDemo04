package com.wy.shiro;

import com.wy.bean.Admin;
import com.wy.bean.AdminExample;
import com.wy.service.AdminService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 自定义的realm 和 mybatis 数据库 结合的 realm
 *
 * realm 中，包含 认证（登录） 和 授权 2个部分
 *
 * AuthorizingRealm  为什么要继承认证？？？有登录不一定授权，授权了一定登录
 */

public class MybatisRealm extends AuthorizingRealm {
    @Autowired
    private AdminService adminService;
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    //认证（登录）
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //AuthenticationToken 这个参数是什么？？？  其实 就是 UsernamePasswordToken（“账号","密码"）
        String account = (String) authenticationToken.getPrincipal(); //拿到 用户登录人的账户名
        //拿到账户名后，能否拿到 数据库中的密码？？？  能 拿到后做对比
        //怎么拿？？  单表的 查询 admin
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andAdminAccountEqualTo(account);
        List<Admin> admins = adminService.selectByExample(example);
        Admin dbAdmin = null;
        if(admins!=null &&admins.size()>0){
            dbAdmin = admins.get(0);
            //获取账户名和密码
            String pwd = dbAdmin.getAdminPwd();
            String salt = dbAdmin.getSalt();

            //获取token认证 获取数据库中的密码
            SimpleAuthenticationInfo simpleAuthenticationInfo =
                    new SimpleAuthenticationInfo(account, pwd, ByteSource.Util.bytes(salt), this.getName());
            System.out.println("ByteSource.Util.bytes(salt) = " + ByteSource.Util.bytes(salt));
            return simpleAuthenticationInfo;
        }



        return null;
    }
}
