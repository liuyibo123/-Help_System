package com.upc.help_sys.dao;

import com.upc.help_sys.dao.entity.Express;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Liuyibo on 2017/4/24.
 */
@Repository
public interface ExpressRepository extends JpaRepository<Express, Integer> {
}
