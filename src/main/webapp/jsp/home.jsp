<%--
  Created by IntelliJ IDEA.
  User: s1nd1
  Date: 24.05.2019
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<link href="CSS/styles.css" rel="stylesheet" type="text/css">
<div class="form-style-6">
<form method="post" action="/home">
    <lable for="Zagolovok"> Заголовок таблицы
        <input type="text" id="Zagolovok" name="Zagolovok">
    </lable>
    <label for="Strok"> Кол-ство строк
    <input type="text" id="Strok" name="Strok">
</label>
    <label for="Stolbec"> Кол-ство столбцов
        <input type="text" id="Stolbec" name="Stolbec">
    </label>
    <label for="Fon"> Фон таблицы
        <select id="Fon" size="0" name="Fon" typeof="text">
            <option value="#ff0000">Красный</option>
            <option value="#ffffff">Белый</option>
            <option value="#0000ff">Синий</option>
            </select>
    </label>
    <input type="submit" value="Создать">
</form>
</div>


</body>
</html>
