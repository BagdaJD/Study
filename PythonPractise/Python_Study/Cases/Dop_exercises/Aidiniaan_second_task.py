def find_abbreviation(s):
    words = s.split()
    abbreviations = []
    current_abbr = ''
    
    for word in words:
        if word.isupper():
            current_abbr += word + ' '
        else:
            if current_abbr.strip():
                abbreviations += [current_abbr.strip()]
                current_abbr = ''
    
    if current_abbr.strip():
        abbreviations += [current_abbr.strip()]
    
    return abbreviations 

#s = 'Это курс информатики соответствует ФГОС и ПООП, это подтверждено ФГУ ФНЦ НИИСИ РАН'
#Res: ['ФГОС', 'ПООП,', 'ФГУ ФНЦ НИИСИ РАН']

s = input('Введите строку: ')
print(find_abbreviation(s))
