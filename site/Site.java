package test_abstract.site;

public class Site extends Template {
    public Site(String title, String body) {
        super(title, body);
    }

    @Override
    String getContent() {
        return "Название страницы сайта: " + getTitle() + "; содержимое страницы: " + getBody();
    }
}
