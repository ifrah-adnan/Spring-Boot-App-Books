package com.adnan.springbootbookseller.repository;

import com.adnan.springbootbookseller.models.Role;
import com.adnan.springbootbookseller.models.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public interface IUserRepository extends JpaRepository<User,Long> {


    Optional<User> findByUsername(String username);
    @Modifying
    @Query("update User set role=:role where username=:username")
    void updateUserRole(@Param("username") String username,@Param("role") Role role);
    @Modifying
    @Query("delete from User where username=:username")
    void deleteUser(@Param("username") String username);



}
