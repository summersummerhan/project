
CREATE DATABASE FinalProjectGroup6;
GO

USE FinalProjectGroup6;
GO




--Column Data Encryption
/*users password column encryption*/ 
 CREATE MASTER KEY  
 ENCRYPTION BY PASSWORD = 'Team6_P@sswOrd' 
   -- Create certificate to protect symmetric key 
 CREATE CERTIFICATE Team6_Certificate 
 WITH SUBJECT = 'Project Team6 Certificate', 
 EXPIRY_DATE = '2026-7-29' 
   -- Create symmetric key to encrypt data 
 CREATE SYMMETRIC KEY Team6_SymmetricKey 
 WITH ALGORITHM = AES_128 
 ENCRYPTION BY CERTIFICATE Team6_Certificate 
   -- Open symmetric key 
 OPEN SYMMETRIC KEY Team6_SymmetricKey 
 DECRYPTION BY CERTIFICATE Team6_Certificate 




-------------------------------------------------------------create table
CREATE TABLE Restaurant(
	RestaurantID INT NOT NULL PRIMARY KEY,
	RestaurantName VARCHAR (45) NOT NULL,
	PhoneNum BIGINT  NOT NULL,
	StreetNumber VARCHAR (45) NOT NULL,
	City VARCHAR (45) NOT NULL,
	State VARCHAR (45) NOT NULL,
    Zipcode INT NOT NULL,
);

create table supplier(
	supplierid int not null primary key,
	suppliername varchar(30)
);

create table deliveryplatform(
	deliveryplatformid int not null primary key,
	deliveryplatformname varchar(30)
);

CREATE TABLE DineInOrder (
	DineInOrderID INT NOT NULL PRIMARY KEY,
	Time DATETIME  NOT NULL,
	TableID INT NOT NULL,
	Price INT NOT NULL,
	RestaurantID INT NOT NULL  REFERENCES Restaurant(RestaurantID),
	Discount DECIMAL(2)
);

CREATE TABLE Employee
(EmployeeID INT PRIMARY KEY,
FirstName VARCHAR(45), 
LastName VARCHAR(45), 
Birthday DATE,
Sex VARCHAR(45),
Salary INT,
RestaurantID INT REFERENCES Restaurant(RestaurantID)
);

create table DeliveryCustomer(
	deliverycustomerID int not null primary key,
	deliverycontact bigint not null,
	firstname varchar(20) not null,
	lastname varchar(20) not null,
	streetname varchar(50) not null,
	city varchar(20) not null,
	state varchar(20) not null,
	zipcode varchar(50) not null
);

CREATE TABLE OnlineOrder
(OnlineOrderID INT PRIMARY KEY,
OrderDate DATE,
DeliveryManID INT,
Price INT,
RestaurantID INT REFERENCES Restaurant(RestaurantID),
DeliveryCustomerID INT REFERENCES DeliveryCustomer(DeliveryCustomerID),
Discount DECIMAL(2) 
);

CREATE TABLE DeliveryMan
(DeliveryManID INT PRIMARY KEY,
FirstName VARCHAR(45), 
LastName VARCHAR(45), 
DeliveryPlatformID INT REFERENCES DeliveryPlatform(DeliveryPlatformID),
OnlineOrderID INT REFERENCES OnlineOrder(OnlineOrderID)

)

CREATE TABLE Dish(
DishID INT NOT NULL PRIMARY KEY,
DishName VARCHAR(45) NOT NULL,
DishType VARCHAR(45) NOT NULL,
DishPrice INT NOT NULL
);

CREATE TABLE DineInOrderToDish(
DineInOrderID INT NOT NULL
    REFERENCES DineInOrder(DineInOrderID),
DishID INT NOT NULL
    REFERENCES Dish(DishID),
Quantity INT NOT NULL
);

CREATE TABLE OnlineOrderToDish(
OnlineOrderID INT NOT NULL
    REFERENCES OnlineOrder(OnlineOrderID),
DishID INT NOT NULL
    REFERENCES Dish(DishID),
Quantity INT NOT NULL
)

