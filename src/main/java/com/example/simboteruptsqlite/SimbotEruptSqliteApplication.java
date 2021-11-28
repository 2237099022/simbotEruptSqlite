package com.example.simboteruptsqlite;

import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.example.simboteruptsqlite.runsuccess.RunSuccess;
import love.forte.simbot.api.sender.BotSender;
import love.forte.simbot.bot.Bot;
import love.forte.simbot.bot.BotManager;
import love.forte.simbot.core.SimbotContext;
import love.forte.simbot.spring.autoconfigure.EnableSimbot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import xyz.erupt.core.annotation.EruptScan;

//spring
@SpringBootApplication
//erupt
@EntityScan
@EruptScan
//simbot
@EnableSimbot
public class SimbotEruptSqliteApplication {

    public static void main(String[] args) {

        SpringApplication.run(SimbotEruptSqliteApplication.class, args);

        //启动成功运行
        RunSuccess.RunSuccess();

        System.out.println("(♥◠‿◠)ﾉﾞ  若依启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "\n" +
                " ██████╗ ██╗  ██╗\n" +
                "██╔═══██╗██║ ██╔╝\n" +
                "██║   ██║█████╔╝ \n" +
                "██║   ██║██╔═██╗ \n" +
                "╚██████╔╝██║  ██╗\n" +
                " ╚═════╝ ╚═╝  ╚═╝\n" +
                "                 \n");
    }
}
