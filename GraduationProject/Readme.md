
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
- Katmanlı mimari projelerimizi belirli bir standart ve düzene göre geliştirmemizi sağlayan, kodun okunabilirliğini arttıran, projelerimizin daha derli toplu olmasını sağlayan ve hata yönetimini daha kolay hale getiren bir yapıdır.
- Katmanlı mimaride Veri bütünlüğünü geliştirir. İstemcinin doğrudan veritabanına erişimi olmadığından daha yüksek düzeyde güvenlik sunar. Bakımı ve herhangi bir değişikliği yapmak daha kolaydır.
- Katmanlı mimari daha temiz kod yazmayı ve dinamik projeler oluşturmayı hedefler. Bundan dolayı geliştiriciler proje ortasında veya sonunda olası değişikliklere karşı koddaki her yere dokunmak yerine sadece bir kaç ayarı değişerek tüm alanlarda değişikliği meydana getirir. 