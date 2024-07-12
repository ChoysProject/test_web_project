package com.example.demo.config;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SomeComponent {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void doSomething() {
        // JdbcTemplate을 사용하여 SQL 쿼리 실행
        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT * FROM employees.empTbl");
        // 결과 처리
        log.info("check result value :: {}", result);
    }
    
}
