### Git Flow Основы




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

