package com.ljh.auth.server.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (RoleInfo)实体类
 *
 * @author makejava
 * @since 2020-08-31 15:50:10
 */
@Entity(name = "role_info")
public class RoleInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String roleName;
    private String roleCode;

    @Override
    public String toString() {
        return "RoleInfo{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleCodes='" + roleCode + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

}
