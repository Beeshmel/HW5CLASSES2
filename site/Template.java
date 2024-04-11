package test_abstract.site;

public abstract class Template {
    private String title;//название страницы
    private String body;//содержимое страницы(контента)

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Template(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public static final String TITLE_SITE = "Блог программиста";

    String getHeader(){
        return "Шапка сайта " + TITLE_SITE;
    }

    String getFooter(){
        return "Подвал сайта " + TITLE_SITE;
    }

    abstract String getContent();//у каждого потомка обязательно должен быть уникальный контент

    String render(){//вывод страницы
        return getHeader() + "\n" + getContent() + "\n" + getFooter() + "\n\n";
    }
}
