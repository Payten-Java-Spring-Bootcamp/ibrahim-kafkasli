#Soru 1
##Pass By Value
> Pass By Value, bir fonksiyona parametre olarak gönderilen bir değişken aslında parametre olarak gönderilen değişkenin kendisi değil bir kopyasıdır. Fonksiyona değişkenin yalnızca değeri iletilir. Biz fonksiyonda gerçek değer üzerinde değil, kopya değer üzerinde işlem yaparız.
##Pass By Reference
> Pass By Reference, bir fonksiyona iletilen parametre, gerçek değerin bir kopyası değil kendisidir. Fonksiyona parametre geçerken o parametrenin değerini değil adresini parametre geçeriz. Bu sayede yaptığımız işlem asıl değeri etkiler.
##### Kaynak: https://pediaa.com/what-is-the-difference-between-pass-by-value-and-pass-by-reference/

##Java'da Pass By Value ve Pass By Reference Kavramları
> Java her ne kadar Pass By Value bir programlama dili olsa da bu konuda kafa karıştıran bazı durumlar vardır. Örneğin Java'da primitive tipler tamamıyla Pass By Value dur. Örnek olarak;
```
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
```
>Burada changeHomerAge fonksiyonuna parametre olarak geçilen homerAge değeri gerçekte oluşturulan homerAge değerinin yalnızca bir kopyasıdır. O yüzden fonksiyonda ne kadar değeri değiştirilmiş olsa da, main metodu içerisinde yazdırılan homerPage işleminin çıktısı 30 olacaktır. Ancak changeHomerAge fonksiyonunda bir yazdırma olsaydı çıktı bu sefer 35 olacaktı. Bu iki değişken birbirinden bağımsızdır ve farklıdır.

> Ancak Java'da objeler bir fonksiyona parametre olarak gönderildiğinde, objenin bellekteki referansının parametre geçilen objeye kopyalanır. Bu durumda iki obje de bellekte aynı yeri gösterdiği için iki obje birbirinin aynısı olur
```
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
```
> Bu örnekte fonksiyona parametre olarak geçilen Simpson sınıfına ait nesne fonksiyon parametresi ile aynı referansı işaret ettiği için, fonksiyon içerisinde yapılan değer güncellemeleri, asıl objeyi de etkiler
#####Kaynak: https://www.infoworld.com/article/3512039/does-java-pass-by-reference-or-pass-by-value.html
#Soru 2
##Immutable ve Immutability Nedir?
> Immutable kelime anlamı olarak değişmez anlamına gelmektedir. Programlama dünyasında baktığımız da ise karşımıza immutable sınıflar çıkmaktadır. Bu sınıfların nesneleri bir kez oluşturulduktan sonra bir daha değiştirilememektedir. Bu tarz nesneler değiştirilmek istendiğinde o nesnenin bir klonu oluşturulmalı, istenilen değişiklik klonu oluştururken yapılmalıdır. 

>Java’da yaygın olanlarından örnek verecek olursak String ve tüm ilkel sarmalayıcılar (Integer, Long, Double, Byte….), BigDecimal, BigInteger immutable sınıflardır.  Date, StringBuilder mutable sınıflardandır.