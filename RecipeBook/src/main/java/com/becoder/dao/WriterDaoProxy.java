package com.becoder.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import com.becoder.entity.Recipe;
import com.becoder.entity.indian;
import com.becoder.entity.continental;
import com.becoder.entity.fastfood;
import com.becoder.entity.desserts;
import com.becoder.entity.request;


public class WriterDaoProxy implements WriterDao {
    private static final Logger logger = LoggerFactory.getLogger(WriterDaoProxy.class);
    private WriterDao writerDao;

    public WriterDaoProxy(WriterDao writerDao) {
        this.writerDao = writerDao;
    }

    @Override
    public int saveRecipe(Recipe recipe) {
        logger.info("Saving recipe: {}", recipe);
        return writerDao.saveRecipe(recipe);
    }

    @Override
    public void deleteBeverages(int id) {
        logger.info("Deleting beverage with ID: {}", id);
        writerDao.deleteBeverages(id);
    }

    @Override
    public void updateBeverages(Recipe n) {
        logger.info("Updating beverage: {}", n);
        writerDao.updateBeverages(n);
    }

    @Override
    public List<Recipe> getRecipe() {
        return writerDao.getRecipe();
    }

    @Override
    public Recipe getRecipeById(int id) {
        return writerDao.getRecipeById(id);
    }

    @Override
    public List<indian> getRecipeInd() {
        return writerDao.getRecipeInd();
    }

    @Override
    public indian getRecipeByIdInd(int id) {
        return writerDao.getRecipeByIdInd(id);
    }

    @Override
    public int saveRecipeInd(indian in) {
        return writerDao.saveRecipeInd(in);
    }

    @Override
    public void deleteInd(int id) {
        writerDao.deleteInd(id);
    }

    @Override
    public void updateInd(indian n) {
        writerDao.updateInd(n);
    }

    @Override
    public List<continental> getRecipeCon() {
        return writerDao.getRecipeCon();
    }

    @Override
    public continental getRecipeByIdCon(int id) {
        return writerDao.getRecipeByIdCon(id);
    }

    @Override
    public int saveRecipeCon(continental in) {
        return writerDao.saveRecipeCon(in);
    }

    @Override
    public void deleteCon(int id) {
        writerDao.deleteCon(id);
    }

    @Override
    public void updateCon(continental n) {
        writerDao.updateCon(n);
    }

    @Override
    public List<fastfood> getRecipeFas() {
        return writerDao.getRecipeFas();
    }

    @Override
    public fastfood getRecipeByIdFas(int id) {
        return writerDao.getRecipeByIdFas(id);
    }

    @Override
    public int saveRecipeFas(fastfood in) {
        return writerDao.saveRecipeFas(in);
    }

    @Override
    public void deleteFas(int id) {
        writerDao.deleteFas(id);
    }

    @Override
    public void updateFas(fastfood n) {
        writerDao.updateFas(n);
    }

    @Override
    public List<desserts> getRecipeDes() {
        return writerDao.getRecipeDes();
    }

    @Override
    public desserts getRecipeByIdDes(int id) {
        return writerDao.getRecipeByIdDes(id);
    }

    @Override
    public int saveRecipeDes(desserts in) {
        return writerDao.saveRecipeDes(in);
    }

    @Override
    public void deleteDes(int id) {
        writerDao.deleteDes(id);
    }

    @Override
    public void updateDes(desserts n) {
        writerDao.updateDes(n);
    }

    @Override
    public request getRequestById(int id) {
        return writerDao.getRequestById(id);
    }

    @Override
    public List<request> getRequest() {
        return writerDao.getRequest();
    }

    @Override
    public void deleteRequest(int id) {
        writerDao.deleteRequest(id);
    }
}
