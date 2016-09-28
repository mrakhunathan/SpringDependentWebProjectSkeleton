package com.organization.applicationname.base.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.organization.applicationname.base.entities.SampleEntity;

@Repository
public interface SampleEntityRepository extends JpaRepository<SampleEntity, Serializable> {

}
