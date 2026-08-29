package com.tanuj.valuation_tool.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tanuj.valuation_tool.model.Company;

@Repository
public interface CompanyRepository  extends JpaRepository<Company,Long>{
    Optional<Company> findByTicker(String ticker);
}
