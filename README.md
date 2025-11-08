# Сжатие строки

Проект на Java, реализующий сжатие строки по количеству подряд идущих символов.  
Например, `AAABBBCDDDFFFFF` превращается в `A3B3C1D3F5`.

## Структура проекта

- `src/main/java/org/example/Solution.java` — метод `makeStringSmall`.
- `src/test/java/Tests.java` — юнит-тесты на JUnit 5.

## Как запустить тесты

```bash
./gradlew test
```

или на Windows:

```bash
gradlew.bat test
```

## Пример

| Вход              | Выход        |
|-------------------|--------------|
| `AAABBBCDDDFFFFF` | `A3B3C1D3F5` |

## Требования

- JDK 17+
- Gradle Wrapper включён

