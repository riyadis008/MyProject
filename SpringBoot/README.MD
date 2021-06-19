Langkah - langkah pembuatan program :

1. Membuat Model 
- Membuat class model masing - masing untuk Objek Product dan Cart yang otomatis membuat sebuah tabel dalam database

2. Membuat JPA Repository
- Membuat Interface JPA untuk model product dan Cart yang berfungsi untuk mengimplementasikan fitur - fitur untuk mengakses database

3. Membuat Service
- Membuat Interface dan Class servis untuk model product dan cart yang digunakan untuk fungsi transactional di database

4. Membuat Rest Controller
- Membuat Rest controller untuk model product dan cart dimana terdapat fungsi - fungsi utama yang digunakan Restful API untuk memanipulasi data