##Pass By Value
> Pass By Value, bir fonksiyona parametre olarak gönderilen bir değişken aslında parametre olarak gönderilen değişkenin kendisi değil bir kopyasıdır. Fonksiyona değişkenin yalnızca değeri iletilir. Biz fonksiyonda gerçek değer üzerinde değil, kopya değer üzerinde işlem yaparız.
##Pass By Reference
> Pass By Reference, bir fonksiyona iletilen parametre, gerçek değerin bir kopyası değil kendisidir. Fonksiyona parametre geçerken o parametrenin değerini değil adresini parametre geçeriz. Bu sayede yaptığımız işlem asıl değeri etkiler.
##### Kaynak: https://pediaa.com/what-is-the-difference-between-pass-by-value-and-pass-by-reference/

##Java'da Pass By Value ve Pass By Reference Kavramları
> Java her ne kadar Pass By Value bir programlama dili olsa da bu konuda kafa karıştıran bazı durumlar vardır. Örneğin Java'da primitive tipler tamamıyla Pass By Value dur. Örnek olarak;

public class PrimitiveByValueExample {
public static void main(String... primitiveByValue) {
int homerAge = 30;
changeHomerAge(homerAge);
System.out.println(homerAge);
}
static void changeHomerAge(int homerAge) {
homerAge = 35;
}
}

>Burada changeHomerAge fonksiyonuna parametre olarak geçilen homerAge değeri gerçekte oluşturulan homerAge değerinin yalnızca bir kopyasıdır. O yüzden fonksiyonda ne kadar değeri değiştirilmiş olsa da, main metodu içerisinde yazdırılan homerPage işleminin çıktısı 30 olacaktır. Ancak changeHomerAge fonksiyonunda bir yazdırma olsaydı çıktı bu sefer 35 olacaktı. Bu iki değişken birbirinden bağımsızdır ve farklıdır.

> Ancak Java'da objeler bir fonksiyona parametre olarak gönderildiğinde, objenin bellekteki referansının parametre geçilen objeye kopyalanır. Bu durumda iki obje de bellekte aynı yeri gösterdiği için iki obje birbirinin aynısı olur

public class ObjectReferenceExample {

	public static void main(String... doYourBest) {
    	    Simpson simpson = new Simpson();
    	    transformIntoHomer(simpson);
    	    System.out.println(simpson.name);
	}

	static void transformIntoHomer(Simpson simpson) {
    	    simpson.name = "Homer";
	}

}

class Simpson {
String name;
}

> Bu örnekte fonksiyona parametre olarak geçilen Simpson sınıfına ait nesne fonksiyon parametresi ile aynı referansı işaret ettiği için, fonksiyon içerisinde yapılan değer güncellemeleri, asıl objeyi de etkiler
#####Kaynak: https://www.infoworld.com/article/3512039/does-java-pass-by-reference-or-pass-by-value.html

##Immutable ve Immutability Nedir?
> Immutable kelime anlamı olarak değişmez anlamına gelmektedir. Programlama dünyasında baktığımız da ise karşımıza immutable sınıflar çıkmaktadır. Bu sınıfların nesneleri bir kez oluşturulduktan sonra bir daha değiştirilememektedir. Bu tarz nesneler değiştirilmek istendiğinde o nesnenin bir klonu oluşturulmalı, istenilen değişiklik klonu oluştururken yapılmalıdır.

>Java’da yaygın olanlarından örnek verecek olursak String ve tüm ilkel sarmalayıcılar (Integer, Long, Double, Byte….), BigDecimal, BigInteger immutable sınıflardır.  Date, StringBuilder mutable sınıflardandır.
##Java da Immutable Sınıf Oluşturmak
> - Class içerisinde tanımlanan değişkenler private olmalı. Çünkü dışarıdan herhangi bir müdahalede bulunulmamalı.
> - Class içerisindeki değişkenlerin setter methodları olmamalı. Bu da dışarıdan gelecek müdahalelere karşı sıkı bir önlem.
> - Değişkenler final olarak işaretlenmeli. Bilindiği üzere final işaretlenen değişkenler ilk değeri aldıktan sonra değiştirilemezler.
> - Final işaretlenen bu alanların ilk değerleri constructur ile verilmeli.
> - Ve son olarak classımızı da final işaretlemeliyiz. Extend edilmemesi gerekiyor.

#####Java da örnek bir immutable sınıf:

public final class Immutable {
private final Integer value;

