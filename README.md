# OpenITHackathon2021
## Работа с git и обработка результатов

- Перед началом работы над задачей хакатона нужно сделать форк от репозитория с заданием на гитхабе (про форки вспомнить можно [по материлам GitHub](https://docs.github.com/en/get-started/quickstart/fork-a-repo).
- Если с форком возникают проблемы - можно создать персональный репозиторий. В таком случае, репозиторий должен быть в аккаунте участника на гитхаб, проект с именем 
OpenITHackathon2021-[FistName_LastName].
- Приветствуются регулярные комиты по мере написания кода - в репозитории с выполненным заданием должно быть не меньше 5 комитов  с осмысленным commit message.
- Ссылку на репозиторий с выполненным заданием и данные участника после завершения работы над проектом отправить через форму: 
https://forms.office.com/r/YjA6cYWfBh.
Форма открывается для доступа и закрывается автоматически в соотвествии с дедлайнами для хакатона, установленными организаторами.
- Степень готовности задания может быть разной, важно ***до наступления дедлайна*** отправить через форму ссылку на репозиторий с результатами "как есть".

## Общие требования

- Использовать библиотеки Selenium WebDriver или его обертки для своего языка программирования. 
- Тест раннер (JS/Python) и unit testing framework можно выбрать по своему усмотрению. 
- Соблюдать принципы clean code и модели Page Object. 
- Классы в репозитории разложить по пакетам (Java), проектам (C#) или папкам (JS, python) в соответствии с логикой выполнения задания. 
- Предусмотреть базовое логгирование. 
- Файл csv, который получается после запуска проекта, должен быть в последнем комите.
- Обоснованное применение паттернов GOF будет плюсом

## Сценарий задания

- Открыть страницу вакансий https://www.epam.com/careers.
- Переключить язык cайта на Global (English). 
- Используя форму поиска вакансий найти все вакансии, в которых в описании в разделе  **WHAT YOU HAVE** будет ключевое слово (keyword): *Jenkins*, направления (skills) *Software Test Engineering* для страны (Location) *Belarus, Minsk*, с возможностью удаленной работы (Remote).  
- Для всех страниц из результатов поиска открыть страницы вакансии и в описании вакансии проверить, что такое слово на странице действительно есть. 
- Название, URL и JOB# каждой из найденных вакансий сохранить в csv файл в папку проекта /resources/careers. Имя файла должно иметь формат FirstName_LastName_LocalTimeStamp.csv 
