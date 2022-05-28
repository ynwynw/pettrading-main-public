package com.example.dao;

import com.example.domain.BKind;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BKindMapper {
    @Insert("insert into bkind (bavatar,bkindname) value (#{bavatar},#{bkindname})")
    @Options(useGeneratedKeys = true,keyProperty = "bkid")
    int addBKind(BKind bkind);

    @Delete("delete from bkind where bkid=#{bkid}")
    int deleteBKind(Long bkid);

    int updateBKind(BKind bkind);

    @Select("select * from bkind")
    List<BKind> queryBKind();

    List<Map> queryBKindname();

    List<BKind> queryBKindandSKind(Map map);


}
