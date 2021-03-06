

Insert into TBL_ACTORES (PK_ID_ACTOR,DS_CODE,DS_NAME,DT_CREATION,DT_MODIFIED,DS_USER_CREATION,DS_USER_MODIFICATION,DS_NOMBRE,DS_DESCRIPCION,DS_PCI) values (2,'1','juan',null,null,'juan','juan','juan','dir','1');

Insert into TBL_ACTORES (PK_ID_ACTOR,DS_CODE,DS_NAME,DT_CREATION,DT_MODIFIED,DS_USER_CREATION,DS_USER_MODIFICATION,DS_NOMBRE,DS_DESCRIPCION,DS_PCI) values (1,'1','juan',null,null,'juan','juan','juan','dir','1');


Insert into TBL_UBICACIONES (PK_ID_UBICACION,DS_CODE,DS_NAME,DT_CREATION,DT_MODIFIED,DS_USER_CREATION,DS_USER_MODIFICATION,DS_NOMBRE,DS_TIPO,DS_DIRECCION,DS_CIUDAD,DS_ESTADO,DS_PAIS,DS_DESCRIPCION,DS_PCI,FK_ID_RESPONSABLE) values (1,'1','juan',null,null,'juan','juan','juan','pefil','director','mx','cdmx','mexico','s','1',1);

Insert into TBL_SEGMENTOS (PK_ID_SEGMENTO,DS_NOMBRE,DS_DESCRPCION,DS_RANGO_IP_INICIA,DS_RANGO_IP_TERMINA,DS_TIPO,DS_PCI,FK_ID_UBICACION) values (1,'santafe','santafe','10-11','10-11','publica','1',1);

Insert into TBL_IPS (PK_ID_IP,DS_IP,DS_TIPO,FK_ID_SEGMENTO) values (1,'10.0.3.1','int',1);

Insert into TBL_NIVELES_CIFRADO (PK_ID_CIFRADO,DS_NOMBRE) values (2,'HTTP');

Insert into TBL_MARCAS (PK_ID_MARCA,DS_NOMBRE,DS_DESCRIPCION) values (2,'10.0.3.2','microsoft');

Insert into TBL_SERVIDORES (PK_ID_SERVIDOR,DS_CODE,DS_NAME,DT_CREATION,DT_MODIFIED,DS_USER_CREATION,DS_USER_MODIFICATION,DS_AMBIENTE,DS_HOST_NAME,DS_DESCRIPCION,DS_PROPOSITO,DS_MARCA_MODELO,DS_VIRTUALIZACION,DS_TIPO,DS_PCI,FK_ID_RESPONSABLE,FK_ID_UBICACION) values (3,'2','linux',null,null,'juan','juan','QA','liux','prod','transacciones','linux','1','1','1',1,1);
Insert into TBL_SERVIDORES (PK_ID_SERVIDOR,DS_CODE,DS_NAME,DT_CREATION,DT_MODIFIED,DS_USER_CREATION,DS_USER_MODIFICATION,DS_AMBIENTE,DS_HOST_NAME,DS_DESCRIPCION,DS_PROPOSITO,DS_MARCA_MODELO,DS_VIRTUALIZACION,DS_TIPO,DS_PCI,FK_ID_RESPONSABLE,FK_ID_UBICACION) values (4,'2','linux',null,null,'juan','juan','QA','liux','prod','transacciones','linux','1','1','1',1,1);

Insert into TBL_SOFTWARE_COMERCIAL (PK_ID_SOFTWARE,DS_NOMBRE,DS_VERSION,DS_TIPO,FK_ID_MARCA) values (3,'office','v1','dev',2);

Insert into TBL_IP_X_SERVIDORES (FK_ID_IP,FK_ID_SERVIDOR) values (1,3);