    public Immutable(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}

#####Kaynak: https://medium.com/kodcular/immutable-class-nedir-ve-neden-class-final-i̇şaretlenmeli-c75c9cd33cee


## Framework ve Library Arasındaki Fark Nedir?
> Kütüphane ve framework arasındaki teknik olarak en büyük fark, bir kütüphane kullandığınızda, uygulamanın akışından siz sorumlusunuz. Kütüphaneyi nerede ne zaman kullanacağınızı siz seçiyorsunuz. Ancak bir framework kullandığınızda ise, framework uygulamanızın akışından sorumludur. Koda ekleyeceğiniz bazı yerler sağlar, ancak gerektiğinde çağırımları framework yapar.
#####Kaynak: https://www.freecodecamp.org/news/the-difference-between-a-framework-and-a-library-bd133054023f/

##Java da Garbage Collector'un Görevi Nedir?
> Garbage Collection, otomatik bellek yönetimi mekanizmasıdır. Bu işlem heap belleğe bakıp, kullanılan objelerin tespit edilmesi ve referans edilmeyenlerin silinmesi üzerine kuruludur. Kullanılmayan/referans edilmeyen nesnelerin kapladığı alan bellekte boşa çıkarılır ve bellekte boş yer açılmış olur. Bu işlemi yapan mekanizmaya da Garbage Collector denir.
> Çalışma prensibi 2 kavram ile açıklanabilir:

> - Mark: Bu kavram hangi bellek parçalarının kullanımda olduğunu ve hangilerinin olmadığını belirlediği yerdir.
> - Sweep: Bu adım Mark aşamasında tanımlanan nesneleri kaldırır.
#####Kaynak: https://www.baeldung.com/jvm-garbage-collectors

##Memory Leak Nedir? Java da Memory Leak Oluşması Mümkün müdür?
> “Memory leak”, programın kullandığı hafıza ile işi bittiği halde ilgili hafıza bloğunu serbest bırakmaması durumudur. Bu durum;
> - Gerçekte kullanılmayan hafıza bloklarının referans edilmeye devam edilmesinden veya
> - Native resource’ların düzgün bir şekilde serbest bırakılmamasından
>
> kaynaklanmaktadır. Zaman içerisinde programın sürekli hafıza kullanması, fakat kullandığı hafızayı işi bittiğinde bırakmaması, memory leak’in giderek büyümesine bundan dolayı yeterince uzun süre çalışan uygulamalarda sistem kaynaklarının kritik miktarlarda tüketilmesine ve uygulamanın hata verip kapanmasına sebep olmaktadır.

> Java da memory leak oluşması bazı özel durumlarda mümkündür:

> - Statik nesnelerin yoğun kullanımı
> - Kapatılmamış kaynaklar(örn: veritabanı bağlantıları, input stream'ler)
> - Uygunsuz kullanılan equals() ve hashCode() metotları
#####Kaynak: https://www.baeldung.com/java-memory-leaks

##Yeni Java Sürümleri Ne Sıklıkla Çıkmaktadır?
> Oracla non-lts olan java sürümleri Mart ve Eylül ayları olmak üzere 6 ay da bir çıkarıyor

> Lts sürümlerin çıkması ise yıl bazında değişkenlik göstermektedir. Örneğin jdk 11 ile jdk 17 arasında 3 yıl bulunmaktadır.
#####Kaynak: https://www.java.com/releases/matrix/

##Stack ve Heap Nedir? Java’da hangi yapılar stack ile, hangi yapılar heap ile ilişkilidir ?
> Program esnasında boyutu bildirilmiş, sabit bir değer kullanıyorsak bunlar bellekte stack kısmında, değişebilir bir değer tutuyorsak bunlar bellekte heap kısmında tutulur.

> Java'daki stack, statik bellek tahsisi ve bir threadin çalıştırılması için kullanılır. Stack içerisinde Java daki primitive(ilkel) tipleri barındırır. (Örn: int, char)

>Java'da heap, java nesnelerinin ve jre sınıflarının dinamik bellek tahsisinde kullanılır.(Örn: ArrayList, HashMap)
#####Kaynak:
- https://www.baeldung.com/java-stack-heap
- https://medium.com/yigit-xcodeproj/stack-ve-heap-arasindaki-fark-nedir-stack-vs-heap-c61e3d463dd7

##Stack ve Heap Nedir? Java’da hangi yapılar stack ile, hangi yapılar heap ile ilişkilidir ?
> OpenJDK, Java SE Platform Edition’un ücretsiz ve açık kaynaklı bir uygulamasıdır. Sun Microsystems şirketinin 2006’da başlattığı geliştirme sonucunda ilk olarak 2007’de piyasaya sürüldü.

>OpenJDK ve Oracle JDK arasındaki en büyük fark lisanslamadır. OpenJDK, GNU Genel Kamu Lisansına sahip tamamen açık kaynaklı Java'dır. Oracle JDK, Oracle İkili Kod Lisans Sözleşmesi kapsamında bir ticari lisans gerektirir. Ancak destek ve maliyet açısından da birçok farklılık var.
#####Kaynak: https://www.openlogic.com/blog/java-experts-openjdk-vs-oracle-jdk

##@FunctionalInterface anotasyonu nerelerde kullanılabilir, neleri sağlar ?
> Function interface, içerisinde sadece bir tane abstract metodu olan interface’dir. Eğer ilgili interface’in türetildiği interface’de abstract metot varsa bu durumda da functional interface olur.
Functional interface’ler, lambda expression’ların kullanılabilmesi için tanımlanırlar.
Functional interface’ler tanımlanırken, @FunctionalInterface anotasyonu kullanması zorunlu değildir. Bu anotasyon sadece validasyon yapma amacıyla kullanılır. Eğer anotasyon eklenirse ve birden fazla abstract metot eklenmeye çalışılırsa, bu durumda compile error verecektir.
##Java’da hangi functional interface’ler yer almaktadır ? Yaptığınız araştırmada en popüler/göze çarpanlar hangileridir ?