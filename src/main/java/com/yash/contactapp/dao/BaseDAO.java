package com.yash.contactapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

abstract public class BaseDAO extends NamedParameterJdbcDaoSupport {

    @Autowired
    public void setDataSource2(DataSource ds){
        super.setDataSource(ds);
    }
}
