1- Concurrent programlama ve Parallel Programlama nedir ? Aralarında çalışma şekli olarak nasıl bir fark bulunmaktadır ?

- Concurrency'de threadlerimiz sıradaki tasklardan birer tane alarak devam eder. Belli bir zamanda yapılan toplam işi arttırır. Parallelsim'de ise bir task birden fazla parçaya bölünerek threadlere dağıtılır. Taskların daha hızlı tamamlanmasını sağlar. Birden fazla CPU gerektirir.

2- Mutex ve Semaphore kavralamrını açıklayınız. Hangi tür durumlarda bunlara başvurmamız gerekir?
- Mutex bir locking mekanizmasıdır. Bu mekanizma dağıtılmış kaynaklarına (örneğin shared memory) erişmesine yönetir. Eğer birden fazla Thread çalışıyorsa ve bir thread-1 memory'e eişmek isterse, Mutex memory'yi kullanan başka thread yoksa thread-1 erişmesine izin verir, varsa diğer thread işlemi bittikten sonra thread-1 erişmesine izin verir. Semaphore, Mutex gibi çalışan bir mekanizmadır ama kaynağı kullanabilen thread'lerin sayısı değişebilir.

3- Java’da Error ve Exception arasındaki fark nedir ? Throwable ile ilişkileri nasıldır ? Hangi tür durumlarda Error hangi tür durumlarda Exception meydana gelebilir ? Örneklerler açıklayınız.
- Error handle edilemeyen hatalardır. Program akışının durmasına sebep olur. Uygulamanın yakalamaya çalışmaması gereken ciddi sorunları gösteren Throwable dan türeyen bir alt sınıftır.
- Exception ise try catch bloklarıyla yakalayabiliriz. Program akışı; exception eğer yakalandıysa devam eder. Exception yaşandığında; bunun program için arasıra yaşansa da sorun olmayacağı uygulamanın devam edebileceği anlaşılır. Exception ve Error; ikisi de Throwable sınıfından türer.

4- Spring’te yer alan @Scheduled anotasyonunun kullanım amaçlarını ve kullanım şeklini açıklayınız.
- Scheduling, belirli bir zaman dilimi için görevleri yürütme sürecidir. Spring Boot, Spring uygulamalarına bir zamanlayıcı yazmak için iyi bir destek sağlar.

5- Spring’te yer alan @Async anotasyonunun kullanım amaçlarını ve kullanım şeklini açıklayınız.
- Scheduling, belirli bir zaman dilimi için görevleri yürütme sürecidir. Spring Boot, Spring uygulamalarına bir zamanlayıcı yazmak için iyi bir destek sağlar.

6- High Availability (HA) kavramını kısa açıklayınız.
- High Availability bir sistemin belirli bir süre boyunca arızalanmadan sürekli çalışma yeteneğidir. HA, bir sistemin üzerinde anlaşmaya varılan bir operasyonel performans seviyesini karşılamasını sağlamak için çalışır.

7- Entity ve Value Object kavramlarını Domain Driven Design (DDD) kapsamında açıklayınız.
- DDD’da önemli bir kavram olan Entity, kendini diğer nesnelere nazaran tekilleştirebilmek için bir kimliğe(Id) sahip olan nesnelerdir. Entity, özünde Entity Framework’den aşina olunduğu gibi yeryüzündeki herhangi bir şey için modellenmiş nesnelere karşılık gelmektedir. Bahsedilen kimlik ise bu nesnelerin her biri için yaratıldığı süreçten itibaren diğerlerinden ayırmamızı sağlayan ve değişmeden taşınan Id değeridir. DDD prensibini kullanan veya kullanmayan çoğu projede value object’ler farkında olunsun ya da olunmasın kullanılan temel DDD yapı taşlarıdır diyebiliriz.

Value object, herhangi bir kimlik(Id) değeri olmayan ve böylece aynı değerlere sahip iki value object nesnesinin değersel açıdan aynı olarak kabul edilebilir olmasını sağlayan ve dolayısıyla birbirlerinin yerine geçebilecekleri anlamına gelen bir nesnedir. İşte bu nedenle value object’ler her daim değişmez(immutable)dirler

9- 