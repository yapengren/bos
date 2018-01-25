package com.yapengren.bos.web.action.take_delivery;

import com.yapengren.bos.domain.take_delivery.WayBill;
import com.yapengren.bos.service.take_delivery.WayBillService;
import com.yapengren.bos.utils.action.BaseAction;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.io.IOException;

@Results({@Result(name = "toList", type = "redirect", location = "/pages/take_delivery/waybill_quick.html")})
public class WayBillAction extends BaseAction<WayBill> {

    @Autowired
    private WayBillService wbs;

    /**
     * 运单分页列表
     * @return
     */
    @Action("WayBillAction_pageList")
    public String pageList() {
        //查询分页列表数据
        Page<WayBill> pageBean = wbs.findPageBean(page, rows);

        page2Client(pageBean, "recArea", "sendArea", "order");

        return null;
    }

    /**
     * 保存运单
     * @return
     * @throws IOException
     */
    @Action("WayBillAction_add")
    public String add() throws IOException {
        //调用service 保存waybill，并返回保存后的id 值
        Integer id = wbs.save(model);
        //将id 值发送到页面显示
        ServletActionContext.getResponse().getWriter().write("" + id);
        return null;
    }
}
