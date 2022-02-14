
## Proje Nasıl Çalıştırılır?

- Öncelikle docker kurulu bir cihazda docker compose dosyası aşağıdaki komut ile çalıştırılmalıdır:
```
docker-compose -f docker-compose.yml up -d
```
- Ardından proje bir ide aracılığı ile ya da terminal üzerinden aşağıdaki kod yardımı ile çalıştırılabilir:
```
mvn clean install
mvn spring-boot:run
```


## Proje'de Kullanılan Teknolojiler

- Spring Boot
- Swagger
- PostgreSql
- Redis
- Lombok
- Twilio

## Mimari Yaklaşım
- Bu proje mümkün olduğunca rest conventionlarına uyularak, katmanlı mimari dikkate alınarak yazılmıştır.