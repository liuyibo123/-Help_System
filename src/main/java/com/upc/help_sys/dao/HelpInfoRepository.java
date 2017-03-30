package com.upc.help_sys.dao;

import com.upc.help_sys.dao.entity.HelpInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by Liuyibo on 2017/3/25.
 * 对Helo_inf(帮助信息)类的数据库管理接口
 * 功能1:使用.save(HelpInfo helpinfo)保存到数据库
 *
 */
@Repository
public interface HelpInfoRepository extends JpaRepository<HelpInfo,Integer> {

}
