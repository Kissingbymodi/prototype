package com.cug.prototype.dao;

import com.cug.prototype.entity.TaxiEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ITaxiMapper {

    List<TaxiEntity> queryAllTaxi();

}
