package com.myProject.myProject.Repository.Admin;

import com.myProject.myProject.Model.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminUser, String> {


}
