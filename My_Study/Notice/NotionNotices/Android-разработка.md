# Android-разработка

## Android-разработка на Java

- **Введение**
    
    ### Создание первого Android-приложения
    
    *Каждое андроид-приложение состоит из экранов,а каждый экран* 
    
    *состоит из макета и активности*
    
    **Активность** *- это одна четкая операция ,которую может выполнять пользователь*
    
    *Активности обычно программируются на **java,kotlin** и т.д.*
    
    *А макет пишется на **xml**,который показывает где какой* 
    
    *элемент находится*
    
    *При генерировании проекта образуются три папки в папке **app** - **manifest,res,java ну и***
    
    *один файл **gradle script***
    
    ---
    
    ---
    
    В папке ***manifest** хранится конфигурация нашего приложения*
    
    В папке ***java** хранится java-код*
    
    В папке ***res** хранятся ресурсы нашего приложения(картинки,цвета,строки и т.д.)*
    
    Основной файл с кодом лежит в папке ***java**(с одноименным проектом)*
    
    А файл макета находится в папке ***res/layout***
    
    ### Способы редактирования макета
    
    1.Через текстовый редактор(нужно с **design** перейти на **code**)
    
    2.Через визуальный редактор(наоборот)
    
    //Перед запуском приложения нужно создать device(устройство , на 
    
    котором мы собственно и будем запускать)
    
    //Если имя пользователя на русском ,то нужно создать будет две сист.переменных
    
    Android_Sdk_Root - путь к sdk
    
    Android_Sdk_Home - путь к проектам 
    
    //Заходим в этот компьютер — Свойства — Доп.св-ва системы — переменные среды — создать переменные для ПК 
    
    ***Активность** каждого приложения отвечает за то,что оно будет выполнять*
    
    А макет отвечает за то ,как должно выглядеть приложение
    
- **Модификации.Добавление локализации**
    
    ***Макет**(activity_main.xml) состоит пока из двух элементов*
    
    из 
    
    ```java
    <androidx.constraintlayout.widget.ConstraintLayoutxmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"> 
    ....
    </androidx.constraintlayout.widget.ConstraintLayout>
    - показывает ,как должны эл-ты располагаться на экране
    ```
    
    <androidx.constraintlayout.widget.ConstraintLayout>  -  своего рода тело экрана
    
    и 
    
    textView - вывод чего-либо на эран
    
    ```java
    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World!"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.434"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintVertical_bias="0.283" />
    
    android:text - это св-во TextView,которое отвечает за вывод 
    текста
    ```
    
    Каждые надписи,должны храниться в отдельном файле,иначе говоря в файле строковых ресурсов.Этот файл можно найти в 
    
    res/values/strings
    
    Как выглядит **файл строковых ресурсов -** 
    
    ```java
    <resources>
        <string name="app_name">MyFirstApp</string> - пример
    	создание строки
    		...
    		... - между resources должны находиться строки,исполь   зуемые приложением
    </resources>
    ```
    
    Все ресурсы хранятся по типу,***ключ - значение***
    
    Здесь же ключом является ***name="app_name*"** ,а значение -
    
    **MyFirstApp**
    
    Пример использования - 
    
    ```java
    <TextView 
    ...             (название этой строки)
                              |
    android:text = "@String/hi_user" 
    />
    ```
    
    **//Лучше использовать строковые ресурсы!**
    
    ### Добавление локализации
    
    Если открыть файл строковых ресурсов,то можно будет найти надпись ***open editor.***
    
    Собственно открываем.
    
    И чтобы добавить ещё одну локализацию,надо нажать на глобус и просто написать название доп.языка.
    
    Ну и затем пишем перевод
    
