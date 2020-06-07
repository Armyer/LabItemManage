package com.edu.szu.csse.mapper.user;

import com.edu.szu.csse.bean.Admin;
import com.edu.szu.csse.bean.AdminExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by jiang on 2020/6/5.
 */
@Mapper
public interface AdminMapper {

    /**
     * 根据id删除admin
     * @param admin
     * @return
     */
    int delete(Admin admin);


    /**
     * 根据id搜索admin
     * @param admin
     * @return
     */
    Admin search(Admin admin);

    /**
     * 更新admin信息
     * @param admin
     * @return
     */
    int update(Admin admin);
    long countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}
