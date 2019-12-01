package com.project.infnet.javaproject.Repository;

import com.project.infnet.javaproject.domain.Proposal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProposalRepository extends CrudRepository <Proposal,Long>{

}