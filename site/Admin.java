package test_abstract.site;

public class Admin extends Template {
    public Admin(String title, String body) {
        super(title, body);
    }

    @Override
    String getContent() {
        return "Название страницы админки: " + getTitle() + "; содержимое страницы: " + getBody();
    }
}
