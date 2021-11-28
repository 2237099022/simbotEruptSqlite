package com.example.simboteruptsqlite.runsuccess;

import cn.hutool.extra.spring.SpringUtil;
import love.forte.simbot.bot.BotManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RunSuccess {

    @Autowired
    private static BotManager botManager;

    public static void RunSuccess() {
        botManager=SpringUtil.getBean("simbotBotManager");
        botManager.getBot(botManager.getBots().get(0)).getSender().SENDER.sendPrivateMsg("3183740142","启动成功");

    }

    public static BotManager getBotManager() {
        return botManager;
    }

}
