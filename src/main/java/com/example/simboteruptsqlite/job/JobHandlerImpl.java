package com.example.simboteruptsqlite.job;

import com.example.simboteruptsqlite.runsuccess.RunSuccess;
import love.forte.simbot.bot.BotManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.erupt.core.annotation.EruptHandlerNaming;
import xyz.erupt.job.handler.EruptJobHandler;

@Service
@EruptHandlerNaming("JobHandlerImpl")  // 如果不添加此配置，类名会作为前端展示依据
public class JobHandlerImpl implements EruptJobHandler {

    /**
     * @param code 任务编码
     * @param param 任务参数
     */
    @Override
    public String exec(String code, String param) {
        BotManager botManager = RunSuccess.getBotManager();
        botManager.getBot(botManager.getBots().get(0)).getSender().SENDER.sendPrivateMsg("3183740142","启动成功111");

        // TODO
        return null;
    }

}