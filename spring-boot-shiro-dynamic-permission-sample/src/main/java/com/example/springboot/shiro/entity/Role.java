package com.example.springboot.shiro.entity;

import java.util.List;

/**
 * @author litz-a
 */
public class Role {

  private Integer id;
  private String roleName;
  private List<Integer> authorityIds;

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

  public List<Integer> getAuthorityIds() {
    return authorityIds;
  }

  public void setAuthorityIds(List<Integer> authorityIds) {
    this.authorityIds = authorityIds;
  }
}
