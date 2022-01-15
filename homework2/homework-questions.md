# Homework 2

## Soru 1
> Spring dışında dependency injection için kullanabileceğimiz framework’ler / kütüphaneler nelerdir ? (Herhangi bir programlama dili için olabilir.)
- Spring.NET
- Castle Windsor
- Structure Map
- Ninject
- Dagger
- Google Guice
- Java EE6 CDI
- PicoContainer

## Soru 2
> @SpringBootApplication anotasyonu hangi anotasyonları kapsamaktadır ? Görevlerini kısaca açıklayınız.
- > @Target: custom anatasyon hangi tip için spesifik olarak kullanıldıysa onu belirtmek için kullanılır. Örneğin @Target({ElementType.TYPE}) anatasyonu class, enum ya da interface'ler için kullanılır.
- > @Retention: bu anatasyon custom bir anatasyonun hangi seviyede devreye gireceğini belirlemek için kullanılır. Örneğin @Retention(RetentionPolicy.RUNTIME) çalışma anında custom anatasyonunu mümkün kılar.
- > @Inherited: Anatasyonlar alt sınıflar tarafından inherit edilmez, bu anatasyon alt sınıflara miras alınacak anatasyonu işaret eder.

## Soru 3
> @Primary, @Qualifier anotasyonlarının kullanım amaçlarını açıklayınız.
- @Primary anatasyonunu anlamak için aynı tipte birden fazla bean oluşturduğumuzu düşünelim. Autowired sırasında spring hangi Bean'i enjekte edeceğini bilmez ve hata fırlatır. Bu sorunu çözmek için Bean'lerden birine @Primary anatasyonu verilir. Bu sayede spring, default olarak hangi Bean'in enjekte edileceğine karar verir.
- @Qualifier anatasyonu ise, Primary anatasyonuna benzer. Ancak Qualifier anatasyonu ile bir bean'i default olarak işaretlemek yerine, aynı tipteki tüm bean'lere farklı isimler veririz. Bu sayede bu isimler sayesinde hangi Bean'i enjekte etmek istiyorsak onu verdiğimiz qualifier ismiyle çağırırız.

## Soru 4
> Convention over configuration kavramını seçtiğiniz bir örnek üzerinden açıklayınız.

> “teâmül konfigürasyondan önce gelir”. Mesleki karşılığını da buraya not düşmek istersek “uygulama ayarlarını harici dosyalara değil de kod içerisine yazmak”.
>> Vereceğimiz örnek sanırım çok vurucu olacak. Amerika’da kapıların bir açılma teâmülü var. Eğer içeriden dışarı çıkıyorsanız kapıyı iterek açıyorsunuz. Dışarıdan geliyorsanız çekerek açıyorsunuz. Binanın dış kapısı, odaların kapısı, daire kapıları, alış veriş yeri kapıları… hepsi aynı teâmülü uyguluyor. Şayet bir robota şöyle bir gez gel deseniz ve bu teâmülü de anlatsanız, kapıları kimseye bir şey sormadan açıverecektir. İçeride ise itecek, dışarıda ise çekecek neticede amacına ulaşacaktır. Memleketimize gelelim. Kapıların açılmasıyla ilgili bir teâmül bulunmamaktadır. Önünüzdeki kapı her türlü açılabilir. Peki aynı robota gel bir de bizim memleketi gez deseniz… kapıları nasıl açacaktı? Biz proaktif davranıp geçeceği tüm kapıların açılma şeklini konfigürasyonla bildirecektik ki arıza çıkmasın. Evet, konfigürasyon buydu. Teâmül ise üst satırdaydı. Demek ki teâmül, bizi bir yığın konfigürasyondan kurtaran esaslı bir araç.

## Soru 5
> Aspect Oriented Programlama nedir ? Avantajları ve dezavantajları nelerdir ?
- > AOP, yazılımın karmaşıklığını azaltmaya, modülariteyi artırmaya yarayan bir yaklaşım biçimidir. Buradaki modülariteden kasıt uygulama süresince sistemin birçok bölümünde kullanılan, fonksiyonel olmayan kodun yani kesişen ilgilerin ufak ufak parçalara ayrılmasıdır (Seperation of Cross Cutting Concerns). Bu sayede uygulama genelinde kullanılacak olan yapıları, sistemden soyutlamış olup enkapsüle de ederek birçok yerde kullanılmasını sağlar. Genel olarak AOP bir sorunu çözmektense var olan sistemin daha güzel bir hale getirilmesini de sağlamaya yardımcı olur denilebilir.

## Soru 6
> SOLID prensiplerini kısaca açıklayınız. Sizce her koşulda bu prensipler çerçevesinde mi kod yazılmalıdır ? Neden ?
- SOLID yazılım prensipleri; geliştirilen yazılımın esnek, yeniden kullanılabilir, sürdürülebilir ve anlaşılır olmasını sağlayan, kod tekrarını önleyen ve Robert C. Martin tarafından öne sürülen prensipler bütünüdür. 
- Bana kalırsa, SOLID günümüz yazılımlarında, kullanılması gereken prensipleri barındırıyor. Bir projede geliştirdiğimiz modül eğer bu prensiplere uymazsa, o modülü başka bir projede tekrar kullanmak mümkün olmayabilir. Bu tarz faydaları açısından SOLID kullanmak mantıklı olacaktır.

