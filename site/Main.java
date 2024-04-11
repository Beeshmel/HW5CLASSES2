package test_abstract.site;

public class Main {
    public static void main(String[] args) {
        Template page1 = new Site("Главная страница","Информация о компании...");
        Template page2 = new Site("Услуги","Информация об услугах...");
        Template page3 = new Site("Контакты","Контактная информация...");

        Template page4 = new Admin("Управление пользователями","Редактирование юзеров....");
        Template page5 = new Admin("Управление страницами","Редактирование страниц...");
        Template page6 = new Admin("Управление дизайном","Редактирование дизайна...");

//        System.out.printf(page1.render());
//        System.out.printf(page2.render());

        Template pages[] = {page1,page2,page3,page4,page5,page6};
        for(Template page : pages){
            System.out.println(page.render());
        }

//        Принцип Барбары-Лисков(принцип подстановки) - с помощью объекта потомка можно сделать
//                замену объекта предка без изменения поведения




    }
}
