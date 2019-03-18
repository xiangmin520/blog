package com.xiami.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xiami.blog.domain.Authority;

/**
 * Authority持久层。
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
