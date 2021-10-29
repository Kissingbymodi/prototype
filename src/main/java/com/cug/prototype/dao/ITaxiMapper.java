package com.cug.prototype.dao;

import com.cug.prototype.entity.TaxiEntity;

import java.util.List;

public interface ITaxiMapper {

    List<TaxiEntity> queryAllTaxi();

}
