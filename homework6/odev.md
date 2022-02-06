## 1. Conway’in Kanunu’ nu (Conway’s Law) açıklayınız.
- Yaklaşım basitçe bir yazılımın geliştirilme sürecinde çok sayıdaki farklı modülün farklı kişiler tarafından geliştirilmesi süresinde yaşanan iletişimin yazılıma da yansımasından bahsetmektedir. Örneğin bir yazılımın ara-yüzünü tasarlayan ve arkadaki kodları yazan iki farklı kişi olduğunu düşünelim, yazılımın tamamlanması için bu iki kişinin birbiri ile iletişim halinde olması gerekecektir. Ara-yüzde görülen her özellik aslında bu iletişimin bir sonucu olacak ve yazılımın başarısı, işlevselliği kullanılabilirliği gibi çok sayıdaki özellik de bu iletişime bağlı olacaktır.

## 2. Software as a Service (SaaS), Platform as a Service (PaaS), Infrastructure as a Service (IaaS), On-Premises kavramlarını örneklerle açıklayınız.
- Software as a Service (SaaS): Hizmet olarak yazılım kullanıcılara internet üzerinden bulut tabanlı uygulamalara erişim ve kullanım olanağı sağlayan, merkezi olarak barındırılan, aboneliğe bağlı bir lisanslama ve dağıtım modelidir.
- Platform as a Service (PaaS): Hizmet olarak platform (PaaS), bulut basit tabanlı uygulamalardan bulut özellikli gelişmiş kurumsal uygulamalara kadar her şeyi dağıtmanıza olanak tanıyan kaynakların yer aldığı, geliştirme ve dağıtıma yönelik eksiksiz bir bulut ortamıdır.
- Infrastructure as a Service (IaaS): Hizmet olarak altyapı (IaaS) isteğe bağlı olarak kullandıkça öde modeliyle temel bilgi işlem, depolama ve ağ kaynakları sunan bir bulut bilişim hizmeti türüdür. IaaS, hizmet olarak yazılım (SaaS), hizmet olarak platform (PaaS) ve sunucusuz ile birlikte dört bulut hizmeti türünden biridir.
- On-Premises: Şirket içi yazılım, sunucu grubu veya bulut gibi uzak bir tesiste değil, yazılımı kullanan kişi veya kuruluşun tesislerinde bulunan bilgisayarlara kurulur ve çalıştırılır. Şirket içi yazılıma bazen "shrinkwrap" yazılımı denir ve şirket dışı yazılıma genellikle "hizmet olarak yazılım" veya "bulut bilişim" denir.

## 3. Continuous Integration, Continuous Delivery ve Continuous Deployment kavramlarını açıklayınız.
### Continuous Integration  
-Yaptığımız geliştirmelerin, refactorlerin, yazdığımız kodların, kontrollerden geçtiği sürece denir. Bu süreçte yapılan geliştirmelerin sorunlara yol açıp açmadığı kontrol edilir, sistemin çalışırlığı test edilir. bu geliştirmeler belli testlere tabi tutulur, kontrol edilir, sistemde bi yerleri kırarsa veya hataya zorlarsa, ilgili developerlara bu bilgilendirmeler yapılarak, sorunun bir an önce giderilmesi sağlanır, bu şekilde her zaman çalışabilen bir sürüm sağlanmış olur.

###Continuous Delivery

-Yapılan geliştirmelerin CI sürecinden (bir önceki süreç) geçtikten sonra build alınıp deploya hazır hale gelmesinin sağlandığı aşamadır.

###Continuous Deployment

-Burda da paketler ürünler sunucuya kurulur, canlıya alınır.


##4. API Gateway pattern’ı açıklayınız
-API Gateway, microservice'lere yapılan çağrıları tek bir location'da toplar. Kullanıcı, API Gateway'e tek bir çağrı yapar ve ardından API Gateway ilgili her bir microservice'i çağırır.
Microservices pattern'la, bir client birden çok farklı microservice'ten gelen verilere ihtiyaç duyabilir. Eğer client her microservice'i doğrudan çağırsaydı, client'ın çağrılan her microservice için bir ağ isteği yapması gerekeceğinden, bu daha uzun yükleme sürelerine sebep olabilir. Ayrıca, client'in her bir microservice'i araması, client'ı doğrudan o microservice'e bağlar - microservice'lerin dahili uygulamaları değişirse (örneğin, gelecekte iki microservice birleştirilirse) veya bir microservice'in location'u (ana bilgisayar ve bağlantı noktası) değişirse, bu microservice'lerden yararlanan her client güncellenmelidir.
API Gateway pattern’ın amacı, bu sorunlardan bazılarını hafifletmektir. API Gateway pattern'da client ile microservice'ler arasına ek bir entity (API Gateway) yerleştirilir. API Gateway'in işi, çağrıları microservice'lere toplamaktır. Client'ın her bir microservice'i ayrı ayrı çağırması yerine, client API Gateway'i tek bir kez çağırır. API Gateway daha sonra client'ın ihtiyaç duyduğu microservice'lerin her birini çağırır.

##5. Backend for frontend (BFF) pattern’ ı açıklayınız.
- Her client için ayrı bir api-gateway tanımlanmasını konu alır. Yani 3 durum için (web-ui,mobile-app,3rd app) 3 farklı BFF ile sorunlarımızı çözümlemeye çalışan pattern’e denir.

##6. Circuit-breaker pattern’ ı açıklayınız. 
- Circuit Breaker Pattern, bir yazılımda hataları tespit ederek hatanın tekrar etmemesini sağlar. Böylece sistemde hataların tekrar etmesi sonucu oluşacak bloklanma, hizmet kesintileri, aşırı kaynak kullanımı gibi sorunlarla karşılaşılmasını önleyerek, sistemin sağlıklı çalışmasını amaçlar.

