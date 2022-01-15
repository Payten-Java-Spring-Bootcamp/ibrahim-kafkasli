## Soru 1
> Imperative Programming ve Declarative Programming kavramlarını kısaca açıklayıp farklarını belirtiniz. 
- imperative programlama ile derleyiciye adım adım ne olmasını istediğinizi söylersiniz. Declerative programlama ile, ne istediğinizi açıklayan, ancak bunun nasıl elde edileceğini gerekmeyen kod yazarsınız

## Soru 2
> Veri tabanlarının sorgu optimizasyonlarında index oluşturmanın avantajı nedir ? Sık index kullanmak bir probleme yol açar mı?
- SQL index özelliği kitaplardaki içindekiler sayfasına benzer. Kitaptaki bir konuyu bulmak için önce içindekiler sayfasına bakılır, konu bulunamazsa tüm kitap sayfalarına bakılır. İndex veri tabanı sorgularını hızlandırmak için kullanılır.
- Veri tabanına yapılan her ekleme, güncelleme ve silme işleminden sonra index yeniden inşa edileceğinden fazla kullanılmayan sütunlar için index oluşturmak veya gereğinden fazla index oluşturmak performans düşürür.

## Soru 3
> İlişkisel veritabanları için normalizasyon kavramı neyi ifade etmektedir ? İlk 3 normal formu örnek üzerinden açıklayınız.
- veri tabanı tasarım aşamasında veri tekrarını, veri kaybını veya veri yetersizliğini önlemek için gerçekleştirilen işlemlerdir.
- 1NF(1. Normal Form)
   - Bir veri tabanının 1NF olabilmesi için aşağıdaki özellikleri karşılayabilmesi gerekir:
     -  Aynı tablo içinde tekrarlayan kolonlar bulunamaz.
     -  Her kolonda yalnızca bir değer bulunabilir .
     -  Her satır bir eşsiz anahtarla tanımlanmalıdır.
- 2NF(2.Normal Form)
  - Bir veri tabanının 2NF olabilmesi için aşağıdaki özellikleri karşılayabilmesi gerekir:
    Tablo 1NF olmalıdır.
    - Anahtar olmayan değerler ile kompozit (bileşik) anahtarlar arasında kısmi (partial) bağımlılık durumu oluşmamalıdır. Kısmi bağımlılık durumu, anahtar olmayan herhangi bir değer kompozit bir anahtarın yalnızca bir kısmına bağıl ise oluşur.
    - Herhangi bir veri alt kümesi birden çok satırda tekrarlanmamalıdır. Bu tür veri alt kümeleri için yeni tablolar oluşturulmalıdır.
    - Ana tablo ile yeni tablolar arasında, dış anahtarlar (foreign key) kullanılarak ilişkiler tanımlanmalıdır.
- 3NF(3.Normal Form) 
  - Bir veri tabanının 3NF olabilmesi için aşağıdaki özellikleri karşılayabilmesi gerekir:
    - Veri tabanı 2NF olmalıdır,
    - Anahtar olmayan hiç bir kolon bir diğerine (anahtar olmayan başka bir kolona) bağıl olmamalı ya da geçişken fonksiyonel bir bağımlılığı (transitional functional dependency) olmamalıdır. Başka bir deyişle her kolon eşsiz anahtara tam bağımlı olmak zorundadır.
    
## Soru 4
> ORM kütüphaneleri kullanmak her zaman avantajlı mıdır ? ORM kütüphanelerinin ne gibi dezavantajları olabilir ?
- Bilgi alış-verişi sırasında kontrolün yüzde yüz sizin elinizde olmaması (Üretilen SQL bazen çok farklı olabilir)
- Performans sorunları
- Kullanılan ORM aracını öğrenmek için harcanan zaman

## Soru 5
> Domain Specific Language (DSL) kavramını açıklayınız.
- Programlama dilleri, özel(Domain Specific Language) ve genel (General Purpose Language) kapsamda kullanılan diller olarak ikiye ayrılabilir. DSL (Domain Specific Language), özel bir uygulama alanı için kullanılan dildir. DSL Örneği olarak web uygulaması geliştireceksiniz ve uygulamanın özel bir kapsamı olan tasarım konusunda CSS'i verebiliriz. CSS demişken, Sass ve LESS örneklerini de verebiliriz. Bu web uygulamasını elbette HTML kullanarak yapmanız gerektiğine göre bu arkadaşı da DSL kapsamına alabiliriz. Örneğin java ile uygulama geliştiriyorsunuz ve veritabanı işlerini SQL ile yaparken, build ve deploy işlemleri için ANT kullanıyorsunuz. Bu iki arkadaş da çılgınlar gibi biz de DSL'iz diye bağırmıyorlar mı sizce de? Eğer kendi DSL dilinizi geliştirmek için isterseniz buraya bakabilirsiniz.
- Genel amaçlı (GPL, General Purpose Language) diller birçok konuya özgün kullanılabilen dillerdir örneğin Java, C, UML vs. Mesela Java ile mimarlık, elektronik, Devlet Su İşleri, pideci amcanın dükkanına projeler geliştirebilirsiniz.

## Soru 6
>Long lived transaction kavramı hangi tip transactionları ifade etmektedir ? Dezavantajları var mıdır ? Varsa nelerdir ?


## Soru 7
> Thread Pool nedir ? Nerelerde kullanılır ?
- threadların pool içinde yedekteki işçi gibi durmasına denir.
- işletim sistemlerinde yeni bir thread yaratmak ekstra iş gerektirdiğinden çok fazla thread kullanan uygulamalarda kullanılır. yeni bir thread yaratılacağı zaman bu pool içindeki boş (diğer bir deyimle yarı ölü) bi tanesi ölümden döndürülerek arkadaşa yapacağı iş söylenir.
- nt sistemlerde bulunur

## Soru 8
> Scalability nedir ? Horizontal ve Vertical Scalability kavramlarını açıklayınız.
- Bir sistemin, ağın veya sürecin artan iş yükünü yönetebilmek veya büyümeyi karşılamak için kaynakların esnetilerek/arttırılarak kullanılması.
- Horizontal Scalability: Sistemin/Veritabanının Yatayda ölçeklenebilir olması (horizontally scalable, scale out); ucuz ve çok sayıda makinenin aynı anda kullanılması anlamına gelir. Yatay ölçeklenebilirlik sayesinde yedeklilik de performans artışı da sağlanabilir.
- Vertical Scalability: Dikey ölçeklenebilirlik varolan makinenizin CPU, RAM gibi özelliklerini artırarak daha güçlü hale getirilmesidir.

## Soru 9
> Data replication ve sharding nedir ? Aralarında nasıl bir fark bulunmaktadır ?
- Veri Replikasyonu, işlem sırasında ortamda biriken verilerin birden fazla konumda tutundurma işlemine verilen Türkçe addır.
- database sharding, en basit ifadeyle veritabanı içerisinde tutulan verilerin benzersiz küçük parçalara (shard’lara ya da chunk’lara) ayrılmasına denir. 
