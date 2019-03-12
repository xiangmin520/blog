package com.xiami.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 菜单 值对象.
 */
@Getter
@Setter
@AllArgsConstructor
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String url;

}
