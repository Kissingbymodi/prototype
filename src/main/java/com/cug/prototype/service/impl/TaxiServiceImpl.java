package com.cug.prototype.service.impl;

import com.cug.prototype.dao.ITaxiMapper;
import com.cug.prototype.entity.TaxiEntity;
import com.cug.prototype.service.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxiServiceImpl implements TaxiService {

    @Autowired
    private ITaxiMapper taxiMapper;
    @Override
    public List<TaxiEntity> queryAllTaxi() {
        return taxiMapper.queryAllTaxi();
    }
}