Insert into TBL_BASE_DATOS (PK_ID_BASE,DS_CODE,DS_NAME,DT_CREATION,DT_MODIFIED,DS_USER_CREATION,DS_USER_MODIFICATION,DS_NOMBRE,FK_ID_MODELO_DATOS,DS_ENCRIPCION,DS_ALGORITMO,DS_PCI,FK_ID_RESPONSABLE) values (3,'dsCode','prueba',to_timestamp('20/05/20 19:01:46.593000000','DD/MM/RR HH24:MI:SSXFF'),to_timestamp('20/05/20 19:01:46.593000000','DD/MM/RR HH24:MI:SSXFF'),'1','dsClasificacion','prueba',null,'dsEncripcion','dsAlgoro','p',2);

Insert into TBL_APLICACIONES (PK_ID_APLICACION,DS_CODE,DS_NAME,DT_CREATION,DT_MODIFIED,DS_USER_CREATION,DS_USER_MODIFICATION,DS_NOMBRE,DS_NOMBRE_CORTO,DS_NOMBRE_LARGO,DS_DESCRIPCION,DS_PCI,DS_CLASIFICACION,DS_ESTATUS) values (2,'5','prueba',to_timestamp('20/05/20 19:01:46.593000000','DD/MM/RR HH24:MI:SSXFF'),to_timestamp('20/05/20 19:01:46.593000000','DD/MM/RR HH24:MI:SSXFF'),'1','dsClasificacion','prueba','prueba','prueba','prueba','p','dsClasificacion',null);

Insert into TBL_SERVICIOS_APLICATIVO (PK_ID_SERVICIO,DS_CODE,DS_NAME,DT_CREATION,DT_MODIFIED,DS_USER_CREATION,DS_USER_MODIFICATION) values (2,'1','Windows',null,null,'Juan','Juan');

Insert into TBL_TABLAS (PK_ID_TABLA,DS_TABLA,FK_ID_BASE) values (2,'TABLA 1',3);

Insert into TBL_SOFTWARESCOM_X_SERVIDOR (FK_ID_SOFTWARE,FK_ID_SERVER) values (3,3);

Insert into TBL_PROTOCOLOS (PK_ID_PROTOCOLO,DS_NOMBRE,DS_VERSION,FK_ID_CIFRADO) values (3,'HTTP','1',2);

Insert into TBL_ACTORES_X_APLICACION (FK_ID_ACTOR, FK_ID_APLICACION) values (1, 2);

Insert into TBL_APLICACIONES (PK_ID_APLICACION,DS_CODE,DS_NAME,DT_CREATION,DT_MODIFIED,DS_USER_CREATION,DS_USER_MODIFICATION,DS_NOMBRE,DS_NOMBRE_CORTO,DS_NOMBRE_LARGO,DS_DESCRIPCION,DS_PCI,DS_CLASIFICACION,DS_ESTATUS) values (5,'5','prueba',to_timestamp('20/05/20 19:01:46.593000000','DD/MM/RR HH24:MI:SSXFF'),to_timestamp('20/05/20 19:01:46.593000000','DD/MM/RR HH24:MI:SSXFF'),'1','dsClasificacion','prueba','prueba','prueba','prueba','p','dsClasificacion',null);

insert into TBL_APLICACIONES_X_SERVIDOR(FK_ID_SERVIDOR, FK_ID_APLICACION) values (3, 5);

Insert into TBL_APLICACIONES (PK_ID_APLICACION,DS_CODE,DS_NAME,DT_CREATION,DT_MODIFIED,DS_USER_CREATION,DS_USER_MODIFICATION,DS_NOMBRE,DS_NOMBRE_CORTO,DS_NOMBRE_LARGO,DS_DESCRIPCION,DS_PCI,DS_CLASIFICACION,DS_ESTATUS) values (6,'5','prueba',to_timestamp('20/05/20 19:01:46.593000000','DD/MM/RR HH24:MI:SSXFF'),to_timestamp('20/05/20 19:01:46.593000000','DD/MM/RR HH24:MI:SSXFF'),'1','dsClasificacion','prueba','prueba','prueba','prueba','p','dsClasificacion',null);

