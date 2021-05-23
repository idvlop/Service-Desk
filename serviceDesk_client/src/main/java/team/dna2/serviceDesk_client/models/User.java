package team.dna2.serviceDesk_client.models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Getter
@Setter
@Component
public class User {
    public SimpleIntegerProperty id;
    public SimpleStringProperty email;
    public SimpleStringProperty password;
    public SimpleStringProperty fullName;
    public String firstName;
    public String lastName;
    public String patronymic;
    public SimpleStringProperty role;
    public SimpleStringProperty avatarFileName;
    public SimpleStringProperty orgAvatarFileName;

    public static ArrayList<User> users = new ArrayList<User>(); // Список пользователей всей системы
    public static User currentUser; // Активный пользователь системы. Меняется после выхода из аккаунта.
    public static int nextId = 0;

    /**
     * WIP
     * Создание новых пользователей
     * @param email Электронная почта пользователя
     * @param password Пароль (пока не хэш) пользователя
     * @param fullName ФИО пользователя
     * @param role Роль пользователя (DEVELOPER, OWNER, MEMBER)
     */
    public User(String email,
                String password,
                String fullName,
                String role) {
        this.id = new SimpleIntegerProperty(nextId++);
        this.email = new SimpleStringProperty(email);
        this.password = new SimpleStringProperty(password);
        this.fullName = new SimpleStringProperty(fullName);
        this.role = new SimpleStringProperty(role);
        if (role.equals(Role.DEVELOPER.getRole()))
            this.avatarFileName = new SimpleStringProperty("developer.png");
        else if (role.equals(Role.MEMBER.getRole()) )
            this.avatarFileName = new SimpleStringProperty("Misha.png");
        else if (role.equals(Role.OWNER.getRole()) )
            this.avatarFileName = new SimpleStringProperty("Obabkov.jpeg");
        this.orgAvatarFileName = new SimpleStringProperty("UrFU.png");
    }

    @Override
    public String toString() {
        return getFullName();
    }

    public int getId() {
        return id.get();
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public String getFullName() {
        return fullName.get();
    }

    public void setFullName(String fullName) {
        this.fullName.set(fullName);
    }

    public void setFullName() {
        this.fullName.set(lastName + " " + firstName + " " + patronymic);
    }

    public String getRole() {
        return role.get();
    }

    public void setRole(String role) {
        this.role.set(role);
    }

    public String getAvatarFileName() {
        return avatarFileName.get();
    }

    public void setAvatarFileName(String avatarFileName) {
        this.avatarFileName.set(avatarFileName);
    }

    public String getOrgAvatarFileName() {
        return orgAvatarFileName.get();
    }

    public void setOrgAvatarFileName(String orgAvatarFileName) {
        this.orgAvatarFileName.set(orgAvatarFileName);
    }
}
