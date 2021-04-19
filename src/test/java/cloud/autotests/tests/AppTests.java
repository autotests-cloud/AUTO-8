package cloud.autotests.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Epic("any")
@Feature("your")
@Story("metadata")
public class AppTests extends TestBase {

    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("autotest on lamoda.ru")
    void test() {

        step("Open https://www.lamoda.ru/", () -> {
            // todo
        });

        step("$(byText("Войти")).click;", () -> {
            // todo
        });

        step("$(byText("Создать аккаунт")).click;", () -> {
            // todo
        });

        step("$(By.name("subscribe")).click;", () -> {
            // todo
        });

        step("$(byText("Введите свой email")).setValue("saa@cn,com");", () -> {
            // todo
        });

        step("", () -> {
            // todo
        });

        step("Остальную автоматизацию на регистрацию нужно заполнить самим, просьба сделать в кратчайшие сроки", () -> {
            // todo
        });

    }
}