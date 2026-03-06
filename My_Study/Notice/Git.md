### Git Flow Основы
Основные команды для Git:
1.git checkout -b имя_ветки - носит в себе две команды(git branch - создать ветку,
2.git checkout - перейти)
3.git status - посмотреть статус файлов
4.git add . - добавление файлов 
5.git commit -m "описание" - сохранить добавление
6.git checkout имя_ветки - переключение на другую ветку
7.git merge имя_ветки_А - слить ветку A  в текущую
8.git branch -d name - удалить ветку

**Основы для Git Flow:**
**1**.git flow feature start имя_фичи 
***Аналог на git:***
1.1 git checkout develop
1.2 git checkout -b feature/имя_фичи

**2**.git flow feature finish имя_фичи
**Аналог на Git:**
2.1 git checkout develop
2.2 git merge feature/имя_фичи
2.3 git branch -d feature/имя_фичи

**Процесс добавление новой фичи +инициализация ветки develop**
1.git checkout -b develop
2.git checkout -b feature/login-form
3.git add .
4.git commit -m "Add: Basic HTML structure for login form"
5.git checkout develop
6.git merge feature/login-form
7.git branch -d feature/login-form
8.git checkout main
9.git merge develop
10.git tag -a v1.0.0 -m "Release version 1.0.0"
11.git push origin main --tags
12.git push origin develop

**Pull Request**
Если прав записи нет, то нужно будет делать fork и все тоже самое
1.git clone https://github.com/your-username/project.git
Создай ветку для своей задачи (от `develop` или `main` в зависимости от правил проекта):
2.git checkout -b feature/my-cool-fix
3.git add .
4.git commit -m "Fix: correct button alignment"
5.git push origin feature/my-cool-fix
После `push` зайди на страницу **оригинального** репозитория. Ты увидишь плашку: _"You pushed a new branch. Compare & pull request"_.
**Твои действия в интерфейсе:**
- **Base branch:** Выбери ветку, куда хочешь влить код (обычно это `develop`).
- **Compare branch:** Выбери свою ветку `feature/my-cool-fix`.
- **Описание:** Напиши, что именно ты сделал и зачем.
- **Кнопка:** Нажми **"Create Pull Request"**.

Это если еще не подключился к репозиторию
git remote add my-fork https://github.com/vash-nick/project.git
### Как настроить автоудаление веток (Бонус)
Чтобы не удалять ветки руками в интерфейсе после каждого принятого PR, ты (или владелец репозитория) можете включить одну настройку:
1. Зайди в **Settings** репозитория на GitHub.
2. Прокрути вниз до раздела **Pull Requests**.
3. Поставь галочку на **"Automatically delete head branches"**.

### Подключение **private**-репозитория
1.ssh-keygen -t ed25519 -C "bagdasar.aydinyan2006@gmail.com"
2.eval "$(ssh-agent -s)"
3.ssh-add ~/.ssh/id_ed25519
4.cat ~/.ssh/id_ed25519.pub 
5.Копируем содержимое файла с расширением `.pub`. Файл без этого расширения — твой приватный ключ, его **нельзя** никому показывать.
После:
- Зайди в свой аккаунт на сайте.
- Перейди в **Settings** (Настройки) → **SSH and GPG keys**.
- Нажми **New SSH Key**.
- Придумай название (например, "My Laptop") и вставь скопированный текст в поле **Key**.
- Нажми **Add SSH key**.
6.ssh -T git@github.com //проверка
7.git clone git@github.com:твой_логин/твой_репозиторий.git

