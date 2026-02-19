#Критерии брал отсюда: https://support.google.com/mail/answer/9211434?hl=ru
def check_email(s):
    if '@' not in s:
        return 'Введена некорректная почта, нет символа @'
    
    parts = s.split('@')
    if len(parts) != 2 or (len(parts[0]) < 6 or len(parts[0]) > 30):
        return 'Введена некорректная почта'
    
    domains_list = ['gmail.com', 'email.com', 
                    'yandex.ru', 'sfedu.ru']
    domain = parts[1]
    if domain.lower() not in domains_list:
        return 'Неправильный домен почты'
    
    right_abc = '.qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM'
    email_name = parts[0]
    
    for c in email_name:
        if c not in right_abc:
            return 'Недопустимые символы в почте'
    
    return 'Почта введена корректно'
        
    
#SomeTests                  
#print('Hello World')          
emails = [
    'IvanIvanov@gmail.com',      # Почта введена корректно
    'IvanIvanov@YANDEX.RU',      # Почта введена корректно
    'IvanIvanovgmail.com',       # Некорректно задана почта, нет символа @
    'Ivan@Ivanov@YANDEX.RU',     # Введена некорректная почта
    'IvanIvanov@YANlkDEX.RU',    # Неправильный домен почты
    'MECHM....AT@SFEDU.RU',      # Многоточие и множество точек в почте не разрешены... вот так вот...
    'abracada[]/.bra@gmail.com', # Недопустимые символы в почте
    '.@gmail.com',               # Введена некорректная почта
]
'''
for email in emails:
    print(check_email(email))
'''
email = input('Введите электронную почту: ')

print(check_email(email))
