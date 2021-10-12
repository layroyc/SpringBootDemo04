package com.wy.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * student
 * @author 
 */
@ToString //lombok 的插件的注解， 不用写 tostring方法
@Data   //不用写get set  @Getter 不用写  getter  @Setter  不用写 setter
public class Student implements Serializable {
    private Integer studentId;

    private String studentName;

    private Integer studentSex;

    private String studentCardId;

    private String studentPhone;

    private String studentAddress;

    //使用中国的时历
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date studentComeDate;

    private static final long serialVersionUID = 1L;

  }