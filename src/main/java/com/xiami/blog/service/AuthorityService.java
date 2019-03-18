package com.xiami.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiami.blog.domain.Authority;
import com.xiami.blog.repository.AuthorityRepository;

/**
 * 权限Service。
 */
@Service
public class AuthorityService {

    @Autowired
    private AuthorityRepository authorityRepository;

    /**
     * 根据id查询权限
     * @param id
     * @return
     */
    public Authority getAuthorityById(Long id) {
        return authorityRepository.getOne(id);
    }
}
