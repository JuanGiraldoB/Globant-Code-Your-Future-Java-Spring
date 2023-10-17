USE nba;

SELECT * FROM equipos;
SELECT * FROM estadisticas;
SELECT * FROM jugadores;
SELECT * FROM partidos;

-- integrador


-- 1) Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s
-- 		siguiente/s consulta/s:
-- Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
SELECT COUNT(*) AS veces_maximo_asistencias
FROM estadisticas
WHERE Asistencias_por_partido = (
  SELECT MAX(Asistencias_por_partido)
  FROM estadisticas
);

-- Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de
-- 	datos:
-- Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
-- centro o esté comprendida en otras posiciones.
SELECT SUM(Peso) AS suma_peso
FROM jugadores
WHERE Nombre_equipo IN (
  SELECT Nombre
  FROM equipos
  WHERE Conferencia = 'East'
)
AND posicion LIKE '%C%';




-- 1) Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
SELECT nombre FROM jugadores
ORDER BY nombre;

-- 2) Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
-- 		ordenados por nombre alfabéticamente.
SELECT nombre, posicion, peso FROM jugadores
WHERE posicion = 'C' AND peso > 200
ORDER BY nombre;

-- 3) Mostrar el nombre de todos los equipos ordenados alfabéticamente.
SELECT nombre FROM equipos
ORDER BY nombre;

-- 4) Mostrar el nombre de los equipos del este (East).
SELECT nombre, conferencia FROM equipos
WHERE conferencia = 'East'
ORDER BY nombre;

-- 5) Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
SELECT nombre, conferencia FROM equipos
WHERE nombre LIKE 'c%'
ORDER BY nombre;

-- 6) Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
SELECT nombre, nombre_equipo FROM jugadores
ORDER BY nombre_equipo;

-- 7) Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
SELECT * FROM jugadores
WHERE nombre_equipo = 'Raptors'
ORDER BY nombre;

-- 8) Mostrar los puntos por partido del jugador ‘Pau Gasol’.
SELECT puntos_por_partido, nombre FROM estadisticas e
INNER JOIN jugadores j
ON e.jugador = j.codigo
WHERE nombre = 'Pau Gasol';

-- 9) Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
SELECT puntos_por_partido, nombre FROM estadisticas e
INNER JOIN jugadores j
ON e.jugador = j.codigo
WHERE nombre = 'Pau Gasol' AND temporada = '04/05';

-- 10) Mostrar el número de puntos de cada jugador en toda su carrera.
SELECT SUM(puntos_por_partido), nombre FROM estadisticas e
INNER JOIN jugadores j
ON e.jugador = j.codigo
GROUP BY nombre
ORDER BY SUM(puntos_por_partido);

-- 11) Mostrar el número de jugadores de cada equipo.
SELECT COUNT(nombre), nombre_equipo FROM jugadores
GROUP BY nombre_equipo;

-- 12) Mostrar el jugador que más puntos ha realizado en toda su carrera.
SELECT SUM(puntos_por_partido), nombre FROM estadisticas e
INNER JOIN jugadores j
ON e.jugador = j.codigo
GROUP BY nombre
ORDER BY SUM(puntos_por_partido) DESC
LIMIT 1;

-- 13) Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
SELECT e.nombre, e.conferencia, e.division, j.altura FROM equipos e
INNER JOIN jugadores j
ON e.nombre = j.nombre_equipo
WHERE j.altura = (SELECT MAX(altura) FROM jugadores);

-- 14) Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor
-- 		diferencia de puntos.
SELECT equipo_local, equipo_visitante, ABS(puntos_local - puntos_visitante) AS diferencia FROM partidos
WHERE ABS(puntos_local - puntos_visitante) = (SELECT MAX(ABS(puntos_local - puntos_visitante)) AS diferencia FROM partidos);

-- 15) Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,
-- 		equipo_ganador), en caso de empate sera null.
SELECT 
    codigo,
    equipo_local,
    equipo_visitante,
    CASE 
        WHEN puntos_local > puntos_visitante THEN equipo_local
        WHEN puntos_local < puntos_visitante THEN equipo_visitante
        ELSE NULL
    END AS equipo_ganador
FROM partidos;