CREATE TABLE Ingredient
(IngredientID INT PRIMARY KEY,
 IngredientName VARCHAR(45) NOT NULL
 );


CREATE TABLE DishToIngredient(
DishID INT NOT NULL
    REFERENCES Dish(DishID),
IngredientID INT NOT NULL
    REFERENCES Ingredient(IngredientID)
);

CREATE TABLE SupplierToIngredient
(SupplierID INT NOT NULL
REFERENCES Supplier(supplierid),
 IngredientID INT  NOT NULL
 REFERENCES Ingredient(IngredientID)
);



CREATE TABLE Behavior (
deliverycontact BIGINT, 
BehaviorType varchar(20), 
BehaviorDate date); 








----------------------------insert data
insert into DeliveryCustomer(deliverycustomerID, deliverycontact,firstname, lastname, streetname, city, state, zipcode)
values
(1, '4086621269', 'Vivian', 'Chen', '1032 Brokaw Rd', 'Seattle', 'WA', '98122'),
(2, '4082201334', 'Jason', 'Wang', '2090 Mahuron Cir', 'San Jose', 'CA', '95132'),
(3, '3174035686', 'Sam', 'Lee', '4N 2ND St', 'San Jose', 'CA', '95113'),
(4, '7656378594', 'Lydia', 'Yang', '101 West Ave', 'San Francisco', 'CA', '92101'),
(5, '7656378593', 'Sam', 'Barry', '11 East Ave', 'Seattle', 'WA', '98122'),
(6, '6616378594', 'Jack', 'Wang', '511 East Ave', 'Oregon', 'OR', '98100'),
(7, '5712509526', 'Chris', 'Lan', '102 Canton', 'Boston', 'MA', '53540'),
(8, '6537511085', 'Logan', 'Lau', '103 Highway', 'Chicago', 'IL', '55110'),
(9, '5102341999', 'Aaron', 'Donald', '23 Market St', 'Los Angeles', 'CA', '94123'),
(10, '4201239999', 'Patrick', 'Mahomes', '45 Main St', 'Kansas City', 'MO', '32149');

insert into supplier(supplierid, suppliername)
values
(1, 'Ross'),
(2, 'Sprouts'),
(3, 'Star Ranch'),
(4, 'West Farm'),
(5, 'FarmBest'),
(6, 'Jacks'),
(7, 'Captain Tom'),
(8, 'Sam'),
(9, 'Costco'),
(10, 'Walmart');

insert into deliveryplatform(deliveryplatformid, deliveryplatformname)
values
(1, 'DoorDash'),
(2, 'UberEats'),
(3, 'XGood'),
(4, 'Tast3'),
(5, 'GoodDish'),
(6, 'Delicious'),
(7, 'UberEat'),
(8, 'HungryPanda'),
(9, 'FastDelivery'),
(10, 'Safeway');

INSERT INTO Restaurant(RestaurantID,RestaurantName,PhoneNum,StreetNumber,City,State,Zipcode)
VALUES (1,'PandaLA','4058201734','1052 Santa Place','Los Angeles','CA',92534),
		(2,'PandaSC','4058201175','1178 High St','Santa Cruz','CA',95064),
		(3,'PandaSF','4058201733','400 McAllister St','San Francisco','CA',94102),
		(4,'PandaSD','4058101175','1100 Union St','San Diego','CA',92101),
		(5,'PandaSEA','4058201734','1959 NE Pacific St','Seattle','WA',98115),
		(6,'PandaOR','4058201175','1585 E 13th Ave','Eugene','OA',97403),
		(7,'PandaOA','4058201734','1st highland','Chicago','IR',10010),
		(8,'PandaKC','4058201175','13 midway','Boston','MA',95533),
		(9,'PandaDC','4058201734','1 main road','Washington ','DC',10001),
		(10,'PandaNYC','4058201175','2 broadway','New York','NY',10086);
	
