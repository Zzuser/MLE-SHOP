package com.tedu.mle.shopend.controller;

import com.tedu.mle.common.vo.JsonResult;
import com.tedu.mle.shopend.entity.ChildMenu;
import com.tedu.mle.shopend.entity.Dish;
import com.tedu.mle.shopend.entity.FatherMenu;
import com.tedu.mle.shopend.service.ChildMenuService;
import com.tedu.mle.shopend.service.DishService;
import com.tedu.mle.shopend.service.FatherMenuService;
import com.tedu.mle.shopend.service.ShopService;
import com.tedu.mle.common.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;


/**
 * 处理菜单及菜品请求的控制器
 *
 * @author zz
 */
@Controller
@RequestMapping("/dishAndMenu/")
public class DishAndMenuController {
    @Autowired
    ShopService shopService;
    @Autowired
    private FatherMenuService fatherMenuService;
    @Autowired
    private ChildMenuService childMenuService;
    @Autowired
    private DishService dishService;
    /**
     * 根据子菜单的id显示菜品数据
     * @param ChildMenuId 子菜单的id
     * @return 返回菜单信息
     */
    @RequestMapping("dojumpObject")
    public String dojumpObject(){
		return "/dish/menu_edit";
    	
    }
    /**
     * 返回主菜单页面
     *
     * @return 菜单页面
     */
    @RequestMapping("doGetFatherMenuUI")
    public String doGetFatherMenuUI() {
        return "dish/father_menu";
    }

    /**
     * 返回子菜单页面
     *
     * @return 菜单页面
     */
    @RequestMapping("doGetChildMenuUI")
    public String doGetChildMenuUI() {
        return "dish/child_menu";
    }
    @RequestMapping("doDeleteDish")
    @ResponseBody
    public JsonResult doDeleteDish(Long dishId){
    	dishService.doDeleteDish(dishId);
    	return new JsonResult("删除成功");
    }
    /**
     * 修改根据菜品id修改菜品
     * @param dish 修改的菜品对象
     * @return 返回修改的数据
     */
    @RequestMapping("doUpdateDishObjects")
    @ResponseBody
    public JsonResult doUpdateDishObjects(Dish dish){
    	dishService.UpdateDish(dish);
    	return new JsonResult("菜品修改成功");
    }
    /**
     * 向菜单中添加菜品
     * @param dish 菜品信息
     * @return 添加的菜品信息
     */
    @RequestMapping("doAddDishObjects")
    @ResponseBody
    public JsonResult doAddDishObjects(Dish dish){
    	dishService.InsertIntoDish(dish);
		return new JsonResult("菜品添加成功");
    	
    }
    /**
     * 根据商铺id查询其总菜单列表
     *
     * @param shopId 商铺id
     * @return 总菜单列表
     */
    @RequestMapping("doGetFatherMenus")
    @ResponseBody
    public JsonResult doGetFatherMenus(Long shopId) {
        List<FatherMenu> fatherMenuList = shopService.findAllFatherMenuByShopId(shopId);
        return new JsonResult(fatherMenuList);
    }

    /**
     * 根据商铺id返回一个完整的商铺页面信息
     *
     * @param shopId 商铺id
     * @return 完整的商铺页面信息
     */
    @RequestMapping("doFindShopVoByShopId")
    @ResponseBody
    public JsonResult doFindShopVoByShopId(Long shopId) {
        return new JsonResult(shopService.findShopVoByShopId(shopId));
    }

    /**
     * 根据主菜单id获取主菜单及其下属子菜单列表
     *
     * @param fatherMenuId 主菜单id
     * @return 主菜单及其下属子菜单列表
     */
    @RequestMapping("doFindFatherMenuById")
    @ResponseBody
    public JsonResult doFindFatherMenuById(Long fatherMenuId) {
        return new JsonResult(shopService.findFatherMenuById(fatherMenuId));
    }
    
    /**
     * 修改子菜单信息
     *
     * @param json 要修改的信息
     * @return 修改结果
     */
    @RequestMapping("doModifyChildMenu")
    @ResponseBody
    public JsonResult doModifyChildMenu(String json) {
        List<ChildMenu> childMenus = JsonUtil.readListValue(json, ChildMenu.class);
        childMenuService.updateByPrimaryKeySelective(childMenus);
        return new JsonResult("修改成功");
    }

    /**
     * 添加子菜单
     *
     * @param json 新子菜单
     * @return 添加结果
     */
    @RequestMapping("doAddChildMenu")
    @ResponseBody
    public JsonResult doAddChildMenu(String json) {
        List<ChildMenu> childMenus = JsonUtil.readListValue(json, ChildMenu.class);
        childMenuService.InsertIntoChildMenu(childMenus); 
     
        return new JsonResult("添加成功");
    }

    /**
     * 删除子菜单
     *
     * @param childMenuId 要删除的子菜单id
     * @return 删除结果
     */
    @RequestMapping("doDeleteChildMenu")
    @ResponseBody
    public JsonResult doDeleteChildMenu(Long childMenuId) {
    	childMenuService.deleteByPrimaryKey(childMenuId);
        return new JsonResult("删除成功");
    }

    /**
     * 修改总菜单信息
     *
     * @param fatherMenuName 总菜单名称
     * @param desc           总菜单描述备注
     * @return 修改结果
     */
    @RequestMapping("doModifyFatherMenu")
    @ResponseBody
    public JsonResult doModifyFatherMenu(Long fatherMenuId,String fatherMenuName, String desc) {
    	fatherMenuService.updateByPrimaryKeySelective(fatherMenuId,fatherMenuName,desc);
        return new JsonResult("修改成功");
    }

    /**
     * 添加总菜单信息
     *
     * @param shopIdF        商铺id
     * @param fatherMenuName 总菜单名称
     * @param desc           总菜单描述备注
     * @return 添加结果
     */
    @RequestMapping("doAddFatherMenu")
    @ResponseBody
    public JsonResult doAddFatherMenu(Long shopIdF, String fatherMenuName, String desc) {
    	fatherMenuService.insertChildMenuObject(shopIdF, fatherMenuName, desc);
        return new JsonResult("添加成功");
    }

    /**
     * 根据总菜单id删除总菜单
     *
     * @param fatherMenuId 菜单id
     * @return 删除结果
     */
    @RequestMapping("doDeleteFatherMenu")
    @ResponseBody
    public JsonResult doDeleteFatherMenu(Integer fatherMenuId) {
    	fatherMenuService.deleteByMenuId(fatherMenuId);
        return new JsonResult("删除成功");
    }

    /**
     * 根据总菜单id激活总菜单
     *
     * @param fatherMenuId 菜单id
     * @return 激活结果
     */
    @RequestMapping("doActiveFatherMenu")
    @ResponseBody
    public JsonResult doActiveFatherMenu(Long fatherMenuId, Long shopIdF) {
        shopService.activeFatherMenu(fatherMenuId, shopIdF);
        System.out.println("fatherMenuId:" + fatherMenuId);
        System.out.println("shopIdF:" + shopIdF);
        return new JsonResult("激活成功");
    }

}