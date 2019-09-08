import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Bot extends TelegramLongPollingBot {
    private Logger log = Logger.getLogger(Bot.class.getSimpleName());

    Bot() {
    }

    public void onUpdateReceived(Update update) {
        String message = update.getMessage().getText();
        if ("/govno".equals(message)) {
            sendMsg(update.getMessage().getChatId().toString(),
                    "Говно (дерьмо, офиц.-канц. фекалии, мед. стул, кал, школ. какашки) " +
                            "— конечная стадия нямки после использования животным по назначению.");
        } else {
            System.out.println(message);
        }
    }

        private synchronized void sendMsg(String chatId, String s) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(s);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            log.log(Level.SEVERE, "Exception: ", e.toString());
        }
    }

    public String getBotUsername() {
        return "mmminiBot";
    }

    public String getBotToken() {
        return "982763658:AAHAm0oNLKYJ-Yls2vKkwg0ReAT2L_mLhHI";
    }
}
