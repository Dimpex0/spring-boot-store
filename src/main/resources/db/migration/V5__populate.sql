INSERT INTO categories (name) VALUES
                                  ('Fruits'),
                                  ('Vegetables'),
                                  ('Dairy'),
                                  ('Meat'),
                                  ('Bakery'),
                                  ('Beverages'),
                                  ('Snacks'),
                                  ('Frozen'),
                                  ('Pantry'),
                                  ('Personal Care');
INSERT INTO products (name, price, description, category_id) VALUES
-- Fruits
('Bananas', 1.29, 'Fresh yellow bananas, sold per pound', 1),

-- Vegetables
('Broccoli', 2.50, 'Organic broccoli crowns, fresh and crunchy', 2),

-- Dairy
('Whole Milk', 3.19, '1 gallon of whole milk, pasteurized', 3),

-- Meat
('Chicken Breast', 6.49, 'Boneless, skinless chicken breasts, per pound', 4),

-- Bakery
('Whole Wheat Bread', 2.99, 'Sliced whole wheat sandwich bread', 5),

-- Beverages
('Coca-Cola 1.5L', 1.89, '1.5 liter bottle of classic Coca-Cola', 6),

-- Snacks
('Lays Classic Chips', 3.29, 'Large bag of Lays classic salted potato chips', 7),

-- Frozen
('Frozen Peas', 2.49, '16 oz bag of green frozen peas', 8),

-- Pantry
('Spaghetti Pasta', 1.59, '1 lb of dry spaghetti pasta, made from durum wheat', 9),

-- Personal Care
('Colgate Toothpaste', 2.79, '4 oz tube of Colgate Total Whitening Toothpaste', 10);
