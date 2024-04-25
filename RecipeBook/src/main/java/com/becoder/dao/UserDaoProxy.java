package com.becoder.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import com.becoder.entity.Recipe;
import com.becoder.entity.User;
import com.becoder.entity.continental;
import com.becoder.entity.desserts;
import com.becoder.entity.fastfood;
import com.becoder.entity.indian;
import com.becoder.entity.request;


public class UserDaoProxy implements UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoProxy.class);
    private UserDao userDao;

    public UserDaoProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int saveUser(User user) {
        logger.info("Saving user: {}", user);
        return userDao.saveUser(user);
    }

    @Override
    public User login(String email, String password) {
        logger.info("Logging in with email: {}", email);
        return userDao.login(email, password);
    }

    @Override
    public void deleteUser(int userId) {
        logger.info("Deleting user with ID: {}", userId);
        userDao.deleteUser(userId);
    }

    @Override
    public List<Recipe> getRecipe() {
        return userDao.getRecipe();
    }

    @Override
    public Recipe getRecipeById(int id) {
        return userDao.getRecipeById(id);
    }

    @Override
    public void likeRecipe(int recipeId) {
        userDao.likeRecipe(recipeId);
    }

    @Override
    public List<Recipe> searchBeverages(String query) {
        return userDao.searchBeverages(query);
    }

    @Override
    public void likeIndian(int recipeId) {
        userDao.likeIndian(recipeId);
    }

    @Override
    public List<indian> searchIndian(String query) {
        return userDao.searchIndian(query);
    }

    @Override
    public List<indian> getIndian() {
        return userDao.getIndian();
    }

    @Override
    public indian getIndianById(int id) {
        return userDao.getIndianById(id);
    }

    @Override
    public void likeContinental(int recipeId) {
        userDao.likeContinental(recipeId);
    }

    @Override
    public List<continental> searchContinental(String query) {
        return userDao.searchContinental(query);
    }

    @Override
    public List<continental> getContinental() {
        return userDao.getContinental();
    }

    @Override
    public continental getContinentalById(int id) {
        return userDao.getContinentalById(id);
    }

    @Override
    public void likeFastfood(int recipeId) {
        userDao.likeFastfood(recipeId);
    }

    @Override
    public List<fastfood> searchFastfood(String query) {
        return userDao.searchFastfood(query);
    }

    @Override
    public List<fastfood> getFastfood() {
        return userDao.getFastfood();
    }

    @Override
    public fastfood getFastfoodById(int id) {
        return userDao.getFastfoodById(id);
    }

    @Override
    public void likeDesserts(int recipeId) {
        userDao.likeDesserts(recipeId);
    }

    @Override
    public List<desserts> searchDesserts(String query) {
        return userDao.searchDesserts(query);
    }

    @Override
    public List<desserts> getDesserts() {
        return userDao.getDesserts();
    }

    @Override
    public desserts getDessertsById(int id) {
        return userDao.getDessertsById(id);
    }

    @Override
    public int saveRequest(request in) {
        return userDao.saveRequest(in);
    }
}