Insert into TBL_APLICACIONES (PK_ID_APLICACION,DS_CODE,DS_NAME,DT_CREATION,DT_MODIFIED,DS_USER_CREATION,DS_USER_MODIFICATION,DS_NOMBRE,DS_NOMBRE_CORTO,DS_NOMBRE_LARGO,DS_DESCRIPCION,DS_PCI,DS_CLASIFICACION,DS_ESTATUS) values (7,'5','prueba',to_timestamp('20/05/20 19:01:46.593000000','DD/MM/RR HH24:MI:SSXFF'),to_timestamp('20/05/20 19:01:46.593000000','DD/MM/RR HH24:MI:SSXFF'),'1','dsClasificacion','prueba','prueba','prueba','prueba','p','dsClasificacion',null);

Insert into TBL_SERVICIOS_APLICATIVO (PK_ID_SERVICIO,DS_CODE,DS_NAME,DT_CREATION,DT_MODIFIED,DS_USER_CREATION,DS_USER_MODIFICATION) values (7,'1','Windows',null,null,'Juan','Juan');

Insert into TBL_APPS_X_SERV_APP (FK_ID_APLICACION, FK_ID_SERVICIO) values (7, 7);

Insert into TBL_APLICACIONES (PK_ID_APLICACION,DS_CODE,DS_NAME,DT_CREATION,DT_MODIFIED,DS_USER_CREATION,DS_USER_MODIFICATION,DS_NOMBRE,DS_NOMBRE_CORTO,DS_NOMBRE_LARGO,DS_DESCRIPCION,DS_PCI,DS_CLASIFICACION,DS_ESTATUS) values (8,'5','prueba',to_timestamp('20/05/20 19:01:46.593000000','DD/MM/RR HH24:MI:SSXFF'),to_timestamp('20/05/20 19:01:46.593000000','DD/MM/RR HH24:MI:SSXFF'),'1','dsClasificacion','prueba','prueba','prueba','prueba','p','dsClasificacion',null);

Insert into TBL_BASE_DATOS (PK_ID_BASE,DS_CODE,DS_NAME,DT_CREATION,DT_MODIFIED,DS_USER_CREATION,DS_USER_MODIFICATION,DS_NOMBRE,FK_ID_MODELO_DATOS,DS_ENCRIPCION,DS_ALGORITMO,DS_PCI,FK_ID_RESPONSABLE) values (8,'dsCode','prueba',to_timestamp('20/05/20 19:01:46.593000000','DD/MM/RR HH24:MI:SSXFF'),to_timestamp('20/05/20 19:01:46.593000000','DD/MM/RR HH24:MI:SSXFF'),'1','dsClasificacion','prueba',null,'dsEncripcion','dsAlgoro','p',2);

Insert into TBL_APP_X_BASE_DATOS (FK_ID_APLICACION, FK_ID_BASE ) values (8, 8);

Insert into TBL_COMPONENTES_RED (PK_ID_COMPONENTE, DS_DESCRIPCION, DS_NOMBRE, DS_SERVICIO, FK_ID_IP) values (5, 'tplink', 'link', 'red', 1);

Insert into TBL_BITACORA_CAMBIOS (PK_ID_BITACORA,DS_CODIGO,DS_FECHA,DS_DESCRIPCION,DS_TIPO,DS_AUTOR,ID_ESTATUS) values (6,1,null,'cambios','1','Arturo ',1);


DROP SEQUENCE IF EXISTS SEQ_COMPONENTE_RED;
DROP SEQUENCE IF EXISTS SEQ_IPS;
DROP SEQUENCE IF EXISTS SEQ_NIVEL_CIFRADO;
DROP SEQUENCE IF EXISTS SEQ_PROTOCOLO;

CREATE SEQUENCE IF NOT EXISTS SEQ_COMPONENTE_RED START WITH 1;
CREATE SEQUENCE IF NOT EXISTS SEQ_IPS START WITH 1;
CREATE SEQUENCE IF NOT EXISTS SEQ_NIVEL_CIFRADO START WITH 1;
CREATE SEQUENCE IF NOT EXISTS SEQ_PROTOCOLO START WITH 1;