INSERT INTO DineInOrder(DineInOrderID,Time,TableID,Price,RestaurantID,Discount)
VALUES (1,'08/09/2020','1','89','1','9.2'),
		(2,'05/02/2021','2','120','2','11.2'),
		(3,'05/29/2021','3','109','3','10.9'),
		(4,'07/01/2021','4','23','4','2.3'),
		(5,'07/05/2020','5','66','5','5'),
		(6,'06/01/2020','6','77','6','6'),
		(7,'03/12/2021','7','130','7','12'),
		(8,'04/13/2021','8','89','8','5'),
		(9,'04/06/2020','9','100','9','3.6'),
		(10,'05/13/2021','10','90','10','5.5');

INSERT INTO Ingredient
(IngredientID, IngredientName) VALUES
(1, 'Tofu'),
(2, 'Pepper'),
(3, 'Beef'),
(4, 'Pork'),
(5, 'Apple'),
(6, 'Broccoli'),
(7, 'Fish'),
(8, 'Potato'),
(9, 'Wine'),
(10, 'Soda');


INSERT INTO Dish
(DishID, DishName, DishType, DishPrice) VALUES
(1, 'Chicken Pasta', 'Pasta', 20),
(2, 'Chicken Salad', 'Salad', 15),
(3, 'Egg Roll', 'Appetizer', 7),
(4, 'Chicken Wings', 'Appetizer', 8),
(5, 'Seaweed Egg Flower Soup', 'Soup', 2),
(6, 'Bortsch', 'Soup', 3),
(7, 'Roast Duck', 'Meat', 50),
(8, 'Roast Goose', 'Meat', 28),
(9, 'Bun', 'Dim sum', 2),
(10, 'Siu mai', 'Dim sum', 2);

INSERT INTO SupplierToIngredient
(SupplierID, IngredientID) VALUES
(1,1),
(2,2),
(3,3),
(4,4),
(5,5),
(6,6),
(7,7),
(8,8),
(9,9),
(10,10);

INSERT INTO DineInOrderToDish(DineInOrderID,DishID,Quantity)
VALUES(1,1,1),
(2,2,5),
(3,3,1),
(4,4,3),
(5,5,2),
(6,6,3),
(7,7,4),
(8,8,5),
(9,9,2),
(10,10,5);

INSERT INTO DishToIngredient(DishID,IngredientID)
VALUES(1,1),
(2,2),
(3,3),
(4,4),
(5,5),
(6,6),
(7,7),
(8,8),
(9,9),
(10,10)

INSERT Employee (EmployeeID,
FirstName, 
LastName, 
Birthday,
Sex,
Salary,
RestaurantID 
)
VALUES 
(1,	'Amy', 'Holguin', '05/02/1988',	'Female', 30, 1),																				
(2,	'Michelle',	'Negi',	'01/01/1992',	'Female', 28, 2),																				
(3,	'Ray', 'Zhang',	'10/01/1981', 'Male', 25, 3),																	
(4,	'Lee', 'Shia', '05/31/1990', 'Female', 23, 4),																				
(5,	'Summer', 'Xia', '02/21/1998', 'Male', 24, 5),																				
(6,	'Jack',	'Ma', '05/27/1870', 'Female', 20, 6),																				
(7,	'Mike', 'Bugrara', '05/29/1981', 'Male', 30, 7),
(8,	'Kal', 'Jordan', '03/15/1998', 'Male', 23, 8),																			
(9,	'JJ', 'Watt', '06/06/1980',	'Male',	25,	9),																			
(10, 'Tom' , 'Brady', '01/01/1970',	'Male',	25,	10),																				
(11, 'Catherune', 'Martin',	'05/02/1937', 'Female',	35,	1),																				
(12, 'Adeel', 'Zafar', '07/08/1987', 'Male', 30, 2),																				
(13, 'Jimmy', 'Smith', '09/30/1994', 'Male', 20, 3),																				
(14, 'Ashley', 'Bredley', '01/01/1991', 'Female', 27, 4),																				
(15, 'Morty', 'Smith',	'08/08/1992', 'Female',	25,	5),																				
(16, 'Rick', 'Sanches',	'09/24/1993', 'Female',	35,	6),																				
(17, 'Piter', 'Zhang', '06/01/1996', 'Male', 20, 7),																				
(18, 'Lily', 'Wang', '07/19/1991', 'Female', 23, 8),																				
(19, 'Aaron', 'Rogers',	'03/04/1985', 'Male', 25, 9),																				
(20, 'Peyton', 'Manning', '05/06/1982', 'Male', 25,	10)				