## Soru 7
> Swagger nedir, ne amaçla kullanılmaktadır ?
- Web API geliştirme aşamasında en elzem gereksinimlerden biri dokümantasyon gereksinimi olarak ifade edilebilir. Çünkü API yöntemlerinin ne işe yaradığı ya da ne şekilde kullanıldığı dokümantasyon sınırları içerisinde anlaşılır olması lazım. Api dokümantasyonunu elle yazmak ise hem zor hem de bu dokümantasyonu güncel bir şekilde tutmak için son derece zor. Bir şekilde bu dokümantasyonun güncelliğinin korunması ve üretimin devamı gerekiyor. İşte tam da bu noktada swagger bir kurtarıcı gibi koşuyor ve sorunlu olan duruma bir çözüm ışığı oluyor. Swagger’ın başka bir önemli bir amacı ise RestApiler için bir ara yüz sağlaması. Bu sayede insanların ve bilgisayarların kaynak koda ulaşma zorluğunu yaşamadan RestApilerin özelliklerinin gözükmesinin incelemesinin ve anlaşılmasının koşulları sağlanmış oluyor.

## Soru 8
> Richardson Maturity Model’i seviyeleriyle birlikte açıklayınız.
- Rest yaklaşımlarının temel unsurlarını 4 adıma bölen bir modeldir.
    - Level-0 Swamp of POX: REST bir taşıma protokolü olarak değerlendirip kullanmaktır. Remote Procedure Call yaparak uzak sistemdeki bir metodu çağırmaktan farksızdır. Bu kullanım SOAP, XML-RPC benzer. Genel’de POST metodu ile çağrımlar gerçekleştirir.
    - Level-1 Resources: REST çağırma API’mizi URI’dan resource bazlı yapıyorsak yani bir context altına atıyor isek , Örneğin http://example.org/ticket/12 dediğimizde ticket resource altındaki 12 numaralı nesneye erişmek istediğimi direk URI üzerinden gerçekleştirmiş olurum. Genelde POST metodu ile çağrımlar gerçekleştirilir.
    - Level-2 HTTP Verbs: Bu seviyede sadece POST ile URI’lar çağrılmaz. Bunun yanında PUT, DELETE, POST ve GET metodları çağrılır. Her birisi için ayrı URI’lar oluşturma ihtiyacı olmaz bu sayede..
    - Level-3 HyperMedia Controls: Bu seviye kullanımda herhangi bir URI çağrıldığında cevabında bu resource ile yapabileceği işlemlerin URI olarak istemci’ye döndürülmesi. Bu sayede istemcinin ayrıyetten tüm URI ve yapacağı işlemleri sisteminde tutmasına gerek kalmaz. HATEOAS yönteminde istemci servis keşfini dönen cevap üzerinden yaparak işlemlerine devam edebilir.

## Soru 9
> URL, URI, URN kavramlarını bir örnek üzerinden açıklayınız.
- http://ibrahim.com/author/amty.html/#posts
- uri: http://ibrahim.com/author/amty.html/#posts
- url: http://ibrahim.com/author/amty.html/
- urn: ibrahim.com/author/amty.html/#posts

## Soru 10
> Idempotency nedir ? Hangi HTTP metotları idempotent’ tir ?
- Bir metodun bir defa çağrıldığında alınan sonuç ile birden fazla kez çağrıldığında alınan sonuç aynı ise bu bir idempotent metottur.
- Get: Sunucuya /students/1 şeklinde bir istek gönderdiğimizde, id si 1 olan kayıt dönecektir. Bu isteği birden fazla kez tekrarlamamız sonucu değiştirmeyecektir. Bundan dolayı GET idempotenent bir metottur.
- ``PUT: /students/1
  body: {‘name’:’Ahmet’, ‘surname’:’Acar’}``
  Sunucuya yukarıdaki gibi bir istek gönderdiğimizde Metin Alnıaçık ifadesi Ahmet Acar olarak güncellenecektir. İsteği bir kez daha gönderdiğimizde veritabanındaki değer Ahmet Acar olduğunda bir değişiklik olmayacaktır. Bu da idempotenent bir metottur.
  
- DELETE: 
  ```/students/1```
  Sunucuya yukarıdaki gibi bir istek gönderdiğimizde id si 1 olan kayıt silinecektir. İlgili istediği tekrar çağırdığımızda id si 1 olan bir kayıt olmadığından herhangi bir işlem gerçekleşmeyecektir. Bu da idempotenent bir metottur.
- POST:
  ```/students body: {‘name’:’Mehmet’, ‘surname’:’Demirci’}```
  Sunucuya yukarıdaki gibi bir istek gönderdiğimizde, {‘id’:’4’, ‘name’:’Mehmet’, ‘surname’:’Demirci’} şeklinde bir kayıt oluşacaktır. İlgili isteği bir kez daha çağırırsak {‘id’:’5’, ‘name’:’Mehmet’, ‘surname’:’Demirci’} şeklinde bir kayıt daha oluşacaktır. Yani kaç defa çağırırsak o kadar yeni kayıt oluşacaktır. Bundan dolayı POST non-idempotenent bir metottur.

## Soru 11
> RFC (Request For Comment) neyi ifade etmektedir ? HTTP hangi RFC dokümanında açıklanmıştır ? Bu dokümanda HTTP hakkında ne tür bilgiler yer almaktadır ?
- RFC internet standartları ve protokolleri için teknik yayınlar diyebiliriz. Bu standartlar belirlendikten sonra üzerine teknolojiler geliştirildiği için değişmesi mümkün olmayan yeni talepler sonrasında yeni versiyonları çıkan dökümanlardır. 
- RFC2616: (HTTP) Hypertext Transfer Protocol — HTTP/1.1
- Bu dökümanda genel syntax, http mesajları, protokol parametreleri, kurallar, request ve response tarzı bilgiler verilmiştir