package com.ibrahim.GraduationProject.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
     UserEntity getUserEntityByTc(String tc);
}
