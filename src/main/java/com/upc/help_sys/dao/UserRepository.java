package com.upc.help_sys.dao;

import com.upc.help_sys.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Liuyibo on 2017/4/27.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
