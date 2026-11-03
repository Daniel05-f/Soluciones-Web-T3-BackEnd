package com.upn.repository;

import com.upn.model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface IUserRepository extends IGenericRepository<User, Integer> {
    //@Query("FROM User u WHERE u.username = ?);
    //Queries derivados
    User findOneByUsername(String username);

    @Transactional
    @Modifying
    @Query("UPDATE User u SET u.password = :password WHERE u.username = :username") //JQPL
    void changePassword(@Param("username") String username, @Param("password") String newPassword);
}
