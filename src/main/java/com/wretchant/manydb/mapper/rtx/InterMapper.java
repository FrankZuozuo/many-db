package com.wretchant.manydb.mapper.rtx;

import com.wretchant.manydb.domain.Inter;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Created by 谭健 on 2019/7/19. 星期五. 10:37.
 * © All Rights Reserved.
 */
@Repository
public interface InterMapper {

    @Select("select * from inter")
    List<Inter> findAll();
}
