package team.dna2.serviceDesk_client.controllers;

import javafx.fxml.Initializable;
import team.dna2.serviceDesk_client.ScreenManager;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Используется только для того, чтобы запустить экран входа в аккаунт.
 * Нужен, потому что не получается назначить на первый экран контроллер через fxml, что приводит к трудностям.
 */
public class InitLoadingController implements Initializable {
    private static ClientApplication clientApplication;

    /**
     * При запуске проекта присваивает clientApplication для смены сцены (экрана) на сцену входа в аккаунт
     * @param location По идее ссылка на fxml файл, но не используется
     * @param resources По идее путь до файла с ресурсами, но не используется
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        clientApplication = ClientApplication.GetClientApplicationInstance();
    }

    /**
     * Меняет эту пустую сцену на сцену (экран) входа в аккаунт
     */
    public static void LoadLoginScreen() {
        ScreenManager.InitToLogIn();
    }
}
