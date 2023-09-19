package com.mqconsumer.demo.repository;

import com.mqconsumer.demo.domain.MQData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface MQDataRepository extends JpaRepository<MQData, Serializable> {

}