INSERT OnlineOrder(OnlineOrderID,
OrderDate,
DeliveryManID,
Price,
RestaurantID,
DeliveryCustomerID,
Discount)
VALUES 
(1,	'05/28/2020',	1,	30,	1,	1,	5.22),
(2,	'03/21/2021',	2,	50,	2,	2,	10.3),
(3,	'05/21/2021',	3,	107, 3,	3,	10.07),
(4,	'05/22/2021',	4,	19, 4,	4,	1.9),
(5,	'06/29/2020',	5,	61,	5,	5,	3.22),
(6,	'01/25/2021',	6,	62,	6,	6,	5.4),
(7,	'01/01/2021',	7,	20,	7,	7,	2.2),
(8,	'12/25/2020',	8,	25,	8,	8,	3.3),
(9,	'02/01/2021',	9,	66,	9,	9,	1.1),
(10, '03/01/2021', 10, 88, 10, 10, 1.2),
(11,	'05/28/2021',	1,	30,	1,	1,	5.22),
(12,	'03/21/2020',	2,	50,	2,	2,	10.3),
(13,	'05/11/2021',	3,	107, 3,	3,	10.07),
(14,	'04/22/2021',	4,	19, 4,	4,	1.9),
(15,	'03/29/2020',	5,	61,	5,	5,	3.22),
(16,	'02/25/2021',	6,	62,	6,	6,	5.4),
(17,	'05/01/2021',	7,	20,	7,	7,	2.2),
(18,	'11/25/2020',	8,	25,	8,	8,	3.3),
(19,	'01/01/2021',	10,	66,	9,	9,	1.1),
(20,    '01/01/2021', 10, 88, 10, 10, 1.2),
(21,	'01/28/2020',	1,	30,	1,	1,	5.22),
(22,	'01/21/2021',	2,	50,	2,	2,	10.3),
(23,	'01/21/2021',	3,	107, 3,	3,	10.07),
(24,	'02/22/2021',	4,	19, 4,	4,	1.9),
(25,	'03/29/2020',	5,	61,	5,	5,	3.22),
(26,	'04/25/2021',	6,	62,	6,	6,	5.4),
(27,	'05/01/2021',	7,	20,	7,	7,	2.2),
(28,	'06/25/2020',	8,	25,	8,	8,	3.3),
(29,	'02/07/2021',	10,	66,	9,	9,	1.1),
(30, '03/24/2021', 10, 88, 10, 10, 1.2);

INSERT DeliveryMan(DeliveryManID,
FirstName, 
LastName , 
DeliveryPlatformID,
OnlineOrderID

)
VALUES 
(1,	'Bef','Ayenew', 1, 1),
(2,	'Jason', 'Krantz', 2,2),
(3,	'Jack', 'Li', 3, 3),
(4,	'Jimmy', 'Zhao', 4,	4),
(5,	'leo',	'Smith', 5,	5),
(6,	'Andy',	'Joe',	6, 6),
(7,	'Jackie', 'Chan', 7, 7),
(8,	'Micheal', 'Lam', 8, 8),
(9,	'Trevor', 'Lawrence', 9, 9),
(10, 'JaMarr', 'Chase',	10,	10);


INSERT INTO OnlineOrderToDish(OnlineOrderID,DishID,Quantity)
VALUES(1,1,4),
(2,2,3),
(3,3,2),
(4,4,5),
(5,5,1),
(6,6,5),
(7,7,2),
(8,8,3),
(9,9,4),
(10,10,5);


