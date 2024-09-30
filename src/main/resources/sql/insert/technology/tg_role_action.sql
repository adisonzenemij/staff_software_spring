-- Insertar registros en la tabla
INSERT INTO `tg_role_action` (`ad_created_date`, `af_description`, `cd_acronym`, `cd_name`, `tg_role_func`) VALUES
(NOW(), 'Consultar informacion','read','Consultar','1'),
(NOW(), 'Crear informacion','create','Crear','1'),
(NOW(), 'Actualizar informacion','update','Actualizar','1'),
(NOW(), 'Eliminar informacion','deleted','Eliminar','1'),
(NOW(), 'Consultar informacion','read','Consultar','2'),
(NOW(), 'Subir informacion','upload','Subir','2'),
(NOW(), 'Proccesar informacion','process','Proccesar','2'),
(NOW(), 'Eliminar informacion','deleted','Eliminar','2'),
(NOW(), 'Validar informacion','validate','Validar','2'),
(NOW(), 'Plantilla informacion','template','Plantilla','2'),
(NOW(), 'Consultar informacion','read','Consultar','3'),
(NOW(), 'Subir informacion','upload','Subir','3'),
(NOW(), 'Descargar informacion','download','Descargar','3'),
(NOW(), 'Eliminar informacion','deleted','Eliminar','3');