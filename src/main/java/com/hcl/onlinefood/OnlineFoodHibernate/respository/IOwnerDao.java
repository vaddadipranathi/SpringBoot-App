package com.hcl.onlinefood.OnlineFoodHibernate.respository;

import com.hcl.onlinefood.OnlineFoodHibernate.beans.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOwnerDao extends JpaRepository<Owner, Integer> {
}
