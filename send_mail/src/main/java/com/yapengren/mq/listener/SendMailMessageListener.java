package com.yapengren.mq.listener;

import com.yapengren.bos.utils.MailUtils;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

@Component("sendMileMessageListener")
public class SendMailMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        //强转为map 消息
        MapMessage mm = (MapMessage) message;

        try {
            //从消息中取出发送邮件相关消息
            String title = mm.getString("title");
            String content = mm.getString("content");
            String to = mm.getString("to");

            //发送邮件
            MailUtils.sendMail(title, content, to);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
