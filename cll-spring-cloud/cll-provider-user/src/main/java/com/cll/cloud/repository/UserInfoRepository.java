package com.cll.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cll.cloud.entity.UserInfo;

@Repository // 标注是一个dao
public interface UserInfoRepository extends JpaRepository<UserInfo, Long>{

	
}
