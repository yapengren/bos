package com.yapengren.bos.web.action.dispatch;

import com.yapengren.bos.domain.take_delivery.Order;
import com.yapengren.bos.service.dispatch.OrderBackService;
import com.yapengren.bos.utils.action.BaseAction;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

/**
 * @author renyapeng
 */
@Results({@Result(name = "toList", type = "redirect", location = "pages/take_delivery/dispatcher.html")})
public class OrderBackAction extends BaseAction<Order> {

    @Autowired
    private OrderBackService obs;

    /**
     * 分页查询订单列表
     *
     * @return
     */
    @Action("OrderBackAction_pageList")
    public String pageList() {
        //查询分页列表数据
        Page<Order> pageBean = obs.findPageBean(page, rows);

        page2Client(pageBean, "sendArea", "recArea", "wayBill", "workBills", "courier");

        return null;
    }

    /**
     * 人工调度
     *
     * @return
     */
    @Action("OrderBackAction_manual")
    public String manuAdd() {
        obs.save(model);
        return "toList";
    }
}
