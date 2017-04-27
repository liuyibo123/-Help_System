package com.upc.help_sys.dao;

import com.upc.help_sys.dao.entity.MainTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by Liuyibo on 2017/4/23.
 */
@Repository
public interface MainTableRepository extends JpaRepository<MainTable, Integer> {
    MainTable findTopByOrderByIdDesc();

}
