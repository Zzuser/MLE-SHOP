package com.tedu.mle.shopend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.mle.shopend.dao.FatherMenuDAO;
import com.tedu.mle.shopend.entity.FatherMenu;
import com.tedu.mle.common.exception.ServiceException;
import com.tedu.mle.shopend.service.FatherMenuService;

import java.util.List;

@Service
public class FatherMenuServiceImpl implements FatherMenuService {
    @Autowired
    private FatherMenuDAO fatherMenuDao;

    /**
     * 添加总菜单
     */
    @Override
    public int insertChildMenuObject(Long shopIdF, String fatherMenuName, String desc) {
        //1.菜单信息的输入验证
        if (shopIdF == null || shopIdF <= 0) {
            throw new IllegalArgumentException("总菜单的id不可以为空");
        }
        if (fatherMenuName == null) {
            throw new ServiceException("总菜单名称不可为空");
        }
        if (desc == null) {
            throw new ServiceException("总菜单的简介不可为空");
        }
        //2.菜单信息的封装
        FatherMenu fatherMenu = new FatherMenu();
        fatherMenu.setShopIdF(shopIdF);
        List<FatherMenu> fatherMenus = fatherMenuDao.selectSelective(fatherMenu);
        if (fatherMenus.size() == 0) {
            fatherMenu.setState((byte) 1);
        }
        fatherMenu.setFatherMenuName(fatherMenuName);
        fatherMenu.setDesc(desc);
        //3.执行添加操作
        int rows = fatherMenuDao.insertChildMenuObject(fatherMenu);
        //4.返回结果
        return rows;
    }

    /**
     * 删除总菜单
     */
    @Override
    public int deleteByMenuId(Integer FatherMenuId) {
        //1.验证输入的总菜单的id
        if (FatherMenuId == null || FatherMenuId <= 0) {
            throw new IllegalArgumentException("商家id不可以为空");
        }
        //2.执行删除操作
        int rows = fatherMenuDao.deleteByMenuId(FatherMenuId);
        //3.验证删除是否成功
        if (rows == 0) {
            throw new ServiceException("删除失败");
        }
        //4.返回结果
        return rows;
    }

    /**
     * 修改总菜单的信息
     */
    @Override
    public int updateByPrimaryKeySelective(Long fatherMenuId, String fatherMenuName, String desc) {
        //1.验证输入信息的信息
        if (fatherMenuName == null || fatherMenuId == null || desc == null) {
            throw new ServiceException("输入完整的信息");
        }
        //2.封装修改的信息
        FatherMenu fatherMenu = new FatherMenu();
        fatherMenu.setFatherMenuName(fatherMenuName);
        fatherMenu.setDesc(desc);
        fatherMenu.setFatherMenuId(fatherMenuId);
        //3.执行修改操作
        int rows = fatherMenuDao.updateByPrimaryKeySelective(fatherMenu);
        //4.验证修改操作是否成功
        if (rows == 0) {
            throw new ServiceException("修改不成功");
        }
        //5.返回结果
        return rows;
    }


}
