package com.codegym.repository.avatar;

import com.codegym.model.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface IAvatarRepository extends JpaRepository<Avatar, Long> {
    @Query(value = "select * from avatars where provider_id = :id", nativeQuery = true)
    Optional<Avatar> findByProvider_Id(@Param("id") Long id);
}
