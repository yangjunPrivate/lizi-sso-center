package com.sso.web.controller.sso;

import com.sso.client.param.LoginBody;
import com.sso.client.stub.TokenStub;
import com.sso.client.vo.R;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Jun Yang
 * @Date 2021/3/26 11:51 下午
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/sso-center/token/")
public class TokenController implements TokenStub {


    @Override
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public R<?> login(@RequestParam("loginBody") LoginBody loginBody){
        return null;
    }

    @Override
    @DeleteMapping(value = "logout")
    public R<?> logout(@RequestParam(value = "token") String token) {
        return null;
    }

    @Override
    @RequestMapping(value = "refresh", method = RequestMethod.POST)
    public R<?> refresh(@RequestParam(value = "token") String token) {
        return null;
    }
}
