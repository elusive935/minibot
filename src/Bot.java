import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.logging.Logger;

public class Bot extends TelegramLongPollingBot {
    private Logger log = Logger.getLogger(Bot.class.getSimpleName());

    Bot() {
    }

    public void onUpdateReceived(Update update) {
        String message = update.getMessage().getText();
        if ("/govno".equals(message)) {
            System.out.println("Вот говно!");
        } else {
            System.out.println(message);
        }
    }

    public String getBotUsername() {
        return "mmminiBot";
    }

    public String getBotToken() {
        return "982763658:AAHAm0oNLKYJ-Yls2vKkwg0ReAT2L_mLhHI";
    }
}
