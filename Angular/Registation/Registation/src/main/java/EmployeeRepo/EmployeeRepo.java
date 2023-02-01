package EmployeeRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import DT0.EmployeeDTO;

@EnableJpaRepositories
@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeDTO,Integer> {
}