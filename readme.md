Тестовое задание
=============================

Средства разработки: Java 1.8  
Framework: Spring boot 1.5.4  
База данных: PostgreSQL  
Протокол: HTTP, порт 80

Среда разработки: IntelliJ IDEA 2017.1

— Основной фреймворк приложения Spring Boot  
— Использовать Spring Data для работы с БД  
— REST  
— Обработка ошибок  
— Тесты

Cистема классов описывающих магазин
------------
![Структура БД](https://github.com/pvl-den/Spring-Boot/blob/master/BD_1.jpg)

//main class  
public class SpringPosgreApplication

//Entity

//Класс категорий товаров  
public class Goods

//Класс Холодильники  
public class Fridge 

//Класс Телевизоры  
public class TV 

//Класс Стиральные машины  
public class Washer

ТРЕБОВАНИЯ
------------

Должна быть создана БД:  
Имя БД: onlinestore  
Пользователь: denis-spring-boot
 


СПИСОК ЗАПРОСОВ
-----------
//вывести список категорий товаров  
http://localhost:80/goods

//вывести категорию товаров с id=5  
http://localhost:80/goods/5

//удалить категорию товаров с id=3  
http://localhost:80/delete/3

-------------------------------------------------------
pvl-den@yandex.ru
