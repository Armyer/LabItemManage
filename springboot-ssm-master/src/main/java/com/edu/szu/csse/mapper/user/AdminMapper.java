package com.edu.szu.csse.mapper.user;

import com.edu.szu.csse.bean.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by jiang on 2020/6/5.
 */
@Mapper
public interface AdminMapper {

    /**
     * 新增Admin
     * @param admin
     * @return
     */
    int insert(Admin admin);

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

}
