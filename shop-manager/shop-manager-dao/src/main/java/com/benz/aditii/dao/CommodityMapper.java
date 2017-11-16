package com.benz.aditii.dao;

import com.benz.aditii.pojo.po.Commodity;
import com.benz.aditii.pojo.po.CommodityExample;
import com.benz.aditii.pojo.po.CommodityWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityMapper {
    int countByExample(CommodityExample example);

    int deleteByExample(CommodityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CommodityWithBLOBs record);

    int insertSelective(CommodityWithBLOBs record);

    List<CommodityWithBLOBs> selectByExampleWithBLOBs(CommodityExample example);

    List<Commodity> selectByExample(CommodityExample example);

    CommodityWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CommodityWithBLOBs record, @Param("example") CommodityExample example);

    int updateByExampleWithBLOBs(@Param("record") CommodityWithBLOBs record, @Param("example") CommodityExample example);

    int updateByExample(@Param("record") Commodity record, @Param("example") CommodityExample example);

    int updateByPrimaryKeySelective(CommodityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CommodityWithBLOBs record);

    int updateByPrimaryKey(Commodity record);
}