package ru.kosenko.springshoppattern.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kosenko.springshoppattern.model.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {

  Authority findByName(String name);
}