- **Первый проект.Работа с макетом и активностями.Создание переменных ссылающихся на эл-ты макета.Создание методов**
    
    ## Работа с макетом
    
    **spinner** - выпадающий список в android
    
    В визуальном редакторе он находится в группе **containers**
    
    ```java
    Пример - 
    <Spinner                           (название данного элемента)
            android:id="@+id/spinner" - идентификатор каждого эл-та
            android:layout_width="409dp" - ширина эл-та
            android:layout_height="wrap_content" - длина эл-та
            app:layout_constraintBottom_toTopOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />
    
    //Последние четыре строчки означают ,что этот эл-т будет относительно 
    //родителя находиться по левому,правому,нижниму и верхнему краям
    
    android:layout_height="wrap_content" - в данном случае длина эл-та
    ъподстраивается по длину содержимоего этого эл-та
    ```
    
    **button** - кнопка
    
    В визуальном редакторе находится в группе **buttons**
    
    ```java
    <Button
            android:id="@+id/button"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Button"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/spinnerColor" />
    //в принципе можно понять что за что отвечает
    ```
    
    **TextView** - выводит текст на экран
    
    В визуальном редакторе находится в группе **Text**
    
    ```java
    <TextView
            android:id="@+id/textView2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="TextView"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/button" />
    ```
    
    Также в файле строковых ресурсов можно создать массив строк
    
    ```java
    <string-array name="colors">- название
            <item>Красный</item> - эл-т со значением
            <item>Оранжевый</item>
            <item>Желтый</item>
            <item>Зеленый</item>
            <item>Голубой</item>
        </string-array>
    
    И чтобы этот массив строк использовать в выпадающем списке надо - 
    
    <Spinner
            android:id="@+id/spinnerColor"
            android:layout_width="0dp"
            android:entries="@array/colors"
            android:layout_height="wrap_content"
            app:layout_constraintBottom_toTopOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />
    
    android:entries="@array/colors" - добавить эту строчку,которая по
    сути ссылается на массив строк(как и на обычную строку,только
    вместо string пишем **arra**)
    ```
    
    *android:layout_margin*="" - отступ со всех сторон
    
    также можно задать отступ с определенной стороны***(android:layout_marginTop,android:layout_marginBottom etc)***
    
    ## Работа с активностью
    
    Разбор начального кода в файле активности
    
    ```java
    package com.example.colordescriptor;
    
    import androidx.appcompat.app.AppCompatActivity;
    
    import android.os.Bundle;
    import android.view.View; - импортируем нужные файлы андроида
    
    public class MainActivity extends AppCompatActivity {
    //Все классы ,которые наследуются от AppCompatActivity
    //должны будут переопределяться эти методы
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState); - это родительский метод
            setContentView(R.layout.activity_main); - этот метод
    								устанавливает макет для нашей активности
        }
    }
    ```
    
    Чтобы метод исполнялся во время клика на какой либо элемент ,он должен быть публичным ,ничего не возвращать и передавать в параметрах объект **View**
    
    ```java
    public void showDescription(View view) {
    		....
        }
    ```
    
    Чтобы ссылаться на какой-либо элемент надо написать по типу этого - 
    
    ```java
    private Spinner spinnerColors = findViewById(R.id.spinnerColor);
    private TextView textViewDescrTemp = findViewById(R.id.textViewDescrTemp);
    
    ***Сначала модификатор доступа,затем элемент(ну типа объект) ,который хотим
    получить ,затем id этого элемента и пишем метод*
    R** - ресурсы нашего приложения
    затем **id** и в крнце прям **id-шник** эл.
    
    Это писать нужно в методе **OnCreate**
    ```
    
    **findViewById()** - метод,который ищет элемент в макете по **id**
    
    **getSelectedItemPosition() -** метод,который получает позицию выбранного элемента
    
    ```java
    int position = spinnerColors.getSelectedItemPosition();
    ```
    
    *Также можно получить элементы  из строковых ресурсов(массивы строк,строки )*
    
    ```java
    String[] description = getResources().getStringArray(R.array.descr_of_temp);
    -это пример получения массива строк
    String ns = getResources().getString(R.string.btnFindDescr);
    -это пример получения строки
    
    ```
    
    **getStringArray()** - метод,который достает массив строк из файла строковых ресурсов
    
    **getString() -** метод,который достает строку из файла строковых ресурсов
    
    **getResources() -** метод,который обращается к ресурсам нашего приложения
    
    **setText()** - вставление текста в элемент
    
    //Всегда нужно писать для начала **getResources()**,перед тем как доставать элемент
    
    Дописать и разживать этот видос xD
    
- **Добавление второй активности.Организаци я этих активностей с помощью интентов**
    
    ### **Добавление второй активности**
    
    Чтобы создать вторую активность нужно - 
    
     нажать на наше приложение(папку app) правой кнопкой мыши ***- new- activity - и выбираем нужную активность***
    
    Создатся новый файл с ***java-кодом***  и новый макет
    
    В файле ***xml*** ,который находится в папке **manifest** ,находится конфигурация нашего приложения.
    
    ```java
    <?xml version="1.0" encoding="utf-8"?>
    <manifest xmlns:android="http://schemas.android.com/apk/res/android"
        package="com.example.messanger">
    
        <application
            android:allowBackup="true"
            android:icon="@mipmap/ic_launcher"
            android:label="@string/app_name"
            android:roundIcon="@mipmap/ic_launcher_round"
            android:supportsRtl="true"
            android:theme="@style/Theme.Messanger">
            ***<activity
                android:name=".receivedMessageActivity"
                android:exported="false" /> - вторая активность***
            ***<activity
                android:name=".CreateMessage"
                android:exported="true">
                <intent-filter>
                    <action android:name="android.intent.action.MAIN" />
    
                    <category android:name="android.intent.category.LAUNCHER" />
                </intent-filter> - наша первая активность
            </activity>***
        </application>
    
    </manifest>
    
    // ***<category android:name="android.intent.category.LAUNCHER" /> -
    - эта строчка указывает на то ,что эта активность будет запускаться первой*** 
    ```
    
    ### Запускаем вторую активность.Интенты.Явный Интент
    
