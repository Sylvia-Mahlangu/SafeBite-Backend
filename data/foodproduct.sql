CREATE TABLE FoodProduct (
    product_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    barcode VARCHAR(100),
    name VARCHAR(255),
    brand VARCHAR(255),
    ingredients TEXT,
    nutrition_grade VARCHAR(10),
    expiry_date VARCHAR(50)
);

INSERT INTO FoodProduct (
    barcode,
    name,
    brand,
    ingredients,
    nutrition_grade,
    expiry_date
)
VALUES (
    '123456789',
    'Sasko Low GI Dumpy Seeded Brown Bread 800g',
    'Sasko Bakery',
    'Wheat Flour, Water, Wheat Bran, Linseed, Oats, Sunflower Seeds, Vitamins and Minerals',
    'A',
    '2026-04-31'
);