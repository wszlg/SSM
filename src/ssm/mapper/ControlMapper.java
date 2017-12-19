package ssm.mapper;

import org.apache.ibatis.annotations.Param;
import ssm.po.Control;
import ssm.po.ControlExample;

import java.util.List;

public interface ControlMapper {
    int countByExample(ControlExample example);

    int deleteByExample(ControlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Control record);

    int insertSelective(Control record);

    List<Control> selectByExample(ControlExample example);

    Control selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Control record, @Param("example") ControlExample example);

    int updateByExample(@Param("record") Control record, @Param("example") ControlExample example);

    int updateByPrimaryKeySelective(Control record);

    int updateByPrimaryKey(Control record);
}