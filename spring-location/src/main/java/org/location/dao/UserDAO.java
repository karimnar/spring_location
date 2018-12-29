package org.location.dao;

import org.location.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
	
	public void ajouter_user(User u);
	
}
