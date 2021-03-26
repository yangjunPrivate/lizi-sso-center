package com.sso.client.facade;


import com.sso.client.param.LoginBody;
import com.sso.client.vo.R;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Jun Yang
 * @Date 2020/12/29 5:54 下午
 * @Version 1.0
 */
public interface TokenFacade {

    /**
     * 登录
     * @param loginBody
     * @return
     */
    @RequestMapping(value = "/api/sso-center/token/login", method = RequestMethod.POST)
    R<?> login(@RequestParam("loginBody") LoginBody loginBody);


    /**
     * 登出
     * @param token
     * @return
     */
    @DeleteMapping(value = "/api/sso-center/token/logout")
    public R<?> logout(@RequestParam(value = "token") String token);


    /**
     * 刷新token
     * @param token
     * @return
     */
    @RequestMapping(value = "/api/sso-center/token/refresh", method = RequestMethod.POST)
    public R<?> refresh(@RequestParam(value = "token") String token);


}
