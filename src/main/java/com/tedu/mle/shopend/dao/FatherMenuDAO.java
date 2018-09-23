package com.tedu.mle.shopend.dao;

import com.tedu.mle.shopend.entity.FatherMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 总菜单相关dao
 *
 * @author zz
 */
@Repository
public interface FatherMenuDAO {
    /**
     * 根据主键删除主菜单
     *
     * @param fatherMenuId 主菜单id
     * @return 影响行数
     */
    int deleteByMenuId(Integer  fatherMenuId);

    /**
     * 新建主菜单
     *
     * @param record 新主菜单
     * @return 影响行数
     */
    int insertChildMenuObject(FatherMenu record);

    /**
     * 根据主键查询主菜单
     *
     * @param fatherMenuId 主菜单id
     * @return 查询结果
     */
    FatherMenu selectByPrimaryKey(Long fatherMenuId);

    /**
     * 可选参数查询主菜单
     *
     * @param fatherMenu 主菜单id,商铺id，主菜单名称
     * @return 查询结果
     */
    List<FatherMenu> selectSelective(FatherMenu fatherMenu);

    /**
     * 根据主键更新主菜单
     *
     * @param record 要更新的内容
     * @return 查询结果
     */
    int updateByPrimaryKeySelective(FatherMenu record);

    //    <update id="activeFatherMenu">
    //        update father_menu
    //        set state = 1
    //        where father_menu_id = #{fatherMenuId}
    //    </update>
    //
    //    <update id="offFatherMenu">
    //        update father_menu
    //        set state = 0
    //        where shop_id_f = #{shopIdF}
    //    </update>

    /**
     * 根据总菜单id激活总菜单
     *
     * @param fatherMenuId 总菜单id
     * @return 影响行数
     */
    int activeFatherMenu(Long fatherMenuId);

    /**
     * 根据店铺id关闭所有总菜单
     *
     * @param shopIdF 店铺id
     * @return 影响行数
     */
    int offFatherMenu(Long shopIdF);

}