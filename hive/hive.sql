# You sql follows
/*Pregunta 1.*/
 Select region_educativa, ciudad,  count(*) from escuelaPR group by region_educativa, ciudad;

/*Pregunta 2.*/
select escuelaPR.nombre_escuela, count(*) from escuelaPR, studentsPR where escuelaPR.num_identificacion = studentsPR.id_escuela group by escuelaPR.nombre_escuela;

/*Pregunta 3.*/
select escuelaPR.nombre_escuela, count(*) from escuelaPR, studentsPR where escuelaPR.num_identificacion = studentsPR.id_escuela AND (escuelaPR.ciudad="Ponce" OR escuelaPR.ciudad="Cabo Rojo") group by escuelaPR.nombre_escuela;

/*Pregunta 4.*/
select id_estudiante, escuelaPR.nombre_escuela from escuelaPR, studentsPR where escuelaPR.num_identificacion = studentsPR.id_escuela AND (escuelaPR.ciudad="Ponce" OR escuelaPR.ciudad="Cabo Rojo");

/*Pregunta 5.*/
select region_educativa, ciudad, count(*) from escuelaPR, studentsPR where escuelaPR.num_identificacion = studentsPR.id_escuela group by region_educativa, ciudad;
