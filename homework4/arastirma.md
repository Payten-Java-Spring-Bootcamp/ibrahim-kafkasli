1- https://martinfowler.com/articles/practical-test-pyramid.html adresindeki yazıyı okuyup özetini çıkarınız.

2- Regression test nedir ? Kısaca açıklayınız.
- Regresyon testi uygulama ortamındaki yapılan tüm değişiklikleri; uygulamaya yeni eklenen özellikler, daha önceki yaşanan hataların düzeltilmesinden sonra, mevcut problemlerin giderildiği ve yeni yapılan güncellemelerin, eklenen özelliklerin yeni bir hata üretip üretmediğini kontrol amaçlı olarak yapılan yazılım test türüdür.

3- A/B test nedir ? Kısaca açıklayınız.
- A / B testi (bölme testi veya kova testi olarak da bilinir) hangisinin daha iyi performans gösterdiğini belirlemek için bir web sayfasının veya uygulamanın iki sürümünü birbiriyle karşılaştırmanın bir yöntemidir. AB testi, esas olarak, bir sayfanın iki veya daha fazla varyantının rasgele kullanıcılara gösterildiği bir deneydir ve hangi varyasyonun belirli bir dönüşüm hedefi için daha iyi performans gösterdiğini belirlemek için istatistiksel analiz kullanılır.

4- Black box / white box test kavramlarını açıklayınız.
- White box testi aynı zamanda Glass box ve structure testing diye geçmekte. Bu test içeriğini yani kod kısmını görebildiğimiz, dolayısı ile hangi yolları takip edebildiğini, hangi parametreleri aldığını, içinde hangi döngülerin ve işlemlerin yapıldığını açıkça görebildiğimiz test türüdür. Böylece hangi sonuçları hangi basamaklar sonucunda alabileceğinin analizini yapabiliriz.

- Black box test de ise, white box test in aksine içerisinde hangi tür kod olduğunu bilmeyiz. Sadece input paramatrelerini verir ve output alırız. Black box test daha çok uzman test grupları tarafında yazılır ve doğruluğu kabul edilmiş farz edileceği içi içeriği sorgulanmaz. Ben şu şu inputları verdim, sonuç ne olur, arkada neler yapıyor gerisi beni ilgilendirmez yaklaşımı ele alınmanktadır.

5- Mutation test nedir ? Kısaca açıklayınız.
- Mutasyon Testi, kaynak koddaki belirli ifadeleri değiştirdiğimiz(mutant) ve test senaryolarının hataları bulabildiğini kontrol ettiğimiz bir tür yazılım testidir. Temelde birim testi(unit test) için kullanılan bir beyaz kutu testi türüdür. Mutant programdaki değişiklikler son derece küçük tutulur, bu nedenle programın genel hedefini etkilemez.
Mutasyon testinin amacı, mutant kodunu kaldıracak kadar sağlam olması gereken test vakalarının kalitesini değerlendirmektir. Bu yöntem, programda bir hata oluşturmayı içerdiği için hata tabanlı test stratejisi olarak da adlandırılır.

6- Behavior Driven Development (BDD) nedir, neyi amaçlamaktadır ?
- Behavior-Drive Development (BDD), Agile'in yazılım geliştiriciler, testçiler ve müşteri temsilcileri arasındaki işbirliğini geliştirmeye odaklanan bir süreçtir. BDD Test-Driven Development'in (TDD) bir uzantısıdır. TDD Aşağıdaki gibi bir döngü içinde çalışmaktadir:

- Bir test başarısız sonuçlanır
Testi düzeltmek için bazı kodlar yazılır
Test başarılı sonuçlanır
Yazılımı geliştirmek için yeniden düzenleme yapılır
Başka bir test başarısız olur.
BDD Sistemin davranışını TDD'nin her döngüsünde test eder. BDD testleri üç adıma ayrılır:

- Bağlam: Başlangıç durumu
Vakar: Kullanıcı tarafından gerçekleştirilen eylem
Sonuçlar: Olay gerçekleştiğinde sistemin beklenen davranışı.

7- Agile test quadrant nedir ? Quadrant’ların kapsamını kısaca açıklayınız.