- **Элементы и их атрибуты в android(макет)**
    
    ## Элементы
    
    **<androidx.constraintlayout.widget.ConstraintLayout>** - ****тело нашего экрана
    
    **TextView** - элемент ,который выводит какой-нибудь текст
    
    **Button** - кнопка
    
    **Spinner** - выпадающий список
    
    **PlainText(EditText)** - полек в которое можно вводить текст
    
    ## Атрибуты
    
    1.android:id - название элемента***(id)***
    
    2.android:text - текст ,который показывает элемент 
    
    3.android:*layout_width -* ширина элемента
    
    *(wrap_content указывает,что ширина и длина будет регулировать содержимым элемента , при значении **0dp** для ширины - элемент будет растянут на всю ширину)*
    
    4.android:*layout_height -* длина элемента
    
    5.android:onClick - вешает на элемент событие(привязывает метод)
    
    6.android:layout_margin - внешний отступ
    
    *(также есть layout_marginTop,layout_marginBottom etc)*
    
    7.android:entries - вставляет например в ***spinner*** массив строк
    
    8.android:hint - атрибут эл-та **PlainText(EditText)**   , показывает подсказку(например ,что вводить)
    
    Тоже лучше использовать строковые ресурсы
    
    ```java
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintHorizontal_bias="0.498"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toBottomOf="@+id/spinnerColors" - ***эти строчки означают к чему юудет привязан этот элемент***
    android:hint="Введите сообщение"
    ```
    
    Применение - 
    
    ```java
    1.android:id="@+id/spinnerColors" - сначала указываем
    @+id ,затем название 
    
    2.android:text="@string/showDescr_btn" - обращаемся
    к файлу стр.ресурсов ,а затем название строки или массива строк
    
    3,4.android:layout_width="409dp" - dp это пиксели
    android:layout_height="wrap_content"
    
    5.android:onClick="showDescription" - нужно будет просто
    указать вызываемый метод
    
    6.android:entries="@array/colors"
    ```
    
- **Методы для *java-кода***
    
    1.**findViewById()** - находит элемент макета по **id**
    
    2.**getSelectedItemPosition()** - отслеживает ,какой элемент**(item)** по номеру выбран напрмер в **Spinner**
    
    3.**getStringArray()** - получает массив строк из файла строковых ресурсов
    
    4.**getString()** - получает строку из файла строковых ресурсов
    
    5.**getResources()** - обращение к ресурсам нашего приложения**(к строкам,картинкам,цветам и т.д.)**
    
    6.**setText()** - вставляет текст в элемент,который будет выводиться
    
    Применение:
    
    ```java
    1. private Spinner spinnerColors;
        private TextView description_color;
    
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            spinnerColors = findViewById(R.id.spinnerColors);
            description_color = findViewById(R.id.description_color);
        }
    //Нужно обязательно присваивать переменной эл-т макета в 
    //методе **onCreate**
    
    description_color = findViewById(**R.id.description_color**); -
    сначала идёт переменная,затем метод,затем **R**(ресурсы пр-я),
    затем что-за рес-ры мы хотим использовать(**id**),а затем ,на-
    звание эл-та(или же его **id**)
    
    ----------------------------------
    
    2.int position = spinnerColors.getSelectedItemPosition();
    
    spinnerColors - хранит в данном случае эл-т **Spinner**.Собстве-
    нно у этого эл-та мы и вызываем этот метод(который возвращает
    тип данных int)
    
    ----------------------------------
    
    3,4,5.
    String[] descrs = getResources().getStringArray(R.array.descriptions);
    - сначала обращаемся к ресурсам пр-я,затем получаем массив-строк
    из файла строковых ресурсов,затем указываем **R.array,то что мы хотим
    получить массив** ,а затем название вытаскиваемого массива
    
    С **getString()** аналогично ,только вместо **R.array -- R.string**
    
    ----------------------------------
    
    ****6. 
    	String descr = "Hello";
    	description_color.setText(descr);
    
    description_color - хранит в данном случае эл-т TextView
    
    **setText()** - просто вставляет значение descr(то есть "Hello")
    ```
    
- *Особенности работы с* **android-studio**
    
    //Эмулятор android в **android-studio** может не запускаться из-за отсутствия **HAXM intel**.Чтобы проверить,что он у нас скачан нужно зайти в **SDK manager - SDK tools** . А дальше проверить если он у нас или нет,если нет ,то  скачать