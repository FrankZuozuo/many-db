package com.wretchant.manydb.mapper.titan;

import com.wretchant.manydb.domain.Amd;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Created by 谭健 on 2019/7/19. 星期五. 10:38.
 * © All Rights Reserved.
 */
@Repository
public interface AmdMapper {

    @Select("select * from amd")
    List<Amd> findAll();
}
