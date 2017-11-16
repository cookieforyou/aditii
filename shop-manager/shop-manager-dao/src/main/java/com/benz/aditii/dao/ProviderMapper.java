package com.benz.aditii.dao;

import com.benz.aditii.pojo.po.Provider;
import com.benz.aditii.pojo.po.ProviderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProviderMapper {
    int countByExample(ProviderExample example);

    int deleteByExample(ProviderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Provider record);

    int insertSelective(Provider record);

    List<Provider> selectByExampleWithBLOBs(ProviderExample example);

    List<Provider> selectByExample(ProviderExample example);

    Provider selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Provider record, @Param("example") ProviderExample example);

    int updateByExampleWithBLOBs(@Param("record") Provider record, @Param("example") ProviderExample example);

    int updateByExample(@Param("record") Provider record, @Param("example") ProviderExample example);

    int updateByPrimaryKeySelective(Provider record);

    int updateByPrimaryKeyWithBLOBs(Provider record);

    int updateByPrimaryKey(Provider record);
}