INSERT INTO Behavior (deliverycontact, BehaviorType, BehaviorDate)
VALUES (5102341999, 'Helpful', '08-10-2019');

INSERT INTO Behavior (deliverycontact, BehaviorType, BehaviorDate)
VALUES (4201239999, 'Abusive', '4-13-2019');











--------------------Computed Columns based on a function 
---function1  Enter DeliveryManID to get the order quantity he transports
GO
CREATE FUNCTION OnlineOrderByDeliveryMan(@DeliveryManID INT) RETURNS INT
AS
BEGIN
DECLARE @tuition INT=0
SELECT @tuition=count(oo.OnlineOrderID)
FROM OnlineOrder oo
WHERE oo.DeliveryManID=@DeliveryManID
GROUP BY oo.DeliveryManID
RETURN @tuition
END;

----test
SELECT dbo.OnlineOrderByDeliveryMan(1);
SELECT dbo.OnlineOrderByDeliveryMan(9);
SELECT dbo.OnlineOrderByDeliveryMan(10);


---function2  get total order quantity delivertman transports

CREATE FUNCTION DeliveryQuantity() RETURNS INT
AS
BEGIN
DECLARE @tuition INT=0
SELECT @tuition=SUM(oo.OnlineOrderID)
FROM OnlineOrder oo
JOIN DeliveryMan dm
ON dm.DeliveryManID=oo.DeliveryManID
GROUP BY dm.DeliveryManID
RETURN @tuition
END;
---test
select dbo.DeliveryQuantity();

---function3 calculate age
CREATE FUNCTION getAge
(@birthday DATE)
RETURNS INT
AS
BEGIN
 DECLARE @Age AS INT
 SET @Age = FLOOR(DATEDIFF(DAY, @birthday, GETDATE()) / 365.25)
 RETURN @Age
END

--test
SELECT dbo.getAge('05/06/1982');

ALTER TABLE Employee ADD Age AS
(dbo.getAge(Birthday));






----------------------------view1
----------Show all employees in each restaurant for easier managing
create view empl as
select a.restaurantid, b.firstname, b.lastname
from Restaurant a left join Employee b on a.RestaurantID = b.RestaurantID

------------TEST
select empl.RestaurantID, 
STRING_AGG(empl.FirstName
    +' '
    +empl.LastName
    ,',') as Employees
from empl
group by RestaurantID
order by RestaurantID

----------------------------view2
---------get most favourite dish information about OnlineOrder
CREATE VIEW OnlineOrder_FavouriteDish AS
SELECT oo.OnlineOrderID,oot.DishID,d.DishName,oot.Quantity
from OnlineOrder oo
join OnlineOrderToDish oot
on oo.OnlineOrderID = oot.OnlineOrderID
join Dish d
on oot.DishID = d.DishID
where oot.Quantity = (select max(Quantity)from OnlineOrderToDish)
group by oo.OnlineOrderID,oot.DishID,d.DishName,oot.Quantity;


---------TEST
select * from OnlineOrder_FavouriteDish















-----------------Table-level CHECK Constraints based on a function
-------check behavior Constraints
CREATE FUNCTION CheckBehavior (@BlockNum BIGINT)
RETURNS smallint
AS
BEGIN
   DECLARE @Count smallint=0;
   SELECT @Count = COUNT(deliverycontact) 
          FROM Behavior
          WHERE deliverycontact = @BlockNum
          AND BehaviorType = 'Abusive';
   RETURN @Count;
END;

ALTER TABLE DeliveryCustomer 
ADD CONSTRAINT BanBadBehavior 
CHECK (dbo.CheckBehavior(deliverycontact) = 0);



------------------TEST constrainS
insert into DeliveryCustomer(deliverycustomerID, deliverycontact,firstname, lastname, streetname, city, state, zipcode)
values(11, 5102341999, 'Aaron', 'Donald', '23 Market St', 'Los Angeles', 'CA', '94123'),------Normal example
(12, 4201239999, 'Patrick', 'Mahomes', '45 Main St', 'Kansas City', 'MO', '32149');-------abnormal example
