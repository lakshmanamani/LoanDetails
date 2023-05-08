package com.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Integer> {

}
