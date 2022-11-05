# ParkingApp
App to help find parking during large events
We Will be Using the MapQuest API to map destinations stored on our database
We will be Using the JDBC and Connector/J API's to help access our MySQL database from our java program


Queries for DB creation:
create schema ParkingApp;
create table ParkingApp.ParkingLot(
City varchar(25),
State char(2),
Address varchar(25),
Hourly_Rate float,
Start_open time,
End_close time,
primary key(City,State,Address));

create table ParkingApp.Customer(
Fname varchar(25),
Lname varchar(25),
Cust_id char(9),
Credit_num char(16),
Cvv char(3),
primary key(Cust_id));

create table ParkingApp.Vehicle(
Lplate char(6),
State char(2),
Make varchar(25),
Model varchar(25),
Vyear year,
Owner_id char(9),
foreign key(Owner_id) references ParkingApp.Customer(Cust_id),
primary key (Owner_id,Lplate));

create table ParkingApp.Transaction(
Id char(9),
Plate char(6),
Park_city varchar(25),
Park_state char(2),
Park_Address varchar(25),
Start_time time,
Leave_time time,
foreign key(Id) references ParkingApp.Customer(Cust_id),
foreign key(Plate) references ParkingApp.Vehicle(Lplate),
foreign key(Park_city) references ParkingApp.ParkingLot(City),
foreign key(Park_state) references ParkingApp.ParkingLot(State),
foreign key(Park_address) references ParkingApp.ParkingLot(Adress),
primary key(Id,Plate,Park_city,Park_state,Park_address));

