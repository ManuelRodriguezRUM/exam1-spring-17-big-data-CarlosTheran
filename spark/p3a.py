#Code here
import csv
data_student = sc.textFile("/home/carlos/Files/studentsPR.csv")
Var_student=data_student.map(lambda x: [x]).map(lambda x : list(csv.reader(x))[0])
sol1=Var_student.filter(lambda x: x[5] == 'F').filter(lambda x: x[2] == '71381')
sol1.foreach(print)
