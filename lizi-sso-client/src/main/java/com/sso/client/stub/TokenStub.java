package com.sso.client.stub;

import com.sso.client.facade.TokenFacade;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author Jun Yang
 * @Date 2020/12/29 5:54 下午
 * @Version 1.0
 */
@FeignClient(name = "${service.lizi.sso:lizi-sso-service}")
public interface TokenStub extends TokenFacade {


}



