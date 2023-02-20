package com.ex;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InfosysRepository extends JpaRepository<Infosys,Integer>{

	@Modifying
	@Transactional
	@Query("update Infosys i set i.salary=?1 where i.eid=?2")
	public void update(int salary,int id);
}