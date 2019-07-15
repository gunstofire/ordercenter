package com.kj.ordercenter.biz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kj.ordercenter.biz.service.OrderService;


//@Api(value ="order-service")
@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
//	@Autowired
//	ProviderInvokerService providerInvokerService;
//	
	
//	@ApiOperation(value="订单测试服务", notes="列表数据查询")
//    @ApiImplicitParams({ 
//            @ApiImplicitParam(name = "test", value = "测试写法，该接口不需要参数", required = false, paramType = "query")
//    })
	@RequestMapping(value = "list",method = RequestMethod.GET)
	public String list() {
//		//feign远程调用，provider服务
//		String romoteValue = providerInvokerService.test("testname");
		
		return orderService.list().size()+":success/";
	}
}
