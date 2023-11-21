# Java Composition

### Proje Kurulumu

Projeyi önce forklayın daha sonra klonlayın ve Intellij kullanarak projeyi açın. 
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Hedeflerimiz:

Sınıf yazmaya doyduğunuz bir proje olması dileklerimle....

### com.workintech.model.Lamp
* com.workintech.model.Lamp isimli bir sınıf yazınız.
* com.workintech.model.Lamp sınıfı için 3 tane ```instance variable``` tanımlamalıyız. ```style``` tipi com.workintech.enums.LampType isminde bir enum olmalı. ```battery``` tipi boolean olmalı. ```globRating``` tipi int olmalı. 
* com.workintech.model.Lamp sınıfının tüm değişkenleri `private` olmalı. com.workintech.model.Lamp sınıfı için 3 değişkeninde eklenebileceği tek bir ```constructor``` olmalı.
* com.workintech.model.Lamp sınıfı için toplamda 4 metod yazmamız gerekiyor. ```turnOn``` herhangi bir değer dönmeyecek. Sadece 'com.workintech.model.Lamp is being turned on.' mesajının ekrana basacak.
* ```getStyle()``` style değişkenin değerini dönmeli. ```isBattery()``` battery değişkeninin değerini dönmeli. ```getGlobalRating()``` globalRating değişkeninin değerini dönmeli.

### com.workintech.model.Bed
* com.workintech.model.Bed isminde bir sınıf yazınız.
* com.workintech.model.Bed sınıfı için 5 tane ```instance variable``` tanımlamalıyız. style tipi String olmalı. ```pillows, height, sheets, quilt``` tipleri int olmalı. Hepsi private olmalı.
* com.workintech.model.Bed sınıfı için bir constructor yazmalıyız.
* com.workintech.model.Bed sınıfı için 5 metod yazacağız. ```make``` herhangi bir return değeri olmayacak. Sadece 'The bed is being made.' mesajını ekrana basacak.
* ```getPillows()``` pillows sayısını return etmeli. ```getHeight()``` height değerini return etmeli. ```getSheets()``` sheets sayısını return etmeli. ```getQuilts()``` quilts sayısını return etmeli.

### com.workintech.model.Wardrobe 
* com.workintech.model.Wardrobe isminde bir sınıf yazınız. 
* com.workintech.model.Wardrobe sınıfı için 3 adet ```instance variable``` tanımlayınız. ```int width, int height, double weight``` Hepsi private olmalı.
* com.workintech.model.Wardrobe sınıfı için constructor & getter metodlarını yazınız.
* com.workintech.model.Wardrobe sınıfı içerisinde ```add``` isminde bir metod tanımlayınız. Herhangi bir değer dönmeyecek. Sadece 'com.workintech.model.Wardrobe added into com.workintech.model.Bedroom.' mesajını ekrana basacak.

### com.workintech.model.Carpet
* com.workintech.model.Carpet isminde bir sınıf yazınız.
* com.workintech.model.Carpet sınıfı için 3 adet ```instance variable``` tanımlayınız. ```int width, int height, com.workintech.enums.PaintColor color``` Hepsi private olmalı.
* com.workintech.model.Carpet sınıfı için constructor & getter metodlarını yazınız.
* com.workintech.model.Carpet sınıfı içerisinde ```lying``` isminde bir metod tanımlayınız. Herhangi bir değer dönmeyecek. Sadece 'com.workintech.model.Carpet is lying on com.workintech.model.Bedroom floor.' mesajını ekrana basacak.

### com.workintech.model.Ceiling
* com.workintech.model.Ceiling isminde bir sınıf yazınız. com.workintech.model.Ceiling sınıfının 2 tane ```instance variable``` olmalı. ```height``` ve ```paintedColor```. height int tipinde olmalı paintedColor com.workintech.enums.PaintColor isminde bir enum olmalı ve ikisi de private olmalı.
* com.workintech.model.Ceiling sınıfının bir ```constructor``` metodu olmalı. 2 değişkenine de değer atamalı.
* com.workintech.model.Ceiling sınıfının ```getHeight()``` adında bir metodu olmalı. height değerini dönmeli. ```getPaintedColor``` adında bir metodu olmalı ve paintedColor değerini dönmeli.
* com.workintech.model.Ceiling sınıfının ```create``` isimli bir metodu olmalı. com.workintech.model.Ceiling objesinin height ve paintingColor değerlerini ekrana basmalı.

### com.workintech.model.Wall
* com.workintech.model.Wall isminde bir sınıf yazınız. İçerisinde bir tane değişkeni olmalı ```direction``` String değerinde olmalı ve private olarak tanımlanmalı.
* com.workintech.model.Wall sınıfının bir ```constructor``` metodu olmalı ve tek değişkenine değer atamalı.
* com.workintech.model.Wall sınıfının iki metodu olmalı. ```getDirection``` direction değişkeninin değerini dönmeli. ```create``` metodu com.workintech.model.Wall objesinin hangi directiona göre oluşturulduğunu ekrana basmalı.

### com.workintech.model.Bedroom 
* com.workintech.model.Bedroom isimli bir sınıf oluşturunuz.
* Bu sınıfın 10 tane ```instance variable``` değeri olmalı. ```name``` String tipinde. ```wall1 wall2 wall3 wall4``` com.workintech.model.Wall tipinde. ```ceiling``` com.workintech.model.Ceiling tipinde.
  ```bed``` com.workintech.model.Bed tipinde. ```lamp``` com.workintech.model.Lamp tipinde. ```wardrobe``` com.workintech.model.Wardrobe tipinde. ```carpet``` com.workintech.model.Carpet tipinde.
* Sınıfımızın ```constructor``` metodu tek olmalı ve 10 değişkeni de almalı. 
* getter metodlarını eklemelisiniz.

### Enums
* com.workintech.enums.LampType ve com.workintech.enums.PaintColor isminde iki tane enum tanımlamalısınız.
* Detaylarını istediğiniz gibi oluşturabilirsiniz.

### Uygulamayı Test Etmek

 Bir adet com.workintech.model.Bedroom objesi oluşturun. İçerdiği sınıfların tüm değerlerine rahatlıkla erişebilmeli, tüm metodlarını çağırabilmelisin. 

### For Challengers
 * Room isminde bir sınıf tanımlasaydık. com.workintech.model.Bedroom ile ilişkisi nasıl olurdu ?
 * com.workintech.model.Bedroom'un hangi ```instance variable``` değerleri Room içerisine alınıp buradan yönetilebilirdi ?
 * Yapılan dizaynı bu bağlamda değiştiriniz.



