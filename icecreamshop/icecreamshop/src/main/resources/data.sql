INSERT INTO CATEGORY ( name, description)
VALUES ( 'ICE_CREAM', 'Delicious ice cream.');

INSERT INTO CATEGORY ( name, description)
VALUES ( 'GELATO', 'Delicious gelato.');

INSERT INTO CATEGORY ( name, description)
VALUES ( 'DONUTS', 'Delicious donuts!');

INSERT INTO CATEGORY ( name, description)
VALUES ( 'MERCHANDISE', 'Cool merch.');

INSERT INTO PRODUCT( TITLE, SHORT_DESCRIPTION, LONG_DESCRIPTION, INGREDIENTS, QUANTITY, ALERGENS, PRICE, CURRENCY, PHOTO_URL, TYPE, CATEGORY_ID)
VALUES('Pistachio Ice Cream','Sweet, cold, and creamy with a chance of Pistachio flavour','Treat yourself to ice cream infused with smooth Bourbon sprinkled with pistachio and vanilla','egg yolks, sugar, heavy cream, evaporate milk,teaspoon salt, teaspoons vanilla extract,teaspoon pure almond extract, shelled pistachios, roughly chopped',10,'Milk, egg',2.0,'$','../../assets/icecream.png','ICE_CREAM',1);

INSERT INTO PRODUCT( TITLE, SHORT_DESCRIPTION, LONG_DESCRIPTION, INGREDIENTS, QUANTITY, ALERGENS, PRICE, CURRENCY, PHOTO_URL, TYPE, CATEGORY_ID)
VALUES('Watermelon Ice Cream','Fill your tummy with a yummy Watermelon Ice Cream','Treat yourself to ice cream infused with smooth Bourbon sprinkled with fresh watermelon','egg yolks, granulated sugar, heavy cream, evaporate milk, teaspoon salt, teaspoon pure, watermelon',30,'Milk, egg',1.0,'$','../../assets/icecream.png','ICE_CREAM',1);

INSERT INTO PRODUCT( TITLE, SHORT_DESCRIPTION, LONG_DESCRIPTION, INGREDIENTS, QUANTITY, ALERGENS, PRICE, CURRENCY, PHOTO_URL, TYPE, CATEGORY_ID)
VALUES('Dark Chocolate Gelato',' The rich, creamy taste of chocolate coupled with the chilliness of the gelato is an experience in itself!','When you reach a gelato parlour and find it difficult to make up your mind on one specific flavour, dark chocolate is a great selection','egg yolks, granulated sugar, milk, heavy cream, vanilla extract, chocolate',26,'Milk, egg',3.0,'$','../../assets/gelato.png','GELATO',2);

INSERT INTO PRODUCT(TITLE, SHORT_DESCRIPTION, LONG_DESCRIPTION, INGREDIENTS, QUANTITY, ALERGENS, PRICE, CURRENCY, PHOTO_URL, TYPE, CATEGORY_ID)
VALUES('Lemon Gelato',' Just like a glass of lemonade, lemon gelato is an invigorating and refreshing cold treat on any hot day.','If you do not like desserts that are excessively sweet, lemon flavoured gelato with its mild sweetness will create a whole new perspective of desserts and may be just the right choice for you.','egg yolks, granulated sugar, milk, heavy cream, vanilla extract, grated lemon',39,'Milk, egg',3.0,'$','../../assets/gelato.png','GELATO',2);

INSERT INTO PRODUCT( TITLE, SHORT_DESCRIPTION, LONG_DESCRIPTION, INGREDIENTS, QUANTITY, ALERGENS, PRICE, CURRENCY, PHOTO_URL, TYPE, CATEGORY_ID)
VALUES('Toasted Coconut Donut','Rise and shine and shake your legs, it’s Toasted Coconut Donut time!','Fill yourself with the doughnut that strikes a good balance of coconut flavor and overall sweetness.','milk, teaspoons active dry yeast, eggs, tablespoons butter, melted and cooled, granulated sugar, teaspoon salt, flour, neutral oil, coconut',50,'Milk, egg',2.0,'$','../../assets/donuts.png','DONUTS',3);

INSERT INTO PRODUCT( TITLE, SHORT_DESCRIPTION, LONG_DESCRIPTION, INGREDIENTS, QUANTITY, ALERGENS, PRICE, CURRENCY, PHOTO_URL, TYPE, CATEGORY_ID)
VALUES('Vanilla Frosted with Sprinkles Donut','Saving the day with sprinkles.','One of the many frosted flavors, this one comes with rainbow sprinkles, but the topping only makes the already too sweet vanilla frosting taste even sweeter.','milk, teaspoons active dry yeast, eggs, tablespoons butter, melted and cooled, granulated sugar, teaspoon salt, flour, neutral oil, vanilla extract',40,'Milk, egg',3.0,'$','../../assets/donuts.png','DONUTS',3);

INSERT INTO PRODUCT( TITLE, SHORT_DESCRIPTION, LONG_DESCRIPTION, INGREDIENTS, QUANTITY, ALERGENS, PRICE, CURRENCY, PHOTO_URL, TYPE, CATEGORY_ID)
VALUES('T-shirt','Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy',' ','Cotton',30,'Cotton',7.0,'$','../../assets/merchandise.png','MERCHANDISE',4);

INSERT INTO PRODUCT(TITLE, SHORT_DESCRIPTION, LONG_DESCRIPTION, INGREDIENTS, QUANTITY, ALERGENS, PRICE, CURRENCY, PHOTO_URL, TYPE, CATEGORY_ID)
VALUES('Simple Mug','Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy',' ','Porcelain',60,' ',5.0,'$','../../assets/merchandise.png','MERCHANDISE',4);


INSERT INTO RATE(product_id, rate)
VALUES (1, 5);

INSERT INTO RATE(  product_id, rate)
 VALUES ( 1, 1);

INSERT INTO RATE(  product_id, rate)
VALUES ( 2, 4);

INSERT INTO RATE( product_id, rate)
VALUES ( 2, 3);

INSERT INTO RATE(  product_id, rate)
VALUES ( 3, 2);

INSERT INTO RATE(  product_id, rate)
VALUES ( 3, 3);

INSERT INTO RATE( product_id, rate)
VALUES ( 4, 2);

INSERT INTO RATE( product_id, rate)
VALUES (4, 5);

INSERT INTO RATE(  product_id, rate)
VALUES ( 5, 3);

INSERT INTO RATE(  product_id, rate)
VALUES ( 5, 4);

INSERT INTO RATE(  product_id, rate)
VALUES (6, 3);

INSERT INTO RATE(  product_id, rate)
VALUES ( 6, 5);

INSERT INTO RATE(  product_id, rate)
VALUES ( 7, 4);

INSERT INTO RATE(  product_id, rate)
VALUES ( 7, 2);

INSERT INTO RATE( product_id, rate)
VALUES (8, 5);

INSERT INTO RATE(  product_id, rate)
VALUES ( 8, 5);

INSERT INTO BASKET( session_id)
VALUES(1);

INSERT INTO BASKET( session_id)
VALUES(1);


INSERT INTO BASKET_PRODUCT(product_id, basket_id, quantity, price)
VALUES(1,2,3,4.0);

INSERT INTO BASKET_PRODUCT( product_id, basket_id ,quantity, price)
VALUES(2,1,3,3.0);



