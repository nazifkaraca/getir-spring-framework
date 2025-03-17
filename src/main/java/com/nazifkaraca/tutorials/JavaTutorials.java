package com.nazifkaraca.tutorials;

public class JavaTutorials {

    public static void main(String[] args) {

/*

        ### 1. **Java Temel Kavramlar ve Kullanımlar**
        #### `Arrays.sort()`
        - `Arrays.sort()` metodu, Java'nın `java.util.Arrays` sınıfında bulunan ve bir diziyi sıralamak için kullanılan bir metottur.
        - Varsayılan olarak, `Arrays.sort()` **doğal sıralama (natural order)** kullanarak elemanları küçükten büyüğe sıralar.
        - Eğer özel bir sıralama istiyorsak, `Comparator` kullanabiliriz.

        ```java
        import java.util.Arrays;

        public class Main {
            public static void main(String[] args) {
                int[] numbers = {5, 2, 8, 1, 3};
                Arrays.sort(numbers);
                System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 5, 8]
            }
        }
        ```

        ---

        #### `this`
        - `this` anahtar kelimesi, **mevcut nesnenin (current instance)** referansını ifade eder.
        - Özellikle nesne içinde metotları ve değişkenleri ayırt etmek için kullanılır.

        ```java
        class Person {
            String name;

            Person(String name) {
                this.name = name; // this kullanımı
            }
        }
        ```

        ---

        #### `super`
        - `super`, bir sınıfın **üst sınıfındaki (superclass) metotlara veya değişkenlere** erişmek için kullanılır.
        - `super()` çağrısı, üst sınıfın yapıcı metodunu çağırır.

        ```java
        class Animal {
            String type = "Hayvan";

            void makeSound() {
                System.out.println("Ses çıkarır.");
            }
        }

        class Dog extends Animal {
            void showType() {
                System.out.println(super.type); // Üst sınıftaki değişkene erişim
            }
        }
        ```

        ---

        #### `break`, `continue`, `return`
        - **`break`**: Döngüyü sonlandırır.
        - **`continue`**: Döngünün mevcut iterasyonunu atlar.
        - **`return`**: Metottan çıkmak için kullanılır.

        ```java
        for (int i = 0; i < 5; i++) {
            if (i == 3) break;  // Döngü 3'e geldiğinde sonlanır
            System.out.println(i);
        }
        ```

        ---

        #### `Optional`
        - `java.util.Optional` sınıfı, **null referansları yönetmek için** kullanılır.

        ```java
        import java.util.Optional;

        public class Main {
            public static void main(String[] args) {
                Optional<String> name = Optional.ofNullable(null);
                System.out.println(name.orElse("Varsayılan Değer")); // Varsayılan Değer
            }
        }
        ```

        ---

        #### `Cast (Tür Dönüşümü)`
        - **Genişletilmiş dönüşüm (Implicit Cast)**: Küçük bir türü büyük türe çevirmek.
        - **Daraltılmış dönüşüm (Explicit Cast)**: Büyük bir türü küçük türe çevirmek.

        ```java
        int x = 10;
        double y = x; // Genişletilmiş dönüşüm

        double a = 10.5;
        int b = (int) a; // Daraltılmış dönüşüm
        ```

        ---

        #### **Primitive Type ve Wrapper Class**
        - **Primitive Types**: `int, double, float, char, boolean` gibi temel veri tipleri.
        - **Wrapper Class**: `Integer, Double, Boolean` gibi nesne temelli sınıflar.

        ```java
        int num = 5;
        Integer obj = num; // Auto-boxing
        int num2 = obj; // Unboxing
        ```

        ---

        #### **Random ve Math**
        - `Random` sınıfı rastgele sayı üretmek için kullanılır.
        - `Math` sınıfı matematiksel işlemler için hazır metotlar içerir.

        ```java
        import java.util.Random;

        Random rand = new Random();
        int num = rand.nextInt(10); // 0-9 arasında sayı üretir

        double sqrtValue = Math.sqrt(25); // 5.0
        ```

        ---

        #### **String, StringBuilder, StringBuffer, StringTokenizer**
        - **`String`**: Değiştirilemez (`immutable`).
        - **`StringBuilder`**: Değiştirilebilir (`mutable`), `thread-safe` değil.
        - **`StringBuffer`**: `StringBuilder` ile benzer ama `thread-safe`.
        - **`StringTokenizer`**: Bir string’i belirli bir ayırıcıya göre böler.

        ```java
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString());
        ```

        ---

        ### 2. **Java Nesne Yönelimli Programlama (OOP)**
        #### **OOP Kavramları**
        - **Encapsulation**: Veri saklama, getter/setter ile erişim.
        - **Inheritance**: Miras alma.
        - **Polymorphism**: Aynı metodu farklı şekillerde kullanma.
        - **Abstraction**: Soyutlama (abstract class ve interface kullanımı).

        ---

        #### **Interface ve Abstract Class**
        ```java
        interface Animal {
            void makeSound();
        }

        class Dog implements Animal {
            public void makeSound() {
                System.out.println("Hav hav!");
            }
        }
        ```

        ```java
        abstract class Vehicle {
            abstract void start();
        }

        class Car extends Vehicle {
            void start() {
                System.out.println("Araba çalıştı.");
            }
        }
        ```

        ---

        ### 3. **Java Koleksiyonlar**
        - **List, Set, Map**: Farklı veri yapıları sunar.
        - **ArrayList ve LinkedList**: Dinamik dizilerdir.

        ```java
        import java.util.ArrayList;
        import java.util.List;

        List<String> list = new ArrayList<>();
        list.add("Elma");
        list.add("Armut");
        System.out.println(list);
        ```

        ---

        ### 4. **Java Exception Handling**
        - `try-catch-finally` bloğu kullanılarak hata yönetimi yapılır.

        ```java
        try {
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Hata: " + e.getMessage());
        } finally {
            System.out.println("Her zaman çalışır.");
        }
        ```

        ---

        ### 5. **Java Çoklu İş Parçacığı (Multithreading)**
        - **Thread** kullanarak paralel işlemler çalıştırılabilir.

        ```java
        class MyThread extends Thread {
            public void run() {
                System.out.println("Thread çalışıyor.");
            }
        }

        public class Main {
            public static void main(String[] args) {
                MyThread t = new MyThread();
                t.start();
            }
        }
        ```

        ---

        ### 6. **Java UML, POJO, Bean, Serileştirme**
        - **UML**: Sınıfların ve nesnelerin ilişkisini görselleştiren bir modelleme dilidir.
        - **POJO (Plain Old Java Object)**: İçinde sadece değişken ve getter/setter olan basit sınıflardır.
        - **Bean**: Özel bir POJO türüdür ve parametresiz bir constructor içerir.
        - **Serileştirme (Serialization)**: Bir nesneyi byte dizisine dönüştürme işlemidir.

        ```java
        import java.io.Serializable;

        class Person implements Serializable {
            private String name;
        }
        ```

        ---

        ### 7. **Java IO, JAR, WAR ve Dağıtık Sistemler**
        - **IO (Input/Output)**: Dosya okuma/yazma işlemlerini içerir.
        - **JAR (Java Archive)**: Java sınıf dosyalarını ve kaynakları sıkıştırılmış bir şekilde içerir.
        - **WAR (Web Archive)**: Web uygulamalarını dağıtmak için kullanılır.
        - **Dağıtık Sistemler**: Ağ üzerindeki farklı bilgisayarlar arasında veri paylaşımı yapılmasını sağlar.

* */


    }
}
