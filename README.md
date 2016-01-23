# Template Belajar Web 
Ini adalah template yang saya gunakan untuk belajar java web programming. Template ini akan saya update terus sebagai dokumentasi pribadi dalam belajar java. Download dulu source codenya, kemudian buat database dengan nama belajar dengan username root dan password root. Buka command prompt dan pastikan maven variabel sudah diseting dengan benar. Kemudian masuk ke folder root source code dan jalankan perintah mvn clean install. Lalu masuk ke folder view dan jalankan perintah mvn jetty:run maka aplikasi akan running namun baru bisa diakses pada URL : http://localhost:9999/item/form. 
## Project Modules ##
1. aplication-config : Konfigurasi aplikasi
2. domain-model : kelas entity 
3. business-process : tempat business logic berada
4. view : view untuk halaman web

## Teknologi ##
1. Spring Framework
2. Hibernate
3. Spring Data JPA
4. JSP
5. Joda Time