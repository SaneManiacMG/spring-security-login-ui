package com.smworks.springauthapp.repository;

import com.smworks.springauthapp.model.Attempts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AttemptsRepository extends JpaRepository<Attempts, String> {

    Optional<Attempts> findAttemptsByUsername(String username);
}
