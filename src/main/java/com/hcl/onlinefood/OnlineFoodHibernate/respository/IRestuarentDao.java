package com.hcl.onlinefood.OnlineFoodHibernate.respository;

import com.hcl.onlinefood.OnlineFoodHibernate.beans.Restuarent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRestuarentDao extends JpaRepository<Restuarent, Integer> {
    public Restuarent findByResName(String resName);

    public List<Restuarent> findByResRating(double resRating);

    @Query(value = "select * from resturant where res_rating >:rating", nativeQuery = true)
    public List<Restuarent> searchByResRating1(@Param("rating") double rating);

//    @Query(value="select * from resturant r inner join owner o  ")
//    public List<Restuarent> searchByOwnerName(@Param("ownerName") String ownerName);

}
