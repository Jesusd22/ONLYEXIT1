# ONLYEXIT

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
1. [Schema](#Schema)

## Overview
### Description
Allows you to shop for clothing on tv screen using Cromecast

### App Evaluation
- **Category:** Shopping
- **Mobile:** This app would be primarily developed for mobile to cast app onto television to cast through cast button to provide customers with a better view of items on sale by displaying them on the tv and allowing customer to navigate with phone .
- **Story:**  Provides shoppers with a new experince by allowing them to see all items being sold on the television to englare user view of items and give a much better shopping experience.
- **Market:** This app is for any individual who would like to shop with ONLYEXIT shopping brand.
- **Habit:** This app could be used when user wants to browse/buy clothes from ONLYEXIT.  ||This app could be used as often or unoften as the user wanted depending on how deep their social life is, and what exactly they're looking for.
- **Scope:** First we would start with getting individuals to shop the brand, get them to use castbutton to enhance shopping experince. Then get a highfasion brands to implement using the castbutton.

## Video Walkthrough

Here's a walkthrough of implementing parse into the app:

<img src='' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Product Spec
### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* Guest can search for items and buy items without having to login.
* Users can click on items and select size and quanity.
* User logs into account to search for items.
* User can pick item and put into shopping cart(quanity/delete item).
* User can check out items.
* User can do all of the above on televison by using cast button.

**Optional Nice-to-have Stories**

* Zoom/Rotate items
* Users previously bought items
* Tracking package
* User profile setup

### 2. Screen Archetypes

* Continue as guest
* Login 
* Register - User signs up or logs into their account
   * Upon Download/Reopening of the application, the user is prompted to log in to gain access to their profile information/ shopping cart.
* Home Screen - shows all of the items that are being sold
   * Upon opening user will see apperal displayed
* Item detail Screen 
   * Allows user to view description of item, select quanity and color option(if applicable)
* Shopping Cart Screen
   * Allows user to view the items they have selected to purchase edit the quantity or remove an item from shopping cart.
* Checkout Screen
   * User inputs mailing adress, and payment information.
* Cast screen
   * Allows user to navigate through tv screen with your phone.
   * User can view all the screens above on tv.

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Home 
* ShoppingCart
* Castbutton

Optional:
* Best sellers

## Schema 
### Models
#### Splash Screen
   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | logo	   | Image    | three to four second startup  logo 

#### Sign Up Screen
   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | name          | String   | registers/creates unique user id for app access |
   | phoneNumber   |number    |Register user account by phone number|
   | emailAddress  |string    |register user account by email address|

#### Login Screen
   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | loginID	   |String    |	Id of an existing account |
   | password	   |String    |	verification of existing account|

#### Home Screen
   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | shirt	   |Image     |	Image button will take user to shirt category|
   |pants	   |Image     |	Image button will take user to pants category|
   |shoes	   |Image     |	Image button will take user to shoes category|
   |accessories	   |Image     |	Image button will take user to accessory category|
   |bestseller *optional*|Image| List most sold clothing options|

#### Items Details Screen
   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   |Property	   |Type      |	Description
   |likesCount	   |Number    |	Number of likes for item
   |reviewsCount   |Number    |	Number of reviews for item
   |Image	   |File      |	Image of item
   |Description    |String    |	Description of item
   |title	   |String    |Title of item
   |itemID	   |Number    |	ID # to search item
   |itemColor      |Image     |	Color options for items

#### Shopping Cart Screen
   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   |Property	   |Type      |	Description
   |itemCount	   |Number    |	Count items in cart
   |itemsName	   |String    |	Name of items
   |itemsPrice	   |float     |	Price of individual items
   |itemTotal	   |float     |	Total price of numbers in cart

#### Shopping Cart Screen
   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   |mailingAddress |String    | Adress items will be shipped to.
   |payment	   |Number    | Card number


### Networking
#### List of network requests by screen
   - Login/Signup Screen
      - (Read/GET) read user credentials
      - (PUT) initialize user credentials 
   - Home Screen
      - (Delete) Delete existing comment
   - Item Detail Screen
      - (Read/GET) Query Item detail
   - Cart Detail Screen
      - (Read/GET) Query item detail
      - (Update/PUT) update cart info 
   - Checkout Screen
      - (Update/PUT) update item inventory 
      - (Read/GET) Query user info
