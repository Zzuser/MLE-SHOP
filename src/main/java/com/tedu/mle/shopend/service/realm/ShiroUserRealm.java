package com.tedu.mle.shopend.service.realm;


import com.tedu.mle.common.dao.ShopDAO;
import com.tedu.mle.common.entity.Shop;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShiroUserRealm extends AuthorizingRealm {
    @Autowired
    ShopDAO shopDAO;

    /**
     * 指定加密算法和加密次数
     *
     * @param credentialsMatcher
     */
    @Override
    public void setCredentialsMatcher(CredentialsMatcher credentialsMatcher) {
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher("MD5");
        super.setCredentialsMatcher(matcher);
    }

    /**
     * 用户认证信息的获取封装
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        return null;
    }

    /**
     * 用户授权信息的获取封装
     *
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //1.获取用户身份信息
        String phone = (String) token.getPrincipal();
        //2.基于用户名获取用户
        Shop shop = shopDAO.selectByPhone(phone);
        //3.对用户信息进行验证
        System.out.println(shop.getShopName());
        System.out.println(shop.getPassword());
        System.out.println(shop.getSalt());
        //3.1验证是否为空
        if (shop == null) {
            throw new AuthenticationException("用户不存在");
        }
        //4.基于业务封装用户数据
        ByteSource credentialsSalt =
                ByteSource.Util.bytes(shop.getSalt());
        SimpleAuthenticationInfo info =
                new SimpleAuthenticationInfo(
                        shop, //principal(用户身份)
                        shop.getPassword(),//hashedCredentials(已经加密的密码)
                        credentialsSalt, //credentialsSalt(盐)
                        this.getName());//realm name
        return info;//此对象返回给谁了?认证管理器
    }
}
