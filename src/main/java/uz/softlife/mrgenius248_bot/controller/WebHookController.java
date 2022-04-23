package uz.softlife.mrgenius248_bot.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;
import uz.softlife.mrgenius248_bot.MyMrGenius248Bot;

@RestController
public class WebHookController {
    private final MyMrGenius248Bot myMrGenius248Bot;

    public WebHookController(MyMrGenius248Bot myMrGenius248Bot) {
        this.myMrGenius248Bot = myMrGenius248Bot;
    }

    @RequestMapping(value ="/", method = RequestMethod.POST)
    public BotApiMethod<?>onUpdateReceived(@RequestBody Update update){
        return myMrGenius248Bot.onWebhookUpdateReceived(update);
    }
}
