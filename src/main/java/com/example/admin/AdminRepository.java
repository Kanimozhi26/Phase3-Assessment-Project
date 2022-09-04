package com.example.admin;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.admin.Admin;
public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
