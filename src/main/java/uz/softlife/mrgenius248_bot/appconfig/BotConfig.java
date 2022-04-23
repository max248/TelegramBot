package uz.softlife.mrgenius248_bot.appconfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.DefaultBotOptions;
//import org.telegram.telegrambots.meta.ApiContext;
import uz.softlife.mrgenius248_bot.MyMrGenius248Bot;

@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "telegrambot")
public class BotConfig {
    private String webHookPath;
    private String botUserName;
    private String botToken;

    private DefaultBotOptions.ProxyType proxyType;
    private String proxyHost;
    private int proxyPort;

    @Bean
    public MyMrGenius248Bot MySuperTelegramBot(){
//        DefaultBotOptions options = ApiContext
//                .getInstance(DefaultBotOptions.class);

        DefaultBotOptions options = new DefaultBotOptions();

//        options.setProxyHost(proxyHost);
//        options.setProxyPort(proxyPort);
//        options.setProxyType(proxyType);

        MyMrGenius248Bot mySuperTelegramBot  = new MyMrGenius248Bot(options);
        mySuperTelegramBot.setBotUserName(botUserName);
        mySuperTelegramBot.setBotToken(botToken);
        mySuperTelegramBot.setWebHookPath(webHookPath);

        return mySuperTelegramBot;

    }
}
