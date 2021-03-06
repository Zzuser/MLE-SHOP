package com.tedu.mle.shopend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.mle.shopend.dao.ChildMenuDAO;
import com.tedu.mle.shopend.dao.DishWithChildMenuDAO;
import com.tedu.mle.shopend.entity.ChildMenu;
import com.tedu.mle.common.exception.ServiceException;
import com.tedu.mle.shopend.service.ChildMenuService;

/**
 * 子菜单的增删改查
 *
 * @author lizhe
 */
@Service
public class ChildMenuServiceImpl implements ChildMenuService {
    @Autowired
    private ChildMenuDAO childMenuDao;
    @Autowired
    private DishWithChildMenuDAO dishWithChildMenuDao;

    /**
     * 添加子菜单模块
     */
    @Override
    public int InsertIntoChildMenu(List<ChildMenu> childMenus) {
        //1.验证提交添加信息
        if (childMenus == null) {
            throw new IllegalArgumentException("请修改");
        }
        int rows = 0;
        //2.遍历添加信息
        for (int i = 0; i < childMenus.size(); i++) {
            //3.封装添加信息
            ChildMenu childMenu = new ChildMenu();
            //4.验证添加信息是否为空
            if (childMenus.get(i).getChildMenuName() == null || childMenus.get(i).getChildMenuName().equals("")) {
                throw new ServiceException("请输入子菜单名字");
            }
            childMenu.setChildMenuName(childMenus.get(i).getChildMenuName());
            childMenu.setFatherMenuIdF(childMenus.get(i).getFatherMenuIdF());
            childMenu.setShooIdF(childMenus.get(i).getShooIdF());
            //5.执行添加操作
            rows = childMenuDao.insert(childMenu);
            if (rows == 0) {
                throw new ServiceException("添加子菜单失败");
            }
        }
        return rows;
    }

    /**
     * 子菜单的删除
     */
    @Override
    public int deleteByPrimaryKey(List<Long> childMenuId) {
        //1.验证是否选中删除
        int rows = 0;
        if (childMenuId == null || childMenuId.size() == 0) {
            throw new IllegalArgumentException("删除子菜单的id错误");
        }
        for (Long id : childMenuId) {
            if (id < 0) {
                throw new IllegalArgumentException("删除子菜单的id错误");
            }
            List<Long> list = dishWithChildMenuDao.selectByPrimaryKey(id);
            System.out.println("list" + list.size());
            if (list.size() != 0) {
                throw new ServiceException("菜单中存在数据无法删除");
            } else {
//            int delete = dishWithChildMenuDao.deleteByPrimaryKey(id);
                //2.执行删除操作
                rows = childMenuDao.deleteByPrimaryKey(id);
                //3.验证操作是否成功
                if (rows == 0) {
                    throw new ServiceException("删除失败");
                }

            }
        }
        //4.返回结果
        return rows;
    }

    /**
     * 子菜单模块的修改
     */
    @Override
    public int updateByPrimaryKeySelective(List<ChildMenu> childMenus) {
        //1.验证修改信息
        if (childMenus == null) {
            throw new IllegalArgumentException("子菜单的修改信息有误");
        }
        int rows = 0;
        //2.遍历获取修改信息
        for (int i = 0; i < childMenus.size(); i++) {
            //3.封装修改信息
            ChildMenu childMenu = new ChildMenu();
            if (childMenus.get(i).getChildMenuName() == null || childMenus.get(i).getChildMenuName().equals("")) {
                throw new ServiceException("修改的菜单名称不可为空");
            }
            childMenu.setChildMenuName(childMenus.get(i).getChildMenuName());
            childMenu.setFatherMenuIdF(childMenus.get(i).getFatherMenuIdF());
            childMenu.setShooIdF(childMenus.get(i).getShooIdF());
            childMenu.setChildMenuId(childMenus.get(i).getChildMenuId());
            //4.执行修改操作
            rows = childMenuDao.updateByPrimaryKeySelective(childMenu);
            if (rows == 0) {
                throw new ServiceException("修改子菜单失败");
            }
        }
        //5.返回结果
        return rows;
    }


}


