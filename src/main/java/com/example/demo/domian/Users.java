package com.example.demo.domian;

import java.util.Date;

/**  
 * @projectName demo
 * @description: 
 * @author Cirilla
 * @date 2019/7/7  17:34
 */
public class Users {
    private Integer id;

    private String name;

    private Date createdAt;

    private Date updatedAt;

    private String gitPushStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getGitPushStatus() {
        return gitPushStatus;
    }

    public void setGitPushStatus(String gitPushStatus) {
        this.gitPushStatus = gitPushStatus;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", gitPushStatus='" + gitPushStatus + '\'' +
                '}';
    }
}