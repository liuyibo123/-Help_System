package com.upc.help_sys.dao;

import com.upc.help_sys.dao.entity.MainTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by Liuyibo on 2017/5/9.
 */
@Repository
public interface MainTableRepository extends JpaRepository<MainTable, Integer> {
    @Query(value = "update maintable set accept_person=?1 where id=?2 ", nativeQuery = true)
    @Modifying
    void updateAcceptperson(int accept, int id);

    @Query(value = "update maintable set state=?1 where id=?2 ", nativeQuery = true)
    @Modifying
    void updateState(int state, int id);

    @Query(value = "update maintable set tip=?1 where id=?2 ", nativeQuery = true)
    @Modifying
    void updateTip(float tip, int id);

    @Query(value = "update maintable set pub_loc=?1 where id=?2 ", nativeQuery = true)
    @Modifying
    void updatePub_loc(String pub_loc, int id);

    @Query(value = "update maintable set help_loc=?1 where id=?2 ", nativeQuery = true)
    @Modifying
    void updateHelp_loc(String help_loc, int id);

}
