package com.xiami.blog.domain;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;

/**
 * 权限。
 */
@Entity
public class Authority implements GrantedAuthority {

    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 自增长策略
    private Long id; // 用户的唯一标识

    @Column(nullable = false) // 映射为字段，值不能为空
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return name;
    }
}
