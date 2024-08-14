package com.studies.projetosbjpa.repositories;

import com.studies.projetosbjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
