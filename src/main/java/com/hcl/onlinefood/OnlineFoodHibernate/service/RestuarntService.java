package com.hcl.onlinefood.OnlineFoodHibernate.service;

import com.hcl.onlinefood.OnlineFoodHibernate.beans.Owner;
import com.hcl.onlinefood.OnlineFoodHibernate.beans.Restuarent;
import com.hcl.onlinefood.OnlineFoodHibernate.exception.UserInputException;
import com.hcl.onlinefood.OnlineFoodHibernate.respository.IOwnerDao;
import com.hcl.onlinefood.OnlineFoodHibernate.respository.IRestuarentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestuarntService {
    @Autowired
    private IRestuarentDao dao;

    @Autowired
    private IOwnerDao ownerDao;


    public Restuarent addResturant1(Restuarent resturant) {

        ownerDao.saveAll(resturant.getOwner2());
        return dao.saveAndFlush(resturant);
    }

    public List<Owner> displayOwner() {
        return ownerDao.findAll();

    }

    public List<Restuarent> displayResturants() {
        return dao.findAll();
    }

    public Restuarent searchByResName(String resName) {
        return dao.findByResName(resName);
    }

    public List<Restuarent> searchByResRating1(double resRating) {
        return dao.searchByResRating1(resRating);
    }

    public List<Restuarent> searchByResRating(double resRating) {
        return dao.findByResRating(resRating);
    }

    public Restuarent searchRestuarnt(int id3) throws UserInputException {
        if (dao.findById(id3).isPresent()) {
            return dao.findById(id3).get();
        } else
            throw new UserInputException("ID dosen't exists can't search");
    }

    public boolean deleteResturant(int id) throws UserInputException {
        if (dao.findById(id).isPresent()) {
            dao.deleteById(id);
            return true;
        } else
            throw new UserInputException("ID dosen't exists can't delete");
    }

    public boolean updateRestuarent(int id, Restuarent resturant) throws UserInputException {
        if (dao.findById(id).isPresent()) {
            ownerDao.saveAll(resturant.getOwner2());
            dao.saveAndFlush(resturant);

            return true;
        } else
            throw new UserInputException("ID dosen't exists can't update");
    }

//    public boolean updateRestuzrent(int id, Restuarent resturant) throws UserInputException {
//        if (dao.findById(id).isPresent()) {
//            dao.saveAndFlush(resturant);
//            return true;
//        } else
//            throw new UserInputException("ID dosen't exists can't update");
//    }
}
