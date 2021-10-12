package com.wy.shirotest;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.jupiter.api.Test;

/**
 * shiro 的加密 和 认证测试
 */
public class MyShiro {
    //shiro 有 对 明文密码 123456 有 加密功能， 让web网站更加安全
    //md5 加密  简单 但是不可逆，但是 可以根据 加密后的密码 进行 反推 ！！！
    //想要 更加的安全！！！  就需要加盐！！！   salt
    @Test
    public void testCmd5(){
        Md5Hash md5Hash = new Md5Hash("123456"); //e10adc3949ba59abbe56e057f20f883e
        System.out.println("md5Hash = " + md5Hash);

        //给密码加盐 更安全了
        Md5Hash md5Hash1 = new Md5Hash("123456", "qwertwyde");
        System.out.println("md5Hash1 = " + md5Hash1);

        //给密码加盐后  进行散列处理
        Md5Hash md5Hash2 = new Md5Hash("123456","qwerty",1024);//破解不出来后，就出现了社会工程学     salt 盐  可以更改  1024次
        System.out.println("md5Hash2 = " + md5Hash2);//cf1b33d7a50064e4921d852bd21f415e

        //数据库的密码   在公司中必须要有salt字段  已防被盗被破
        Md5Hash md5Hash3 = new Md5Hash("123456", "MGH7kU1(",1024);
        System.out.println("md5Hash3 = " + md5Hash3);
    }

    //左边是 账户  右边是密码
}
