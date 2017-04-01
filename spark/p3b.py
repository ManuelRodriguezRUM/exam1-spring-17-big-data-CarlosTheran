#Code here
import csv
data_escuela = sc.textFile("/home/carlos/Files/escuelasPR.csv")
Var_escuela=data_escuela.map(lambda x: [x]).map(lambda x : list(csv.reader(x))[0])
ponce = Var_escuela.filter(lambda x: x[2] == 'Ponce')
Cabo_Rojo = Var_escuela.filter(lambda x: x[2] == 'Cabo Rojo')
Dorado = Var_escuela.filter(lambda x: x[2] == 'Dorado')
sol2 = ponce.union(Cabo_Rojo).union(Dorado)
sol2.foreach(print)
