create database OnlineShop
go
use OnlineShop
go
--Table Color
create table Color(
	colorID int identity(1,1),
	colorName nvarchar(max) not null,
	CONSTRAINT pk_Color_colorID PRIMARY KEY (colorID)
)
go
--Table Brand
create table Brand(
	brandID int identity(1,1),
	brandName varchar(max) not null,
	CONSTRAINT pk_Brand_brandID PRIMARY KEY (brandID)
)
go
--Table Category
create table Category(
	cateID int identity(1,1),
	brandID int not null ,
	cateName nvarchar(max) not null,
	CONSTRAINT pk_Category_cateID PRIMARY KEY (cateID),
	CONSTRAINT fk_Category_brandID FOREIGN KEY (brandID) REFERENCES Brand(brandID)
)
go
--Table Product
create table Product(
	productID int identity(1,1),
	productName nvarchar(max) not null,
	productPrice float not null,
	productImage varchar(max) not null,
	productDescribe nvarchar(max) not null,
	cateID int not null,
	totalQuantity int not null,
	discount float ,
	createAt Date not null,
	isSale bit not null,
	isActive bit not null,
	CONSTRAINT pk_Product_productID PRIMARY KEY (productID),
	CONSTRAINT fk_Product_cateID FOREIGN KEY (cateID) REFERENCES Category(cateID)
)
go
--Table Size
create table Size(
	sizeID int identity(1,1),
	numberSize int not null,
	CONSTRAINT pk_Size_sizeID PRIMARY KEY (sizeID)
)
go

--Table ProductDetail
create table ProductDetail(
	detailID int identity(1,1),
	productID int not null,
	sizeID int not null,
	quantity int not null,
	colorID int not null,
	CONSTRAINT pk_ProductDetail_deitailID PRIMARY KEY (detailID),
	CONSTRAINT fk_ProductDetail_productID FOREIGN KEY (productID) REFERENCES Product(productID),
	CONSTRAINT fk_ProductDetail_sizeID FOREIGN KEY (sizeID) REFERENCES Size(sizeID),
	CONSTRAINT fk_ProductDetail_colorID FOREIGN KEY (colorID) REFERENCES Color(colorID)
)
go
--Table ImgOfProduct
create table ImgOfProduct(
	imgID int identity(1,1),
	colorID int not null,
	productID int not null,
	imageProduct varchar(max) not null
	CONSTRAINT pk_img_ProductID PRIMARY KEY (imgID),
	CONSTRAINT fk_img_colorID FOREIGN KEY (colorID) REFERENCES Color(colorID),
	CONSTRAINT fk_img_productID FOREIGN KEY (productID) REFERENCES Product(productID)
)
go
--Table orderState
create table OrderState(
	stateID int identity(1,1),
	nameState nvarchar(max) not null,
	CONSTRAINT pk_OrderState_stateID PRIMARY KEY (stateID)
)
go
--Table Role
create table [Role](
	userRole int identity(1,1),
	roleName nvarchar(max) not null,
	CONSTRAINT pk_Role_userRole PRIMARY KEY (userRole)
)
go
create table userStatus(
	uStatusID int identity(1,1),
	statusName nvarchar(max) not null,
	CONSTRAINT pk_userStatus PRIMARY KEY(uStatusID),
)
go
--Table User
create table [User](
	userID int identity(1,1),
	userName varchar(max) not null,
	userPass varchar(max) not null,
	fullName nvarchar(max) not null,
	userAvatar varchar(max) not null,
	userAdress nvarchar(max) not null,
	userBirth date not null,
	userGender bit not null,
	userEmail varchar(max)not null,
	userPhone varchar(20)not null,
	userRole int not null,
	uStatusID int not null,
	CONSTRAINT pk_User_userID PRIMARY KEY (userID),
	CONSTRAINT fk_User_userRole FOREIGN KEY (userRole) REFERENCES [Role](userRole),
	CONSTRAINT fk_User_userStatus FOREIGN KEY (uStatusID) REFERENCES userStatus(uStatusID)
)
go
--table Order
create table [Order](
	orderID int identity(1,1),
	userID int not null,
	orderDate date not null,
	amount int not null,
	stateID int not null,
	CONSTRAINT pk_Order_orderID PRIMARY KEY (orderID),
	CONSTRAINT fk_Order_userID FOREIGN KEY (userID) REFERENCES [User](userID),
	CONSTRAINT fk_Order_stateID FOREIGN KEY (stateID) REFERENCES OrderState(stateID),
)
go
--Table orderDetail
create table OrderDetail(
	orderDetailID int identity(1,1),
	detailID int not null,
	quantity int not null,
	price int not null,
	discount float,
	createAt date not null,
	updateAt date not null,
	orderID int not null,
	Amount int not null
	CONSTRAINT pk_OrderDetail_detailID PRIMARY KEY (orderDetailID),
	CONSTRAINT pk_DetailID FOREIGN KEY (detailID) REFERENCES  ProductDetail(detailID),
	CONSTRAINT pk_orderFrID FOREIGN KEY (orderID) REFERENCES  [Order](orderID)
)
--Table CateBlog
go
create table CategoryBlog(
	cateBlogID int identity(1,1),
	cateBlogName nvarchar(100) not null,
	CONSTRAINT pk_cateBlogID PRIMARY KEY (cateBlogID),
)
go
--Table Blog
create table Blog(
	blogID int identity(1,1),
	userID int not null,
	blogTitle nvarchar(max) not null,
	blogContent nvarchar(max) not null,
	blogImg varchar(max) not null,
	authorName nvarchar(max) not null,
	createDate date not null,
	statusBlogID bit not null,
	cateBlogID int not null,
	CONSTRAINT pk_Blog_postID PRIMARY KEY (blogID),
	CONSTRAINT fk_Blog_userID FOREIGN KEY (userID) REFERENCES [User](userID),
	CONSTRAINT fk_cateBlogID FOREIGN KEY (cateBlogID) REFERENCES [CategoryBlog](cateBlogID)
)
go
--Table FeedBack
create table Feedback(
	feedbackID int identity(1,1),
	userID int not null,
	detailID int not null,
	comment nvarchar(max) not null,
	commentDate date not null,
	CONSTRAINT pk_Feedback_feedbackID PRIMARY KEY (feedbackID),
	CONSTRAINT fk_Feedback_userlID FOREIGN KEY (userID) REFERENCES [User](userID),
	CONSTRAINT fk_Feedback_detailID FOREIGN KEY (detailID) REFERENCES [ProductDetail](detailID)
)

--Table Cart
create table Cart(
	cartID int identity(1,1),
	userID int not null,
	detailID int not null,
	quantity int not null,
	CONSTRAINT pk_Cart_cartID PRIMARY KEY (cartID),
	CONSTRAINT fk_Cart_detailID FOREIGN KEY (detailID) REFERENCES [ProductDetail](detailID),
	CONSTRAINT fk_Cart_userID FOREIGN KEY (userID) REFERENCES [User](userID)
)
--Table Slider
create table Slider(
	sliderID int identity(1,1),
	title nvarchar(max) not null,
	sliderContent nvarchar(max) not null,
	img varchar(max) not null,
	colorID int not null,
	link varchar(max) not null,
	CONSTRAINT pk_Slider_sliderID PRIMARY KEY (sliderID)
)

--drop database OnlineShop