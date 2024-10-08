INSERT INTO Usuario (id, name, lastname, age)
VALUES (1, 'John', 'Doe', 30);
INSERT INTO Usuario (id, name, lastname, age)
VALUES (2, 'Jane', 'Smith', 25);
INSERT INTO Usuario (id, name, lastname, age)
VALUES (3, 'Michael', 'Johnson', 35);
INSERT INTO Usuario (id, name, lastname, age)
VALUES (4, 'Emily', 'Williams', 28);
INSERT INTO Usuario (id, name, lastname, age)
VALUES (5, 'David', 'Brown', 40);
INSERT INTO Usuario (id, name, lastname, age)
VALUES (6, 'Sarah', 'Jones', 32);
INSERT INTO Usuario (id, name, lastname, age)
VALUES (7, 'James', 'Taylor', 27);
INSERT INTO Usuario (id, name, lastname, age)
VALUES (8, 'Emma', 'Martinez', 38);
INSERT INTO Usuario (id, name, lastname, age)
VALUES (9, 'Daniel', 'Anderson', 29);
INSERT INTO Usuario (id, name, lastname, age)
VALUES (10, 'Olivia', 'Garcia', 31);
INSERT INTO Empleado (id, nombre, apellido, direccion, telefono, salario)
VALUES (1, 'Juan', 'Perez', 'Calle 123', '123456789', 2500.00),
       (2, 'María', 'Gomez', 'Avenida 456', '987654321', 2800.00),
       (3, 'Pedro', 'Lopez', 'Calle 789', '456123789', 3000.00),
       (4, 'Ana', 'Martinez', 'Avenida 1011', '789456123', 2700.00),
       (5, 'Carlos', 'Rodriguez', 'Calle 1213', '147258369', 3200.00),
       (6, 'Laura', 'Sanchez', 'Avenida 1415', '369258147', 2900.00),
       (7, 'Diego', 'Garcia', 'Calle 1617', '258369147', 3100.00),
       (8, 'Sofia', 'Hernandez', 'Avenida 1819', '963852741', 2600.00),
       (9, 'Javier', 'Diaz', 'Calle 2021', '159487263', 3300.00),
       (10, 'Paula', 'Torres', 'Avenida 2223', '741852963', 3000.00);
INSERT INTO Producto (id, nombre, descripcion, categoria, precio, stock)
VALUES (1, 'Smartphone XYZ', 'Teléfono inteligente de última generación', 'Electrónica', 599.99, 50),
       (2, 'Camiseta básica', 'Camiseta de algodón en varios colores', 'Ropa', 19.99, 100),
       (3, 'Sartén antiadherente', 'Sartén de calidad premium con revestimiento antiadherente', 'Hogar', 39.99, 30),
       (4, 'Auriculares Bluetooth', 'Auriculares inalámbricos con cancelación de ruido', 'Electrónica', 79.99, 20),
       (5, 'Juego de sábanas', 'Sábanas suaves y confortables de 300 hilos', 'Hogar', 49.99, 40),
       (6, 'Zapatillas deportivas', 'Zapatillas para correr con tecnología de amortiguación', 'Ropa', 89.99, 15),
       (7, 'Aspiradora sin bolsa', 'Aspiradora potente y sin bolsa para facilitar la limpieza', 'Hogar', 129.99, 10),
       (8, 'Tableta gráfica', 'Tableta para dibujo digital de alta precisión', 'Electrónica', 149.99, 25),
       (9, 'Cafetera de cápsulas', 'Máquina de café con sistema de cápsulas compatible con varias marcas',
        'Electrónica', 89.99, 20),
       (10, 'Manta de lana', 'Manta suave y cálida de lana merina', 'Hogar', 29.99, 35);
INSERT INTO Habitacion (id, tipo, capacidad, precio)
VALUES (1, 'individual', 1, 60.00),
       (2, 'individual', 1, 55.00),
       (3, 'individual', 1, 70.00),
       (4, 'doble', 2, 90.00),
       (5, 'doble', 2, 85.00),
       (6, 'suite', 4, 180.00),
       (7, 'suite', 4, 160.00),
       (8, 'suite', 4, 200.00);
INSERT INTO Disponibilidad (id, id_habitacion, fecha, disponible)
VALUES (1, 1, '2023-05-12', true),
       (2, 1, '2023-05-13', true),
       (3, 2, '2024-05-10', true),
       (4, 2, '2024-05-11', false),
       (5, 3, '2024-06-12', false),
       (6, 3, '2024-06-13', true),
       (7, 4, '2025-07-10', true),
       (8, 4, '2025-07-11', true),
       (9, 5, '2025-08-10', true),
       (10, 5, '2025-08-11', true),
       (11, 6, '2026-09-12', true),
       (12, 6, '2026-09-13', true),
       (13, 7, '2027-10-10', false),
       (14, 7, '2027-10-11', true),
       (15, 8, '2027-11-10', true),
       (16, 8, '2027-11-11', true);
