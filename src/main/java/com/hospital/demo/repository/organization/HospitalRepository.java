package com.hospital.demo.repository.organization;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hospital.demo.entity.organization.Hospital;

@Repository
public interface HospitalRepository extends MongoRepository<Hospital, String> {

}
