package cn.gyyx.elves.supervisor.dao;

import cn.gyyx.elves.supervisor.model.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ApiDao {

    //查询Demo数据
    @Select("SELECT * FROM  datalist")
    List<Data> queryData();

}
