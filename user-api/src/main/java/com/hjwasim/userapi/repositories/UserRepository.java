package com.hjwasim.userapi.repositories;

import com.hjwasim.userapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByPan(String pan);
    List<User> queryByNameLike(String name);
}
