### HTML и основные теги

HTML (HyperText Markup Language) - это язык разметки, который используется для создания веб-страниц. Он состоит из различных элементов, называемых тегами, которые определяют структуру и содержание веб-страницы. Вот несколько основных тегов:

1. **`<div>`** - это блочный тег, который используется для создания контейнеров или блоков веб-страницы. Он обычно используется для группировки элементов и стилизации с помощью CSS.

2. **`<span>`** - это строчный тег, который используется для выделения небольших фрагментов текста или вложенных элементов. Он также может быть стилизован с помощью CSS.

3. **Семантические теги** - такие как `<header>`, `<footer>`, `<main>`, `<section>` и другие, предназначены для указания семантической роли элементов на странице. Например, `<header>` обозначает верхнюю часть страницы, `<footer>` - нижнюю часть, `<main>` - основное содержание страницы, а `<section>` - раздел страницы.

### Стилизация элементов

Стилизация веб-страницы позволяет улучшить ее внешний вид и макет. Существует несколько способов стилизации элементов:

1. **Inline Styles** - это метод стилизации, при котором стили задаются непосредственно внутри тега элемента с использованием атрибута `style`. Например:

   <p style="color: blue; font-size: 16px;">Этот текст синего цвета и размера шрифта 16 пикселей.</p>

2. **CSS (Cascading Style Sheets)** - это язык, который используется для описания стилей веб-страницы. Стили описываются внешними файлами CSS и могут быть применены к нескольким элементам на странице. Это более гибкий и мощный способ стилизации.

### Вставка CSS в HTML

Для того чтобы вставить CSS в HTML документ, вы можете использовать несколько способов:

1. **Внешний файл CSS** - создайте отдельный файл с расширением `.css`, определите в нем стили и затем подключите этот файл в вашем HTML документе с помощью тега `<link>`. Пример:

   <link rel="stylesheet" type="text/css" href="styles.css">

2. **Внутренний стиль** - вы можете вставить стили непосредственно внутрь HTML документа, используя тег `<style>` внутри `<head>`:

   <head>
       <style>
           p {
               color: blue;
           }
       </style>
   </head>

3. **Inline Styles** - как упомянуто ранее, вы также можете использовать атрибут `style` прямо внутри элемента.

### Селекторы CSS

Селекторы в CSS используются для выбора элементов, к которым будут применены стили. Вот некоторые основные типы селекторов:

1. **Тип селектора** - выбирает все элементы данного типа. Например, `p` выберет все абзацы на странице.

2. **Классовый селектор** - выбирает элементы с определенным классом. Например, `.my-class` выбирает все элементы с классом "my-class".

3. **Идентификаторный селектор** - выбирает элемент с уникальным идентификатором. Например, `#my-id` выбирает элемент с id "my-id".