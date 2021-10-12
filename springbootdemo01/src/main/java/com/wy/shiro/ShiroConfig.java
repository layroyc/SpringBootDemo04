package com.wy.shiro;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * shiro 的 web 配置
 * 过滤器
 * 目的： 因为 shiro 可以和很多项目适配， 那么我们是 web项目，就需要配置成 web 的 securityManger
 * 又因为  是 web项目， 所以就需要用 过滤器 来配置 需要拦截的请求，和非拦截器的请求
 */

@Configuration   //配置类的注解， 表明该类是配置类， 该注解 是配置的意思， 顶替的是 xml中的配置
            //这个注解 优先于其他注解
public class ShiroConfig {

    //1.shiroconfig 需要指明 Realm是谁？ 并且把这个realm创建出来，这个创建指的是，优先于 其他的 controller，service等注解
    //对象 优先创建
    @Bean
    public Realm getMybatisRealm(){
        MybatisRealm realm = new MybatisRealm();
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher();
        matcher.setHashAlgorithmName("md5");
        matcher.setHashIterations(1024);
        realm.setCredentialsMatcher(matcher);//注入 匹配， 注入 加密加盐的匹配
        return realm;
    }

    //2.指派 security Manager， 因为我们是web项目所以 是 websecurityManager
    @Bean
    public DefaultWebSecurityManager getSecurityManager(Realm realm){
        DefaultWebSecurityManager sm = new DefaultWebSecurityManager();
        sm.setRealm(realm);
        return sm;
    }

    //以上 是subject（主体）和realm（数据库）连接在一起了
    //3.subject 他需要 用 过滤器来获取
    @Bean
    public ShiroFilterFactoryBean getFilter(DefaultWebSecurityManager sm){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(sm);

        //使用过滤器
        Map map = new LinkedHashMap();//这个map是有序的
        //1.不拦截的页面！！！  因先小后大
        map.put("/page/loginVue","anon");//anon是匿名的，任何请求都可以去看，去访问，不拦截
        map.put("/api/admin/loginByShiro","anon");//登录的方法也不能拦截
        //map.put("/*/**","authc");//authc  需要登录

        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);//把拦截的顺序放入到linkedMap中！！！
        return shiroFilterFactoryBean;
    }
}
