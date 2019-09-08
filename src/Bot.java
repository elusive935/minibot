import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends TelegramLongPollingBot {

    Bot() {
    }

    public void onUpdateReceived(Update update) {
        String message = update.getMessage().getText();
        System.out.println(message);
    }

    public String getBotUsername() {
        return "mmminiBot";
    }

    public String getBotToken() {
        return "982763658:AAHAm0oNLKYJ-Yls2vKkwg0ReAT2L_mLhHI";
    }
}
