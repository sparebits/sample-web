package com.faac.sample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.faac.sample.domain.Configuration;

@Component
public class ConfigurationDao {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public List<Configuration> getAll() {
        return jdbcTemplate.query("SELECT * FROM configuration", (rs, num) -> {
                Configuration config = new Configuration();
                config.setId(rs.getLong(1));
                return config;
            });
    }

}
