INSERT INTO CATEGORY (id, name, description)
VALUES (1, 'ICE_CREAM', 'Delicious ice cream.');

INSERT INTO CATEGORY (id, name, description)
VALUES (2, 'GELATO', 'Delicious gelato.');

INSERT INTO CATEGORY (id, name, description)
VALUES (3, 'DONUTS', 'Delicious donuts!');

INSERT INTO CATEGORY (id, name, description)
VALUES (4, 'MERCHANDISE', 'Cool merch.');

-- INSERT INTO PRODUCT(id,title, shortDescription, longDescription, ingredients, quantity, alergens, price, currency, photoUrl, type, categoryId)
-- VALUES(1,'Pistachio Ice Cream','Sweet, cold, and creamy with a chance of Pistachio flavour','Treat yourself to ice cream infused with smooth Bourbon sprinkled with pistachio and vanilla','egg yolks, sugar, heavy cream, evaporate milk,teaspoon salt, teaspoons vanilla extract,teaspoon pure almond extract, shelled pistachios, roughly chopped',10,'Milk, egg',2.0,'$','../../assets/icecream.png','Ice cream',1);
-- INSERT INTO PRODUCT(id,title, shortDescription, longDescription, ingredients, quantity, alergens, price, currency, photoUrl, type, categoryId)
-- VALUES(2,'Watermelon Ice Cream','Fill your tummy with a yummy Watermelon Ice Cream','Treat yourself to ice cream infused with smooth Bourbon sprinkled with fresh watermelon','egg yolks, granulated sugar, heavy cream, evaporate milk, teaspoon salt, teaspoon pure, watermelon',30,'Milk, egg',1.0,'$','../../assets/icecream.png','Ice cream',1);
-- INSERT INTO PRODUCT(id,title, shortDescription, longDescription, ingredients, quantity, alergens, price, currency, photoUrl, type, categoryId)
-- VALUES(3,'Dark Chocolate Gelato',' The rich, creamy taste of chocolate coupled with the chilliness of the gelato is an experience in itself!','When you reach a gelato parlour and find it difficult to make up your mind on one specific flavour, dark chocolate is a great selection','egg yolks, granulated sugar, milk, heavy cream, vanilla extract, chocolate',26,'Milk, egg',3.0,'$','../../assets/gelato.png','Gelato',2);
-- INSERT INTO PRODUCT(id,title, shortDescription, longDescription, ingredients, quantity, alergens, price, currency, photoUrl, type, categoryId)
-- VALUES(4,'Lemon Gelato',' Just like a glass of lemonade, lemon gelato is an invigorating and refreshing cold treat on any hot day.','If you do not like desserts that are excessively sweet, lemon flavoured gelato with its mild sweetness will create a whole new perspective of desserts and may be just the right choice for you.','egg yolks, granulated sugar, milk, heavy cream, vanilla extract, grated lemon',39,'Milk, egg',3.0,'$','../../assets/gelato.png','Gelato',2);
-- INSERT INTO PRODUCT(id,title, shortDescription, longDescription, ingredients, quantity, alergens, price, currency, photoUrl, type, categoryId)
-- VALUES(5,'Toasted Coconut Donut','Rise and shine and shake your legs, it’s Toasted Coconut Donut time!','Fill yourself with the doughnut that strikes a good balance of coconut flavor and overall sweetness.','milk, teaspoons active dry yeast, eggs, tablespoons butter, melted and cooled, granulated sugar, teaspoon salt, flour, neutral oil, coconut',50,'Milk, egg',2.0,'$','../../assets/donuts.png','Donuts',3);
-- INSERT INTO PRODUCT(id,title, shortDescription, longDescription, ingredients, quantity, alergens, price, currency, photoUrl, type, categoryId)
-- VALUES(6,'Vanilla Frosted with Sprinkles Donut','Saving the day with sprinkles.','One of the many frosted flavors, this one comes with rainbow sprinkles, but the topping only makes the already too sweet vanilla frosting taste even sweeter.','milk, teaspoons active dry yeast, eggs, tablespoons butter, melted and cooled, granulated sugar, teaspoon salt, flour, neutral oil, vanilla extract',40,'Milk, egg',3.0,'$','../../assets/donuts.png','Donuts',3);
-- INSERT INTO PRODUCT(id,title, shortDescription, longDescription, ingredients, quantity, alergens, price, currency, photoUrl, type, categoryId)
-- VALUES(7,'T-shirt','Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy',' ','Cotton',30,'Cotton',7.0,'$','../../assets/merchandise.png','Merchandise',4);
-- INSERT INTO PRODUCT(id,title, shortDescription, longDescription, ingredients, quantity, alergens, price, currency, photoUrl, type, categoryId)
-- VALUES(8,'Simple Mug','Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy',' ','Porcelain',60,' ',5.0,'$','../../assets/merchandise.png','Merchandise',4);
--

-- INSERT INTO RATE(id,  productId, rate)
-- VALUES (1, 1, 5);
--
-- INSERT INTO RATE(id,  productId, rate)
-- VALUES (2, 1, 1);
--
-- INSERT INTO RATE(id,  productId, rate)
-- VALUES (3, 2, 4);
--
-- INSERT INTO RATE(id,  productId, rate)
-- VALUES (4, 2, 3);
--
-- INSERT INTO RATE(id,  productId, rate)
-- VALUES (5, 3, 2);
--
-- INSERT INTO RATE(id,  productId, rate)
-- VALUES (6, 3, 3);
--
-- INSERT INTO RATE(id,  productId, rate)
-- VALUES (7, 4, 2);
--
-- INSERT INTO RATE(id,  productId, rate)
-- VALUES (8, 4, 5);
--
-- INSERT INTO RATE(id,  productId, rate)
-- VALUES (9, 5, 3);
--
-- INSERT INTO RATE(id,  productId, rate)
-- VALUES (10, 5, 4);

-- INSERT INTO RATE(id,  productId, rate)
-- VALUES (11, 6, 3);
--
-- INSERT INTO RATE(id,  productId, rate)
-- VALUES (12, 6, 5);
--
-- INSERT INTO RATE(id,  productId, rate)
-- VALUES (13, 7, 4);
--
-- INSERT INTO RATE(id,  productId, rate)
-- VALUES (14, 7, 2);
--
-- INSERT INTO RATE(id,  productId, rate)
-- VALUES (15, 8, 5);
--
-- INSERT INTO RATE(id,  productId, rate)
-- VALUES (16, 8, 5);

INSERT INTO BASKET(id, sessionId, listOfBasketProduct)
VALUES(1,1,' ')

INSERT INTO BASKET(id, sessionId, listOfBasketProduct)
VALUES(2,1,' ')


INSERT INTO BASKETPRODUCT(id, productId, quantity, price)
VALUES(1,1,2,4.0)

INSERT INTO BASKETPRODUCT(id, productId, quantity, price)
VALUES(2,2,3,3.0)



