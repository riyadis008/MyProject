from sklearn import ensemble

kls = ensemble.RandomForestClassifier() #random forest classifier

#fungsi prediksi
def prediction (height, weight, shoes) :
	#lakukan prediksi dengan input list informasi
	prediksi = kls.predict([[height,weight,shoes]])
	return prediksi


#[tinggi, berat badan , ukuran sepatu]
informasi = [[181,71,44],[171,70,43],[181,81,45],[166,65,37],[165,55,35],[171,80,43],
			[179,75,42],[178,72,443],[166,56,35],[170,60,37],[171,63,36],[175,65,40]]

#label data jenis kelamin
jkelamin = ['pria','pria','pria','wanita','wanita','pria','pria','pria','wanita','wanita','wanita','wanita']



#train berdasarkan data

kls = kls.fit(informasi,jkelamin)

while True :
	#menerima command user
	print("")
	print("Intro Python for Data Science")
	print("================================")
	print("a. Prediksi")
	print("b. Keluar  Program")
	masukkan = input("Masukkan Nomor Command Anda : ")

	if masukkan == "a" :
		#masukkan input untuk di prediksi
		tinggi = input("Masukkan Tinggi Badan : ")
		berat  = input("masukkan Berat Badan : ")
		sepatu = input ("Masukkan Berat Sepatu : ") 
		print(prediction(tinggi,berat,sepatu))

	else :
		print("Keluar Dari Program")
		break
