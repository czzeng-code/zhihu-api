package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.RoundTable;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author ZENG
 */
public interface RoundTableMapper {
    /**
     * 查询最热圆桌
     * @return List<RoundTable>
     */
    @Select("SELECT * FROM t_round_table ORDER BY visits_count DESC LIMIT 0,4 ")
    List<RoundTable> selectHot();

    /**
     * 查询所有圆桌
     * @return List<Map>
     */
    @Select("SELECT * FROM t_round_table ")
    List<Map> selectAll();
}
