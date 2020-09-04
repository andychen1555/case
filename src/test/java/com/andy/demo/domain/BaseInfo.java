package com.andy.demo.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author: weipeng
 * @create: 2020-04-20 16:43
 * @description:
 */
@Data
public class BaseInfo {
    private Integer id;

    private String userName;

    private String password;

    private Integer companyId;

    private String companyName;

    private String name;

    private Integer departmentId;

    private String departmentName;

    private Integer createdBy;

    private Date createdTime;

    private String mobile;

    private String email;

    private Byte enabled;

    private Date lastedUpdatedTime;

    private Integer lastedUpdatedBy;

    private String pingyin;

    private Integer teamId;

    private String teamCode;

    private String teamName;

    private Integer leader;

    private Integer departManager;

    private String loginIp;
}
