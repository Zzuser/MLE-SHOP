package com.tedu.mle.shopend.service.impl;

import com.tedu.mle.shopend.dao.ChildMenuDAO;
import com.tedu.mle.shopend.dao.FatherMenuDAO;
import com.tedu.mle.shopend.dao.ShopDAO;
import com.tedu.mle.shopend.entity.ChildMenu;
import com.tedu.mle.shopend.entity.FatherMenu;
import com.tedu.mle.shopend.entity.Shop;
import com.tedu.mle.shopend.service.ShopService;
import com.tedu.mle.common.exception.ServiceException;
import com.tedu.mle.common.vo.ShopVo;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.UUID;


/**
 * @author zz
 */
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    ChildMenuDAO childMenuDAO;
    @Autowired
    ShopDAO shopDAO;
    @Autowired
    FatherMenuDAO fatherMenuDAO;

    @Override
    public Shop selectByPhone(String phone) {
        return shopDAO.selectByPhone(phone);
    }

    @Override
    public ShopVo findShopVoByShopId(long shopId) {
        //1.根据主键查询店铺信息附带折扣列表
        Shop shop = new Shop();
        shop.setShopId(shopId);
        shop = shopDAO.selectWithDiscountList(shop).get(0);
        //2.根据商铺id查询主菜单信息
        FatherMenu fatherMenu = new FatherMenu();
        fatherMenu.setShopIdF(shopId);
        fatherMenu = fatherMenuDAO.selectSelective(fatherMenu).get(0);
        //3.根据总菜单id查询子菜单信息附带菜品列表
        ChildMenu childMenu = new ChildMenu();
        childMenu.setFatherMenuIdF(fatherMenu.getFatherMenuId());
        List<ChildMenu> childMenus = childMenuDAO.selectWithDishList(childMenu);
        //4.构建商铺VO
        ShopVo shopVo = new ShopVo();
        shopVo.setShop(shop);
        shopVo.setFatherMenu(fatherMenu);
        shopVo.setChildMenuList(childMenus);
        return shopVo;
    }

    @Override
    public ShopVo findFatherMenuById(Long fatherMenuId) {
        //1.根据主键查询店铺信息附带折扣列表
        FatherMenu fatherMenu = fatherMenuDAO.selectByPrimaryKey(fatherMenuId);
        //3.根据总菜单id查询子菜单信息附带菜品列表
        ChildMenu childMenu = new ChildMenu();
        childMenu.setFatherMenuIdF(fatherMenu.getFatherMenuId());
        List<ChildMenu> childMenus = childMenuDAO.selectWithDishList(childMenu);
        //4.构建商铺VO
        ShopVo shopVo = new ShopVo();
        shopVo.setFatherMenu(fatherMenu);
        shopVo.setChildMenuList(childMenus);
        return shopVo;
    }

    @Override
    public List<FatherMenu> findAllFatherMenuByShopId(Long shopId) {
        //2.根据商铺id查询主菜单信息
        if (shopId == null || shopId == 0) {
            throw new IllegalArgumentException("参数不正确");
        }
        FatherMenu fatherMenu = new FatherMenu();
        fatherMenu.setShopIdF(shopId);
        List<FatherMenu> fatherMenus = fatherMenuDAO.selectSelective(fatherMenu);
        return fatherMenus;
    }

    @Override
    public void activeFatherMenu(Long fatherMenuId, Long shopIdF) {
        //1,根据店铺id关闭所有总菜单
        fatherMenuDAO.offFatherMenu(shopIdF);
        //2，根据总菜单id激活总菜单
        fatherMenuDAO.activeFatherMenu(fatherMenuId);
    }

    @Override
    public List<Shop> findShopsWithDiscountListByCategoryId(Long shopCategoryId) {
        return shopDAO.selectWithDiscountListByCategoryId(shopCategoryId);
    }
    
  //基于店铺账户id查询店铺信息
  	@Override
  	public Shop selectByPrimaryKey(Long shopId) {
  		//验证参数合法性
  		if (shopId==null || shopId<1) {
  			throw new ServiceException("商户账户不正确");
  		}
  		//查询当前页信息
  		Shop shop = shopDAO.selectByPrimaryKey(shopId);
  		return shop;
  	}

  	
  	@Override
  	public int updateShopByPrimaryKey(Shop record) {
  		//参数验证
  		if (record == null) {
  			throw new ServiceException("用户信息不能为空");
  		}
  		if (StringUtils.isEmpty(record.getPhone())) {
  			throw new ServiceException("商户电话不能为空");
  		}
  		if (StringUtils.isEmpty(record.getAddress())) {
  			throw new ServiceException("商户地址不能为空");
  		}
  		if (StringUtils.isEmpty(record.getPassword())) {
  			throw new ServiceException("商户密码不能为空");
  		}
  		//密码
		String salt = UUID.randomUUID().toString();
		record.setSalt(salt);
		SimpleHash sHash = new SimpleHash("MD5",record.getPassword(), salt);
		record.setPassword(sHash.toString());
  		//更新数据
  		int rows = shopDAO.updateShopByPrimaryKey(record);
  		return rows;
  	}

	/**
	 * 更改店铺状态
	 * @param record
	 * @return
	 */
	@Override
	public int updateShopState(Shop record) {
		//参数验证
		if (record==null) {
			throw new ServiceException("商户信息不能为空");
		}
		int rows = shopDAO.updateShopState(record);
		return rows;
	}

	@Override
	public int shanghuzhuce(Shop shop) {
		//1.进行参数有效性验证
				if(StringUtils.isEmpty(shop.getShopName()))
					throw new ServiceException("店家名不能为空");
				if(StringUtils.isEmpty(shop.getPhone()))
					throw new ServiceException("联系电话不能为空");
				if(StringUtils.isEmpty(shop.getManagerName()))
					throw new ServiceException("责任人姓名不能为空");
				if(StringUtils.isEmpty(shop.getManagerIdcard()))
					throw new ServiceException("身份证号不能为空");
				if(StringUtils.isEmpty(shop.getPassword()))
					throw new ServiceException("管理密码不能为空");
				if(StringUtils.isEmpty(shop.getAddress()))
					throw new ServiceException("地址不能为空");
				//2.查询记录并进行验证
				Shop sp = shopDAO.selectByPhoneNum(shop.getPhone());
				if(sp!=null){
				throw  new ServiceException("该手机号已经注册过，请登录即可");	
				}
				//密码加密
				String salt = UUID.randomUUID().toString();
				shop.setSalt(salt);
				SimpleHash sHash = new SimpleHash("MD5",shop.getPassword(), salt);
				shop.setPassword(sHash.toString());
				//3.进行商户注册
				int rows = shopDAO.insert(shop);
				//4.返回一个值
				return rows;
	}

}
